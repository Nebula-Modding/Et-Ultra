package io.github.nebulamodding.datagen.assets;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EUBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.awt.*;
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
        excludedBlocks.add(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_stone_brick_slab"));
        excludedBlocks.add(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_stone_wall"));
        excludedBlocks.add(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_cobblestone_wall"));
        excludedBlocks.add(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("polished_frigus_stone_wall"));
        excludedBlocks.add(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_stone_brick_wall"));
        excludedBlocks.add(EUBlocks.FRIGUS_STONE_PRESSURE_PLATE);
        excludedBlocks.add(EUBlocks.FRIGUS_STONE_BUTTON);

        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_TILE_STAIRS);
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_brick_slab"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_tile_slab"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_brick_slab"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_tile_slab"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_wall"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("cobbled_frigus_deepslate_wall"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("polished_frigus_deepslate_wall"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_brick_wall"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_tile_wall"));

        excludedBlocks.add(EUBlocks.PERMAFROST_BRICK_STAIRS);
        excludedBlocks.add(EUBlocks.PERMAFROST_TILE_STAIRS);
        excludedBlocks.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_slab"));
        excludedBlocks.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_slab"));
        excludedBlocks.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_slab"));
        excludedBlocks.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_slab"));
        excludedBlocks.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_wall"));
        excludedBlocks.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("polished_permafrost_wall"));
        excludedBlocks.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_wall"));
        excludedBlocks.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_wall"));

        excludedBlocks.add(EUBlocks.WATER_ICE_BLOCKS.get("water_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_brick_slab"));

        excludedBlocks.add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_brick_slab"));

        excludedBlocks.add(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_brick_slab"));
        excludedBlocks.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_brick_slab"));

        excludedBlocks.add(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_brick_slab"));

        excludedBlocks.add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_brick_slab"));

        excludedBlocks.add(EUBlocks.SALT_PACKED_BLOCKS.get("salt_slab"));
        excludedBlocks.add(EUBlocks.SALT_PACKED_BLOCKS.get("salt_brick_slab"));

        excludedBlocks.add(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_slab"));
        excludedBlocks.add(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_brick_slab"));

        excludedBlocks.add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_slab"));
        excludedBlocks.add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_brick_slab"));

        excludedBlocks.add(EUBlocks.FLESH_BLOCKS.get("flesh_slab"));

        excludedBlocks.add(EUBlocks.MALUNITE_PLATING_PRESSURE_PLATE);
        excludedBlocks.add(EUBlocks.MALUNITE_PLATING_BUTTON);

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
            } else if (entry.get() instanceof SlabBlock slabBlock) {
                ResourceLocation textureId = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_slab", ""));
                slabBlock(
                        slabBlock,
                        models().slab(name(slabBlock), textureId, textureId, textureId),
                        models().slabTop(name(slabBlock) + "_top", textureId, textureId, textureId),
                        new ModelFile.UncheckedModelFile(textureId)
                );
            } else if (entry.get() instanceof StairBlock stairBlock) {
                ResourceLocation textureId = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_stairs", ""));
                stairsBlock(
                        stairBlock,
                        models().stairs(name(stairBlock), textureId, textureId, textureId),
                        models().stairsInner(name(stairBlock) + "_inner", textureId, textureId, textureId),
                        models().stairsOuter(name(stairBlock) + "_outer", textureId, textureId, textureId)
                );
            } else {
                cubeAll(entry.get());
                simpleBlock(entry.get());
            }
            simpleBlockItem(entry.get(), model);
        }

        /*
        Manual Block Models
         */

        stairsBlock(EUBlocks.FRIGUS_MUD_BRICK_STAIRS, blockLoc(EUBlocks.FRIGUS_MUD_BRICKS));
        slabBlock(EUBlocks.FRIGUS_MUD_BRICK_SLAB, blockLoc(EUBlocks.FRIGUS_MUD_BRICKS), blockLoc(EUBlocks.FRIGUS_MUD_BRICKS));
        wallBlock(EUBlocks.FRIGUS_MUD_BRICK_WALL, blockLoc(EUBlocks.FRIGUS_MUD_BRICKS));

        stairsBlock(EUBlocks.FRIGUS_STONE_BRICK_STAIRS, blockLoc(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_bricks")));
        slabBlock(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_stone_brick_slab"), blockLoc(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_bricks")), blockLoc(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_bricks")));
        wallBlock(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_stone_wall"), blockLoc(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone")));
        wallBlock(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_cobblestone_wall"), blockLoc(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_cobblestone")));
        wallBlock(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("polished_frigus_stone_wall"), blockLoc(EUBlocks.FRIGUS_STONE_BLOCKS.get("polished_frigus_stone")));
        wallBlock(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_stone_brick_wall"), blockLoc(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_bricks")));
        pressurePlateBlock(EUBlocks.FRIGUS_STONE_PRESSURE_PLATE, blockLoc(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone")));
        buttonBlock(EUBlocks.FRIGUS_STONE_BUTTON, blockLoc(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone")));
        
        stairsBlock(EUBlocks.FRIGUS_DEEPSLATE_BRICK_STAIRS, blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks")));
        stairsBlock(EUBlocks.FRIGUS_DEEPSLATE_TILE_STAIRS, blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles")));
        slabBlock(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_brick_slab"), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks")), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks")));
        slabBlock(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_tile_slab"), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles")), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles")));
        wallBlock(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_wall"), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate")));
        wallBlock(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("cobbled_frigus_deepslate_wall"), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate")));
        wallBlock(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("polished_frigus_deepslate_wall"), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("polished_frigus_deepslate")));
        wallBlock(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_brick_wall"), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks")));
        wallBlock(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_tile_wall"), blockLoc(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles")));

        stairsBlock(EUBlocks.PERMAFROST_BRICK_STAIRS, blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks")));
        stairsBlock(EUBlocks.PERMAFROST_TILE_STAIRS, blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles")));
        slabBlock(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_slab"), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks")), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks")));
        slabBlock(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_slab"), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles")), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles")));
        wallBlock(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_wall"), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost")));
        wallBlock(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("polished_permafrost_wall"), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("polished_permafrost")));
        wallBlock(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_wall"), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks")));
        wallBlock(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_wall"), blockLoc(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles")));

        pressurePlateBlock(EUBlocks.MALUNITE_PLATING_PRESSURE_PLATE, blockLoc(EUBlocks.MALUNITE_BLOCKS.get("malunite_plating")));
        buttonBlock(EUBlocks.MALUNITE_PLATING_BUTTON, blockLoc(EUBlocks.MALUNITE_BLOCKS.get("malunite_plating")));
    }
    // Helpers
    private void stairsBlock(DeferredBlock<Block> block, ResourceLocation texture) {
        super.stairsBlock((StairBlock) block.get(), texture);
    }
    private void slabBlock(DeferredBlock<? extends Block> block, ResourceLocation doubleslab, ResourceLocation texture) {
        super.slabBlock((SlabBlock) block.get(), doubleslab, texture);
    }
    private void fenceBlock(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.fenceBlock((FenceBlock) block.get(), texture);
        models().fenceInventory(block.getId().getPath() + "_inventory", texture);
    }
    private void pressurePlateBlock(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.pressurePlateBlock((PressurePlateBlock) block.get(), texture);
    }
    public void buttonBlock(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.buttonBlock((ButtonBlock) block.get(), texture);
        models().buttonInventory(block.getId().getPath() + "_inventory", texture);
    }
    public void wallBlock(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.wallBlock((WallBlock) block.get(), texture);
        models().wallInventory(block.getId().getPath() + "_inventory", texture);
    }
    private ResourceLocation blockLoc(DeferredBlock<? extends Block> block) {
        return modLoc("block/" + block.getId().getPath());
    }
    private ResourceLocation key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }
    private String name(Block block) {
        return key(block).getPath();
    }
}