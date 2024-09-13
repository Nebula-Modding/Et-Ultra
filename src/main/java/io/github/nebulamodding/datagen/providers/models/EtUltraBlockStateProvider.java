package io.github.nebulamodding.datagen.providers.models;

import com.ibm.icu.impl.data.ResourceReader;
import io.github.nebulamodding.registry.EtUltraBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class EtUltraBlockStateProvider extends BlockStateProvider {
    public EtUltraBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, "et_ultra", existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        EtUltraBlocks.BLOCKS.getEntries()
                .forEach(entry -> {
                    cubeAll(entry.get());
                    simpleBlockWithItem(entry.get(), new ModelFile.UncheckedModelFile(entry.getId().withPrefix("block/")));
                });
    }
}