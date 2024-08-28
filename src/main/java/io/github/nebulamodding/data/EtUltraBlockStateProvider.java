package io.github.nebulamodding.data;


import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EtUltraBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class EtUltraBlockStateProvider extends BlockStateProvider {
    // Parameter values are provided by GatherDataEvent.
    public EtUltraBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        // Replace "examplemod" with your own mod id.
        super(output, EtUltra.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Placeholders, their usages should be replaced with real values. See above for how to use the model builder,
        // and below for the helpers the model builder offers.
        ModelFile exampleModel = models().withExistingParent("minecraft:deepslate","");
        Block block = EtUltraBlocks.MARS_DEEPSLATE.get();
        ResourceLocation exampleTexture = modLoc("block/example_texture");
        ResourceLocation bottomTexture = modLoc("block/example_texture_bottom");
        ResourceLocation topTexture = modLoc("block/example_texture_top");
        ResourceLocation sideTexture = modLoc("block/example_texture_front");
        ResourceLocation frontTexture = modLoc("block/example_texture_front");

        // Create a simple block model with the same texture on each side.
        // The texture must be located at assets/<namespace>/textures/block/<path>.png, where
        // <namespace> and <path> are the block's registry name's namespace and path, respectively.
        // Used by the majority of (full) blocks, such as planks, cobblestone or bricks.
        simpleBlock(block);
        // Overload that accepts a model file to use.
        simpleBlock(block, exampleModel);
        // Overload that accepts one or multiple (vararg) ConfiguredModel objects.
        // See below for more info about ConfiguredModel.
        simpleBlock(block, ConfiguredModel.builder().build());
        // Adds an item model file with the block's name, parenting the given model file, for a block item to pick up.
        simpleBlockItem(block, exampleModel);
        // Shorthand for calling #simpleBlock() (model file overload) and #simpleBlockItem.
        simpleBlockWithItem(block, exampleModel);


    }
}