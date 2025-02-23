package io.github.nebulamodding.registry.registers;

import io.github.nebulamodding.EtUltra;
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

    public static TagKey<Block> createToolTag(String name) {
        return TagKey.create(BuiltInRegistries.BLOCK.key(), ResourceLocation.fromNamespaceAndPath(EtUltra.MOD_ID, name));
    }
    public static class EUBlockTags {
        // Block Tags
        public static final TagKey<Block>
                ORE_BEARING_GROUND_FRIGUS_STONE = commonBlockTag("ore_bearing_ground/frigus_stone"),
                ORE_BEARING_GROUND_FRIGUS_DEEPSLATE = commonBlockTag("ore_bearing_ground/frigus_deepslate"),
                STORAGE_BLOCKS_OBDURIUM = commonBlockTag("storage_blocks/obdurium")
        ;
    }
    public static class EUItemTags {
        // Block Item Tags
        public static final TagKey<Item>
                ORE_BEARING_GROUND_FRIGUS_STONE = commonItemTag("ore_bearing_ground/frigus_stone"),
                ORE_BEARING_GROUND_FRIGUS_DEEPSLATE = commonItemTag("ore_bearing_ground/frigus_deepslate"),
                STORAGE_BLOCKS_OBDURIUM = commonItemTag("storage_blocks/obdurium")
        ;

        // Item Tags
        public static final TagKey<Item>
                RAW_MATERIALS_OBDURIUM = commonItemTag("raw_material/obdurium"),
                NUGGETS_OBDURIUM = commonItemTag("nuggets/obdurium"),
                INGOTS_OBDURIUM = commonItemTag("ingots/obdurium")
        ;
    }
}