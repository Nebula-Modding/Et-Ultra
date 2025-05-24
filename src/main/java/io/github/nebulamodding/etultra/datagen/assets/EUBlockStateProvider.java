package io.github.nebulamodding.etultra.datagen.assets;

import io.github.nebulamodding.etultra.EtUltra;
import io.github.nebulamodding.etultra.registry.block.EUBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
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
        final List<DeferredBlock<? extends Block>> excludedBlocks = new ArrayList<>();
        // Blocks excluded from having blockstates and models provided
        excludedBlocks.add(EUBlocks.MAYURA_WOOD);
        excludedBlocks.add(EUBlocks.STRIPPED_MAYURA_WOOD);
        excludedBlocks.add(EUBlocks.MAYURA_STAIRS);
        excludedBlocks.add(EUBlocks.MAYURA_SLAB);
        excludedBlocks.add(EUBlocks.MAYURA_FENCE);
        excludedBlocks.add(EUBlocks.MAYURA_FENCE_GATE);
        excludedBlocks.add(EUBlocks.MAYURA_DOOR);
        excludedBlocks.add(EUBlocks.MAYURA_TRAPDOOR);
        excludedBlocks.add(EUBlocks.MAYURA_PRESSURE_PLATE);
        excludedBlocks.add(EUBlocks.MAYURA_BUTTON);
        excludedBlocks.add(EUBlocks.MAYURA_SAPLING);

        excludedBlocks.add(EUBlocks.GRIMWOOD_WOOD);
        excludedBlocks.add(EUBlocks.STRIPPED_GRIMWOOD_WOOD);
        excludedBlocks.add(EUBlocks.GRIMWOOD_STAIRS);
        excludedBlocks.add(EUBlocks.GRIMWOOD_SLAB);
        excludedBlocks.add(EUBlocks.GRIMWOOD_FENCE);
        excludedBlocks.add(EUBlocks.GRIMWOOD_FENCE_GATE);
        excludedBlocks.add(EUBlocks.GRIMWOOD_DOOR);
        excludedBlocks.add(EUBlocks.GRIMWOOD_TRAPDOOR);
        excludedBlocks.add(EUBlocks.GRIMWOOD_PRESSURE_PLATE);
        excludedBlocks.add(EUBlocks.GRIMWOOD_BUTTON);
        excludedBlocks.add(EUBlocks.GRIMWOOD_SAPLING);

        excludedBlocks.add(EUBlocks.FRIGUS_GRASS_BLOCK);
        excludedBlocks.add(EUBlocks.FRIGUS_DIRT_PATH);
        excludedBlocks.add(EUBlocks.FRIGUS_FARMLAND);

        excludedBlocks.add(EUBlocks.FRIGUS_MUD_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.FRIGUS_MUD_BRICK_SLAB);
        excludedBlocks.add(EUBlocks.FRIGUS_MUD_BRICK_WALL);

        excludedBlocks.add(EUBlocks.FRIGUS_SHORT_GRASS);
        excludedBlocks.add(EUBlocks.VIVIAN);
        excludedBlocks.add(EUBlocks.WICKUL);
        excludedBlocks.add(EUBlocks.ICEFLOWER);

        excludedBlocks.add(EUBlocks.BLUESCHIST_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("blueschist_brick_slab"));
        excludedBlocks.add(EUBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("blueschist_brick_wall"));

        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_TILE_STAIRS);
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_brick_slab"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_tile_slab"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_brick_slab"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_tile_slab"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_brick_wall"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_tile_wall"));

        excludedBlocks.add(EUBlocks.PERMAFROST_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.PERMAFROST_TILE_STAIRS);
        excludedBlocks.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_slab"));
        excludedBlocks.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_slab"));
        excludedBlocks.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_slab"));
        excludedBlocks.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_slab"));
        excludedBlocks.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_wall"));
        excludedBlocks.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_wall"));

        excludedBlocks.add(EUBlocks.KARCASS_STONE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.KARCASS_STONE_BLOCKS_CONTINUED.get("karcass_stone_brick_slab"));
        excludedBlocks.add(EUBlocks.KARCASS_STONE_BLOCKS_CONTINUED.get("karcass_stone_brick_wall"));

        excludedBlocks.add(EUBlocks.WATER_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_brick_wall"));
        excludedBlocks.add(EUBlocks.THOLIN_POOR_WATER_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_brick_wall"));
        excludedBlocks.add(EUBlocks.THOLIN_RICH_WATER_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_brick_wall"));
        excludedBlocks.add(EUBlocks.BLACK_WATER_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_brick_wall"));

        excludedBlocks.add(EUBlocks.METHANE_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_brick_wall"));
        excludedBlocks.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_brick_wall"));
        excludedBlocks.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_brick_wall"));

        excludedBlocks.add(EUBlocks.CARBON_DIOXIDE_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_brick_wall"));
        excludedBlocks.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_brick_wall"));
        excludedBlocks.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_brick_wall"));

        excludedBlocks.add(EUBlocks.AMMONIA_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_brick_wall"));

        excludedBlocks.add(EUBlocks.NITROGEN_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_brick_wall"));
        excludedBlocks.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_brick_wall"));
        excludedBlocks.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_brick_wall"));
        excludedBlocks.add(EUBlocks.RED_NITROGEN_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_brick_wall"));

        excludedBlocks.add(EUBlocks.SULFUR_DIOXIDE_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_brick_wall"));

        excludedBlocks.add(EUBlocks.OXYGEN_ICE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_brick_wall"));

        excludedBlocks.add(EUBlocks.CUT_SALT_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.CUT_SALT_BLOCKS_CONTINUED.get("cut_salt_brick_slab"));
        excludedBlocks.add(EUBlocks.CUT_SALT_BLOCKS_CONTINUED.get("cut_salt_brick_wall"));

        excludedBlocks.add(EUBlocks.GRAPHITE_CLUSTER);
        excludedBlocks.add(EUBlocks.CUT_GRAPHITE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.CUT_GRAPHITE_BLOCKS_CONTINUED.get("cut_graphite_brick_slab"));
        excludedBlocks.add(EUBlocks.CUT_GRAPHITE_BLOCKS_CONTINUED.get("cut_graphite_brick_wall"));

        excludedBlocks.add(EUBlocks.CUT_SULFUR_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.CUT_SULFUR_BLOCKS_CONTINUED.get("cut_sulfur_brick_slab"));
        excludedBlocks.add(EUBlocks.CUT_SULFUR_BLOCKS_CONTINUED.get("cut_sulfur_brick_wall"));

        excludedBlocks.add(EUBlocks.TUMOR);
        excludedBlocks.add(EUBlocks.GRISTLED_FLESH);
        excludedBlocks.add(EUBlocks.SHORT_GRISTLES);
        excludedBlocks.add(EUBlocks.TALL_GRISTLES);
        excludedBlocks.add(EUBlocks.GORESLATE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.GORESLATE_TILE_STAIRS);
        excludedBlocks.add(EUBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_brick_slab"));
        excludedBlocks.add(EUBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_tile_slab"));
        excludedBlocks.add(EUBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_brick_slab"));
        excludedBlocks.add(EUBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_tile_slab"));
        excludedBlocks.add(EUBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_brick_wall"));
        excludedBlocks.add(EUBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_tile_wall"));

        excludedBlocks.add(EUBlocks.MALUNITE_FACTORY_BLOCK);
        excludedBlocks.add(EUBlocks.OBDURIUM_FACTORY_BLOCK);

        excludedBlocks.add(EUBlocks.LUTRUM_FACTORY_BLOCK);
        excludedBlocks.add(EUBlocks.CHISELED_LUTRUM);
        excludedBlocks.add(EUBlocks.LUTRUM_GRATE);
        excludedBlocks.add(EUBlocks.LUTRUM_DOOR);
        excludedBlocks.add(EUBlocks.LUTRUM_TRAPDOOR);
        excludedBlocks.add(EUBlocks.LUTRUM_BULB);
        excludedBlocks.add(EUBlocks.EXPOSED_LUTRUM_FACTORY_BLOCK);
        excludedBlocks.add(EUBlocks.EXPOSED_CHISELED_LUTRUM);
        excludedBlocks.add(EUBlocks.EXPOSED_LUTRUM_GRATE);
        excludedBlocks.add(EUBlocks.EXPOSED_LUTRUM_DOOR);
        excludedBlocks.add(EUBlocks.EXPOSED_LUTRUM_TRAPDOOR);
        excludedBlocks.add(EUBlocks.EXPOSED_LUTRUM_BULB);
        excludedBlocks.add(EUBlocks.WEATHERED_LUTRUM_FACTORY_BLOCK);
        excludedBlocks.add(EUBlocks.WEATHERED_CHISELED_LUTRUM);
        excludedBlocks.add(EUBlocks.WEATHERED_LUTRUM_GRATE);
        excludedBlocks.add(EUBlocks.WEATHERED_LUTRUM_DOOR);
        excludedBlocks.add(EUBlocks.WEATHERED_LUTRUM_TRAPDOOR);
        excludedBlocks.add(EUBlocks.WEATHERED_LUTRUM_BULB);
        excludedBlocks.add(EUBlocks.OXIDIZED_LUTRUM_FACTORY_BLOCK);
        excludedBlocks.add(EUBlocks.OXIDIZED_CHISELED_LUTRUM);
        excludedBlocks.add(EUBlocks.OXIDIZED_LUTRUM_GRATE);
        excludedBlocks.add(EUBlocks.OXIDIZED_LUTRUM_DOOR);
        excludedBlocks.add(EUBlocks.OXIDIZED_LUTRUM_TRAPDOOR);
        excludedBlocks.add(EUBlocks.OXIDIZED_LUTRUM_BULB);

        excludedBlocks.add(EUBlocks.WAXED_LUTRUM_FACTORY_BLOCK);
        excludedBlocks.add(EUBlocks.WAXED_ENCASED_LUTRUM_BLOCK);
        excludedBlocks.add(EUBlocks.WAXED_LUTRUM_PLATEBLOCK);
        excludedBlocks.add(EUBlocks.WAXED_LUTRUM_PANEL);
        excludedBlocks.add(EUBlocks.WAXED_LUTRUM_BLOCK);
        excludedBlocks.add(EUBlocks.WAXED_LUTRUM_PLATING);
        excludedBlocks.add(EUBlocks.WAXED_LUTRUM_PILLAR);
        excludedBlocks.add(EUBlocks.WAXED_GLOWING_LUTRUM_PILLAR);
        excludedBlocks.add(EUBlocks.WAXED_MARKED_LUTRUM_PILLAR);
        excludedBlocks.add(EUBlocks.WAXED_CHISELED_LUTRUM);
        excludedBlocks.add(EUBlocks.WAXED_LUTRUM_GRATE);
        excludedBlocks.add(EUBlocks.WAXED_LUTRUM_PLATING_STAIRS);
        excludedBlocks.add(EUBlocks.WAXED_LUTRUM_PLATING_SLAB);
        excludedBlocks.add(EUBlocks.WAXED_LUTRUM_PLATING_PRESSURE_PLATE);
        excludedBlocks.add(EUBlocks.WAXED_LUTRUM_PLATING_BUTTON);
        excludedBlocks.add(EUBlocks.WAXED_LUTRUM_DOOR);
        excludedBlocks.add(EUBlocks.WAXED_LUTRUM_TRAPDOOR);
        excludedBlocks.add(EUBlocks.WAXED_LUTRUM_BULB);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_LUTRUM_FACTORY_BLOCK);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_ENCASED_LUTRUM_BLOCK);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_LUTRUM_PLATEBLOCK);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_LUTRUM_PANEL);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_LUTRUM_BLOCK);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_LUTRUM_PLATING);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_LUTRUM_PILLAR);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_GLOWING_LUTRUM_PILLAR);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_MARKED_LUTRUM_PILLAR);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_CHISELED_LUTRUM);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_LUTRUM_GRATE);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_LUTRUM_PLATING_STAIRS);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_LUTRUM_PLATING_SLAB);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_LUTRUM_PLATING_PRESSURE_PLATE);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_LUTRUM_PLATING_BUTTON);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_LUTRUM_DOOR);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_LUTRUM_TRAPDOOR);
        excludedBlocks.add(EUBlocks.WAXED_EXPOSED_LUTRUM_BULB);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_LUTRUM_FACTORY_BLOCK);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_ENCASED_LUTRUM_BLOCK);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_LUTRUM_PLATEBLOCK);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_LUTRUM_PANEL);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_LUTRUM_BLOCK);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_LUTRUM_PLATING);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_LUTRUM_PILLAR);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_GLOWING_LUTRUM_PILLAR);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_MARKED_LUTRUM_PILLAR);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_CHISELED_LUTRUM);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_LUTRUM_GRATE);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_LUTRUM_PLATING_STAIRS);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_LUTRUM_PLATING_SLAB);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_LUTRUM_PLATING_PRESSURE_PLATE);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_LUTRUM_PLATING_BUTTON);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_LUTRUM_DOOR);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_LUTRUM_TRAPDOOR);
        excludedBlocks.add(EUBlocks.WAXED_WEATHERED_LUTRUM_BULB);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_LUTRUM_FACTORY_BLOCK);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_ENCASED_LUTRUM_BLOCK);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_LUTRUM_PLATEBLOCK);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_LUTRUM_PANEL);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_LUTRUM_BLOCK);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_LUTRUM_PLATING);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_LUTRUM_PILLAR);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_GLOWING_LUTRUM_PILLAR);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_MARKED_LUTRUM_PILLAR);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_CHISELED_LUTRUM);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_LUTRUM_GRATE);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_STAIRS);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_SLAB);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_PRESSURE_PLATE);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_BUTTON);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_LUTRUM_DOOR);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_LUTRUM_TRAPDOOR);
        excludedBlocks.add(EUBlocks.WAXED_OXIDIZED_LUTRUM_BULB);

        excludedBlocks.add(EUBlocks.POTTED_MAYURA_SAPLING);
        excludedBlocks.add(EUBlocks.POTTED_GRIMWOOD_SAPLING);
        excludedBlocks.add(EUBlocks.POTTED_VIVIAN);
        excludedBlocks.add(EUBlocks.POTTED_WICKUL);
        excludedBlocks.add(EUBlocks.POTTED_ICEFLOWER);

        /*
        Automated Block Models
         */

        for (var entry : EUBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !excludedBlocks.contains(b))
                .collect(Collectors.toSet())
        ) {
            var model = new ModelFile.UncheckedModelFile(entry.getId().withPrefix("block/"));
            if (entry.get() instanceof RotatedPillarBlock pillarBlock) {
                logBlock(pillarBlock);
                simpleBlockItem(entry.get(), model);
            } else if (entry.get() instanceof StairBlock stairBlock) {
                ResourceLocation texture = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_stairs", ""));
                stairsBlock(stairBlock, texture);
                simpleBlockItem(stairBlock, model);
            } else if (entry.get() instanceof SlabBlock slabBlock) {
                ResourceLocation textureId = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_slab", ""));
                slabBlock(
                        slabBlock,
                        models().slab(name(slabBlock), textureId, textureId, textureId),
                        models().slabTop(name(slabBlock) + "_top", textureId, textureId, textureId),
                        new ModelFile.UncheckedModelFile(textureId)
                );
                simpleBlockItem(slabBlock, model);
            } else if (entry.get() instanceof WallBlock wallBlock) {
                ResourceLocation texture = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_wall", ""));
                wallBlock(wallBlock, texture);
                models().wallInventory(entry.getId().getPath() + "_inventory", texture);
                simpleBlockItem(wallBlock, new ModelFile.UncheckedModelFile(entry.getId().withPrefix("block/").withSuffix("_inventory")));
            } else if (entry.get() instanceof ButtonBlock buttonBlock) {
                ResourceLocation texture = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_button", ""));
                buttonBlock(buttonBlock, texture);
                models().buttonInventory(entry.getId().getPath() + "_inventory", texture);
                simpleBlockItem(buttonBlock, new ModelFile.UncheckedModelFile(entry.getId().withPrefix("block/").withSuffix("_inventory")));
            } else if (entry.get() instanceof PressurePlateBlock pressurePlateBlock) {
                ResourceLocation texture = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_pressure_plate", ""));
                pressurePlateBlock(pressurePlateBlock, texture);
                simpleBlockItem(pressurePlateBlock, model);
            } else {
                cubeAll(entry.get());
                simpleBlock(entry.get());
                simpleBlockItem(entry.get(), model);
            }
        }

        /*
        Manual Block Models
         */

        axisBlockWithItem(EUBlocks.MAYURA_WOOD, blockLoc(EUBlocks.MAYURA_LOG), blockLoc(EUBlocks.MAYURA_LOG));
        axisBlockWithItem(EUBlocks.STRIPPED_MAYURA_WOOD, blockLoc(EUBlocks.STRIPPED_MAYURA_LOG), blockLoc(EUBlocks.STRIPPED_MAYURA_LOG));
        stairsBlockWithItem(EUBlocks.MAYURA_STAIRS, blockLoc(EUBlocks.MAYURA_PLANKS));
        slabBlockWithItem(EUBlocks.MAYURA_SLAB, blockLoc(EUBlocks.MAYURA_PLANKS), blockLoc(EUBlocks.MAYURA_PLANKS));
        fenceBlockWithItem(EUBlocks.MAYURA_FENCE, blockLoc(EUBlocks.MAYURA_PLANKS));
        fenceGateBlockWithItem(EUBlocks.MAYURA_FENCE_GATE, blockLoc(EUBlocks.MAYURA_PLANKS));
        doorBlockWithItem(EUBlocks.MAYURA_DOOR, blockLoc(EUBlocks.MAYURA_DOOR, "bottom"), blockLoc(EUBlocks.MAYURA_DOOR, "top"), "cutout");
        trapDoorBlockWithItem(EUBlocks.MAYURA_TRAPDOOR, blockLoc(EUBlocks.MAYURA_TRAPDOOR), true, "cutout");
        pressurePlateBlockWithItem(EUBlocks.MAYURA_PRESSURE_PLATE, blockLoc(EUBlocks.MAYURA_PLANKS));
        buttonBlockWithItem(EUBlocks.MAYURA_BUTTON, blockLoc(EUBlocks.MAYURA_PLANKS));
        simpleBlock(EUBlocks.MAYURA_SAPLING.get(), models().cross(EUBlocks.MAYURA_SAPLING.getId().getPath(), blockLoc(EUBlocks.MAYURA_SAPLING)).renderType("cutout"));

        axisBlockWithItem(EUBlocks.GRIMWOOD_WOOD, blockLoc(EUBlocks.GRIMWOOD_LOG), blockLoc(EUBlocks.GRIMWOOD_LOG));
        axisBlockWithItem(EUBlocks.STRIPPED_GRIMWOOD_WOOD, blockLoc(EUBlocks.STRIPPED_GRIMWOOD_LOG), blockLoc(EUBlocks.STRIPPED_GRIMWOOD_LOG));
        stairsBlockWithItem(EUBlocks.GRIMWOOD_STAIRS, blockLoc(EUBlocks.GRIMWOOD_PLANKS));
        slabBlockWithItem(EUBlocks.GRIMWOOD_SLAB, blockLoc(EUBlocks.GRIMWOOD_PLANKS), blockLoc(EUBlocks.GRIMWOOD_PLANKS));
        fenceBlockWithItem(EUBlocks.GRIMWOOD_FENCE, blockLoc(EUBlocks.GRIMWOOD_PLANKS));
        fenceGateBlockWithItem(EUBlocks.GRIMWOOD_FENCE_GATE, blockLoc(EUBlocks.GRIMWOOD_PLANKS));
        doorBlockWithItem(EUBlocks.GRIMWOOD_DOOR, blockLoc(EUBlocks.GRIMWOOD_DOOR, "bottom"), blockLoc(EUBlocks.GRIMWOOD_DOOR, "top"), "cutout");
        trapDoorBlockWithItem(EUBlocks.GRIMWOOD_TRAPDOOR, blockLoc(EUBlocks.GRIMWOOD_TRAPDOOR), true, "cutout");
        pressurePlateBlockWithItem(EUBlocks.GRIMWOOD_PRESSURE_PLATE, blockLoc(EUBlocks.GRIMWOOD_PLANKS));
        buttonBlockWithItem(EUBlocks.GRIMWOOD_BUTTON, blockLoc(EUBlocks.GRIMWOOD_PLANKS));
        simpleBlock(EUBlocks.GRIMWOOD_SAPLING.get(), models().cross(EUBlocks.GRIMWOOD_SAPLING.getId().getPath(), blockLoc(EUBlocks.GRIMWOOD_SAPLING)).renderType("cutout"));

        simpleBlock(EUBlocks.FRIGUS_SHORT_GRASS.get(), models().cross(EUBlocks.FRIGUS_SHORT_GRASS.getId().getPath(), blockLoc(EUBlocks.FRIGUS_SHORT_GRASS)).renderType("cutout"));
        simpleBlock(EUBlocks.VIVIAN.get(), models().cross("vivian", blockLoc(EUBlocks.VIVIAN)).renderType("cutout"));
        simpleBlock(EUBlocks.WICKUL.get(), models().cross("wickul", blockLoc(EUBlocks.WICKUL)).renderType("cutout"));
        simpleBlock(EUBlocks.ICEFLOWER.get(), models().cross("iceflower", blockLoc(EUBlocks.ICEFLOWER)).renderType("cutout"));

        stairsBlockWithItem(EUBlocks.FRIGUS_MUD_BRICK_STAIRS, blockLoc(EUBlocks.FRIGUS_MUD_BRICKS));
        slabBlockWithItem(EUBlocks.FRIGUS_MUD_BRICK_SLAB, blockLoc(EUBlocks.FRIGUS_MUD_BRICKS), blockLoc(EUBlocks.FRIGUS_MUD_BRICKS));
        wallBlockWithItem(EUBlocks.FRIGUS_MUD_BRICK_WALL, blockLoc(EUBlocks.FRIGUS_MUD_BRICKS));

        stairsBlockWithItem(EUBlocks.BLUESCHIST_BRICK_STAIRS, blockLoc(EUBlocks.BLUESCHIST_BLOCKS.get("blueschist_bricks")));
        slabBlockWithItem(EUBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("blueschist_brick_slab"), blockLoc(EUBlocks.BLUESCHIST_BLOCKS.get("blueschist_bricks")), blockLoc(EUBlocks.BLUESCHIST_BLOCKS.get("blueschist_bricks")));
        wallBlockWithItem(EUBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("blueschist_brick_wall"), blockLoc(EUBlocks.BLUESCHIST_BLOCKS.get("blueschist_bricks")));

        stairsBlockWithItem(EUBlocks.FRIGUS_DEEPSLATE_BRICK_STAIRS, blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks")));
        stairsBlockWithItem(EUBlocks.FRIGUS_DEEPSLATE_TILE_STAIRS, blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles")));
        slabBlockWithItem(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_brick_slab"), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks")), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks")));
        slabBlockWithItem(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_tile_slab"), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles")), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles")));
        wallBlockWithItem(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_brick_wall"), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks")));
        wallBlockWithItem(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_tile_wall"), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles")));

        stairsBlockWithItem(EUBlocks.PERMAFROST_BRICK_STAIRS, blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks")));
        stairsBlockWithItem(EUBlocks.PERMAFROST_TILE_STAIRS, blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles")));
        slabBlockWithItem(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_slab"), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks")), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks")));
        slabBlockWithItem(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_slab"), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles")), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles")));
        wallBlockWithItem(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_wall"), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks")));
        wallBlockWithItem(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_wall"), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles")));

        stairsBlockWithItem(EUBlocks.KARCASS_STONE_BRICK_STAIRS, blockLoc(EUBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone_bricks")));
        slabBlockWithItem(EUBlocks.KARCASS_STONE_BLOCKS_CONTINUED.get("karcass_stone_brick_slab"), blockLoc(EUBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone_bricks")), blockLoc(EUBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone_bricks")));
        wallBlockWithItem(EUBlocks.KARCASS_STONE_BLOCKS_CONTINUED.get("karcass_stone_brick_wall"), blockLoc(EUBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone_bricks")));

        stairsBlockWithItem(EUBlocks.WATER_ICE_BRICK_STAIRS, blockLoc(EUBlocks.WATER_ICE_BLOCKS.get("water_ice_bricks")));
        slabBlockWithItem(EUBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_brick_slab"), blockLoc(EUBlocks.WATER_ICE_BLOCKS.get("water_ice_bricks")), blockLoc(EUBlocks.WATER_ICE_BLOCKS.get("water_ice_bricks")));
        wallBlockWithItem(EUBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_brick_wall"), blockLoc(EUBlocks.WATER_ICE_BLOCKS.get("water_ice_bricks")));
        stairsBlockWithItem(EUBlocks.THOLIN_POOR_WATER_ICE_BRICK_STAIRS, blockLoc(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks")));
        slabBlockWithItem(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_brick_slab"), blockLoc(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks")), blockLoc(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks")));
        wallBlockWithItem(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_brick_wall"), blockLoc(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks")));
        stairsBlockWithItem(EUBlocks.THOLIN_RICH_WATER_ICE_BRICK_STAIRS, blockLoc(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks")));
        slabBlockWithItem(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_brick_slab"), blockLoc(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks")), blockLoc(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks")));
        wallBlockWithItem(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_brick_wall"), blockLoc(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks")));
        stairsBlockWithItem(EUBlocks.BLACK_WATER_ICE_BRICK_STAIRS, blockLoc(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks")));
        slabBlockWithItem(EUBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_brick_slab"), blockLoc(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks")), blockLoc(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks")));
        wallBlockWithItem(EUBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_brick_wall"), blockLoc(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks")));

        stairsBlockWithItem(EUBlocks.METHANE_ICE_BRICK_STAIRS, blockLoc(EUBlocks.METHANE_ICE_BLOCKS.get("methane_ice_bricks")));
        slabBlockWithItem(EUBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_brick_slab"), blockLoc(EUBlocks.METHANE_ICE_BLOCKS.get("methane_ice_bricks")), blockLoc(EUBlocks.METHANE_ICE_BLOCKS.get("methane_ice_bricks")));
        wallBlockWithItem(EUBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_brick_wall"), blockLoc(EUBlocks.METHANE_ICE_BLOCKS.get("methane_ice_bricks")));
        stairsBlockWithItem(EUBlocks.THOLIN_POOR_METHANE_ICE_BRICK_STAIRS, blockLoc(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks")));
        slabBlockWithItem(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_brick_slab"), blockLoc(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks")), blockLoc(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks")));
        wallBlockWithItem(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_brick_wall"), blockLoc(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks")));
        stairsBlockWithItem(EUBlocks.THOLIN_RICH_METHANE_ICE_BRICK_STAIRS, blockLoc(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks")));
        slabBlockWithItem(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_brick_slab"), blockLoc(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks")), blockLoc(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks")));
        wallBlockWithItem(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_brick_wall"), blockLoc(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks")));

        stairsBlockWithItem(EUBlocks.CARBON_DIOXIDE_ICE_BRICK_STAIRS, blockLoc(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks")));
        slabBlockWithItem(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_brick_slab"), blockLoc(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks")), blockLoc(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks")));
        wallBlockWithItem(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_brick_wall"), blockLoc(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks")));
        stairsBlockWithItem(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BRICK_STAIRS, blockLoc(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks")));
        slabBlockWithItem(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_brick_slab"), blockLoc(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks")), blockLoc(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks")));
        wallBlockWithItem(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_brick_wall"), blockLoc(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks")));
        stairsBlockWithItem(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BRICK_STAIRS, blockLoc(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks")));
        slabBlockWithItem(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_brick_slab"), blockLoc(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks")), blockLoc(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks")));
        wallBlockWithItem(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_brick_wall"), blockLoc(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks")));

        stairsBlockWithItem(EUBlocks.AMMONIA_ICE_BRICK_STAIRS, blockLoc(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks")));
        slabBlockWithItem(EUBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_brick_slab"), blockLoc(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks")), blockLoc(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks")));
        wallBlockWithItem(EUBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_brick_wall"), blockLoc(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks")));

        stairsBlockWithItem(EUBlocks.NITROGEN_ICE_BRICK_STAIRS, blockLoc(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks")));
        slabBlockWithItem(EUBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_brick_slab"), blockLoc(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks")), blockLoc(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks")));
        wallBlockWithItem(EUBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_brick_wall"), blockLoc(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks")));
        stairsBlockWithItem(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BRICK_STAIRS, blockLoc(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks")));
        slabBlockWithItem(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_brick_slab"), blockLoc(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks")), blockLoc(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks")));
        wallBlockWithItem(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_brick_wall"), blockLoc(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks")));
        stairsBlockWithItem(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BRICK_STAIRS, blockLoc(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks")));
        slabBlockWithItem(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_brick_slab"), blockLoc(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks")), blockLoc(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks")));
        wallBlockWithItem(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_brick_wall"), blockLoc(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks")));
        stairsBlockWithItem(EUBlocks.RED_NITROGEN_ICE_BRICK_STAIRS, blockLoc(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks")));
        slabBlockWithItem(EUBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_brick_slab"), blockLoc(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks")), blockLoc(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks")));
        wallBlockWithItem(EUBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_brick_wall"), blockLoc(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks")));
        
        stairsBlockWithItem(EUBlocks.SULFUR_DIOXIDE_ICE_BRICK_STAIRS, blockLoc(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks")));
        slabBlockWithItem(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_brick_slab"), blockLoc(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks")), blockLoc(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks")));
        wallBlockWithItem(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_brick_wall"), blockLoc(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks")));

        stairsBlockWithItem(EUBlocks.OXYGEN_ICE_BRICK_STAIRS, blockLoc(EUBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks")));
        slabBlockWithItem(EUBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_brick_slab"), blockLoc(EUBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks")), blockLoc(EUBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks")));
        wallBlockWithItem(EUBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_brick_wall"), blockLoc(EUBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks")));

        stairsBlockWithItem(EUBlocks.CUT_SALT_BRICK_STAIRS, blockLoc(EUBlocks.CUT_SALT_BLOCKS.get("cut_salt_bricks")));
        slabBlockWithItem(EUBlocks.CUT_SALT_BLOCKS_CONTINUED.get("cut_salt_brick_slab"), blockLoc(EUBlocks.CUT_SALT_BLOCKS.get("cut_salt_bricks")), blockLoc(EUBlocks.CUT_SALT_BLOCKS.get("cut_salt_bricks")));
        wallBlockWithItem(EUBlocks.CUT_SALT_BLOCKS_CONTINUED.get("cut_salt_brick_wall"), blockLoc(EUBlocks.CUT_SALT_BLOCKS.get("cut_salt_bricks")));
        
        stairsBlockWithItem(EUBlocks.CUT_GRAPHITE_BRICK_STAIRS, blockLoc(EUBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite_bricks")));
        slabBlockWithItem(EUBlocks.CUT_GRAPHITE_BLOCKS_CONTINUED.get("cut_graphite_brick_slab"), blockLoc(EUBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite_bricks")), blockLoc(EUBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite_bricks")));
        wallBlockWithItem(EUBlocks.CUT_GRAPHITE_BLOCKS_CONTINUED.get("cut_graphite_brick_wall"), blockLoc(EUBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite_bricks")));
        
        stairsBlockWithItem(EUBlocks.CUT_SULFUR_BRICK_STAIRS, blockLoc(EUBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur_bricks")));
        slabBlockWithItem(EUBlocks.CUT_SULFUR_BLOCKS_CONTINUED.get("cut_sulfur_brick_slab"), blockLoc(EUBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur_bricks")), blockLoc(EUBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur_bricks")));
        wallBlockWithItem(EUBlocks.CUT_SULFUR_BLOCKS_CONTINUED.get("cut_sulfur_brick_wall"), blockLoc(EUBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur_bricks")));

        simpleBlockWithItem(EUBlocks.GRISTLED_FLESH.get(), models().cubeBottomTop("gristled_flesh", blockLoc(EUBlocks.GRISTLED_FLESH), blockLoc(EUBlocks.FLESH_BLOCK), blockLoc(EUBlocks.GRISTLE_BLOCK)));
        simpleBlock(EUBlocks.SHORT_GRISTLES.get(), models().cross(EUBlocks.SHORT_GRISTLES.getId().getPath(), blockLoc(EUBlocks.SHORT_GRISTLES)).renderType("cutout"));
        simpleBlock(EUBlocks.TALL_GRISTLES.get(), models().cross(EUBlocks.TALL_GRISTLES.getId().getPath(), blockLoc(EUBlocks.TALL_GRISTLES)).renderType("cutout"));
        stairsBlockWithItem(EUBlocks.GORESLATE_BRICK_STAIRS, blockLoc(EUBlocks.GORESLATE_BLOCKS.get("goreslate_bricks")));
        stairsBlockWithItem(EUBlocks.GORESLATE_TILE_STAIRS, blockLoc(EUBlocks.GORESLATE_BLOCKS.get("goreslate_tiles")));
        slabBlockWithItem(EUBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_brick_slab"), blockLoc(EUBlocks.GORESLATE_BLOCKS.get("goreslate_bricks")), blockLoc(EUBlocks.GORESLATE_BLOCKS.get("goreslate_bricks")));
        slabBlockWithItem(EUBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_tile_slab"), blockLoc(EUBlocks.GORESLATE_BLOCKS.get("goreslate_tiles")), blockLoc(EUBlocks.GORESLATE_BLOCKS.get("goreslate_tiles")));
        wallBlockWithItem(EUBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_brick_wall"), blockLoc(EUBlocks.GORESLATE_BLOCKS.get("goreslate_bricks")));
        wallBlockWithItem(EUBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_tile_wall"), blockLoc(EUBlocks.GORESLATE_BLOCKS.get("goreslate_tiles")));

        simpleBlockWithItem(EUBlocks.CHISELED_LUTRUM.get(), models().cubeColumn("chiseled_lutrum", blockLoc(EUBlocks.CHISELED_LUTRUM), blockLoc(EUBlocks.CHISELED_LUTRUM, "top")));
        simpleBlockWithItem(EUBlocks.LUTRUM_GRATE.get(), models().cubeAll("lutrum_grate", blockLoc(EUBlocks.LUTRUM_GRATE)).renderType("cutout"));
        doorBlockWithItem(EUBlocks.LUTRUM_DOOR, blockLoc(EUBlocks.LUTRUM_DOOR, "bottom"), blockLoc(EUBlocks.LUTRUM_DOOR, "top"), "cutout");
        trapDoorBlockWithItem(EUBlocks.LUTRUM_TRAPDOOR, blockLoc(EUBlocks.LUTRUM_TRAPDOOR), true, "cutout");
        simpleBlockWithItem(EUBlocks.EXPOSED_CHISELED_LUTRUM.get(), models().cubeColumn("exposed_chiseled_lutrum", blockLoc(EUBlocks.EXPOSED_CHISELED_LUTRUM), blockLoc(EUBlocks.EXPOSED_CHISELED_LUTRUM, "top")));
        simpleBlockWithItem(EUBlocks.EXPOSED_LUTRUM_GRATE.get(), models().cubeAll("exposed_lutrum_grate", blockLoc(EUBlocks.EXPOSED_LUTRUM_GRATE)).renderType("cutout"));
        doorBlockWithItem(EUBlocks.EXPOSED_LUTRUM_DOOR, blockLoc(EUBlocks.EXPOSED_LUTRUM_DOOR, "bottom"), blockLoc(EUBlocks.EXPOSED_LUTRUM_DOOR, "top"), "cutout");
        trapDoorBlockWithItem(EUBlocks.EXPOSED_LUTRUM_TRAPDOOR, blockLoc(EUBlocks.EXPOSED_LUTRUM_TRAPDOOR), true, "cutout");
        simpleBlockWithItem(EUBlocks.WEATHERED_CHISELED_LUTRUM.get(), models().cubeColumn("weathered_chiseled_lutrum", blockLoc(EUBlocks.WEATHERED_CHISELED_LUTRUM), blockLoc(EUBlocks.WEATHERED_CHISELED_LUTRUM, "top")));
        simpleBlockWithItem(EUBlocks.WEATHERED_LUTRUM_GRATE.get(), models().cubeAll("weathered_lutrum_grate", blockLoc(EUBlocks.WEATHERED_LUTRUM_GRATE)).renderType("cutout"));
        doorBlockWithItem(EUBlocks.WEATHERED_LUTRUM_DOOR, blockLoc(EUBlocks.WEATHERED_LUTRUM_DOOR, "bottom"), blockLoc(EUBlocks.WEATHERED_LUTRUM_DOOR, "top"), "cutout");
        trapDoorBlockWithItem(EUBlocks.WEATHERED_LUTRUM_TRAPDOOR, blockLoc(EUBlocks.WEATHERED_LUTRUM_TRAPDOOR), true, "cutout");
        simpleBlockWithItem(EUBlocks.OXIDIZED_CHISELED_LUTRUM.get(), models().cubeColumn("oxidized_chiseled_lutrum", blockLoc(EUBlocks.OXIDIZED_CHISELED_LUTRUM), blockLoc(EUBlocks.OXIDIZED_CHISELED_LUTRUM, "top")));
        simpleBlockWithItem(EUBlocks.OXIDIZED_LUTRUM_GRATE.get(), models().cubeAll("oxidized_lutrum_grate", blockLoc(EUBlocks.OXIDIZED_LUTRUM_GRATE)).renderType("cutout"));
        doorBlockWithItem(EUBlocks.OXIDIZED_LUTRUM_DOOR, blockLoc(EUBlocks.OXIDIZED_LUTRUM_DOOR, "bottom"), blockLoc(EUBlocks.OXIDIZED_LUTRUM_DOOR, "top"), "cutout");
        trapDoorBlockWithItem(EUBlocks.OXIDIZED_LUTRUM_TRAPDOOR, blockLoc(EUBlocks.OXIDIZED_LUTRUM_TRAPDOOR), true, "cutout");

        simpleBlock(EUBlocks.POTTED_MAYURA_SAPLING.get(), models().withExistingParent(EUBlocks.POTTED_MAYURA_SAPLING.getId().getPath(), mcLoc("flower_pot_cross")).texture("plant", blockLoc(EUBlocks.MAYURA_SAPLING)).renderType("cutout"));
        simpleBlock(EUBlocks.POTTED_GRIMWOOD_SAPLING.get(), models().withExistingParent(EUBlocks.POTTED_GRIMWOOD_SAPLING.getId().getPath(), mcLoc("flower_pot_cross")).texture("plant", blockLoc(EUBlocks.GRIMWOOD_SAPLING)).renderType("cutout"));
        simpleBlock(EUBlocks.POTTED_VIVIAN.get(), models().withExistingParent(EUBlocks.POTTED_VIVIAN.getId().getPath(), mcLoc("flower_pot_cross")).texture("plant", blockLoc(EUBlocks.VIVIAN)).renderType("cutout"));
        simpleBlock(EUBlocks.POTTED_WICKUL.get(), models().withExistingParent(EUBlocks.POTTED_WICKUL.getId().getPath(), mcLoc("flower_pot_cross")).texture("plant", blockLoc(EUBlocks.WICKUL)).renderType("cutout"));
        simpleBlock(EUBlocks.POTTED_ICEFLOWER.get(), models().withExistingParent(EUBlocks.POTTED_ICEFLOWER.getId().getPath(), mcLoc("flower_pot_cross")).texture("plant", blockLoc(EUBlocks.ICEFLOWER)).renderType("cutout"));
    }
    // Helpers
    private void simpleBlock(DeferredBlock<? extends Block> block) {
        super.simpleBlock(block.get());
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }
    public void simpleBlockWithoutItem(DeferredBlock<? extends Block> block, ModelFile model) {
        super.simpleBlock(block.get(), model);
    }
    public void axisBlockWithItem(DeferredBlock<Block> block, ResourceLocation side, ResourceLocation end) {
        super.axisBlock((RotatedPillarBlock) block.get(), side, end);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }
    private void stairsBlockWithItem(DeferredBlock<Block> block, ResourceLocation texture) {
        super.stairsBlock((StairBlock) block.get(), texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }
    private void slabBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation doubleSlab, ResourceLocation texture) {
        super.slabBlock((SlabBlock) block.get(), doubleSlab, texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }
    private void fenceBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.fenceBlock((FenceBlock) block.get(), texture);
        models().fenceInventory(block.getId().getPath() + "_inventory", texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_inventory")));
    }
    private void fenceGateBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.fenceGateBlock((FenceGateBlock) block.get(), texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }
    private void pressurePlateBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.pressurePlateBlock((PressurePlateBlock) block.get(), texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }
    public void buttonBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.buttonBlock((ButtonBlock) block.get(), texture);
        models().buttonInventory(block.getId().getPath() + "_inventory", texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_inventory")));
    }
    public void wallBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.wallBlock((WallBlock) block.get(), texture);
        models().wallInventory(block.getId().getPath() + "_inventory", texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_inventory")));
    }
    public void doorBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation bottom, ResourceLocation top) {
        super.doorBlock((DoorBlock) block.get(), bottom, top);
    }
    public void doorBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation bottom, ResourceLocation top, String renderType) {
        super.doorBlockWithRenderType((DoorBlock) block.get(), bottom, top, renderType);
    }
    public void trapDoorBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation texture, boolean orientable) {
        super.trapdoorBlock((TrapDoorBlock) block.get(), texture, orientable);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_bottom")));
    }
    public void trapDoorBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation texture, boolean orientable, String renderType) {
        super.trapdoorBlockWithRenderType((TrapDoorBlock) block.get(), texture, orientable, renderType);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_bottom")));
    }
    private ResourceLocation extend(ResourceLocation rl, String suffix) {
        return ResourceLocation.fromNamespaceAndPath(rl.getNamespace(), rl.getPath() + suffix);
    }
    private ResourceLocation blockLoc(DeferredBlock<? extends Block> block) {
        return modLoc("block/" + block.getId().getPath());
    }
    public ResourceLocation blockLoc(DeferredBlock<? extends Block> block, String suffix) {
        return modLoc("block/" + block.getId().getPath() + "_" + suffix);
    }
    private ResourceLocation key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }
    private String name(Block block) {
        return key(block).getPath();
    }
}