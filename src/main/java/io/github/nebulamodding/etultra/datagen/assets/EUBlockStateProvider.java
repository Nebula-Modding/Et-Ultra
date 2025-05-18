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

        excludedBlocks.add(EUBlocks.FRIGUS_STONE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_stone_brick_slab"));
        excludedBlocks.add(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_stone_brick_wall"));

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

        excludedBlocks.add(EUBlocks.CUT_GRAPHITE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.CUT_GRAPHITE_BLOCKS_CONTINUED.get("cut_graphite_brick_slab"));
        excludedBlocks.add(EUBlocks.CUT_GRAPHITE_BLOCKS_CONTINUED.get("cut_graphite_brick_wall"));

        excludedBlocks.add(EUBlocks.CUT_SULFUR_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.CUT_SULFUR_BLOCKS_CONTINUED.get("cut_sulfur_brick_slab"));
        excludedBlocks.add(EUBlocks.CUT_SULFUR_BLOCKS_CONTINUED.get("cut_sulfur_brick_wall"));

        excludedBlocks.add(EUBlocks.LUTRUM_GRATE);
        excludedBlocks.add(EUBlocks.LUTRUM_DOOR);
        excludedBlocks.add(EUBlocks.LUTRUM_TRAPDOOR);
        excludedBlocks.add(EUBlocks.LUTRUM_BULB);

        excludedBlocks.add(EUBlocks.POTTED_MAYURA_SAPLING);
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

        axisBlock(EUBlocks.MAYURA_WOOD, blockLoc(EUBlocks.MAYURA_LOG), blockLoc(EUBlocks.MAYURA_LOG));
        axisBlock(EUBlocks.STRIPPED_MAYURA_WOOD, blockLoc(EUBlocks.STRIPPED_MAYURA_LOG), blockLoc(EUBlocks.STRIPPED_MAYURA_LOG));
        stairsBlock(EUBlocks.MAYURA_STAIRS, blockLoc(EUBlocks.MAYURA_PLANKS));
        slabBlock(EUBlocks.MAYURA_SLAB, blockLoc(EUBlocks.MAYURA_PLANKS), blockLoc(EUBlocks.MAYURA_PLANKS));
        fenceBlock(EUBlocks.MAYURA_FENCE, blockLoc(EUBlocks.MAYURA_PLANKS));
        fenceGateBlock(EUBlocks.MAYURA_FENCE_GATE, blockLoc(EUBlocks.MAYURA_PLANKS));
        doorBlockWithRenderType(EUBlocks.MAYURA_DOOR, blockLoc(EUBlocks.MAYURA_DOOR, "bottom"), blockLoc(EUBlocks.MAYURA_DOOR, "top"), "cutout");
        trapDoorBlockWithRenderType(EUBlocks.MAYURA_TRAPDOOR, blockLoc(EUBlocks.MAYURA_TRAPDOOR), true, "cutout");
        pressurePlateBlock(EUBlocks.MAYURA_PRESSURE_PLATE, blockLoc(EUBlocks.MAYURA_PLANKS));
        buttonBlock(EUBlocks.MAYURA_BUTTON, blockLoc(EUBlocks.MAYURA_PLANKS));
        simpleBlock(EUBlocks.MAYURA_SAPLING.get(), models().cross(EUBlocks.MAYURA_SAPLING.getId().getPath(), blockLoc(EUBlocks.MAYURA_SAPLING)).renderType("cutout"));

        simpleBlockWithoutItem(EUBlocks.FRIGUS_SHORT_GRASS, models().cross(EUBlocks.FRIGUS_SHORT_GRASS.getId().getPath(), blockLoc(EUBlocks.FRIGUS_SHORT_GRASS)).renderType("cutout"));
        simpleBlockWithoutItem(EUBlocks.VIVIAN, models().cross("vivian", blockLoc(EUBlocks.VIVIAN)).renderType("cutout"));
        simpleBlockWithoutItem(EUBlocks.WICKUL, models().cross("wickul", blockLoc(EUBlocks.WICKUL)).renderType("cutout"));
        simpleBlockWithoutItem(EUBlocks.ICEFLOWER, models().cross("iceflower", blockLoc(EUBlocks.ICEFLOWER)).renderType("cutout"));

        stairsBlock(EUBlocks.FRIGUS_MUD_BRICK_STAIRS, blockLoc(EUBlocks.FRIGUS_MUD_BRICKS));
        slabBlock(EUBlocks.FRIGUS_MUD_BRICK_SLAB, blockLoc(EUBlocks.FRIGUS_MUD_BRICKS), blockLoc(EUBlocks.FRIGUS_MUD_BRICKS));
        wallBlock(EUBlocks.FRIGUS_MUD_BRICK_WALL, blockLoc(EUBlocks.FRIGUS_MUD_BRICKS));

        stairsBlock(EUBlocks.FRIGUS_STONE_BRICK_STAIRS, blockLoc(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_bricks")));
        slabBlock(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_stone_brick_slab"), blockLoc(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_bricks")), blockLoc(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_bricks")));
        wallBlock(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_stone_brick_wall"), blockLoc(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_bricks")));

        stairsBlock(EUBlocks.FRIGUS_DEEPSLATE_BRICK_STAIRS, blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks")));
        stairsBlock(EUBlocks.FRIGUS_DEEPSLATE_TILE_STAIRS, blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles")));
        slabBlock(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_brick_slab"), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks")), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks")));
        slabBlock(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_tile_slab"), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles")), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles")));
        wallBlock(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_brick_wall"), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks")));
        wallBlock(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_tile_wall"), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles")));

        stairsBlock(EUBlocks.PERMAFROST_BRICK_STAIRS, blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks")));
        stairsBlock(EUBlocks.PERMAFROST_TILE_STAIRS, blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles")));
        slabBlock(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_slab"), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks")), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks")));
        slabBlock(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_slab"), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles")), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles")));
        wallBlock(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_wall"), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks")));
        wallBlock(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_wall"), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles")));

        stairsBlock(EUBlocks.WATER_ICE_BRICK_STAIRS, blockLoc(EUBlocks.WATER_ICE_BLOCKS.get("water_ice_bricks")));
        slabBlock(EUBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_brick_slab"), blockLoc(EUBlocks.WATER_ICE_BLOCKS.get("water_ice_bricks")), blockLoc(EUBlocks.WATER_ICE_BLOCKS.get("water_ice_bricks")));
        wallBlock(EUBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_brick_wall"), blockLoc(EUBlocks.WATER_ICE_BLOCKS.get("water_ice_bricks")));
        stairsBlock(EUBlocks.THOLIN_POOR_WATER_ICE_BRICK_STAIRS, blockLoc(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks")));
        slabBlock(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_brick_slab"), blockLoc(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks")), blockLoc(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks")));
        wallBlock(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_brick_wall"), blockLoc(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks")));
        stairsBlock(EUBlocks.THOLIN_RICH_WATER_ICE_BRICK_STAIRS, blockLoc(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks")));
        slabBlock(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_brick_slab"), blockLoc(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks")), blockLoc(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks")));
        wallBlock(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_brick_wall"), blockLoc(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks")));
        stairsBlock(EUBlocks.BLACK_WATER_ICE_BRICK_STAIRS, blockLoc(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks")));
        slabBlock(EUBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_brick_slab"), blockLoc(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks")), blockLoc(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks")));
        wallBlock(EUBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_brick_wall"), blockLoc(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks")));

        stairsBlock(EUBlocks.METHANE_ICE_BRICK_STAIRS, blockLoc(EUBlocks.METHANE_ICE_BLOCKS.get("methane_ice_bricks")));
        slabBlock(EUBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_brick_slab"), blockLoc(EUBlocks.METHANE_ICE_BLOCKS.get("methane_ice_bricks")), blockLoc(EUBlocks.METHANE_ICE_BLOCKS.get("methane_ice_bricks")));
        wallBlock(EUBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_brick_wall"), blockLoc(EUBlocks.METHANE_ICE_BLOCKS.get("methane_ice_bricks")));
        stairsBlock(EUBlocks.THOLIN_POOR_METHANE_ICE_BRICK_STAIRS, blockLoc(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks")));
        slabBlock(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_brick_slab"), blockLoc(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks")), blockLoc(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks")));
        wallBlock(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_brick_wall"), blockLoc(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks")));
        stairsBlock(EUBlocks.THOLIN_RICH_METHANE_ICE_BRICK_STAIRS, blockLoc(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks")));
        slabBlock(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_brick_slab"), blockLoc(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks")), blockLoc(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks")));
        wallBlock(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_brick_wall"), blockLoc(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks")));

        stairsBlock(EUBlocks.CARBON_DIOXIDE_ICE_BRICK_STAIRS, blockLoc(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks")));
        slabBlock(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_brick_slab"), blockLoc(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks")), blockLoc(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks")));
        wallBlock(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_brick_wall"), blockLoc(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks")));
        stairsBlock(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BRICK_STAIRS, blockLoc(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks")));
        slabBlock(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_brick_slab"), blockLoc(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks")), blockLoc(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks")));
        wallBlock(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_brick_wall"), blockLoc(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks")));
        stairsBlock(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BRICK_STAIRS, blockLoc(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks")));
        slabBlock(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_brick_slab"), blockLoc(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks")), blockLoc(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks")));
        wallBlock(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_brick_wall"), blockLoc(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks")));

        stairsBlock(EUBlocks.AMMONIA_ICE_BRICK_STAIRS, blockLoc(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks")));
        slabBlock(EUBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_brick_slab"), blockLoc(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks")), blockLoc(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks")));
        wallBlock(EUBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_brick_wall"), blockLoc(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks")));

        stairsBlock(EUBlocks.NITROGEN_ICE_BRICK_STAIRS, blockLoc(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks")));
        slabBlock(EUBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_brick_slab"), blockLoc(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks")), blockLoc(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks")));
        wallBlock(EUBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_brick_wall"), blockLoc(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks")));
        stairsBlock(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BRICK_STAIRS, blockLoc(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks")));
        slabBlock(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_brick_slab"), blockLoc(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks")), blockLoc(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks")));
        wallBlock(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_brick_wall"), blockLoc(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks")));
        stairsBlock(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BRICK_STAIRS, blockLoc(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks")));
        slabBlock(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_brick_slab"), blockLoc(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks")), blockLoc(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks")));
        wallBlock(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_brick_wall"), blockLoc(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks")));
        stairsBlock(EUBlocks.RED_NITROGEN_ICE_BRICK_STAIRS, blockLoc(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks")));
        slabBlock(EUBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_brick_slab"), blockLoc(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks")), blockLoc(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks")));
        wallBlock(EUBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_brick_wall"), blockLoc(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks")));
        
        stairsBlock(EUBlocks.SULFUR_DIOXIDE_ICE_BRICK_STAIRS, blockLoc(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks")));
        slabBlock(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_brick_slab"), blockLoc(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks")), blockLoc(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks")));
        wallBlock(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_brick_wall"), blockLoc(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks")));

        stairsBlock(EUBlocks.OXYGEN_ICE_BRICK_STAIRS, blockLoc(EUBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks")));
        slabBlock(EUBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_brick_slab"), blockLoc(EUBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks")), blockLoc(EUBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks")));
        wallBlock(EUBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_brick_wall"), blockLoc(EUBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks")));

        stairsBlock(EUBlocks.CUT_SALT_BRICK_STAIRS, blockLoc(EUBlocks.CUT_SALT_BLOCKS.get("cut_salt_bricks")));
        slabBlock(EUBlocks.CUT_SALT_BLOCKS_CONTINUED.get("cut_salt_brick_slab"), blockLoc(EUBlocks.CUT_SALT_BLOCKS.get("cut_salt_bricks")), blockLoc(EUBlocks.CUT_SALT_BLOCKS.get("cut_salt_bricks")));
        wallBlock(EUBlocks.CUT_SALT_BLOCKS_CONTINUED.get("cut_salt_brick_wall"), blockLoc(EUBlocks.CUT_SALT_BLOCKS.get("cut_salt_bricks")));
        
        stairsBlock(EUBlocks.CUT_GRAPHITE_BRICK_STAIRS, blockLoc(EUBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite_bricks")));
        slabBlock(EUBlocks.CUT_GRAPHITE_BLOCKS_CONTINUED.get("cut_graphite_brick_slab"), blockLoc(EUBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite_bricks")), blockLoc(EUBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite_bricks")));
        wallBlock(EUBlocks.CUT_GRAPHITE_BLOCKS_CONTINUED.get("cut_graphite_brick_wall"), blockLoc(EUBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite_bricks")));
        
        stairsBlock(EUBlocks.CUT_SULFUR_BRICK_STAIRS, blockLoc(EUBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur_bricks")));
        slabBlock(EUBlocks.CUT_SULFUR_BLOCKS_CONTINUED.get("cut_sulfur_brick_slab"), blockLoc(EUBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur_bricks")), blockLoc(EUBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur_bricks")));
        wallBlock(EUBlocks.CUT_SULFUR_BLOCKS_CONTINUED.get("cut_sulfur_brick_wall"), blockLoc(EUBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur_bricks")));

        doorBlockWithRenderType(EUBlocks.LUTRUM_DOOR, blockLoc(EUBlocks.LUTRUM_DOOR, "bottom"), blockLoc(EUBlocks.LUTRUM_DOOR, "top"), "cutout");
        trapDoorBlockWithRenderType(EUBlocks.LUTRUM_TRAPDOOR, blockLoc(EUBlocks.LUTRUM_TRAPDOOR), true, "cutout");

        simpleBlock(EUBlocks.POTTED_MAYURA_SAPLING.get(), models().withExistingParent(EUBlocks.POTTED_MAYURA_SAPLING.getId().getPath(), mcLoc("flower_pot_cross")).texture("plant", blockLoc(EUBlocks.MAYURA_SAPLING)).renderType("cutout"));
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
    public void axisBlock(DeferredBlock<Block> block, ResourceLocation texture, ResourceLocation texture2) {
        super.axisBlock((RotatedPillarBlock) block.get(), texture, texture2);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }
    private void stairsBlock(DeferredBlock<Block> block, ResourceLocation texture) {
        super.stairsBlock((StairBlock) block.get(), texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }
    private void slabBlock(DeferredBlock<? extends Block> block, ResourceLocation doubleslab, ResourceLocation texture) {
        super.slabBlock((SlabBlock) block.get(), doubleslab, texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }
    private void fenceBlock(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.fenceBlock((FenceBlock) block.get(), texture);
        models().fenceInventory(block.getId().getPath() + "_inventory", texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_inventory")));
    }
    private void fenceGateBlock(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.fenceGateBlock((FenceGateBlock) block.get(), texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }
    private void pressurePlateBlock(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.pressurePlateBlock((PressurePlateBlock) block.get(), texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }
    public void buttonBlock(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.buttonBlock((ButtonBlock) block.get(), texture);
        models().buttonInventory(block.getId().getPath() + "_inventory", texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_inventory")));
    }
    public void wallBlock(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.wallBlock((WallBlock) block.get(), texture);
        models().wallInventory(block.getId().getPath() + "_inventory", texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_inventory")));
    }
    public void doorBlockWithRenderType(DeferredBlock<? extends Block> block, ResourceLocation bottom, ResourceLocation top, String renderType) {
        super.doorBlockWithRenderType((DoorBlock) block.get(), bottom, top, renderType);
    }
    public void trapDoorBlockWithRenderType(DeferredBlock<? extends Block> block, ResourceLocation texture, boolean orientable, String renderType) {
        super.trapdoorBlockWithRenderType((TrapDoorBlock) block.get(), texture, orientable, renderType);
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