package io.github.nebulamodding.registry;

// Items Go Here

import io.github.nebulamodding.EtUltra;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EtUltraItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EtUltra.MOD_ID);

    // Block Items

    public static final Supplier<BlockItem> COBBLED_MOON_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.COBBLED_MOON_DEEPSLATE);
    public static final Supplier<BlockItem> CHISELED_MOON_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.CHISELED_MOON_DEEPSLATE);
    public static final Supplier<BlockItem> POLISHED_MOON_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.POLISHED_MOON_DEEPSLATE);
    public static final Supplier<BlockItem> MOON_DEEPSLATE_BRICKS = ITEMS.registerSimpleBlockItem(EtUltraBlocks.MOON_DEEPSLATE_BRICKS);
    public static final Supplier<BlockItem> CRACKED_MOON_DEEPSLATE_BRICKS = ITEMS.registerSimpleBlockItem(EtUltraBlocks.CRACKED_MOON_DEEPSLATE_BRICKS);
    public static final Supplier<BlockItem> MOON_DEEPSLATE_TILES = ITEMS.registerSimpleBlockItem(EtUltraBlocks.MOON_DEEPSLATE_TILES);

    public static final Supplier<BlockItem> MARS_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.MARS_DEEPSLATE);
    public static final Supplier<BlockItem> COBBLED_MARS_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.COBBLED_MARS_DEEPSLATE);
    public static final Supplier<BlockItem> CHISELED_MARS_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.CHISELED_MARS_DEEPSLATE);
    public static final Supplier<BlockItem> POLISHED_MARS_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.POLISHED_MARS_DEEPSLATE);
    public static final Supplier<BlockItem> MARS_DEEPSLATE_BRICKS = ITEMS.registerSimpleBlockItem(EtUltraBlocks.MARS_DEEPSLATE_BRICKS);
    public static final Supplier<BlockItem> CRACKED_MARS_DEEPSLATE_BRICKS = ITEMS.registerSimpleBlockItem(EtUltraBlocks.CRACKED_MARS_DEEPSLATE_BRICKS);
    public static final Supplier<BlockItem> MARS_DEEPSLATE_TILES = ITEMS.registerSimpleBlockItem(EtUltraBlocks.MARS_DEEPSLATE_TILES);




    public static final Supplier<BlockItem> GRAPHITE_BLOCK = ITEMS.registerSimpleBlockItem(EtUltraBlocks.GRAPHITE_BLOCK);
    public static final Supplier<BlockItem> GRAPHITE_DUST = ITEMS.registerSimpleBlockItem(EtUltraBlocks.GRAPHITE_DUST);

    // Items

    public static final DeferredItem<Item> PENCIL = ITEMS.register("pencil", () -> new Item(new Item.Properties()
            .stacksTo(16)
            .setNoRepair()
    ));
}
