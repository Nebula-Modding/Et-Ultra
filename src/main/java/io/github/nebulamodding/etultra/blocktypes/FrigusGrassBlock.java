package io.github.nebulamodding.etultra.blocktypes;

import com.mojang.serialization.MapCodec;
import io.github.nebulamodding.etultra.registry.EUBlocks;
import io.github.nebulamodding.etultra.registry.EUVegetationPlacements;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;

import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.lighting.LightEngine;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;


public class FrigusGrassBlock extends SpreadingSnowyDirtBlock implements BonemealableBlock {
    public static final MapCodec<GrassBlock> CODEC = simpleCodec(GrassBlock::new);

    @Override
    public @NotNull MapCodec<GrassBlock> codec() {
        return CODEC;
    }

    public FrigusGrassBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader levelReader, BlockPos blockPos, @NotNull BlockState blockState) {
        return levelReader.getBlockState(blockPos.above()).isAir();
    }

    @Override
    public boolean isBonemealSuccess(@NotNull Level level, @NotNull RandomSource randomSource, @NotNull BlockPos blockPos, @NotNull BlockState blockState) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel serverLevel, @NotNull RandomSource randomSource, BlockPos blockPos, @NotNull BlockState blockState) {
        BlockPos blockpos = blockPos.above();
        BlockState blockstate = EUBlocks.FRIGUS_SHORT_GRASS.get().defaultBlockState();
        Optional<Holder.Reference<PlacedFeature>> optional = serverLevel.registryAccess()
                .registryOrThrow(Registries.PLACED_FEATURE)
                .getHolder(EUVegetationPlacements.FRIGUS_GRASS_BONEMEAL);

        label49:
        for (int i = 0; i < 128; i++) {
            BlockPos blockpos1 = blockpos;

            for (int j = 0; j < i / 16; j++) {
                blockpos1 = blockpos1.offset(randomSource.nextInt(3) - 1, (randomSource.nextInt(3) - 1) * randomSource.nextInt(3) / 2, randomSource.nextInt(3) - 1);
                if (!serverLevel.getBlockState(blockpos1.below()).is(this) || serverLevel.getBlockState(blockpos1).isCollisionShapeFullBlock(serverLevel, blockpos1)) {
                    continue label49;
                }
            }

            BlockState blockstate1 = serverLevel.getBlockState(blockpos1);
            if (blockstate1.is(blockstate.getBlock()) && randomSource.nextInt(10) == 0) {
                ((BonemealableBlock)blockstate.getBlock()).performBonemeal(serverLevel, randomSource, blockpos1, blockstate1);
            }

            if (blockstate1.isAir()) {
                Holder<PlacedFeature> holder;
                if (randomSource.nextInt(8) == 0) {
                    List<ConfiguredFeature<?, ?>> list = serverLevel.getBiome(blockpos1).value().getGenerationSettings().getFlowerFeatures();
                    if (list.isEmpty()) {
                        continue;
                    }

                    holder = ((RandomPatchConfiguration)list.getFirst().config()).feature();
                } else {
                    if (optional.isEmpty()) {
                        continue;
                    }

                    holder = optional.get();
                }

                holder.value().place(serverLevel, serverLevel.getChunkSource().getGenerator(), randomSource, blockpos1);
            }
        }
    }

    @Override
    public @NotNull Type getType() {
        return Type.NEIGHBOR_SPREADER;
    }

    private static boolean canBeGrass(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        BlockPos blockpos = blockPos.above();
        BlockState blockstate = levelReader.getBlockState(blockpos);
        if (blockstate.is(Blocks.SNOW) && blockstate.getValue(SnowLayerBlock.LAYERS) == 1) {
            return true;
        } else if (blockstate.getFluidState().getAmount() == 8) {
            return false;
        } else {
            int i = LightEngine.getLightBlockInto(
                    levelReader, blockState, blockPos, blockstate, blockpos, Direction.UP, blockstate.getLightBlock(levelReader, blockpos)
            );
            return i < levelReader.getMaxLightLevel();
        }
    }

    private static boolean canPropagate(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        BlockPos blockpos = blockPos.above();
        return canBeGrass(blockState, levelReader, blockPos) && !levelReader.getFluidState(blockpos).is(FluidTags.WATER);
    }

    @Override
    protected void randomTick(@NotNull BlockState state, @NotNull ServerLevel serverLevel, @NotNull BlockPos blockPos, @NotNull RandomSource randomSource) {
        if (!canBeGrass(state, serverLevel, blockPos)) {
            if (!serverLevel.isAreaLoaded(blockPos, 1)) return;
            serverLevel.setBlockAndUpdate(blockPos, EUBlocks.FRIGUS_DIRT.get().defaultBlockState());
        } else {
            if (!serverLevel.isAreaLoaded(blockPos, 3)) return;
            if (serverLevel.getMaxLocalRawBrightness(blockPos.above()) >= 9) {
                BlockState blockstate = this.defaultBlockState();

                for (int i = 0; i < 4; i++) {
                    BlockPos blockpos = blockPos.offset(randomSource.nextInt(3) - 1, randomSource.nextInt(5) - 3, randomSource.nextInt(3) - 1);
                    if (serverLevel.getBlockState(blockpos).is(EUBlocks.FRIGUS_DIRT) && canPropagate(blockstate, serverLevel, blockpos)) {
                        serverLevel.setBlockAndUpdate(
                                blockpos, blockstate.setValue(SNOWY, serverLevel.getBlockState(blockpos.above()).is(Blocks.SNOW))
                        );
                    }
                }
            }
        }
    }
}