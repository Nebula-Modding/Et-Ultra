package io.github.nebulamodding.etultra.blocktypes;

import com.mojang.serialization.MapCodec;
import io.github.nebulamodding.etultra.registry.block.EUBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class FrigusDirtPathBlock extends Block {
    public static final MapCodec<FrigusDirtPathBlock> CODEC = simpleCodec(FrigusDirtPathBlock::new);
    protected static final VoxelShape SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);

    @Override
    public @NotNull MapCodec<FrigusDirtPathBlock> codec() {
        return CODEC;
    }

    public FrigusDirtPathBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected boolean useShapeForLightOcclusion(@NotNull BlockState blockState) {
        return true;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        return !this.defaultBlockState().canSurvive(blockPlaceContext.getLevel(), blockPlaceContext.getClickedPos())
                ? Block.pushEntitiesUp(this.defaultBlockState(), EUBlocks.FRIGUS_DIRT.get().defaultBlockState(), blockPlaceContext.getLevel(), blockPlaceContext.getClickedPos())
                : super.getStateForPlacement(blockPlaceContext);
    }

    @Override
    protected @NotNull BlockState updateShape(
            @NotNull BlockState blockState, @NotNull Direction direction, @NotNull BlockState blockState2, @NotNull LevelAccessor levelAccessor, @NotNull BlockPos blockPos, @NotNull BlockPos blockPos2
    ) {
        if (direction == Direction.UP && !blockState.canSurvive(levelAccessor, blockPos)) {
            levelAccessor.scheduleTick(blockPos, this, 1);
        }

        return super.updateShape(blockState, direction, blockState2, levelAccessor, blockPos, blockPos2);
    }

    @Override
    protected void tick(@NotNull BlockState blockState, @NotNull ServerLevel serverLevel, @NotNull BlockPos blockPos, @NotNull RandomSource randomSource) {
        FrigusFarmlandBlock.turnToFrigusDirt(null, blockState, serverLevel, blockPos);
    }

    @Override
    protected boolean canSurvive(@NotNull BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        BlockState blockstate = levelReader.getBlockState(blockPos.above());
        return !blockstate.isSolid() || blockstate.getBlock() instanceof FenceGateBlock;
    }

    @Override
    protected @NotNull VoxelShape getShape(@NotNull BlockState blockState, @NotNull BlockGetter blockGetter, @NotNull BlockPos blockPos, @NotNull CollisionContext collisionContext) {
        return SHAPE;
    }

    @Override
    protected boolean isPathfindable(@NotNull BlockState blockState, @NotNull PathComputationType pathComputationType) {
        return false;
    }
}
