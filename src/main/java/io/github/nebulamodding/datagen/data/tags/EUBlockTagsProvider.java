package io.github.nebulamodding.datagen.data.tags;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EUBlocks;
import io.github.nebulamodding.registry.EUTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class EUBlockTagsProvider extends BlockTagsProvider {
    public EUBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EtUltra.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        // Lists with collections of blocks with multiple of the same tag to save on lines of code and make this file more readable
        final List<DeferredBlock<? extends Block>> frigusStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> frigusDeepslateOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> stoneStairs = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> stoneSlabs = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> stoneWalls = new ArrayList<>();
        frigusStoneOres.add(EUBlocks.FRIGUS_COAL_ORE);
        frigusStoneOres.add(EUBlocks.FRIGUS_IRON_ORE);
        frigusStoneOres.add(EUBlocks.FRIGUS_COPPER_ORE);
        frigusStoneOres.add(EUBlocks.FRIGUS_GOLD_ORE);
        frigusStoneOres.add(EUBlocks.FRIGUS_REDSTONE_ORE);
        frigusStoneOres.add(EUBlocks.FRIGUS_EMERALD_ORE);
        frigusStoneOres.add(EUBlocks.FRIGUS_LAPIS_ORE);
        frigusStoneOres.add(EUBlocks.FRIGUS_DIAMOND_ORE);
        frigusStoneOres.add(EUBlocks.FRIGUS_OBDURIUM_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_COAL_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_IRON_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_COPPER_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_GOLD_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_REDSTONE_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_EMERALD_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_LAPIS_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_DIAMOND_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_OBDURIUM_ORE);
        stoneStairs.add(EUBlocks.FRIGUS_STONE_STAIRS);
        stoneStairs.add(EUBlocks.FRIGUS_COBBLESTONE_STAIRS);
        stoneStairs.add(EUBlocks.POLISHED_FRIGUS_STONE_STAIRS);
        stoneStairs.add(EUBlocks.FRIGUS_STONE_BRICK_STAIRS);
        stoneSlabs.add(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_stone_slab"));
        stoneSlabs.add(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_cobblestone_slab"));
        stoneSlabs.add(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("polished_frigus_stone_slab"));
        stoneSlabs.add(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_stone_brick_slab"));
        stoneWalls.add(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_stone_wall"));
        stoneWalls.add(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_cobblestone_wall"));
        stoneWalls.add(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("polished_frigus_stone_wall"));
        stoneWalls.add(EUBlocks.FRIGUS_STONE_BLOCKS_CONTINUED.get("frigus_stone_brick_wall"));
        stoneStairs.add(EUBlocks.FRIGUS_DEEPSLATE_STAIRS);
        stoneStairs.add(EUBlocks.COBBLED_FRIGUS_DEEPSLATE_STAIRS);
        stoneStairs.add(EUBlocks.POLISHED_FRIGUS_DEEPSLATE_STAIRS);
        stoneStairs.add(EUBlocks.FRIGUS_DEEPSLATE_BRICK_STAIRS);
        stoneStairs.add(EUBlocks.FRIGUS_DEEPSLATE_TILE_STAIRS);
        stoneSlabs.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_slab"));
        stoneSlabs.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("cobbled_frigus_deepslate_slab"));
        stoneSlabs.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("polished_frigus_deepslate_slab"));
        stoneSlabs.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_brick_slab"));
        stoneSlabs.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_tile_slab"));
        stoneWalls.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_wall"));
        stoneWalls.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("cobbled_frigus_deepslate_wall"));
        stoneWalls.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("polished_frigus_deepslate_wall"));
        stoneWalls.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_brick_wall"));
        stoneWalls.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_tile_wall"));
        stoneStairs.add(EUBlocks.PERMAFROST_STAIRS);
        stoneStairs.add(EUBlocks.POLISHED_PERMAFROST_STAIRS);
        stoneStairs.add(EUBlocks.PERMAFROST_BRICK_STAIRS);
        stoneStairs.add(EUBlocks.PERMAFROST_TILE_STAIRS);
        stoneSlabs.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_slab"));
        stoneSlabs.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("polished_permafrost_slab"));
        stoneSlabs.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_slab"));
        stoneSlabs.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_slab"));
        stoneWalls.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_wall"));
        stoneWalls.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("polished_permafrost_wall"));
        stoneWalls.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_wall"));
        stoneWalls.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_wall"));

        /*
        Tool Tags
         */

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(EUBlocks.FRIGUS_GRASS_BLOCK.get())
                .add(EUBlocks.FRIGUS_DIRT_PATH.get())
                .add(EUBlocks.FRIGUS_DIRT.get())
                .add(EUBlocks.FRIGUS_COARSE_DIRT.get())
                .add(EUBlocks.FRIGUS_FARMLAND.get())

                .add(EUBlocks.SALT_DUST_BLOCK.get())
                .add(EUBlocks.SULFUR_DUST_BLOCK.get())
                .add(EUBlocks.GRAPHITE_DUST_BLOCK.get())
        ;
        frigusStoneOres.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        frigusDeepslateOres.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        stoneStairs.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        stoneSlabs.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                // Frigus
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get())
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_cobblestone").get())
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("chiseled_frigus_stone").get())
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("polished_frigus_stone").get())
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_bricks").get())
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("cracked_frigus_stone_bricks").get())
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_pillar").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("chiseled_frigus_deepslate").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("polished_frigus_deepslate").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cracked_frigus_deepslate_bricks").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_pillar").get())
                // Permafrost
                .add(EUBlocks.PERMAFROST_BLOCKS.get("permafrost").get())
                .add(EUBlocks.PERMAFROST_BLOCKS.get("chiseled_permafrost").get())
                .add(EUBlocks.PERMAFROST_BLOCKS.get("polished_permafrost").get())
                .add(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks").get())
                .add(EUBlocks.PERMAFROST_BLOCKS.get("cracked_permafrost_bricks").get())
                .add(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles").get())
                .add(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_pillar").get())
        ;
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(EUBlocks.FRIGUS_SHORT_GRASS.get())
        ;
        tag(BlockTags.MINEABLE_WITH_HOE)
        ;
        tag(BlockTags.SWORD_EFFICIENT)
                .add(EUBlocks.FRIGUS_SHORT_GRASS.get())
        ;
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(EUBlocks.FRIGUS_COPPER_ORE.get())
                .add(EUBlocks.FRIGUS_IRON_ORE.get())
                .add(EUBlocks.FRIGUS_LAPIS_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_COPPER_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_IRON_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_LAPIS_ORE.get())
        ;
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(EUBlocks.FRIGUS_GOLD_ORE.get())
                .add(EUBlocks.FRIGUS_REDSTONE_ORE.get())
                .add(EUBlocks.FRIGUS_EMERALD_ORE.get())
                .add(EUBlocks.FRIGUS_DIAMOND_ORE.get())
                .add(EUBlocks.FRIGUS_OBDURIUM_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_GOLD_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_REDSTONE_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_EMERALD_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_DIAMOND_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_OBDURIUM_ORE.get())
        ;
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
        ;
        tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
        ;
        tag(BlockTags.INCORRECT_FOR_STONE_TOOL)
        ;
        tag(BlockTags.INCORRECT_FOR_IRON_TOOL)
        ;
        tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
        ;
        tag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
        ;

        /*
        Block Variant Tags
         */

        stoneStairs.forEach(entry -> tag(BlockTags.STAIRS).add(entry.get()));
        tag(BlockTags.STAIRS)
        ;
        tag(BlockTags.WOODEN_STAIRS)
        ;
        stoneSlabs.forEach(entry -> tag(BlockTags.SLABS).add(entry.get()));
        tag(BlockTags.SLABS)
        ;
        tag(BlockTags.WOODEN_SLABS)
        ;
        stoneWalls.forEach(entry -> tag(BlockTags.WALLS).add(entry.get()));
        tag(BlockTags.WALLS)
        ;

        /*
        Ore Tags
         */

        tag(BlockTags.COAL_ORES)
                .add(EUBlocks.FRIGUS_COAL_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_COAL_ORE.get())
        ;
        tag(BlockTags.IRON_ORES)
                .add(EUBlocks.FRIGUS_IRON_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_IRON_ORE.get())
        ;
        tag(BlockTags.COPPER_ORES)
                .add(EUBlocks.FRIGUS_COPPER_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_COPPER_ORE.get())
        ;
        tag(BlockTags.GOLD_ORES)
                .add(EUBlocks.FRIGUS_GOLD_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_GOLD_ORE.get())
        ;
        tag(BlockTags.REDSTONE_ORES)
                .add(EUBlocks.FRIGUS_REDSTONE_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_REDSTONE_ORE.get())
        ;
        tag(BlockTags.EMERALD_ORES)
                .add(EUBlocks.FRIGUS_EMERALD_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_EMERALD_ORE.get())
        ;
        tag(BlockTags.LAPIS_ORES)
                .add(EUBlocks.FRIGUS_LAPIS_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_LAPIS_ORE.get())
        ;
        tag(BlockTags.DIAMOND_ORES)
                .add(EUBlocks.FRIGUS_DIAMOND_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_DIAMOND_ORE.get())
        ;
        tag(EUTags.EUBlockTags.ORES_OBDURIUM)
                .add(EUBlocks.FRIGUS_OBDURIUM_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_OBDURIUM_ORE.get())
        ;
        tag(EUTags.EUBlockTags.ORES_MALUNITE)
        ;
        tag(Tags.Blocks.ORE_RATES_DENSE)
                .add(EUBlocks.FRIGUS_COPPER_ORE.get())
                .add(EUBlocks.FRIGUS_REDSTONE_ORE.get())
                .add(EUBlocks.FRIGUS_LAPIS_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_COPPER_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_REDSTONE_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_LAPIS_ORE.get())
        ;
        tag(Tags.Blocks.ORE_RATES_SINGULAR)
                .add(EUBlocks.FRIGUS_COAL_ORE.get())
                .add(EUBlocks.FRIGUS_IRON_ORE.get())
                .add(EUBlocks.FRIGUS_GOLD_ORE.get())
                .add(EUBlocks.FRIGUS_EMERALD_ORE.get())
                .add(EUBlocks.FRIGUS_DIAMOND_ORE.get())
                .add(EUBlocks.FRIGUS_OBDURIUM_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_COAL_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_IRON_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_GOLD_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_EMERALD_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_DIAMOND_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_OBDURIUM_ORE.get())
        ;
        tag(Tags.Blocks.ORE_RATES_SPARSE)
        ;
        tag(EUTags.EUBlockTags.ORE_BEARING_GROUND_FRIGUS_STONE)
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get())
        ;
        tag(EUTags.EUBlockTags.ORE_BEARING_GROUND_FRIGUS_DEEPSLATE)
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get())
        ;
        frigusStoneOres.forEach(entry -> tag(EUTags.EUBlockTags.ORES_IN_GROUND_FRIGUS_STONE).add(entry.get()));
        frigusDeepslateOres.forEach(entry -> tag(EUTags.EUBlockTags.ORES_IN_GROUND_FRIGUS_DEEPSLATE).add(entry.get()));

        /*
        Stone Tags
         */

        tag(Tags.Blocks.STONES)
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get())
        ;
        tag(Tags.Blocks.COBBLESTONES)
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_cobblestone").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get())
        ;
        tag(EUTags.EUBlockTags.COBBLESTONES_FRIGUS_STONE)
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_cobblestone").get())
        ;
        tag(EUTags.EUBlockTags.COBBLESTONES_FRIGUS_DEEPSLATE)
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get())
        ;

        /*
        Storage Block Tags
         */

        tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTag(EUTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM)
        ;
        tag(EUTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM)
                .add(EUBlocks.OBDURIUM_BLOCKS.get("obdurium_block").get())
        ;
        tag(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_OBDURIUM)
        ;
        tag(EUTags.EUBlockTags.STORAGE_BLOCKS_MALUNITE)
        ;
        tag(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_MALUNITE)
        ;

        /*
        Miscellaneous Tags
         */

        tag(BlockTags.ENCHANTMENT_POWER_TRANSMITTER)
                // Prevents blocks from interfering with enchanting
                .add(EUBlocks.FRIGUS_SHORT_GRASS.get())
        ;
        tag(BlockTags.REPLACEABLE)
                .add(EUBlocks.FRIGUS_SHORT_GRASS.get())
        ;
        tag(BlockTags.REPLACEABLE_BY_TREES)
                .add(EUBlocks.FRIGUS_SHORT_GRASS.get())
        ;
        tag(BlockTags.ANIMALS_SPAWNABLE_ON)
                .add(EUBlocks.FRIGUS_GRASS_BLOCK.get())
        ;
        tag(BlockTags.DIRT)
                .add(EUBlocks.FRIGUS_GRASS_BLOCK.get())
                .add(EUBlocks.FRIGUS_DIRT.get())
                .add(EUBlocks.FRIGUS_COARSE_DIRT.get())
        ;
        tag(BlockTags.SMALL_FLOWERS)
                .add(EUBlocks.VIVIAN.get())
                .add(EUBlocks.WICKUL.get())
                .add(EUBlocks.ICEFLOWER.get())
        ;
        tag(BlockTags.TALL_FLOWERS)
        ;
        tag(BlockTags.FLOWER_POTS)
        ;
    }
}