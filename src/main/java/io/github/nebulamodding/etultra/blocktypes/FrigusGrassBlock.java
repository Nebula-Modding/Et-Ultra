package io.github.nebulamodding.etultra.blocktypes;

import io.github.nebulamodding.etultra.registry.EUBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.state.BlockState;

import org.jetbrains.annotations.NotNull;


public class FrigusGrassBlock extends GrassBlock {
    public FrigusGrassBlock(Properties properties) {
        super(properties);
    }

    private static boolean canBeGrass(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos above = pos.above();
        BlockState aboveState = level.getBlockState(above);
        return !aboveState.isSolidRender(level, pos.above()) || aboveState.getFluidState().getAmount() == 8;
    }

    private static boolean canPropagate(BlockState state, LevelReader level, BlockPos sourcePos, BlockPos targetPos) {
        BlockState targetState = level.getBlockState(targetPos);
        return targetState.is(EUBlocks.FRIGUS_DIRT.get()) && canBeGrass(state, level, targetPos);
    }

    @Override
    public void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        if (!canBeGrass(state, level, pos)) {
            level.setBlockAndUpdate(pos, EUBlocks.FRIGUS_DIRT.get().defaultBlockState());
        } else {
            if (level.getMaxLocalRawBrightness(pos.above()) >= 9) {
                BlockPos.MutableBlockPos targetPos = new BlockPos.MutableBlockPos();
                for (int i = 0; i < 4; ++i) {
                    targetPos.setWithOffset(pos, random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                    if (canPropagate(state, level, pos, targetPos)) {
                        level.setBlockAndUpdate(targetPos, EUBlocks.FRIGUS_GRASS_BLOCK.get().defaultBlockState());
                    }
                }
            }
        }
    }
}