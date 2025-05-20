package io.github.nebulamodding.etultra.datagen.data.loot;

import io.github.nebulamodding.etultra.registry.block.EUBlocks;
import io.github.nebulamodding.etultra.registry.item.EUItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
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
        excludedBlocks.add(EUBlocks.MAYURA_LEAVES);
        excludedBlocks.add(EUBlocks.GRIMWOOD_DOOR);
        excludedBlocks.add(EUBlocks.GRIMWOOD_LEAVES);
        excludedBlocks.add(EUBlocks.FRIGUS_GRASS_BLOCK);
        excludedBlocks.add(EUBlocks.FRIGUS_DIRT_PATH);
        excludedBlocks.add(EUBlocks.FRIGUS_FARMLAND);
        excludedBlocks.add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone"));
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate"));
        excludedBlocks.add(EUBlocks.WATER_ICE_BLOCKS.get("water_ice"));
        excludedBlocks.add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice"));
        excludedBlocks.add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice"));
        excludedBlocks.add(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice"));
        excludedBlocks.add(EUBlocks.METHANE_ICE_BLOCKS.get("methane_ice"));
        excludedBlocks.add(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice"));
        excludedBlocks.add(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice"));
        excludedBlocks.add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice"));
        excludedBlocks.add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice"));
        excludedBlocks.add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice"));
        excludedBlocks.add(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice"));
        excludedBlocks.add(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice"));
        excludedBlocks.add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice"));
        excludedBlocks.add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice"));
        excludedBlocks.add(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice"));
        excludedBlocks.add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice"));
        excludedBlocks.add(EUBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice"));
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
        excludedBlocks.add(EUBlocks.FRIGUS_LUTRUM_ORE);
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
        excludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_LUTRUM_ORE);
        excludedBlocks.add(EUBlocks.WATER_ICE_COAL_ORE);
        excludedBlocks.add(EUBlocks.WATER_ICE_IRON_ORE);
        excludedBlocks.add(EUBlocks.WATER_ICE_COPPER_ORE);
        excludedBlocks.add(EUBlocks.WATER_ICE_GOLD_ORE);
        excludedBlocks.add(EUBlocks.WATER_ICE_REDSTONE_ORE);
        excludedBlocks.add(EUBlocks.WATER_ICE_EMERALD_ORE);
        excludedBlocks.add(EUBlocks.WATER_ICE_LAPIS_ORE);
        excludedBlocks.add(EUBlocks.WATER_ICE_DIAMOND_ORE);
        excludedBlocks.add(EUBlocks.WATER_ICE_OBDURIUM_ORE);
        excludedBlocks.add(EUBlocks.WATER_ICE_MALUNITE_ORE);
        excludedBlocks.add(EUBlocks.WATER_ICE_LUTRUM_ORE);
        excludedBlocks.add(EUBlocks.NITROGEN_ICE_COAL_ORE);
        excludedBlocks.add(EUBlocks.NITROGEN_ICE_IRON_ORE);
        excludedBlocks.add(EUBlocks.NITROGEN_ICE_COPPER_ORE);
        excludedBlocks.add(EUBlocks.NITROGEN_ICE_GOLD_ORE);
        excludedBlocks.add(EUBlocks.NITROGEN_ICE_REDSTONE_ORE);
        excludedBlocks.add(EUBlocks.NITROGEN_ICE_EMERALD_ORE);
        excludedBlocks.add(EUBlocks.NITROGEN_ICE_LAPIS_ORE);
        excludedBlocks.add(EUBlocks.NITROGEN_ICE_DIAMOND_ORE);
        excludedBlocks.add(EUBlocks.NITROGEN_ICE_OBDURIUM_ORE);
        excludedBlocks.add(EUBlocks.NITROGEN_ICE_MALUNITE_ORE);
        excludedBlocks.add(EUBlocks.NITROGEN_ICE_LUTRUM_ORE);
        excludedBlocks.add(EUBlocks.OXYGEN_ICE_COAL_ORE);
        excludedBlocks.add(EUBlocks.OXYGEN_ICE_IRON_ORE);
        excludedBlocks.add(EUBlocks.OXYGEN_ICE_COPPER_ORE);
        excludedBlocks.add(EUBlocks.OXYGEN_ICE_GOLD_ORE);
        excludedBlocks.add(EUBlocks.OXYGEN_ICE_REDSTONE_ORE);
        excludedBlocks.add(EUBlocks.OXYGEN_ICE_EMERALD_ORE);
        excludedBlocks.add(EUBlocks.OXYGEN_ICE_LAPIS_ORE);
        excludedBlocks.add(EUBlocks.OXYGEN_ICE_DIAMOND_ORE);
        excludedBlocks.add(EUBlocks.OXYGEN_ICE_OBDURIUM_ORE);
        excludedBlocks.add(EUBlocks.OXYGEN_ICE_MALUNITE_ORE);
        excludedBlocks.add(EUBlocks.OXYGEN_ICE_LUTRUM_ORE);
        excludedBlocks.add(EUBlocks.BRAINROCK);
        excludedBlocks.add(EUBlocks.LUTRUM_DOOR);
        excludedBlocks.add(EUBlocks.POTTED_MAYURA_SAPLING);
        excludedBlocks.add(EUBlocks.POTTED_GRIMWOOD_SAPLING);
        excludedBlocks.add(EUBlocks.POTTED_VIVIAN);
        excludedBlocks.add(EUBlocks.POTTED_WICKUL);
        excludedBlocks.add(EUBlocks.POTTED_ICEFLOWER);

        /*
        Manual Loot Tables
         */

        add(EUBlocks.MAYURA_LEAVES.get(), b -> createLeavesDrops(b, EUBlocks.MAYURA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(EUBlocks.GRIMWOOD_LEAVES.get(), b -> createLeavesDrops(b, EUBlocks.GRIMWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(EUBlocks.FRIGUS_GRASS_BLOCK.get(), b -> createSingleItemTable(EUBlocks.FRIGUS_DIRT.get()));
        add(EUBlocks.FRIGUS_DIRT_PATH.get(), b -> createSingleItemTable(EUBlocks.FRIGUS_DIRT.get()));
        add(EUBlocks.FRIGUS_FARMLAND.get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.FRIGUS_DIRT.get()));
        add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_cobblestone").get()));
        add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get()));
        add(EUBlocks.WATER_ICE_BLOCKS.get("water_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.WATER_ICE_BLOCKS.get("cobbled_water_ice").get()));
        add(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("cobbled_tholin_poor_water_ice").get()));
        add(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("cobbled_tholin_rich_water_ice").get()));
        add(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.BLACK_WATER_ICE_BLOCKS.get("cobbled_black_water_ice").get()));
        add(EUBlocks.METHANE_ICE_BLOCKS.get("methane_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.METHANE_ICE_BLOCKS.get("cobbled_methane_ice").get()));
        add(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("cobbled_tholin_poor_methane_ice").get()));
        add(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("cobbled_tholin_rich_methane_ice").get()));
        add(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("cobbled_carbon_dioxide_ice").get()));
        add(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("cobbled_tholin_poor_carbon_dioxide_ice").get()));
        add(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("cobbled_tholin_rich_carbon_dioxide_ice").get()));
        add(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.AMMONIA_ICE_BLOCKS.get("cobbled_ammonia_ice").get()));
        add(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.NITROGEN_ICE_BLOCKS.get("cobbled_nitrogen_ice").get()));
        add(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("cobbled_tholin_poor_nitrogen_ice").get()));
        add(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("cobbled_tholin_rich_nitrogen_ice").get()));
        add(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("cobbled_red_nitrogen_ice").get()));
        add(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("cobbled_sulfur_dioxide_ice").get()));
        add(EUBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice").get(), b -> createSingleItemTableWithSilkTouch(b, EUBlocks.OXYGEN_ICE_BLOCKS.get("cobbled_oxygen_ice").get()));

        /*
        Door Drops
         */

        add(EUBlocks.MAYURA_DOOR.get(), this::createDoorTable);
        add(EUBlocks.GRIMWOOD_DOOR.get(), this::createDoorTable);
        add(EUBlocks.LUTRUM_DOOR.get(), this::createDoorTable);

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
        add(EUBlocks.FRIGUS_LUTRUM_ORE.get(), this::createLutrumOreDrops);
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
        add(EUBlocks.FRIGUS_DEEPSLATE_LUTRUM_ORE.get(), this::createLutrumOreDrops);
        add(EUBlocks.WATER_ICE_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        add(EUBlocks.WATER_ICE_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        add(EUBlocks.WATER_ICE_COPPER_ORE.get(), this::createCopperOreDrops);
        add(EUBlocks.WATER_ICE_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        add(EUBlocks.WATER_ICE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        add(EUBlocks.WATER_ICE_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        add(EUBlocks.WATER_ICE_LAPIS_ORE.get(), this::createLapisOreDrops);
        add(EUBlocks.WATER_ICE_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));
        add(EUBlocks.WATER_ICE_OBDURIUM_ORE.get(), (block) -> this.createOreDrop(block, EUItems.OBDURIUM_ITEMS.get("raw_obdurium").get()));
        add(EUBlocks.WATER_ICE_MALUNITE_ORE.get(), (block) -> this.createOreDrop(block, EUItems.MALUNITE_ITEMS.get("raw_malunite").get()));
        add(EUBlocks.WATER_ICE_LUTRUM_ORE.get(), this::createLutrumOreDrops);
        add(EUBlocks.NITROGEN_ICE_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        add(EUBlocks.NITROGEN_ICE_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        add(EUBlocks.NITROGEN_ICE_COPPER_ORE.get(), this::createCopperOreDrops);
        add(EUBlocks.NITROGEN_ICE_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        add(EUBlocks.NITROGEN_ICE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        add(EUBlocks.NITROGEN_ICE_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        add(EUBlocks.NITROGEN_ICE_LAPIS_ORE.get(), this::createLapisOreDrops);
        add(EUBlocks.NITROGEN_ICE_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));
        add(EUBlocks.NITROGEN_ICE_OBDURIUM_ORE.get(), (block) -> this.createOreDrop(block, EUItems.OBDURIUM_ITEMS.get("raw_obdurium").get()));
        add(EUBlocks.NITROGEN_ICE_MALUNITE_ORE.get(), (block) -> this.createOreDrop(block, EUItems.MALUNITE_ITEMS.get("raw_malunite").get()));
        add(EUBlocks.NITROGEN_ICE_LUTRUM_ORE.get(), this::createLutrumOreDrops);
        add(EUBlocks.OXYGEN_ICE_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        add(EUBlocks.OXYGEN_ICE_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        add(EUBlocks.OXYGEN_ICE_COPPER_ORE.get(), this::createCopperOreDrops);
        add(EUBlocks.OXYGEN_ICE_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        add(EUBlocks.OXYGEN_ICE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        add(EUBlocks.OXYGEN_ICE_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        add(EUBlocks.OXYGEN_ICE_LAPIS_ORE.get(), this::createLapisOreDrops);
        add(EUBlocks.OXYGEN_ICE_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));
        add(EUBlocks.OXYGEN_ICE_OBDURIUM_ORE.get(), (block) -> this.createOreDrop(block, EUItems.OBDURIUM_ITEMS.get("raw_obdurium").get()));
        add(EUBlocks.OXYGEN_ICE_MALUNITE_ORE.get(), (block) -> this.createOreDrop(block, EUItems.MALUNITE_ITEMS.get("raw_malunite").get()));
        add(EUBlocks.OXYGEN_ICE_LUTRUM_ORE.get(), this::createLutrumOreDrops);

        /*
        Potted Plant Loot Tables
         */

        dropPottedContents(EUBlocks.POTTED_MAYURA_SAPLING.get());
        dropPottedContents(EUBlocks.POTTED_VIVIAN.get());
        dropPottedContents(EUBlocks.POTTED_WICKUL.get());
        dropPottedContents(EUBlocks.POTTED_ICEFLOWER.get());
        dropPottedContents(EUBlocks.POTTED_GRIMWOOD_SAPLING.get());

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
    protected LootTable.Builder createLutrumOreDrops(Block block) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                block,
                this.applyExplosionDecay(
                        block,
                        LootItem.lootTableItem(EUItems.LUTRUM_ITEMS.get("raw_lutrum"))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }
}