package io.github.nebulamodding.registry;

import io.github.nebulamodding.EtUltra;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class EUTags {
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
    public static class EUBlockTags {
        // Block Tags
        public static final TagKey<Block>
                STORAGE_BLOCKS_OBDURIUM = BlockTags.create(createGenericItemsLocation("storage_blocks/obdurium"))
        ;
    }

    public static class EUItemTags {
        // Block Item Tags
        public static final TagKey<Item>
                STORAGE_BLOCKS_OBDURIUM = ItemTags.create(createGenericItemsLocation("storage_blocks/obdurium"))
        ;

        // Item Tags
        public static final TagKey<Item>
                RAW_MATERIALS_OBDURIUM = ItemTags.create(createGenericItemsLocation("raw_material/obdurium")),
                NUGGETS_OBDURIUM = ItemTags.create(createGenericItemsLocation("nuggets/obdurium")),
                INGOTS_OBDURIUM = ItemTags.create(createGenericItemsLocation("ingots/obdurium"))
        ;
    }
}