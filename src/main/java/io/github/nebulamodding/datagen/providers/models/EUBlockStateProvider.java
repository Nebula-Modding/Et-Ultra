package io.github.nebulamodding.datagen.providers.models;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.blocks.EUBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

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
        excludedBlocks.add(EUBlocks.FRIGUS_GRASS_BLOCK);

        excludedBlocks.add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_brick_slab"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_brick_slab"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tile_slab"));

        excludedBlocks.add(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_brick_slab"));
        excludedBlocks.add(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_tile_slab"));





        // AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

        excludedBlocks.add(EUBlocks.MERCURY_BLOCKS.get("mercury_deepslate_brick_slab"));
        excludedBlocks.add(EUBlocks.MERCURY_BLOCKS.get("mercury_deepslate_tile_slab"));

        excludedBlocks.add(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_slab"));
        excludedBlocks.add(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_brick_slab"));

        excludedBlocks.add(EUBlocks.MOON_BLOCKS.get("moon_deepslate_brick_slab"));
        excludedBlocks.add(EUBlocks.MOON_BLOCKS.get("moon_deepslate_tile_slab"));

        excludedBlocks.add(EUBlocks.MARS_BLOCKS.get("mars_deepslate_brick_slab"));
        excludedBlocks.add(EUBlocks.MARS_BLOCKS.get("mars_deepslate_tile_slab"));

        excludedBlocks.add(EUBlocks.WATER_ICE_BLOCKS.get("water_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_brick_slab"));

        excludedBlocks.add(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_brick_slab"));

        //excludedBlocks.add(EUBlocks.METHANE_ICE_BLOCKS.get("methane_ice_brick_slab"));
        //excludedBlocks.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_brick_slab"));
        //excludedBlocks.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_brick_slab"));

        excludedBlocks.add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_brick_slab"));

        excludedBlocks.add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_brick_slab"));

        excludedBlocks.add(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_brick_slab"));

        excludedBlocks.add(EUBlocks.SALT_PACKED_BLOCKS.get("salt_slab"));
        excludedBlocks.add(EUBlocks.SALT_PACKED_BLOCKS.get("salt_brick_slab"));
        excludedBlocks.add(EUBlocks.SALT_PACKED_BLOCKS.get("salt_tile_slab"));

        excludedBlocks.add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_slab"));
        excludedBlocks.add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_brick_slab"));
        excludedBlocks.add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_tile_slab"));

        excludedBlocks.add(EUBlocks.FLESH_BLOCKS.get("flesh_slab"));
        excludedBlocks.add(EUBlocks.FLESH_BLOCKS.get("flesh_brick_slab"));

        excludedBlocks.add(EUBlocks.ROTTEN_FLESH_BLOCKS.get("rotten_flesh_slab"));

        excludedBlocks.add(EUBlocks.MISCELLANEOUS_BLOCKS.get("erdragh_slab"));


        //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA




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