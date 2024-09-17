package io.github.nebulamodding.datagen.providers.loot;

import io.github.nebulamodding.registry.EtUltraBlocks;
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

public class EtUltraBlockLootTables extends BlockLootSubProvider {
    public EtUltraBlockLootTables(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate() {
        // To exclude a block, just add it to the list using #add,
        // then add a custom block drop after the loop
        final List<DeferredHolder<Block, ? extends Block>> excludedBlocks = new ArrayList<>();

//        excludedBlocks.add(EtUltraBlocks.MARS_DEEPSLATE);

        EtUltraBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !excludedBlocks.contains(b))
                .forEach(entry -> dropSelf(entry.get()));

        // I am assuming that this code here is for future reference, so I will not
        // remove it (for now)
        // (also "I" is Emma, in case you don't want to find the git blame)

        //add(EtUltraBlocks.EXAMPLE_ORE.get(), createOreDrop(EtUltraBlocks.EXAMPLE_ORE.get(), EtUltraItems.RAW_EXAMPLE.get()));
        //add(EtUltraBlocks.DEEPSLATE_EXAMPLE_ORE.get(), createOreDrop(EtUltraBlocks.DEEPSLATE_EXAMPLE_ORE.get(), EtUltraItems.RAW_EXAMPLE.get()));
        //add(EtUltraBlocks.MARS_DEEPSLATE.get(), b -> createSingleItemTableWithSilkTouch(b, EtUltraBlocks.COBBLED_MARS_DEEPSLATE.get()));
        //add(EtUltraBlocks.LAUNCH_PAD.get(), b ->
        //        createSinglePropConditionTable(b, LaunchPadBlock.PART, LaunchPadPartProperty.CENTER));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return EtUltraBlocks.BLOCKS.getEntries()
                .stream()
                .map(DeferredHolder::get)
                .collect(Collectors.toSet());
    }
}