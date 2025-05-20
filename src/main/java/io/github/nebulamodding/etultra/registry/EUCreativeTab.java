package io.github.nebulamodding.etultra.registry;

import io.github.nebulamodding.etultra.EtUltra;
import io.github.nebulamodding.etultra.registry.block.EUBlocks;
import io.github.nebulamodding.etultra.registry.item.EUItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;

public class EUCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EtUltra.MOD_ID);

    public static String CREATIVE_TAB_TITLE = "itemGroup.et_ultra";
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ET_ULTRA = CREATIVE_MODE_TABS.register("et_ultra", () ->
            CreativeModeTab.builder()
                    .title(Component.translatable(CREATIVE_TAB_TITLE))
                    .icon(() -> new ItemStack(EUBlocks.FRIGUS_GRASS_BLOCK.get()))
                    .build());

    public static void buildCreativeTab(BuildCreativeModeTabContentsEvent event) {
        final List<DeferredBlock<? extends Block>> excludedItems = new ArrayList<>();
        // Blocks excluded from the creative menu
        excludedItems.add(EUBlocks.POTTED_MAYURA_SAPLING);
        excludedItems.add(EUBlocks.POTTED_GRIMWOOD_SAPLING);
        excludedItems.add(EUBlocks.POTTED_VIVIAN);
        excludedItems.add(EUBlocks.POTTED_WICKUL);
        excludedItems.add(EUBlocks.POTTED_ICEFLOWER);

        if(event.getTab() == ET_ULTRA.get()) {
            EUItems.ITEMS.getEntries()
                    .stream()
                    .filter(b -> !excludedItems.contains(b))
                    .forEach(item -> event.accept(item.get()));
        }
    }
}