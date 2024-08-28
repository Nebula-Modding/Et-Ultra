package io.github.nebulamodding.registry;

// Items Go Here

import io.github.nebulamodding.EtUltra;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EtUltraItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EtUltra.MOD_ID);
    public static final Supplier<BlockItem> MARS_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.MARS_DEEPSLATE);
    public static final Supplier<BlockItem> COBBLED_MARS_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.COBBLED_MARS_DEEPSLATE);
    public static final Supplier<BlockItem> GRAPHITE_BLOCK = ITEMS.registerSimpleBlockItem(EtUltraBlocks.GRAPHITE_BLOCK);
    public static final Supplier<BlockItem> GRAPHITE_DUST = ITEMS.registerSimpleBlockItem(EtUltraBlocks.GRAPHITE_DUST);
}
