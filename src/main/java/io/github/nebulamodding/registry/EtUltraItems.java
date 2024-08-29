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

    public static final Supplier<BlockItem> MARS_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.MARS_DEEPSLATE);
    public static final Supplier<BlockItem> COBBLED_MARS_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.COBBLED_MARS_DEEPSLATE);
    public static final Supplier<BlockItem> GRAPHITE_BLOCK = ITEMS.registerSimpleBlockItem(EtUltraBlocks.GRAPHITE_BLOCK);
    public static final Supplier<BlockItem> GRAPHITE_DUST = ITEMS.registerSimpleBlockItem(EtUltraBlocks.GRAPHITE_DUST);

    // Items

    public static final DeferredItem<Item> PENCIL = ITEMS.register("pencil", () -> new Item(new Item.Properties()
            .stacksTo(16)
            .setNoRepair()
    ));
}
