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
        excludedBlocks.add(EUBlocks.BRUMA_BLOCK);

        excludedBlocks.add(EUBlocks.SALT_CRYSTAL_BLOCK);
        excludedBlocks.add(EUBlocks.SALT_DUST_BLOCK);
        excludedBlocks.add(EUBlocks.SALT_PACKED_BLOCKS.get("salt_block"));

        excludedBlocks.add(EUBlocks.SULFUR_CRYSTAL_BLOCK);
        excludedBlocks.add(EUBlocks.SULFUR_DUST_BLOCK);
        excludedBlocks.add(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_block"));

        excludedBlocks.add(EUBlocks.GRAPHITE_CRYSTAL_BLOCK);
        excludedBlocks.add(EUBlocks.GRAPHITE_DUST_BLOCK);
        excludedBlocks.add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_block"));

        excludedBlocks.add(EUBlocks.FLESH_BLOCK);

        final List<DeferredItem<? extends Item>> excludedItems = new ArrayList<>();
        // Items excluded from having a translation automatically provided
        excludedItems.add(EUItems.GOLDEN_AZURE_ROOT);
        excludedItems.add(EUItems.ENCHANTED_GOLDEN_AZURE_ROOT);
        excludedItems.add(EUItems.COOKED_FLESH);

        /*
        Manual Translations
         */

        // Blocks
        addBlock(EUBlocks.BRUMA_BLOCK, "Bruma Bale");

        addBlock(EUBlocks.SALT_CRYSTAL_BLOCK, "Block of Salt Crystal");
        addBlock(EUBlocks.SALT_PACKED_BLOCKS.get("salt_block"), "Block of Salt");
        addBlock(EUBlocks.SALT_DUST_BLOCK, "Block of Salt Dust");

        addBlock(EUBlocks.SULFUR_CRYSTAL_BLOCK, "Block of Sulfur Crystal");
        addBlock(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_block"), "Block of Sulfur");
        addBlock(EUBlocks.SULFUR_DUST_BLOCK, "Block of Sulfur Dust");

        addBlock(EUBlocks.GRAPHITE_CRYSTAL_BLOCK, "Block of Graphite Crystal");
        addBlock(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_block"), "Block of Graphite");
        addBlock(EUBlocks.GRAPHITE_DUST_BLOCK, "Block of Graphite Dust");

        addBlock(EUBlocks.FLESH_BLOCK, "Block of Flesh");

        // Items
        addItem(EUItems.GOLDEN_AZURE_ROOT, "Golden Root");
        addItem(EUItems.ENCHANTED_GOLDEN_AZURE_ROOT, "Enchanted Golden Root");
        addItem(EUItems.COOKED_FLESH, "Jerky");

        /*
        Tag Translations
         */

        // Block Tags
        add(EUTags.EUBlockTags.COBBLESTONES_FRIGUS_STONE, "Frigus Stone Cobblestones");
        add(EUTags.EUBlockTags.COBBLESTONES_FRIGUS_DEEPSLATE, "Frigus Deepslate Cobblestones");
        add(EUTags.EUBlockTags.ORE_BEARING_GROUND_FRIGUS_STONE, "Frigus Stone Ore Bearing Ground");
        add(EUTags.EUBlockTags.ORE_BEARING_GROUND_FRIGUS_DEEPSLATE, "Frigus Deepslate Ore Bearing Ground");
        add(EUTags.EUBlockTags.ORES_IN_GROUND_FRIGUS_STONE, "Frigus Stone Ores In Ground");
        add(EUTags.EUBlockTags.ORES_IN_GROUND_FRIGUS_DEEPSLATE, "Frigus Deepslate Ores In Ground");
        add(EUTags.EUBlockTags.ORES_OBDURIUM, "Obdurium Ores");
        add(EUTags.EUBlockTags.ORES_MALUNITE, "Malunite Ores");
        add(EUTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM, "Obdurium Storage Blocks");
        add(EUTags.EUBlockTags.STORAGE_BLOCKS_MALUNITE, "Malunite Storage Blocks");
        add(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_OBDURIUM, "Raw Obdurium Storage Blocks");
        add(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_MALUNITE, "Raw Malunite Storage Blocks");

        // Block Item Tags
        add(EUTags.EUItemTags.COBBLESTONES_FRIGUS_STONE, "Frigus Stone Cobblestones");
        add(EUTags.EUItemTags.COBBLESTONES_FRIGUS_DEEPSLATE, "Frigus Deepslate Cobblestones");
        add(EUTags.EUItemTags.ORE_BEARING_GROUND_FRIGUS_STONE, "Frigus Stone Ore Bearing Ground");
        add(EUTags.EUItemTags.ORE_BEARING_GROUND_FRIGUS_DEEPSLATE, "Frigus Deepslate Ore Bearing Ground");
        add(EUTags.EUItemTags.ORES_IN_GROUND_FRIGUS_STONE, "Frigus Stone Ores In Ground");
        add(EUTags.EUItemTags.ORES_IN_GROUND_FRIGUS_DEEPSLATE, "Frigus Deepslate Ores In Ground");
        add(EUTags.EUItemTags.ORES_OBDURIUM, "Obdurium Ores");
        add(EUTags.EUItemTags.ORES_MALUNITE, "Malunite Ores");
        add(EUTags.EUItemTags.STORAGE_BLOCKS_OBDURIUM, "Obdurium Storage Blocks");
        add(EUTags.EUItemTags.STORAGE_BLOCKS_MALUNITE, "Malunite Storage Blocks");
        add(EUTags.EUItemTags.STORAGE_BLOCKS_RAW_OBDURIUM, "Raw Obdurium Storage Blocks");
        add(EUTags.EUItemTags.STORAGE_BLOCKS_RAW_MALUNITE, "Raw Malunite Storage Blocks");

        // Item Tags
        add(EUTags.EUItemTags.RAW_MATERIALS_OBDURIUM, "Obdurium Raw Materials");
        add(EUTags.EUItemTags.NUGGETS_OBDURIUM, "Obdurium Nuggets");
        add(EUTags.EUItemTags.INGOTS_OBDURIUM, "Obdurium Ingots");

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
