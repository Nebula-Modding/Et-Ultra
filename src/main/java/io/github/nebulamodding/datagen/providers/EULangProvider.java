package io.github.nebulamodding.datagen.providers;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.client.EUEventHandler;
import io.github.nebulamodding.registry.blocks.EUBlocks;
import io.github.nebulamodding.registry.items.EUItems;
import io.github.nebulamodding.registry.registers.EUCreativeTab;
import io.github.nebulamodding.registry.registers.EUTags;
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

public class EULangProvider extends LanguageProvider {

    public EULangProvider(PackOutput output) {
        super(output, EtUltra.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // To exclude a block, just add it to the list using #add
        final List<DeferredBlock<? extends Block>> langExcludedBlocks = new ArrayList<>();
        langExcludedBlocks.add(EUBlocks.SALT_CRYSTAL_BLOCKS.get("salt_crystal_block"));
        langExcludedBlocks.add(EUBlocks.SALT_DUST_BLOCK);
        langExcludedBlocks.add(EUBlocks.SALT_PACKED_BLOCKS.get("salt_block"));

        langExcludedBlocks.add(EUBlocks.SULFUR_CRYSTAL_BLOCKS.get("sulfur_crystal_block"));
        langExcludedBlocks.add(EUBlocks.SULFUR_DUST_BLOCK);
        langExcludedBlocks.add(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_block"));

        langExcludedBlocks.add(EUBlocks.GRAPHITE_CRYSTAL_BLOCKS.get("graphite_crystal_block"));
        langExcludedBlocks.add(EUBlocks.GRAPHITE_DUST_BLOCK);
        langExcludedBlocks.add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_block"));

        langExcludedBlocks.add(EUBlocks.FLESH_BLOCKS.get("flesh_block"));
        langExcludedBlocks.add(EUBlocks.ROTTEN_FLESH_BLOCKS.get("rotten_flesh_block"));

        langExcludedBlocks.add(EUBlocks.MISCELLANEOUS_BLOCKS.get("erdragh_block"));
        langExcludedBlocks.add(EUBlocks.MISCELLANEOUS_BLOCKS.get("erdragh_slab"));

        // To exclude an item, just add it to the list using #add
        final List<DeferredItem<? extends Item>> langExcludedItems = new ArrayList<>();
        langExcludedItems.add((DeferredItem<? extends Item>) EUItems.THERMALYTE_SHOVEL);
        langExcludedItems.add((DeferredItem<? extends Item>) EUItems.THERMALYTE_PICKAXE);
        langExcludedItems.add((DeferredItem<? extends Item>) EUItems.THERMALYTE_AXE);
        langExcludedItems.add((DeferredItem<? extends Item>) EUItems.THERMALYTE_HOE);
        langExcludedItems.add((DeferredItem<? extends Item>) EUItems.THERMALYTE_SWORD);

        // Automatically provide translations
        EUBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !langExcludedBlocks.contains(b))
                .forEach(entry -> addBlock(entry,
                        StringUtils.capitaliseAllWords(entry
                                .getId()
                                .getPath()
                                .replace("_", " "))));

        EUItems.ITEMS.getEntries()
                .stream()
                .filter(i -> !(i.get() instanceof BlockItem) && !langExcludedItems.contains(i))
                .forEach(entry -> addItem(entry,
                        StringUtils.capitaliseAllWords(entry
                                .getId()
                                .getPath()
                                .replace("_", " "))));

        //Blocks
        addBlock(EUBlocks.SALT_CRYSTAL_BLOCKS.get("salt_crystal_block"), "Block of Salt Crystal");
        addBlock(EUBlocks.SALT_PACKED_BLOCKS.get("salt_block"), "Block of Salt");
        addBlock(EUBlocks.SALT_DUST_BLOCK, "Block of Salt Dust");

        addBlock(EUBlocks.SULFUR_CRYSTAL_BLOCKS.get("sulfur_crystal_block"), "Block of Sulfur Crystal");
        addBlock(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_block"), "Block of Sulfur");
        addBlock(EUBlocks.SULFUR_DUST_BLOCK, "Block of Sulfur Dust");

        addBlock(EUBlocks.GRAPHITE_CRYSTAL_BLOCKS.get("graphite_crystal_block"), "Block of Graphite Crystal");
        addBlock(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_block"), "Block of Graphite");
        addBlock(EUBlocks.GRAPHITE_DUST_BLOCK, "Block of Graphite Dust");

        addBlock(EUBlocks.MISCELLANEOUS_BLOCKS.get("erdragh_block"), "Block of Erdragh");
        addBlock(EUBlocks.MISCELLANEOUS_BLOCKS.get("erdragh_slab"), "Slab of Erdragh");

        addBlock(EUBlocks.FLESH_BLOCKS.get("flesh_block"), "Block of Flesh");
        addBlock(EUBlocks.ROTTEN_FLESH_BLOCKS.get("rotten_flesh_block"), "Block of Rotten Flesh");

        // Items
        addItem(EUItems.THERMALYTE_SHOVEL, "Thermalyte Spade");
        addItem(EUItems.THERMALYTE_PICKAXE, "Thermalyte Pickaxe");
        addItem(EUItems.THERMALYTE_AXE, "Thermalyte Broadaxe");
        addItem(EUItems.THERMALYTE_HOE, "Thermalyte Swoe");
        addItem(EUItems.THERMALYTE_SWORD, "Thermalyte Greatsword");

        // Block Tags
        add(EUTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM, "Obdurium Storage Blocks");

        // Block Item Tags
        add(EUTags.EUItemTags.STORAGE_BLOCKS_OBDURIUM, "Obdurium Storage Blocks");

        // Item Tags
        add(EUTags.EUItemTags.RAW_MATERIALS_OBDURIUM, "Obdurium Raw Materials");
        add(EUTags.EUItemTags.NUGGETS_OBDURIUM, "Obdurium Nuggets");
        add(EUTags.EUItemTags.INGOTS_OBDURIUM, "Obdurium Ingots");

        // Other Stuff
        add(EUCreativeTab.ETULTRA_TAB_TITLE, "Et Ultra");
        add(String.valueOf(EUEventHandler.TestScreenKey), "Test Screen Key");
    }
}
