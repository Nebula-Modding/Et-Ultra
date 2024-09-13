package io.github.nebulamodding.datagen.providers.loot;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EtUltraBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EtUltraBlockLootTables extends BlockLootSubProvider {
    public EtUltraBlockLootTables(HolderLookup.Provider p_344943_) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), p_344943_);
    }

    private static final Set<RegistryAccess.RegistryEntry<Item>> BLOCK_DROP_OVERRIDES = Set.of();

    @Override
    protected void generate() {

        EtUltraBlocks.BLOCKS.getEntries()
                .stream().filter(b -> !(BLOCK_DROP_OVERRIDES.contains(b)))
                .forEach(entry ->
                        dropSelf(entry.get()));

        //add(EtUltraBlocks.EXAMPLE_ORE.get(), createOreDrop(EtUltraBlocks.EXAMPLE_ORE.get(), EtUltraItems.RAW_EXAMPLE.get()));
        //add(EtUltraBlocks.DEEPSLATE_EXAMPLE_ORE.get(), createOreDrop(EtUltraBlocks.DEEPSLATE_EXAMPLE_ORE.get(), EtUltraItems.RAW_EXAMPLE.get()));

        //add(EtUltraBlocks.MARS_DEEPSLATE.get(), b -> createSingleItemTableWithSilkTouch(b, EtUltraBlocks.COBBLED_MARS_DEEPSLATE.get()));


        //add(EtUltraBlocks.LAUNCH_PAD.get(), b ->
        //        createSinglePropConditionTable(b, LaunchPadBlock.PART, LaunchPadPartProperty.CENTER));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return BuiltInRegistries.BLOCK.stream()
                .filter(block -> Optional.of(BuiltInRegistries.BLOCK.getKey(block))
                        .filter(key -> key.getNamespace().equals(EtUltra.MOD_ID))
                        .isPresent())
                .collect(Collectors.toSet());
    }
}