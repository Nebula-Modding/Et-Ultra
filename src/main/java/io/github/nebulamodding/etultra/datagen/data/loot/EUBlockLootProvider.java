package io.github.nebulamodding.etultra.datagen.data.loot;

import io.github.nebulamodding.etultra.registry.EUBlocks;
import io.github.nebulamodding.etultra.registry.EUItems;
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

public class EUBlockLootProvider extends BlockLootSubProvider {
    public EUBlockLootProvider(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }
    @Override
    protected void generate() {
        final List<DeferredHolder<Block, ? extends Block>> excludedBlocks = new ArrayList<>();
        // Blocks excluded from having a drop automatically provided
        excludedBlocks.add(EUBlocks.MAYURA_DOOR);
        excludedBlocks.add(EUBlocks.FRIGUS_GRASS_BLOCK);
        excludedBlocks.add(EUBlocks.FRIGUS_DIRT_PATH);
        excludedBlocks.add(EUBlocks.FRIGUS_FARMLAND);
        excludedBlocks.add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate"));
        excludedBlocks.add(EUBlocks.FRIGUS_COAL_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_IRON_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_COPPER_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_GOLD_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_REDSTONE_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_EMERALD_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_LAPIS_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_DIAMOND_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_OBDURIUM_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_MALUNITE_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_COAL_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_IRON_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_COPPER_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_GOLD_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_REDSTONE_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_EMERALD_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_LAPIS_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_DIAMOND_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_OBDURIUM_ORE);
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_MALUNITE_ORE);
        excludedBlocks.add(EUBlocks.BRAINROCK);
        excludedBlocks.add(EUBlocks.POTTED_MAYURA_SAPLING);
        excludedBlocks.add(EUBlocks.POTTED_VIVIAN);
        excludedBlocks.add(EUBlocks.POTTED_WICKUL);
        excludedBlocks.add(EUBlocks.POTTED_ICEFLOWER);

        /*
        Manual Loot Tables
         */

        add(EUBlocks.MAYURA_DOOR.get(), this::createDoorTable);

        add(EUBlocks.FRIGUS_GRASS_BLOCK.get(), b -> createSingleItemTable(EUBlocks.FRIGUS_DIRT.get()));
        add(EUBlocks.FRIGUS_DIRT_PATH.get(), b -> createSingleItemTable(EUBlocks.FRIGUS_DIRT.get()));
        add(EUBlocks.FRIGUS_FARMLAND.get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.FRIGUS_DIRT.get()));
        add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_cobblestone").get()));
        add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get()));

        /*
        Ore Drops
         */

        add(EUBlocks.FRIGUS_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        add(EUBlocks.FRIGUS_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        add(EUBlocks.FRIGUS_COPPER_ORE.get(), this::createCopperOreDrops);
        add(EUBlocks.FRIGUS_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        add(EUBlocks.FRIGUS_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        add(EUBlocks.FRIGUS_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        add(EUBlocks.FRIGUS_LAPIS_ORE.get(), this::createLapisOreDrops);
        add(EUBlocks.FRIGUS_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));
        add(EUBlocks.FRIGUS_OBDURIUM_ORE.get(), (block) -> this.createOreDrop(block, EUItems.OBDURIUM_ITEMS.get("raw_obdurium").get()));
        add(EUBlocks.FRIGUS_MALUNITE_ORE.get(), (block) -> this.createOreDrop(block, EUItems.MALUNITE_ITEMS.get("raw_malunite").get()));
        add(EUBlocks.FRIGUS_DEEPSLATE_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        add(EUBlocks.FRIGUS_DEEPSLATE_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        add(EUBlocks.FRIGUS_DEEPSLATE_COPPER_ORE.get(), this::createCopperOreDrops);
        add(EUBlocks.FRIGUS_DEEPSLATE_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        add(EUBlocks.FRIGUS_DEEPSLATE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        add(EUBlocks.FRIGUS_DEEPSLATE_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        add(EUBlocks.FRIGUS_DEEPSLATE_LAPIS_ORE.get(), this::createLapisOreDrops);
        add(EUBlocks.FRIGUS_DEEPSLATE_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));
        add(EUBlocks.FRIGUS_DEEPSLATE_OBDURIUM_ORE.get(), (block) -> this.createOreDrop(block, EUItems.OBDURIUM_ITEMS.get("raw_obdurium").get()));
        add(EUBlocks.FRIGUS_DEEPSLATE_MALUNITE_ORE.get(), (block) -> this.createOreDrop(block, EUItems.MALUNITE_ITEMS.get("raw_malunite").get()));

        /*
        Potted Plant Loot Tables
         */

        dropPottedContents(EUBlocks.POTTED_MAYURA_SAPLING.get());
        dropPottedContents(EUBlocks.POTTED_VIVIAN.get());
        dropPottedContents(EUBlocks.POTTED_WICKUL.get());
        dropPottedContents(EUBlocks.POTTED_ICEFLOWER.get());

        /*
        Automated Loot Tables
         */

        EUBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !excludedBlocks.contains(b))
                .forEach(entry -> dropSelf(entry.get()));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return EUBlocks.BLOCKS.getEntries()
                .stream()
                .map(DeferredHolder::get)
                .collect(Collectors.toSet());
    }
}