package io.github.nebulamodding.registry;

import io.github.nebulamodding.EtUltra;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class EtUltraTags {
    public static ResourceLocation createOreLocation(String name) {
        return ResourceLocation.fromNamespaceAndPath(EtUltra.MOD_ID,  "ores/" + name);
    }

    public static ResourceLocation createBlockLocation(String name) {
        return ResourceLocation.fromNamespaceAndPath(EtUltra.MOD_ID, name);
    }

    public static ResourceLocation createGenericItemsLocation(String name) {
        return ResourceLocation.fromNamespaceAndPath(EtUltra.MOD_ID, name);
    }

    public static ResourceLocation createRawItemsLocation(String name) {
        return ResourceLocation.fromNamespaceAndPath(EtUltra.MOD_ID, "raw/" + name);
    }

    public static TagKey<Block> createToolTag(String name) {
        return TagKey.create(BuiltInRegistries.BLOCK.key(), ResourceLocation.fromNamespaceAndPath(EtUltra.MOD_ID, name));
    }

    public static class EtUltraItemTags {
        //public static final TagKey<Item> TEST_ITEMS = ItemTags.create(createGenericItemsLocation("test_items"));
        //public static final TagKey<Item> TEST_BLOCKS = ItemTags.create(createBlockLocation("test_blocks"));
    }

    public static class EtUltraBlockTags {
        //public static final TagKey<Block> TEST_BLOCKS =
        //        BlockTags.create(createBlockLocation("test_blocks"));
    }
}