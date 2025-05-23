package io.github.nebulamodding.etultra.datagen.data.tags;

import io.github.nebulamodding.etultra.EtUltra;
import io.github.nebulamodding.etultra.registry.block.EUBlocks;
import io.github.nebulamodding.etultra.registry.EUTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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
        final List<DeferredBlock<? extends Block>> blueschistOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> frigusDeepslateOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> waterIceOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> methaneIceOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> nitrogenIceOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> oxygenIceOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> pickaxeStairs = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> pickaxeSlabs = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> pickaxeWalls = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> stonePressurePlates = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> stoneButtons = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> ices = new ArrayList<>();
        // Ores
        blueschistOres.add(EUBlocks.BLUESCHIST_COAL_ORE);
        blueschistOres.add(EUBlocks.BLUESCHIST_IRON_ORE);
        blueschistOres.add(EUBlocks.BLUESCHIST_COPPER_ORE);
        blueschistOres.add(EUBlocks.BLUESCHIST_GOLD_ORE);
        blueschistOres.add(EUBlocks.BLUESCHIST_REDSTONE_ORE);
        blueschistOres.add(EUBlocks.BLUESCHIST_EMERALD_ORE);
        blueschistOres.add(EUBlocks.BLUESCHIST_LAPIS_ORE);
        blueschistOres.add(EUBlocks.BLUESCHIST_DIAMOND_ORE);
        blueschistOres.add(EUBlocks.BLUESCHIST_OBDURIUM_ORE);
        blueschistOres.add(EUBlocks.BLUESCHIST_MALUNITE_ORE);
        blueschistOres.add(EUBlocks.BLUESCHIST_LUTRUM_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_COAL_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_IRON_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_COPPER_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_GOLD_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_REDSTONE_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_EMERALD_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_LAPIS_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_DIAMOND_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_OBDURIUM_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_MALUNITE_ORE);
        frigusDeepslateOres.add(EUBlocks.FRIGUS_DEEPSLATE_LUTRUM_ORE);
        waterIceOres.add(EUBlocks.WATER_ICE_COAL_ORE);
        waterIceOres.add(EUBlocks.WATER_ICE_IRON_ORE);
        waterIceOres.add(EUBlocks.WATER_ICE_COPPER_ORE);
        waterIceOres.add(EUBlocks.WATER_ICE_GOLD_ORE);
        waterIceOres.add(EUBlocks.WATER_ICE_REDSTONE_ORE);
        waterIceOres.add(EUBlocks.WATER_ICE_EMERALD_ORE);
        waterIceOres.add(EUBlocks.WATER_ICE_LAPIS_ORE);
        waterIceOres.add(EUBlocks.WATER_ICE_DIAMOND_ORE);
        waterIceOres.add(EUBlocks.WATER_ICE_OBDURIUM_ORE);
        waterIceOres.add(EUBlocks.WATER_ICE_MALUNITE_ORE);
        waterIceOres.add(EUBlocks.WATER_ICE_LUTRUM_ORE);
        nitrogenIceOres.add(EUBlocks.NITROGEN_ICE_COAL_ORE);
        nitrogenIceOres.add(EUBlocks.NITROGEN_ICE_IRON_ORE);
        nitrogenIceOres.add(EUBlocks.NITROGEN_ICE_COPPER_ORE);
        nitrogenIceOres.add(EUBlocks.NITROGEN_ICE_GOLD_ORE);
        nitrogenIceOres.add(EUBlocks.NITROGEN_ICE_REDSTONE_ORE);
        nitrogenIceOres.add(EUBlocks.NITROGEN_ICE_EMERALD_ORE);
        nitrogenIceOres.add(EUBlocks.NITROGEN_ICE_LAPIS_ORE);
        nitrogenIceOres.add(EUBlocks.NITROGEN_ICE_DIAMOND_ORE);
        nitrogenIceOres.add(EUBlocks.NITROGEN_ICE_OBDURIUM_ORE);
        nitrogenIceOres.add(EUBlocks.NITROGEN_ICE_MALUNITE_ORE);
        nitrogenIceOres.add(EUBlocks.NITROGEN_ICE_LUTRUM_ORE);
        oxygenIceOres.add(EUBlocks.OXYGEN_ICE_COAL_ORE);
        oxygenIceOres.add(EUBlocks.OXYGEN_ICE_IRON_ORE);
        oxygenIceOres.add(EUBlocks.OXYGEN_ICE_COPPER_ORE);
        oxygenIceOres.add(EUBlocks.OXYGEN_ICE_GOLD_ORE);
        oxygenIceOres.add(EUBlocks.OXYGEN_ICE_REDSTONE_ORE);
        oxygenIceOres.add(EUBlocks.OXYGEN_ICE_EMERALD_ORE);
        oxygenIceOres.add(EUBlocks.OXYGEN_ICE_LAPIS_ORE);
        oxygenIceOres.add(EUBlocks.OXYGEN_ICE_DIAMOND_ORE);
        oxygenIceOres.add(EUBlocks.OXYGEN_ICE_OBDURIUM_ORE);
        oxygenIceOres.add(EUBlocks.OXYGEN_ICE_MALUNITE_ORE);
        oxygenIceOres.add(EUBlocks.OXYGEN_ICE_LUTRUM_ORE);
        // Frigus Mud
        pickaxeStairs.add(EUBlocks.FRIGUS_MUD_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.FRIGUS_MUD_BRICK_SLAB);
        pickaxeWalls.add(EUBlocks.FRIGUS_MUD_BRICK_WALL);
        // Frigus Stone
        pickaxeStairs.add(EUBlocks.BLUESCHIST_STAIRS);
        pickaxeStairs.add(EUBlocks.FRIGUS_COBBLESTONE_STAIRS);
        pickaxeStairs.add(EUBlocks.POLISHED_BLUESCHIST_STAIRS);
        pickaxeStairs.add(EUBlocks.BLUESCHIST_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("blueschist_slab"));
        pickaxeSlabs.add(EUBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("cobbled_blueschist_slab"));
        pickaxeSlabs.add(EUBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("polished_blueschist_slab"));
        pickaxeSlabs.add(EUBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("blueschist_brick_slab"));
        pickaxeWalls.add(EUBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("blueschist_wall"));
        pickaxeWalls.add(EUBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("cobbled_blueschist_wall"));
        pickaxeWalls.add(EUBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("polished_blueschist_wall"));
        pickaxeWalls.add(EUBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("blueschist_brick_wall"));
        stonePressurePlates.add(EUBlocks.BLUESCHIST_PRESSURE_PLATE);
        stoneButtons.add(EUBlocks.BLUESCHIST_BUTTON);
        // Frigus Deepslate
        pickaxeStairs.add(EUBlocks.FRIGUS_DEEPSLATE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_FRIGUS_DEEPSLATE_STAIRS);
        pickaxeStairs.add(EUBlocks.POLISHED_FRIGUS_DEEPSLATE_STAIRS);
        pickaxeStairs.add(EUBlocks.FRIGUS_DEEPSLATE_BRICK_STAIRS);
        pickaxeStairs.add(EUBlocks.FRIGUS_DEEPSLATE_TILE_STAIRS);
        pickaxeSlabs.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_slab"));
        pickaxeSlabs.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("cobbled_frigus_deepslate_slab"));
        pickaxeSlabs.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("polished_frigus_deepslate_slab"));
        pickaxeSlabs.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_brick_slab"));
        pickaxeSlabs.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_tile_slab"));
        pickaxeWalls.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_wall"));
        pickaxeWalls.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("cobbled_frigus_deepslate_wall"));
        pickaxeWalls.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("polished_frigus_deepslate_wall"));
        pickaxeWalls.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_brick_wall"));
        pickaxeWalls.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS_CONTINUED.get("frigus_deepslate_tile_wall"));
        // Permafrost
        pickaxeStairs.add(EUBlocks.PERMAFROST_STAIRS);
        pickaxeStairs.add(EUBlocks.POLISHED_PERMAFROST_STAIRS);
        pickaxeStairs.add(EUBlocks.PERMAFROST_BRICK_STAIRS);
        pickaxeStairs.add(EUBlocks.PERMAFROST_TILE_STAIRS);
        pickaxeSlabs.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_slab"));
        pickaxeSlabs.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("polished_permafrost_slab"));
        pickaxeSlabs.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_slab"));
        pickaxeSlabs.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_slab"));
        pickaxeWalls.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_wall"));
        pickaxeWalls.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("polished_permafrost_wall"));
        pickaxeWalls.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_wall"));
        pickaxeWalls.add(EUBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_wall"));
        // Ices
        ices.add(EUBlocks.WATER_ICE_BLOCKS.get("water_ice"));
        ices.add(EUBlocks.WATER_ICE_BLOCKS.get("cobbled_water_ice"));
        ices.add(EUBlocks.WATER_ICE_BLOCKS.get("water_ice_bricks"));
        ices.add(EUBlocks.WATER_ICE_BLOCKS.get("cracked_water_ice_bricks"));
        ices.add(EUBlocks.WATER_ICE_BLOCKS.get("water_ice_pillar"));
        pickaxeStairs.add(EUBlocks.WATER_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_WATER_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.WATER_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_slab"));
        pickaxeSlabs.add(EUBlocks.WATER_ICE_BLOCKS_CONTINUED.get("cobbled_water_ice_slab"));
        pickaxeSlabs.add(EUBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_wall"));
        pickaxeWalls.add(EUBlocks.WATER_ICE_BLOCKS_CONTINUED.get("cobbled_water_ice_wall"));
        pickaxeWalls.add(EUBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_brick_wall"));
        ices.add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice"));
        ices.add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("cobbled_tholin_poor_water_ice"));
        ices.add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks"));
        ices.add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("cracked_tholin_poor_water_ice_bricks"));
        ices.add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_pillar"));
        pickaxeStairs.add(EUBlocks.THOLIN_POOR_WATER_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_THOLIN_POOR_WATER_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.THOLIN_POOR_WATER_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_slab"));
        pickaxeSlabs.add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("cobbled_tholin_poor_water_ice_slab"));
        pickaxeSlabs.add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_wall"));
        pickaxeWalls.add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("cobbled_tholin_poor_water_ice_wall"));
        pickaxeWalls.add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_brick_wall"));
        ices.add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice"));
        ices.add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("cobbled_tholin_rich_water_ice"));
        ices.add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks"));
        ices.add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("cracked_tholin_rich_water_ice_bricks"));
        ices.add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_pillar"));
        pickaxeStairs.add(EUBlocks.THOLIN_RICH_WATER_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_THOLIN_RICH_WATER_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.THOLIN_RICH_WATER_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_slab"));
        pickaxeSlabs.add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("cobbled_tholin_rich_water_ice_slab"));
        pickaxeSlabs.add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_wall"));
        pickaxeWalls.add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("cobbled_tholin_rich_water_ice_wall"));
        pickaxeWalls.add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_brick_wall"));
        ices.add(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice"));
        ices.add(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("cobbled_black_water_ice"));
        ices.add(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks"));
        ices.add(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("cracked_black_water_ice_bricks"));
        ices.add(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_pillar"));
        pickaxeStairs.add(EUBlocks.BLACK_WATER_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_BLACK_WATER_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.BLACK_WATER_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_slab"));
        pickaxeSlabs.add(EUBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("cobbled_black_water_ice_slab"));
        pickaxeSlabs.add(EUBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_wall"));
        pickaxeWalls.add(EUBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("cobbled_black_water_ice_wall"));
        pickaxeWalls.add(EUBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_brick_wall"));
        ices.add(EUBlocks.METHANE_ICE_BLOCKS.get("methane_ice"));
        ices.add(EUBlocks.METHANE_ICE_BLOCKS.get("cobbled_methane_ice"));
        ices.add(EUBlocks.METHANE_ICE_BLOCKS.get("methane_ice_bricks"));
        ices.add(EUBlocks.METHANE_ICE_BLOCKS.get("cracked_methane_ice_bricks"));
        ices.add(EUBlocks.METHANE_ICE_BLOCKS.get("methane_ice_pillar"));
        pickaxeStairs.add(EUBlocks.METHANE_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_METHANE_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.METHANE_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_slab"));
        pickaxeSlabs.add(EUBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("cobbled_methane_ice_slab"));
        pickaxeSlabs.add(EUBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_wall"));
        pickaxeWalls.add(EUBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("cobbled_methane_ice_wall"));
        pickaxeWalls.add(EUBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_brick_wall"));
        ices.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice"));
        ices.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("cobbled_tholin_poor_methane_ice"));
        ices.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks"));
        ices.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("cracked_tholin_poor_methane_ice_bricks"));
        ices.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_pillar"));
        pickaxeStairs.add(EUBlocks.THOLIN_POOR_METHANE_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_THOLIN_POOR_METHANE_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_slab"));
        pickaxeSlabs.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("cobbled_tholin_poor_methane_ice_slab"));
        pickaxeSlabs.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_wall"));
        pickaxeWalls.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("cobbled_tholin_poor_methane_ice_wall"));
        pickaxeWalls.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_brick_wall"));
        ices.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice"));
        ices.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("cobbled_tholin_rich_methane_ice"));
        ices.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks"));
        ices.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("cracked_tholin_rich_methane_ice_bricks"));
        ices.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_pillar"));
        pickaxeStairs.add(EUBlocks.THOLIN_RICH_METHANE_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_THOLIN_RICH_METHANE_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_slab"));
        pickaxeSlabs.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("cobbled_tholin_rich_methane_ice_slab"));
        pickaxeSlabs.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_wall"));
        pickaxeWalls.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("cobbled_tholin_rich_methane_ice_wall"));
        pickaxeWalls.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_brick_wall"));
        ices.add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice"));
        ices.add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("cobbled_carbon_dioxide_ice"));
        ices.add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks"));
        ices.add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("cracked_carbon_dioxide_ice_bricks"));
        ices.add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_pillar"));
        pickaxeStairs.add(EUBlocks.CARBON_DIOXIDE_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_CARBON_DIOXIDE_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.CARBON_DIOXIDE_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_slab"));
        pickaxeSlabs.add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("cobbled_carbon_dioxide_ice_slab"));
        pickaxeSlabs.add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_wall"));
        pickaxeWalls.add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("cobbled_carbon_dioxide_ice_wall"));
        pickaxeWalls.add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_brick_wall"));
        ices.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice"));
        ices.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("cobbled_tholin_poor_carbon_dioxide_ice"));
        ices.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks"));
        ices.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("cracked_tholin_poor_carbon_dioxide_ice_bricks"));
        ices.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_pillar"));
        pickaxeStairs.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_THOLIN_POOR_CARBON_DIOXIDE_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_slab"));
        pickaxeSlabs.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("cobbled_tholin_poor_carbon_dioxide_ice_slab"));
        pickaxeSlabs.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_wall"));
        pickaxeWalls.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("cobbled_tholin_poor_carbon_dioxide_ice_wall"));
        pickaxeWalls.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_brick_wall"));
        ices.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice"));
        ices.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("cobbled_tholin_rich_carbon_dioxide_ice"));
        ices.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks"));
        ices.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("cracked_tholin_rich_carbon_dioxide_ice_bricks"));
        ices.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_pillar"));
        pickaxeStairs.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_THOLIN_RICH_CARBON_DIOXIDE_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_slab"));
        pickaxeSlabs.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("cobbled_tholin_rich_carbon_dioxide_ice_slab"));
        pickaxeSlabs.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_wall"));
        pickaxeWalls.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("cobbled_tholin_rich_carbon_dioxide_ice_wall"));
        pickaxeWalls.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_brick_wall"));
        ices.add(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice"));
        ices.add(EUBlocks.AMMONIA_ICE_BLOCKS.get("cobbled_ammonia_ice"));
        ices.add(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks"));
        ices.add(EUBlocks.AMMONIA_ICE_BLOCKS.get("cracked_ammonia_ice_bricks"));
        ices.add(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_pillar"));
        pickaxeStairs.add(EUBlocks.AMMONIA_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_AMMONIA_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.AMMONIA_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_slab"));
        pickaxeSlabs.add(EUBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("cobbled_ammonia_ice_slab"));
        pickaxeSlabs.add(EUBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_wall"));
        pickaxeWalls.add(EUBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("cobbled_ammonia_ice_wall"));
        pickaxeWalls.add(EUBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_brick_wall"));
        ices.add(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice"));
        ices.add(EUBlocks.NITROGEN_ICE_BLOCKS.get("cobbled_nitrogen_ice"));
        ices.add(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks"));
        ices.add(EUBlocks.NITROGEN_ICE_BLOCKS.get("cracked_nitrogen_ice_bricks"));
        ices.add(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_pillar"));
        pickaxeStairs.add(EUBlocks.NITROGEN_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_NITROGEN_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.NITROGEN_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_slab"));
        pickaxeSlabs.add(EUBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("cobbled_nitrogen_ice_slab"));
        pickaxeSlabs.add(EUBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_wall"));
        pickaxeWalls.add(EUBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("cobbled_nitrogen_ice_wall"));
        pickaxeWalls.add(EUBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_brick_wall"));
        ices.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice"));
        ices.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("cobbled_tholin_poor_nitrogen_ice"));
        ices.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks"));
        ices.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("cracked_tholin_poor_nitrogen_ice_bricks"));
        ices.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_pillar"));
        pickaxeStairs.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_THOLIN_POOR_NITROGEN_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_slab"));
        pickaxeSlabs.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("cobbled_tholin_poor_nitrogen_ice_slab"));
        pickaxeSlabs.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_wall"));
        pickaxeWalls.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("cobbled_tholin_poor_nitrogen_ice_wall"));
        pickaxeWalls.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_brick_wall"));
        ices.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice"));
        ices.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("cobbled_tholin_rich_nitrogen_ice"));
        ices.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks"));
        ices.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("cracked_tholin_rich_nitrogen_ice_bricks"));
        ices.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_pillar"));
        pickaxeStairs.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_THOLIN_RICH_NITROGEN_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_slab"));
        pickaxeSlabs.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("cobbled_tholin_rich_nitrogen_ice_slab"));
        pickaxeSlabs.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_wall"));
        pickaxeWalls.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("cobbled_tholin_rich_nitrogen_ice_wall"));
        pickaxeWalls.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_brick_wall"));
        ices.add(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice"));
        ices.add(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("cobbled_red_nitrogen_ice"));
        ices.add(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks"));
        ices.add(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("cracked_red_nitrogen_ice_bricks"));
        ices.add(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_pillar"));
        pickaxeStairs.add(EUBlocks.RED_NITROGEN_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_RED_NITROGEN_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.RED_NITROGEN_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_slab"));
        pickaxeSlabs.add(EUBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("cobbled_red_nitrogen_ice_slab"));
        pickaxeSlabs.add(EUBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_wall"));
        pickaxeWalls.add(EUBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("cobbled_red_nitrogen_ice_wall"));
        pickaxeWalls.add(EUBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_brick_wall"));
        ices.add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice"));
        ices.add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("cobbled_sulfur_dioxide_ice"));
        ices.add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks"));
        ices.add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("cracked_sulfur_dioxide_ice_bricks"));
        ices.add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_pillar"));
        pickaxeStairs.add(EUBlocks.SULFUR_DIOXIDE_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_SULFUR_DIOXIDE_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.SULFUR_DIOXIDE_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_slab"));
        pickaxeSlabs.add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("cobbled_sulfur_dioxide_ice_slab"));
        pickaxeSlabs.add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_wall"));
        pickaxeWalls.add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("cobbled_sulfur_dioxide_ice_wall"));
        pickaxeWalls.add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_brick_wall"));
        ices.add(EUBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice"));
        ices.add(EUBlocks.OXYGEN_ICE_BLOCKS.get("cobbled_oxygen_ice"));
        ices.add(EUBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks"));
        ices.add(EUBlocks.OXYGEN_ICE_BLOCKS.get("cracked_oxygen_ice_bricks"));
        ices.add(EUBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_pillar"));
        pickaxeStairs.add(EUBlocks.OXYGEN_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.COBBLED_OXYGEN_ICE_STAIRS);
        pickaxeStairs.add(EUBlocks.OXYGEN_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(EUBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_slab"));
        pickaxeSlabs.add(EUBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("cobbled_oxygen_ice_slab"));
        pickaxeSlabs.add(EUBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_brick_slab"));
        pickaxeWalls.add(EUBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_wall"));
        pickaxeWalls.add(EUBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("cobbled_oxygen_ice_wall"));
        pickaxeWalls.add(EUBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_brick_wall"));

        /*
        Tool Tags
         */

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(EUBlocks.FRIGUS_GRASS_BLOCK.get())
                .add(EUBlocks.FRIGUS_DIRT_PATH.get())
                .add(EUBlocks.FRIGUS_DIRT.get())
                .add(EUBlocks.COARSE_FRIGUS_DIRT.get())
                .add(EUBlocks.FRIGUS_FARMLAND.get())
                .add(EUBlocks.FRIGUS_MUD.get())

                .add(EUBlocks.SALT_DUST_BLOCK.get())
                .add(EUBlocks.SULFUR_DUST_BLOCK.get())
                .add(EUBlocks.GRAPHITE_DUST_BLOCK.get())
        ;
        blueschistOres.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        frigusDeepslateOres.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        waterIceOres.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        nitrogenIceOres.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        oxygenIceOres.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        pickaxeStairs.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        pickaxeSlabs.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        stonePressurePlates.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        ices.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                // Frigus Stones
                .add(EUBlocks.BLUESCHIST_BLOCKS.get("blueschist").get())
                .add(EUBlocks.BLUESCHIST_BLOCKS.get("cobbled_blueschist").get())
                .add(EUBlocks.BLUESCHIST_BLOCKS.get("chiseled_blueschist").get())
                .add(EUBlocks.BLUESCHIST_BLOCKS.get("polished_blueschist").get())
                .add(EUBlocks.BLUESCHIST_BLOCKS.get("blueschist_bricks").get())
                .add(EUBlocks.BLUESCHIST_BLOCKS.get("cracked_blueschist_bricks").get())
                .add(EUBlocks.BLUESCHIST_BLOCKS.get("blueschist_pillar").get())
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
                // Plating
                .add(EUBlocks.MALUNITE_PLATING_PRESSURE_PLATE.get())
                .add(EUBlocks.MALUNITE_PLATING_BUTTON.get())
                // Miscellaneous
                .add(EUBlocks.PACKED_FRIGUS_MUD.get())
                .add(EUBlocks.FRIGUS_MUD_BRICKS.get())
        ;
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(EUBlocks.FRIGUS_SHORT_GRASS.get())
                .add(EUBlocks.MAYURA_LOG.get())
                .add(EUBlocks.MAYURA_WOOD.get())
                .add(EUBlocks.STRIPPED_MAYURA_LOG.get())
                .add(EUBlocks.STRIPPED_MAYURA_WOOD.get())
                .add(EUBlocks.MAYURA_PLANKS.get())
                .add(EUBlocks.MAYURA_FENCE_GATE.get())
                .add(EUBlocks.GRIMWOOD_LOG.get())
                .add(EUBlocks.GRIMWOOD_WOOD.get())
                .add(EUBlocks.STRIPPED_GRIMWOOD_LOG.get())
                .add(EUBlocks.STRIPPED_GRIMWOOD_WOOD.get())
                .add(EUBlocks.GRIMWOOD_PLANKS.get())
                .add(EUBlocks.GRIMWOOD_FENCE_GATE.get())
        ;
        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(EUBlocks.MAYURA_LEAVES.get())
                .add(EUBlocks.GRIMWOOD_LEAVES.get())
                .add(EUBlocks.BRUMA_BLOCK.get())
        ;
        tag(BlockTags.SWORD_EFFICIENT)
                .add(EUBlocks.FRIGUS_SHORT_GRASS.get())
        ;
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(EUBlocks.BLUESCHIST_COPPER_ORE.get())
                .add(EUBlocks.BLUESCHIST_IRON_ORE.get())
                .add(EUBlocks.BLUESCHIST_LAPIS_ORE.get())
                .add(EUBlocks.BLUESCHIST_LUTRUM_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_COPPER_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_IRON_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_LAPIS_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_LUTRUM_ORE.get())
                .add(EUBlocks.WATER_ICE_COPPER_ORE.get())
                .add(EUBlocks.WATER_ICE_IRON_ORE.get())
                .add(EUBlocks.WATER_ICE_LAPIS_ORE.get())
                .add(EUBlocks.WATER_ICE_LUTRUM_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_COPPER_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_IRON_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_LAPIS_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_LUTRUM_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_COPPER_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_IRON_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_LAPIS_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_LUTRUM_ORE.get())
        ;
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(EUBlocks.BLUESCHIST_GOLD_ORE.get())
                .add(EUBlocks.BLUESCHIST_REDSTONE_ORE.get())
                .add(EUBlocks.BLUESCHIST_EMERALD_ORE.get())
                .add(EUBlocks.BLUESCHIST_DIAMOND_ORE.get())
                .add(EUBlocks.BLUESCHIST_OBDURIUM_ORE.get())
                .add(EUBlocks.BLUESCHIST_MALUNITE_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_GOLD_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_REDSTONE_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_EMERALD_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_DIAMOND_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_OBDURIUM_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_MALUNITE_ORE.get())
                .add(EUBlocks.WATER_ICE_GOLD_ORE.get())
                .add(EUBlocks.WATER_ICE_REDSTONE_ORE.get())
                .add(EUBlocks.WATER_ICE_EMERALD_ORE.get())
                .add(EUBlocks.WATER_ICE_DIAMOND_ORE.get())
                .add(EUBlocks.WATER_ICE_OBDURIUM_ORE.get())
                .add(EUBlocks.WATER_ICE_MALUNITE_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_GOLD_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_REDSTONE_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_EMERALD_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_DIAMOND_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_OBDURIUM_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_MALUNITE_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_GOLD_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_REDSTONE_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_EMERALD_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_DIAMOND_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_OBDURIUM_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_MALUNITE_ORE.get())
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

        pickaxeStairs.forEach(entry -> tag(BlockTags.STAIRS).add(entry.get()));
        tag(BlockTags.STAIRS)
        ;
        tag(BlockTags.WOODEN_STAIRS)
                .add(EUBlocks.MAYURA_STAIRS.get())
                .add(EUBlocks.GRIMWOOD_STAIRS.get())
        ;
        pickaxeSlabs.forEach(entry -> tag(BlockTags.SLABS).add(entry.get()));
        tag(BlockTags.SLABS)
        ;
        tag(BlockTags.WOODEN_SLABS)
                .add(EUBlocks.MAYURA_SLAB.get())
                .add(EUBlocks.GRIMWOOD_SLAB.get())
        ;
        tag(BlockTags.FENCES)
        ;
        tag(BlockTags.WOODEN_FENCES)
                .add(EUBlocks.MAYURA_FENCE.get())
                .add(EUBlocks.GRIMWOOD_FENCE.get())
        ;
        tag(BlockTags.FENCE_GATES)
                .add(EUBlocks.MAYURA_FENCE_GATE.get())
                .add(EUBlocks.GRIMWOOD_FENCE_GATE.get())
        ;
        tag(Tags.Blocks.FENCE_GATES)
        ;
        tag(Tags.Blocks.FENCE_GATES_WOODEN)
                .add(EUBlocks.MAYURA_FENCE_GATE.get())
                .add(EUBlocks.GRIMWOOD_FENCE_GATE.get())
        ;
        pickaxeWalls.forEach(entry -> tag(BlockTags.WALLS).add(entry.get()));
        tag(BlockTags.WALLS)
        ;
        tag(BlockTags.DOORS)
        ;
        tag(BlockTags.WOODEN_DOORS)
                .add(EUBlocks.MAYURA_DOOR.get())
                .add(EUBlocks.GRIMWOOD_DOOR.get())
        ;
        tag(BlockTags.TRAPDOORS)
        ;
        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(EUBlocks.MAYURA_TRAPDOOR.get())
                .add(EUBlocks.GRIMWOOD_TRAPDOOR.get())
        ;
        tag(BlockTags.PRESSURE_PLATES)
                .add(EUBlocks.MALUNITE_PLATING_PRESSURE_PLATE.get())
        ;
        stonePressurePlates.forEach(entry -> tag(BlockTags.STONE_PRESSURE_PLATES).add(entry.get()));
        tag(BlockTags.STONE_PRESSURE_PLATES)
        ;
        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(EUBlocks.MAYURA_PRESSURE_PLATE.get())
                .add(EUBlocks.GRIMWOOD_PRESSURE_PLATE.get())
        ;
        tag(BlockTags.BUTTONS)
                .add(EUBlocks.MALUNITE_PLATING_BUTTON.get())
        ;
        stoneButtons.forEach(entry -> tag(BlockTags.STONE_BUTTONS).add(entry.get()));
        tag(BlockTags.STONE_BUTTONS)
        ;
        tag(BlockTags.WOODEN_BUTTONS)
                .add(EUBlocks.MAYURA_BUTTON.get())
                .add(EUBlocks.GRIMWOOD_BUTTON.get())
        ;

        /*
        Ore Tags
         */

        tag(BlockTags.COAL_ORES)
                .add(EUBlocks.BLUESCHIST_COAL_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_COAL_ORE.get())
                .add(EUBlocks.WATER_ICE_COAL_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_COAL_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_COAL_ORE.get())
        ;
        tag(BlockTags.IRON_ORES)
                .add(EUBlocks.BLUESCHIST_IRON_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_IRON_ORE.get())
                .add(EUBlocks.WATER_ICE_IRON_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_IRON_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_IRON_ORE.get())
        ;
        tag(BlockTags.COPPER_ORES)
                .add(EUBlocks.BLUESCHIST_COPPER_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_COPPER_ORE.get())
                .add(EUBlocks.WATER_ICE_COPPER_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_COPPER_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_COPPER_ORE.get())
        ;
        tag(BlockTags.GOLD_ORES)
                .add(EUBlocks.BLUESCHIST_GOLD_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_GOLD_ORE.get())
                .add(EUBlocks.WATER_ICE_GOLD_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_GOLD_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_GOLD_ORE.get())
        ;
        tag(BlockTags.REDSTONE_ORES)
                .add(EUBlocks.BLUESCHIST_REDSTONE_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_REDSTONE_ORE.get())
                .add(EUBlocks.WATER_ICE_REDSTONE_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_REDSTONE_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_REDSTONE_ORE.get())
        ;
        tag(BlockTags.EMERALD_ORES)
                .add(EUBlocks.BLUESCHIST_EMERALD_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_EMERALD_ORE.get())
                .add(EUBlocks.WATER_ICE_EMERALD_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_EMERALD_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_EMERALD_ORE.get())
        ;
        tag(BlockTags.LAPIS_ORES)
                .add(EUBlocks.BLUESCHIST_LAPIS_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_LAPIS_ORE.get())
                .add(EUBlocks.WATER_ICE_LAPIS_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_LAPIS_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_LAPIS_ORE.get())
        ;
        tag(BlockTags.DIAMOND_ORES)
                .add(EUBlocks.BLUESCHIST_DIAMOND_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_DIAMOND_ORE.get())
                .add(EUBlocks.WATER_ICE_DIAMOND_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_DIAMOND_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_DIAMOND_ORE.get())
        ;
        tag(EUTags.EUBlockTags.ORES_OBDURIUM)
                .add(EUBlocks.BLUESCHIST_OBDURIUM_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_OBDURIUM_ORE.get())
                .add(EUBlocks.WATER_ICE_OBDURIUM_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_OBDURIUM_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_OBDURIUM_ORE.get())
        ;
        tag(EUTags.EUBlockTags.ORES_MALUNITE)
                .add(EUBlocks.BLUESCHIST_MALUNITE_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_MALUNITE_ORE.get())
                .add(EUBlocks.WATER_ICE_MALUNITE_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_MALUNITE_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_MALUNITE_ORE.get())
        ;
        tag(EUTags.EUBlockTags.ORES_LUTRUM)
                .add(EUBlocks.BLUESCHIST_LUTRUM_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_LUTRUM_ORE.get())
                .add(EUBlocks.WATER_ICE_LUTRUM_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_LUTRUM_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_LUTRUM_ORE.get())
        ;
        tag(Tags.Blocks.ORE_RATES_DENSE)
                .add(EUBlocks.BLUESCHIST_COPPER_ORE.get())
                .add(EUBlocks.BLUESCHIST_REDSTONE_ORE.get())
                .add(EUBlocks.BLUESCHIST_LAPIS_ORE.get())
                .add(EUBlocks.BLUESCHIST_LUTRUM_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_COPPER_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_REDSTONE_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_LAPIS_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_LUTRUM_ORE.get())
                .add(EUBlocks.WATER_ICE_COPPER_ORE.get())
                .add(EUBlocks.WATER_ICE_REDSTONE_ORE.get())
                .add(EUBlocks.WATER_ICE_LAPIS_ORE.get())
                .add(EUBlocks.WATER_ICE_LUTRUM_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_COPPER_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_REDSTONE_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_LAPIS_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_LUTRUM_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_COPPER_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_REDSTONE_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_LAPIS_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_LUTRUM_ORE.get())
        ;
        tag(Tags.Blocks.ORE_RATES_SINGULAR)
                .add(EUBlocks.BLUESCHIST_COAL_ORE.get())
                .add(EUBlocks.BLUESCHIST_IRON_ORE.get())
                .add(EUBlocks.BLUESCHIST_GOLD_ORE.get())
                .add(EUBlocks.BLUESCHIST_EMERALD_ORE.get())
                .add(EUBlocks.BLUESCHIST_DIAMOND_ORE.get())
                .add(EUBlocks.BLUESCHIST_OBDURIUM_ORE.get())
                .add(EUBlocks.BLUESCHIST_MALUNITE_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_COAL_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_IRON_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_GOLD_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_EMERALD_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_DIAMOND_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_OBDURIUM_ORE.get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_MALUNITE_ORE.get())
                .add(EUBlocks.WATER_ICE_COAL_ORE.get())
                .add(EUBlocks.WATER_ICE_IRON_ORE.get())
                .add(EUBlocks.WATER_ICE_GOLD_ORE.get())
                .add(EUBlocks.WATER_ICE_EMERALD_ORE.get())
                .add(EUBlocks.WATER_ICE_DIAMOND_ORE.get())
                .add(EUBlocks.WATER_ICE_OBDURIUM_ORE.get())
                .add(EUBlocks.WATER_ICE_MALUNITE_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_COAL_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_IRON_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_GOLD_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_EMERALD_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_DIAMOND_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_OBDURIUM_ORE.get())
                .add(EUBlocks.NITROGEN_ICE_MALUNITE_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_COAL_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_IRON_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_GOLD_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_EMERALD_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_DIAMOND_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_OBDURIUM_ORE.get())
                .add(EUBlocks.OXYGEN_ICE_MALUNITE_ORE.get())
        ;
        tag(Tags.Blocks.ORE_RATES_SPARSE)
        ;
        tag(EUTags.EUBlockTags.ORE_BEARING_GROUND_BLUESCHIST)
                .add(EUBlocks.BLUESCHIST_BLOCKS.get("blueschist").get())
        ;
        tag(EUTags.EUBlockTags.ORE_BEARING_GROUND_FRIGUS_DEEPSLATE)
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get())
        ;
        tag(EUTags.EUBlockTags.ORE_BEARING_GROUND_WATER_ICE)
                .add(EUBlocks.WATER_ICE_BLOCKS.get("water_ice").get())
        ;
        tag(EUTags.EUBlockTags.ORE_BEARING_GROUND_NITROGEN_ICE)
                .add(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice").get())
        ;
        tag(EUTags.EUBlockTags.ORE_BEARING_GROUND_OXYGEN_ICE)
                .add(EUBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice").get())
        ;
        blueschistOres.forEach(entry -> tag(EUTags.EUBlockTags.ORES_IN_GROUND_BLUESCHIST).add(entry.get()));
        frigusDeepslateOres.forEach(entry -> tag(EUTags.EUBlockTags.ORES_IN_GROUND_FRIGUS_DEEPSLATE).add(entry.get()));
        waterIceOres.forEach(entry -> tag(EUTags.EUBlockTags.ORES_IN_GROUND_WATER_ICE).add(entry.get()));
        nitrogenIceOres.forEach(entry -> tag(EUTags.EUBlockTags.ORES_IN_GROUND_NITROGEN_ICE).add(entry.get()));
        oxygenIceOres.forEach(entry -> tag(EUTags.EUBlockTags.ORES_IN_GROUND_OXYGEN_ICE).add(entry.get()));

        /*
        Stone Tags
         */

        tag(Tags.Blocks.STONES)
                .add(EUBlocks.BLUESCHIST_BLOCKS.get("blueschist").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get())
                .add(EUBlocks.PERMAFROST_BLOCKS.get("permafrost").get())
        ;
        tag(Tags.Blocks.COBBLESTONES)
                .addTag(EUTags.EUBlockTags.COBBLESTONES_BLUESCHIST)
                .addTag(EUTags.EUBlockTags.COBBLESTONES_FRIGUS_DEEPSLATE)
        ;
        tag(EUTags.EUBlockTags.COBBLESTONES_BLUESCHIST)
                .add(EUBlocks.BLUESCHIST_BLOCKS.get("cobbled_blueschist").get())
        ;
        tag(EUTags.EUBlockTags.COBBLESTONES_FRIGUS_DEEPSLATE)
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get())
        ;

        // Base Stone Tags
        tag(EUTags.EUBlockTags.BASE_STONE_FRIGUS)
                .add(EUBlocks.BLUESCHIST_BLOCKS.get("blueschist").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get())
                .add(EUBlocks.PERMAFROST_BLOCKS.get("permafrost").get())
        ;

        /*
        Storage Block Tags
         */

        tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTag(EUTags.EUBlockTags.STORAGE_BLOCKS_BRUMA)
                .addTag(EUTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM)
                .addTag(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_OBDURIUM)
                .addTag(EUTags.EUBlockTags.STORAGE_BLOCKS_MALUNITE)
                .addTag(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_MALUNITE)
                .addTag(EUTags.EUBlockTags.STORAGE_BLOCKS_LUTRUM)
                .addTag(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_LUTRUM)
        ;
        tag(EUTags.EUBlockTags.STORAGE_BLOCKS_BRUMA)
                .add(EUBlocks.BRUMA_BLOCK.get())
        ;
        tag(EUTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM)
                .add(EUBlocks.OBDURIUM_BLOCK.get())
        ;
        tag(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_OBDURIUM)
                .add(EUBlocks.RAW_OBDURIUM_BLOCK.get())
        ;
        tag(EUTags.EUBlockTags.STORAGE_BLOCKS_MALUNITE)
                .add(EUBlocks.MALUNITE_BLOCK.get())
        ;
        tag(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_MALUNITE)
                .add(EUBlocks.RAW_MALUNITE_BLOCK.get())
        ;
        tag(EUTags.EUBlockTags.STORAGE_BLOCKS_LUTRUM)
                .add(EUBlocks.LUTRUM_BLOCK.get())
        ;
        tag(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_LUTRUM)
                .add(EUBlocks.RAW_LUTRUM_BLOCK.get())
        ;

        /*
        Soil Tags
         */

        tag(BlockTags.DIRT)
                .add(EUBlocks.FRIGUS_GRASS_BLOCK.get())
                .add(EUBlocks.FRIGUS_DIRT.get())
                .add(EUBlocks.COARSE_FRIGUS_DIRT.get())
                .add(EUBlocks.FRIGUS_MUD.get())
        ;
        tag(EUTags.EUBlockTags.CONVERTABLE_TO_FRIGUS_MUD)
                .add(EUBlocks.FRIGUS_DIRT.get())
                .add(EUBlocks.COARSE_FRIGUS_DIRT.get())
        ;
        tag(BlockTags.ANIMALS_SPAWNABLE_ON)
                .add(EUBlocks.FRIGUS_GRASS_BLOCK.get())
        ;
        tag(BlockTags.SNIFFER_DIGGABLE_BLOCK)
                .add(EUBlocks.FRIGUS_GRASS_BLOCK.get())
                .add(EUBlocks.FRIGUS_DIRT.get())
                .add(EUBlocks.COARSE_FRIGUS_DIRT.get())
        ;
        tag(BlockTags.VALID_SPAWN)
                .add(EUBlocks.FRIGUS_GRASS_BLOCK.get())
        ;
        tag(Tags.Blocks.VILLAGER_FARMLANDS)
                .add(EUBlocks.FRIGUS_FARMLAND.get())
        ;

        /*
        Tree Tags
         */

        tag(BlockTags.LEAVES)
                .add(EUBlocks.MAYURA_LEAVES.get())
                .add(EUBlocks.GRIMWOOD_LEAVES.get())
        ;
        tag(BlockTags.LOGS)
                .add(EUBlocks.MAYURA_LOG.get())
                .add(EUBlocks.MAYURA_WOOD.get())
                .add(EUBlocks.STRIPPED_MAYURA_LOG.get())
                .add(EUBlocks.STRIPPED_MAYURA_WOOD.get())
                .add(EUBlocks.GRIMWOOD_LOG.get())
                .add(EUBlocks.GRIMWOOD_WOOD.get())
                .add(EUBlocks.STRIPPED_GRIMWOOD_LOG.get())
                .add(EUBlocks.STRIPPED_GRIMWOOD_WOOD.get())
        ;
        tag(Tags.Blocks.STRIPPED_LOGS)
                .add(EUBlocks.STRIPPED_MAYURA_LOG.get())
                .add(EUBlocks.STRIPPED_GRIMWOOD_LOG.get())
        ;
        tag(Tags.Blocks.STRIPPED_WOODS)
                .add(EUBlocks.STRIPPED_MAYURA_WOOD.get())
                .add(EUBlocks.STRIPPED_GRIMWOOD_WOOD.get())
        ;
        tag(BlockTags.LOGS_THAT_BURN)
                .add(EUBlocks.MAYURA_LOG.get())
                .add(EUBlocks.MAYURA_WOOD.get())
                .add(EUBlocks.STRIPPED_MAYURA_LOG.get())
                .add(EUBlocks.STRIPPED_MAYURA_WOOD.get())
                .add(EUBlocks.GRIMWOOD_LOG.get())
                .add(EUBlocks.GRIMWOOD_WOOD.get())
                .add(EUBlocks.STRIPPED_GRIMWOOD_LOG.get())
                .add(EUBlocks.STRIPPED_GRIMWOOD_WOOD.get())
        ;
        tag(BlockTags.PLANKS)
                .add(EUBlocks.MAYURA_PLANKS.get())
                .add(EUBlocks.GRIMWOOD_PLANKS.get())
        ;
        tag(EUTags.EUBlockTags.MAYURA_LOGS)
                .add(EUBlocks.MAYURA_LOG.get())
                .add(EUBlocks.MAYURA_WOOD.get())
                .add(EUBlocks.STRIPPED_MAYURA_LOG.get())
                .add(EUBlocks.STRIPPED_MAYURA_WOOD.get())
        ;
        tag(EUTags.EUBlockTags.GRIMWOOD_LOGS)
                .add(EUBlocks.GRIMWOOD_LOG.get())
                .add(EUBlocks.GRIMWOOD_WOOD.get())
                .add(EUBlocks.STRIPPED_GRIMWOOD_LOG.get())
                .add(EUBlocks.STRIPPED_GRIMWOOD_WOOD.get())
        ;

        /*
        Plant Tags
         */

        tag(BlockTags.REPLACEABLE_BY_TREES)
                .add(EUBlocks.FRIGUS_SHORT_GRASS.get())
        ;
        tag(BlockTags.SAPLINGS)
                .add(EUBlocks.MAYURA_SAPLING.get())
        ;
        tag(BlockTags.SMALL_FLOWERS)
                .add(EUBlocks.VIVIAN.get())
                .add(EUBlocks.WICKUL.get())
                .add(EUBlocks.ICEFLOWER.get())
        ;
        tag(BlockTags.TALL_FLOWERS)
        ;
        tag(BlockTags.FLOWER_POTS)
                .add(EUBlocks.POTTED_VIVIAN.get())
                .add(EUBlocks.POTTED_WICKUL.get())
                .add(EUBlocks.POTTED_ICEFLOWER.get())
        ;

        /*
        Carver Replaceable Tags
         */

        tag(EUTags.EUBlockTags.FRIGUS_CARVER_REPLACEABLES)
                .addTag(EUTags.EUBlockTags.BASE_STONE_FRIGUS)
                .addTag(BlockTags.DIRT)
                .addTag(BlockTags.SAND)
                .addTag(BlockTags.COPPER_ORES)
                .addTag(BlockTags.IRON_ORES)
                .addTag(BlockTags.SNOW)
                .add(Blocks.PACKED_ICE)
                .add(Blocks.RAW_COPPER_BLOCK)
                .add(Blocks.RAW_IRON_BLOCK)
                .add(Blocks.WATER)
        ;

        /*
        Ore Replaceable Tags
         */

        tag(EUTags.EUBlockTags.BLUESCHIST_ORE_REPLACEABLES)
                .add(EUBlocks.BLUESCHIST_BLOCKS.get("blueschist").get())
                .add(EUBlocks.PERMAFROST_BLOCKS.get("permafrost").get())
        ;
        tag(EUTags.EUBlockTags.FRIGUS_DEEPSLATE_ORE_REPLACEABLES)
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get())
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
        tag(BlockTags.ICE)
                .add(EUBlocks.WATER_ICE_BLOCKS.get("water_ice").get())
                .add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice").get())
                .add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice").get())
        ;
    }
}