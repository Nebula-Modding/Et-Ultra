package io.github.nebulamodding.datagen.providers.models;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EtUltraBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class EtUltraBlockStateProvider extends BlockStateProvider {
    public EtUltraBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EtUltra.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        normalBlock(EtUltraBlocks.COBBLED_MOON_DEEPSLATE.get());
        normalBlock(EtUltraBlocks.CHISELED_MOON_DEEPSLATE.get());
        normalBlock(EtUltraBlocks.POLISHED_MOON_DEEPSLATE.get());
        normalBlock(EtUltraBlocks.MOON_DEEPSLATE_BRICKS.get());
        normalBlock(EtUltraBlocks.CRACKED_MOON_DEEPSLATE_BRICKS.get());
        normalBlock(EtUltraBlocks.MOON_DEEPSLATE_TILES.get());

        normalBlock(EtUltraBlocks.MARS_DEEPSLATE.get());
        normalBlock(EtUltraBlocks.COBBLED_MARS_DEEPSLATE.get());
        normalBlock(EtUltraBlocks.CHISELED_MARS_DEEPSLATE.get());
        normalBlock(EtUltraBlocks.POLISHED_MARS_DEEPSLATE.get());
        normalBlock(EtUltraBlocks.MARS_DEEPSLATE_BRICKS.get());
        normalBlock(EtUltraBlocks.CRACKED_MARS_DEEPSLATE_BRICKS.get());
        normalBlock(EtUltraBlocks.MARS_DEEPSLATE_TILES.get());

        normalBlock(EtUltraBlocks.GRAPHITE_BLOCK.get());
        normalBlock(EtUltraBlocks.GRAPHITE_DUST.get());
    }

    private void normalBlock(Block block) {
        ResourceLocation blockKey = BuiltInRegistries.BLOCK.getKey(block);
        String path = blockKey.getPath();
        simpleBlock(block, models().cubeAll(path, modLoc("block/" + path)));
        simpleBlockItem(block, models().getExistingFile(modLoc("block/" + path)));
    }
}