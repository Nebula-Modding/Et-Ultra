package io.github.nebulamodding.datagen.providers.models;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EtUltraBlocks;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class EtUltraBlockStateProvider extends BlockStateProvider {

    protected static final ExistingFileHelper.ResourceType TEXTURE = new ExistingFileHelper.ResourceType(PackType.CLIENT_RESOURCES, ".png", "textures");

    public EtUltraBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EtUltra.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //ModBlocks.CUBES.stream().map(RegistryEntry::get).forEach(this::basicBlock); is what AA uses

        /*
        public class EndPortalFrameBlock extends Block {
    // Note: It is possible to directly use the values in BlockStateProperties instead of referencing them here again.
    // However, for the sake of simplicity and readability, it is recommended to add constants like this.
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public static final BooleanProperty EYE = BlockStateProperties.EYE;

    public EndPortalFrameBlock(BlockBehaviour.Properties pProperties) {
        super(pProperties);
        // stateDefinition.any() returns a random BlockState from an internal set,
        // we don't care because we're setting all values ourselves anyway
        registerDefaultState(stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(EYE, false)
        );
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        // this is where the properties are actually added to the state
        pBuilder.add(FACING, EYE);
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        // code that determines which state will be used when
        // placing down this block, depending on the BlockPlaceContext
    }
}









         */


        //normalBlock(EtUltraBlocks.COBBLED_MOON_DEEPSLATE.get());
        //normalBlock(EtUltraBlocks.CHISELED_MOON_DEEPSLATE.get());
        //normalBlock(EtUltraBlocks.POLISHED_MOON_DEEPSLATE.get());
        //normalBlock(EtUltraBlocks.MOON_DEEPSLATE_BRICKS.get());
        //normalBlock(EtUltraBlocks.CRACKED_MOON_DEEPSLATE_BRICKS.get());
        //normalBlock(EtUltraBlocks.MOON_DEEPSLATE_TILES.get());

        //normalBlock(EtUltraBlocks.MARS_DEEPSLATE.get());
        //normalBlock(EtUltraBlocks.COBBLED_MARS_DEEPSLATE.get());
        //normalBlock(EtUltraBlocks.CHISELED_MARS_DEEPSLATE.get());
        //normalBlock(EtUltraBlocks.POLISHED_MARS_DEEPSLATE.get());
        //normalBlock(EtUltraBlocks.MARS_DEEPSLATE_BRICKS.get());
        //normalBlock(EtUltraBlocks.CRACKED_MARS_DEEPSLATE_BRICKS.get());
        //normalBlock(EtUltraBlocks.MARS_DEEPSLATE_TILES.get());

        //normalBlock(EtUltraBlocks.GRAPHITE_BLOCK.get());
        //normalBlock(EtUltraBlocks.GRAPHITE_DUST.get());
    }

    public void basicBlock(Block block) {
        simpleBlockItem(block, models().getBuilder(getName()));
        simpleBlock(block);
    }

    public void basicBlock(Block block, ModelFile model) {
        simpleBlockItem(block, models().getBuilder(getName()));
        simpleBlock(block, model);
    }

    public void basicBlockNoState(Block block) {
        simpleBlockItem(block, models().getBuilder(name(block)));
        cubeAll(block);
    }

    public void basicCubeColumn(Block block) {
        basicBlock(block,
                models().cubeColumn(
                        name(block),
                        modLoc("block/" + name(block)),
                        modLoc("block/" + name(block) + "_top")));
    }

    private ResourceLocation key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }

    private String name(Block block) {
        return this.key(block).getPath();
    }

    public void existingBlock(Block block) {
        simpleBlock(block, models().getExistingFile(modLoc("block/%s".formatted(name(block)))));
    }
}