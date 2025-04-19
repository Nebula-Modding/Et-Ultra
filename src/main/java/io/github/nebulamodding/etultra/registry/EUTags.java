package io.github.nebulamodding.etultra.registry;

import io.github.nebulamodding.etultra.EtUltra;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class EUTags {
    public static TagKey<Block> commonBlockTag(String name) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
    }
    public static TagKey<Item> commonItemTag(String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
    }
    public static TagKey<Block> blockTag(String name) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath(EtUltra.MOD_ID, name));
    }
    public static TagKey<Item> itemTag(String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(EtUltra.MOD_ID, name));
    }
    public static class EUBlockTags {
        // Blocks
        public static final TagKey<Block>

                /*
                Common Tags
                 */

                // Cobblestones
                COBBLESTONES_FRIGUS_STONE = commonBlockTag("cobblestones/frigus_stone"),
                COBBLESTONES_FRIGUS_DEEPSLATE = commonBlockTag("cobblestones/frigus_deepslate"),

                // Ore Bearing Ground
                ORE_BEARING_GROUND_FRIGUS_STONE = commonBlockTag("ore_bearing_ground/frigus_stone"),
                ORE_BEARING_GROUND_FRIGUS_DEEPSLATE = commonBlockTag("ore_bearing_ground/frigus_deepslate"),

                // Ores In Ground
                ORES_IN_GROUND_FRIGUS_STONE = commonBlockTag("ores_in_ground/frigus_stone"),
                ORES_IN_GROUND_FRIGUS_DEEPSLATE = commonBlockTag("ores_in_ground/frigus_deepslate"),

                // Ore Blocks
                ORES_OBDURIUM = commonBlockTag("ores/obdurium"),
                ORES_MALUNITE = commonBlockTag("ores/malunite"),

                // Storage Blocks
                STORAGE_BLOCKS_OBDURIUM = commonBlockTag("storage_blocks/obdurium"),
                STORAGE_BLOCKS_MALUNITE = commonBlockTag("storage_blocks/malunite"),
                STORAGE_BLOCKS_RAW_OBDURIUM = commonBlockTag("storage_blocks/raw_obdurium"),
                STORAGE_BLOCKS_RAW_MALUNITE = commonBlockTag("storage_blocks/raw_malunite"),

                /*
                Et Ultra Tags
                 */

                // Needs Tools
                NEEDS_OBDURIUM_TOOL = blockTag("needs_obdurium_tool"),
                NEEDS_MALUNITE_TOOL = blockTag("needs_malunite_tool"),

                // Base Stones
                BASE_STONE_FRIGUS = blockTag("base_stone_frigus"),

                // Carver Replacables
                FRIGUS_CARVER_REPLACEABLES = blockTag("frigus_carver_replaceables"),

                // Ore Replacables
                FRIGUS_STONE_ORE_REPLACEABLES = blockTag("frigus_stone_ore_replaceables"),
                FRIGUS_DEEPSLATE_ORE_REPLACEABLES = blockTag("frigus_deepslate_ore_replaceables"),

                // Convertable to Mud
                CONVERTABLE_TO_FRIGUS_MUD = blockTag("convertable_to_frigus_mud")
        ;
    }
    public static class EUItemTags {
        // Block Items
        public static final TagKey<Item>
                // Cobblestones
                COBBLESTONES_FRIGUS_STONE = commonItemTag("cobblestones/frigus_stone"),
                COBBLESTONES_FRIGUS_DEEPSLATE = commonItemTag("cobblestones/frigus_deepslate"),

                // Ore Bearing Ground
                ORE_BEARING_GROUND_FRIGUS_STONE = commonItemTag("ore_bearing_ground/frigus_stone"),
                ORE_BEARING_GROUND_FRIGUS_DEEPSLATE = commonItemTag("ore_bearing_ground/frigus_deepslate"),

                // Ores In Ground
                ORES_IN_GROUND_FRIGUS_STONE = commonItemTag("ores_in_ground/frigus_stone"),
                ORES_IN_GROUND_FRIGUS_DEEPSLATE = commonItemTag("ores_in_ground/frigus_deepslate"),

                // Ore Blocks
                ORES_OBDURIUM = commonItemTag("ores/obdurium"),
                ORES_MALUNITE = commonItemTag("ores/malunite"),

                // Storage Blocks
                STORAGE_BLOCKS_OBDURIUM = commonItemTag("storage_blocks/obdurium"),
                STORAGE_BLOCKS_MALUNITE = commonItemTag("storage_blocks/malunite"),
                STORAGE_BLOCKS_RAW_OBDURIUM = commonItemTag("storage_blocks/raw_obdurium"),
                STORAGE_BLOCKS_RAW_MALUNITE = commonItemTag("storage_blocks/raw_malunite")
        ;
        // Items
        public static final TagKey<Item>
                // Adds a plates tag because neoforge doesn't have a common tag for it by default
                PLATES = commonItemTag("plates"),

                RAW_MATERIALS_OBDURIUM = commonItemTag("raw_material/obdurium"),
                NUGGETS_OBDURIUM = commonItemTag("nuggets/obdurium"),
                INGOTS_OBDURIUM = commonItemTag("ingots/obdurium"),
                PLATES_OBDURIUM = commonItemTag("plates/obdurium"),
                RODS_OBDURIUM = commonItemTag("rods/obdurium"),

                RAW_MATERIALS_MALUNITE = commonItemTag("raw_material/malunite"),
                NUGGETS_MALUNITE = commonItemTag("nuggets/malunite"),
                INGOTS_MALUNITE = commonItemTag("ingots/malunite"),
                PLATES_MALUNITE = commonItemTag("plates/malunite"),
                RODS_MALUNITE = commonItemTag("rods/malunite")
        ;
    }
}