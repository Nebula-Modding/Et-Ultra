package io.github.nebulamodding.registry;

import io.github.nebulamodding.EtUltra;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EUCreativeTab {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EtUltra.MOD_ID);

    public static String ETULTRA_TAB_TITLE = "itemGroup.et_ultra.main";

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ETULTRA_TAB = CREATIVE_MODE_TABS.register("et_ultra_creative_tab", () -> {
        CreativeModeTab.Builder builder = CreativeModeTab.builder();

        builder.displayItems((itemDisplay, output) -> {
            EUItems.ITEMS.getEntries()
                    .forEach(item -> output.accept(item.get()));

            EUBlocks.BLOCKS.getEntries()
                    .forEach(block -> output.accept(block.get()));
        });

        builder.icon(() -> new ItemStack((ItemLike) EUItems.OBDURIUM_HAMMER));
        builder.title(Component.translatable(ETULTRA_TAB_TITLE));

        return builder.build();
    });
}