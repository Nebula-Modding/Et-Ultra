package io.github.nebulamodding.datagen.providers.loot;

import io.github.nebulamodding.registry.blocks.EUBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EUBlockLootTables extends BlockLootSubProvider {
    public EUBlockLootTables(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate() {
        // To exclude a block, just add it to the list using #add,
        // then add a custom block drop after the loop
        final List<DeferredHolder<Block, ? extends Block>> excludedBlocks = new ArrayList<>();

        excludedBlocks.add(EUBlocks.FRIGUS_GRASS_BLOCK);
        excludedBlocks.add(EUBlocks.MARS_BLOCKS.get("mars_deepslate"));

        EUBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !excludedBlocks.contains(b))
                .forEach(entry -> dropSelf(entry.get()));

        add(EUBlocks.FRIGUS_GRASS_BLOCK.get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.FRIGUS_DIRT.get()));
        add(EUBlocks.FRIGUS_DIRT_PATH.get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.FRIGUS_DIRT.get()));
        add(EUBlocks.FRIGUS_FARMLAND.get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.FRIGUS_DIRT.get()));
        add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_cobblestone").get()));
        add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get()));
        add(EUBlocks.MARS_BLOCKS.get("mars_deepslate").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.MARS_BLOCKS.get("cobbled_mars_deepslate").get()));
    }
    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return EUBlocks.BLOCKS.getEntries()
                .stream()
                .map(DeferredHolder::get)
                .collect(Collectors.toSet());
    }
}