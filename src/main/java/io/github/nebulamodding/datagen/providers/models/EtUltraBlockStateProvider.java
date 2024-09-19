package io.github.nebulamodding.datagen.providers.models;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EtUltraBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.ArrayList;
import java.util.List;

public class EtUltraBlockStateProvider extends BlockStateProvider {
    public EtUltraBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EtUltra.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // To exclude a block, just add it to the list using #add
        final List<DeferredBlock<Block>> excludedBlocks = new ArrayList<>();
        excludedBlocks.add(EtUltraBlocks.PLANET_BLOCKS.get("ganymede_block").get());
        // Automatically provide models to blocks and block items
        EtUltraBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !excludedBlocks.contains(b))
                .forEach(entry -> {
                    cubeAll(entry.get());
                    simpleBlockWithItem(entry.get(), new ModelFile.UncheckedModelFile(entry.getId().withPrefix("block/")));
                });
    }
}