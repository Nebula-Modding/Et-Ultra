package io.github.nebulamodding.datagen.providers.models;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EUBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EUBlockStateProvider extends BlockStateProvider {
    public EUBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EtUltra.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // To exclude a block, just add it to the list using #add
        final List<DeferredBlock<? extends Block>> excludedBlocks = new ArrayList<>();
        //excludedBlocks.add(EUBlocks.PLANET_BLOCKS.get("ganymede_block"));
        // Automatically provide models to blocks and block items
        for (var entry : EUBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !excludedBlocks.contains(b))
                .collect(Collectors.toSet())
        ) {
            var model = new ModelFile.UncheckedModelFile(entry.getId().withPrefix("block/"));
            if (entry.get() instanceof RotatedPillarBlock pillarBlock) {
                logBlock(pillarBlock);
            } else if (entry.get() instanceof SlabBlock slabBlock) {
                ResourceLocation textureId = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_slab", ""));
                slabBlock(
                        slabBlock,
                        models().slab(name(slabBlock), textureId, textureId, textureId),
                        models().slabTop(name(slabBlock) + "_top", textureId, textureId, textureId),
                        new ModelFile.UncheckedModelFile(textureId)
                );
            } else {
                cubeAll(entry.get());
                simpleBlock(entry.get());
            }
            simpleBlockItem(entry.get(), model);
        }
    }

    // Both of these are from BlockStateProvider
    // Please someone tell me why these are not protected or public...
    // I don't knowwwwwwwww :sob:
    private ResourceLocation key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }

    private String name(Block block) {
        return key(block).getPath();
    }
}