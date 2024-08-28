package io.github.nebulamodding.etultra;

// Items Go Here

import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EtUltraItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EtUltra.MODID);
    public static final Supplier<BlockItem> EXAMPLE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(EtUltraBlocks.);


}
