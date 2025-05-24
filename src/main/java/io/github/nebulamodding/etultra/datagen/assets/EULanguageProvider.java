package io.github.nebulamodding.etultra.datagen.assets;

import io.github.nebulamodding.etultra.EtUltra;
import io.github.nebulamodding.etultra.registry.block.EUBlocks;
import io.github.nebulamodding.etultra.registry.item.EUItems;
import io.github.nebulamodding.etultra.registry.EUCreativeTab;
import io.github.nebulamodding.etultra.registry.EUTags;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import org.codehaus.plexus.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EULanguageProvider extends LanguageProvider {
    public EULanguageProvider(PackOutput output) {
        super(output, EtUltra.MOD_ID, "en_us");
    }
    @Override
    protected void addTranslations() {
        final List<DeferredBlock<? extends Block>> excludedBlocks = new ArrayList<>();
        // Blocks excluded from having a translation automatically provided
        excludedBlocks.add(EUBlocks.SALT_CRYSTAL_BLOCK);
        excludedBlocks.add(EUBlocks.SALT_DUST_BLOCK);

        excludedBlocks.add(EUBlocks.SULFUR_CRYSTAL_BLOCK);
        excludedBlocks.add(EUBlocks.SULFUR_DUST_BLOCK);

        excludedBlocks.add(EUBlocks.GRAPHITE_CRYSTAL_BLOCK);
        excludedBlocks.add(EUBlocks.GRAPHITE_DUST_BLOCK);

        excludedBlocks.add(EUBlocks.FLESH_BLOCK);

        excludedBlocks.add(EUBlocks.BRUMA_BLOCK);

        excludedBlocks.add(EUBlocks.BRUMA_BLOCK);
        excludedBlocks.add(EUBlocks.RAW_OBDURIUM_BLOCK);
        excludedBlocks.add(EUBlocks.RAW_MALUNITE_BLOCK);
        excludedBlocks.add(EUBlocks.LUTRUM_AMALGAMATE_BLOCK);
        excludedBlocks.add(EUBlocks.RAW_LUTRUM_BLOCK);

        excludedBlocks.add(EUBlocks.OBDURIUM_BLOCK);
        excludedBlocks.add(EUBlocks.MALUNITE_BLOCK);
        excludedBlocks.add(EUBlocks.LUTRUM_BLOCK);

        final List<DeferredItem<? extends Item>> excludedItems = new ArrayList<>();
        // Items excluded from having a translation automatically provided
        excludedItems.add(EUItems.GOLDEN_AZURE_ROOT);
        excludedItems.add(EUItems.ENCHANTED_GOLDEN_AZURE_ROOT);
        excludedItems.add(EUItems.COOKED_FLESH);

        /*
        Manual Translations
         */

        // Blocks
        addBlock(EUBlocks.SALT_CRYSTAL_BLOCK, "Block of Salt Crystals");
        addBlock(EUBlocks.SALT_DUST_BLOCK, "Block of Salt Dust");

        addBlock(EUBlocks.SULFUR_CRYSTAL_BLOCK, "Block of Sulfur Crystals");
        addBlock(EUBlocks.SULFUR_DUST_BLOCK, "Block of Sulfur Dust");

        addBlock(EUBlocks.GRAPHITE_CRYSTAL_BLOCK, "Block of Graphite Crystals");
        addBlock(EUBlocks.GRAPHITE_DUST_BLOCK, "Block of Graphite Dust");

        addBlock(EUBlocks.FLESH_BLOCK, "Block of Flesh");

        addBlock(EUBlocks.BRUMA_BLOCK, "Bruma Bale");
        addBlock(EUBlocks.RAW_OBDURIUM_BLOCK, "Block of Raw Obdurium");
        addBlock(EUBlocks.RAW_MALUNITE_BLOCK, "Block of Raw Malunite");
        addBlock(EUBlocks.LUTRUM_AMALGAMATE_BLOCK, "Block of Lutrum Amalgamate");
        addBlock(EUBlocks.RAW_LUTRUM_BLOCK, "Block of Raw Lutrum");

        addBlock(EUBlocks.OBDURIUM_BLOCK, "Block of Obdurium");
        addBlock(EUBlocks.MALUNITE_BLOCK, "Block of Malunite");
        addBlock(EUBlocks.LUTRUM_BLOCK, "Block of Lutrum");

        // Items
        addItem(EUItems.GOLDEN_AZURE_ROOT, "Golden Root");
        addItem(EUItems.ENCHANTED_GOLDEN_AZURE_ROOT, "Enchanted Golden Root");
        addItem(EUItems.COOKED_FLESH, "Jerky");

        /*
        Tag Translations
         */

        // Block Tags
        add(EUTags.EUBlockTags.COBBLESTONES_BLUESCHIST, "Blueschist Cobblestones");
        add(EUTags.EUBlockTags.COBBLESTONES_FRIGUS_DEEPSLATE, "Frigus Deepslate Cobblestones");
        add(EUTags.EUBlockTags.ORE_BEARING_GROUND_BLUESCHIST, "Blueschist Ore Bearing Ground");
        add(EUTags.EUBlockTags.ORE_BEARING_GROUND_FRIGUS_DEEPSLATE, "Frigus Deepslate Ore Bearing Ground");
        add(EUTags.EUBlockTags.ORE_BEARING_GROUND_WATER_ICE, "Water Ice Ore Bearing Ground");
        add(EUTags.EUBlockTags.ORE_BEARING_GROUND_METHANE_ICE, "Methane Ice Ore Bearing Ground");
        add(EUTags.EUBlockTags.ORE_BEARING_GROUND_NITROGEN_ICE, "Nitrogen Ice Ore Bearing Ground");
        add(EUTags.EUBlockTags.ORE_BEARING_GROUND_OXYGEN_ICE, "Oxygen Ice Ore Bearing Ground");
        add(EUTags.EUBlockTags.ORES_IN_GROUND_BLUESCHIST, "Blueschist Ores In Ground");
        add(EUTags.EUBlockTags.ORES_IN_GROUND_FRIGUS_DEEPSLATE, "Frigus Deepslate Ores In Ground");
        add(EUTags.EUBlockTags.ORES_IN_GROUND_WATER_ICE, "Water Ice Ores In Ground");
        add(EUTags.EUBlockTags.ORES_IN_GROUND_METHANE_ICE, "Methane Ice Ores In Ground");
        add(EUTags.EUBlockTags.ORES_IN_GROUND_NITROGEN_ICE, "Nitrogen Ice Ores In Ground");
        add(EUTags.EUBlockTags.ORES_IN_GROUND_OXYGEN_ICE, "Oxygen Ice Ores In Ground");
        add(EUTags.EUBlockTags.ORES_OBDURIUM, "Obdurium Ores");
        add(EUTags.EUBlockTags.ORES_MALUNITE, "Malunite Ores");
        add(EUTags.EUBlockTags.ORES_LUTRUM, "Lutrum Ores");
        add(EUTags.EUBlockTags.STORAGE_BLOCKS_BRUMA, "Bruma Storage Blocks");
        add(EUTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM, "Obdurium Storage Blocks");
        add(EUTags.EUBlockTags.STORAGE_BLOCKS_MALUNITE, "Malunite Storage Blocks");
        add(EUTags.EUBlockTags.STORAGE_BLOCKS_LUTRUM, "Lutrum Storage Blocks");
        add(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_OBDURIUM, "Raw Obdurium Storage Blocks");
        add(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_MALUNITE, "Raw Malunite Storage Blocks");
        add(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_LUTRUM, "Raw Lutrum Storage Blocks");
        // Et Ultra Tags
        add(EUTags.EUBlockTags.NEEDS_OBDURIUM_TOOL, "Needs Obdurium Tool");
        add(EUTags.EUBlockTags.NEEDS_MALUNITE_TOOL, "Needs Malunite Tool");
        add(EUTags.EUBlockTags.NEEDS_LUTRUM_TOOL, "Needs Lutrum Tool");
        add(EUTags.EUBlockTags.BASE_STONE_FRIGUS, "Frigus Base Stones");
        add(EUTags.EUBlockTags.FRIGUS_CARVER_REPLACEABLES, "Frigus Carver Replaceables");
        add(EUTags.EUBlockTags.BLUESCHIST_ORE_REPLACEABLES, "Blueschist Ore Replaceables");
        add(EUTags.EUBlockTags.FRIGUS_DEEPSLATE_ORE_REPLACEABLES, "Frigus Deepslate Ore Replaceables");
        add(EUTags.EUBlockTags.CONVERTABLE_TO_FRIGUS_MUD, "Convertable to Frigus Mud");
        add(EUTags.EUBlockTags.MAYURA_LOGS, "Mayura Logs");
        add(EUTags.EUBlockTags.GRIMWOOD_LOGS, "Grimwood Logs");

        // Block Item Tags
        add(EUTags.EUItemTags.COBBLESTONES_BLUESCHIST, "Blueschist Cobblestones");
        add(EUTags.EUItemTags.COBBLESTONES_FRIGUS_DEEPSLATE, "Frigus Deepslate Cobblestones");
        add(EUTags.EUItemTags.ORE_BEARING_GROUND_BLUESCHIST, "Blueschist Ore Bearing Ground");
        add(EUTags.EUItemTags.ORE_BEARING_GROUND_FRIGUS_DEEPSLATE, "Frigus Deepslate Ore Bearing Ground");
        add(EUTags.EUItemTags.ORE_BEARING_GROUND_WATER_ICE, "Water Ice Ore Bearing Ground");
        add(EUTags.EUItemTags.ORE_BEARING_GROUND_METHANE_ICE, "Methane Ice Ore Bearing Ground");
        add(EUTags.EUItemTags.ORE_BEARING_GROUND_NITROGEN_ICE, "Nitrogen Ice Ore Bearing Ground");
        add(EUTags.EUItemTags.ORE_BEARING_GROUND_OXYGEN_ICE, "Oxygen Ice Ore Bearing Ground");
        add(EUTags.EUItemTags.ORES_IN_GROUND_BLUESCHIST, "Blueschist Ores In Ground");
        add(EUTags.EUItemTags.ORES_IN_GROUND_FRIGUS_DEEPSLATE, "Frigus Deepslate Ores In Ground");
        add(EUTags.EUItemTags.ORES_IN_GROUND_WATER_ICE, "Water Ice Ores In Ground");
        add(EUTags.EUItemTags.ORES_IN_GROUND_METHANE_ICE, "Methane Ice Ores In Ground");
        add(EUTags.EUItemTags.ORES_IN_GROUND_NITROGEN_ICE, "Nitrogen Ice Ores In Ground");
        add(EUTags.EUItemTags.ORES_IN_GROUND_OXYGEN_ICE, "Oxygen Ice Ores In Ground");
        add(EUTags.EUItemTags.ORES_OBDURIUM, "Obdurium Ores");
        add(EUTags.EUItemTags.ORES_MALUNITE, "Malunite Ores");
        add(EUTags.EUItemTags.ORES_LUTRUM, "Lutrum Ores");
        add(EUTags.EUItemTags.STORAGE_BLOCKS_BRUMA, "Bruma Storage Blocks");
        add(EUTags.EUItemTags.STORAGE_BLOCKS_OBDURIUM, "Obdurium Storage Blocks");
        add(EUTags.EUItemTags.STORAGE_BLOCKS_MALUNITE, "Malunite Storage Blocks");
        add(EUTags.EUItemTags.STORAGE_BLOCKS_LUTRUM, "Lutrum Storage Blocks");
        add(EUTags.EUItemTags.STORAGE_BLOCKS_RAW_OBDURIUM, "Raw Obdurium Storage Blocks");
        add(EUTags.EUItemTags.STORAGE_BLOCKS_RAW_MALUNITE, "Raw Malunite Storage Blocks");
        add(EUTags.EUItemTags.STORAGE_BLOCKS_RAW_LUTRUM, "Raw Lutrum Storage Blocks");
        // Et Ultra Tags
        add(EUTags.EUItemTags.MAYURA_LOGS, "Mayura Logs");
        add(EUTags.EUItemTags.GRIMWOOD_LOGS, "Grimwood Logs");

        // Item Tags
        add(EUTags.EUItemTags.PLATES, "Plates");
        add(EUTags.EUItemTags.RAW_MATERIALS_OBDURIUM, "Obdurium Raw Materials");
        add(EUTags.EUItemTags.NUGGETS_OBDURIUM, "Obdurium Nuggets");
        add(EUTags.EUItemTags.INGOTS_OBDURIUM, "Obdurium Ingots");
        add(EUTags.EUItemTags.PLATES_OBDURIUM, "Obdurium Plates");
        add(EUTags.EUItemTags.RODS_OBDURIUM, "Obdurium Rods");
        add(EUTags.EUItemTags.RAW_MATERIALS_MALUNITE, "Malunite Raw Materials");
        add(EUTags.EUItemTags.NUGGETS_MALUNITE, "Malunite Nuggets");
        add(EUTags.EUItemTags.INGOTS_MALUNITE, "Malunite Ingots");
        add(EUTags.EUItemTags.PLATES_MALUNITE, "Malunite Plates");
        add(EUTags.EUItemTags.RODS_MALUNITE, "Malunite Rods");
        add(EUTags.EUItemTags.RAW_MATERIALS_LUTRUM, "Lutrum Raw Materials");
        add(EUTags.EUItemTags.NUGGETS_LUTRUM, "Lutrum Nuggets");
        add(EUTags.EUItemTags.INGOTS_LUTRUM, "Lutrum Ingots");
        add(EUTags.EUItemTags.PLATES_LUTRUM, "Lutrum Plates");
        add(EUTags.EUItemTags.RODS_LUTRUM, "Lutrum Rods");

        /*
        Miscellaneous Translations
         */

        add(EUCreativeTab.CREATIVE_TAB_TITLE, "Et Ultra");

        /*
        Automated Translations
         */

        // Blocks
        EUBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !excludedBlocks.contains(b))
                .forEach(entry -> addBlock(entry,
                        StringUtils.capitaliseAllWords(entry
                                .getId()
                                .getPath()
                                .replace("_", " "))));
        // Items
        EUItems.ITEMS.getEntries()
                .stream()
                .filter(i -> !(i.get() instanceof BlockItem) && !excludedItems.contains(i))
                .forEach(entry -> addItem(entry,
                        StringUtils.capitaliseAllWords(entry
                                .getId()
                                .getPath()
                                .replace("_", " "))));
    }
}
