package io.github.nebulamodding.datagen.data.loot;

import io.github.nebulamodding.registry.EUBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.stream.Collectors;

public class EUBlockLootProvider extends BlockLootSubProvider {
    public EUBlockLootProvider(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }
    @Override
    protected void generate() {
        //Manual Loot Tables
        add(EUBlocks.FRIGUS_GRASS_BLOCK.get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.FRIGUS_DIRT.get()));
        add(EUBlocks.FRIGUS_DIRT_PATH.get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.FRIGUS_DIRT.get()));
        add(EUBlocks.FRIGUS_FARMLAND.get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.FRIGUS_DIRT.get()));
        add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_cobblestone").get()));
        add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get()));

        // Automated Loot Tables
        EUBlocks.BLOCKS.getEntries().forEach(entry -> dropSelf(entry.get()));
    }
    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return EUBlocks.BLOCKS.getEntries()
                .stream()
                .map(DeferredHolder::get)
                .collect(Collectors.toSet());
    }
}