package io.github.nebulamodding.datagen.providers.loot;

import io.github.nebulamodding.registry.EUBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
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

        excludedBlocks.add(EUBlocks.MARS_BLOCKS.get("mars_deepslate"));

        EUBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !excludedBlocks.contains(b))
                .forEach(entry -> dropSelf(entry.get()));

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