package io.github.nebulamodding.registry;

import io.github.nebulamodding.EtUltra;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashSet;
import java.util.Set;

public class EtUltraCreativeTab {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EtUltra.MOD_ID);

    public static String ETULTRA_TAB_TITLE = "itemGroup.et_ultra.main";

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ETULTRA_TAB = CREATIVE_MODE_TABS.register("et_ultra_creative_tab", () -> {
        CreativeModeTab.Builder builder = CreativeModeTab.builder();

        builder.displayItems((itemDisplay, output) -> {
            Set<Item> addedItems = new HashSet<>();

            EtUltraItems.ITEMS.getEntries()
                    .stream()
                    .map((item) -> item.get().asItem())
                    .filter(addedItems::add)
                    .forEach(output::accept);

            EtUltraBlocks.BLOCKS.getEntries()
                    .stream()
                    .map((block) -> block.get().asItem())
                    .filter(addedItems::add)
                    .forEach(output::accept);
        });

        builder.icon(() -> new ItemStack(EtUltraItems.MARS_DEEPSLATE.get()));
        builder.title(Component.translatable(ETULTRA_TAB_TITLE));

        return builder.build();
    });
}