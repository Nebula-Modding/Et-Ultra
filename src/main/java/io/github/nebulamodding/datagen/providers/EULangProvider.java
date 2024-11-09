package io.github.nebulamodding.datagen.providers;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.client.EUEventHandler;
import io.github.nebulamodding.registry.EUBlocks;
import io.github.nebulamodding.registry.EUItems;
import io.github.nebulamodding.registry.EUCreativeTab;
import io.github.nebulamodding.registry.EUTags;
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
        langExcludedBlocks.add(EUBlocks.MOON_BLOCKS.get("moon_deepslate_bricks_slab"));
        langExcludedBlocks.add(EUBlocks.MOON_BLOCKS.get("moon_deepslate_tiles_slab"));

        langExcludedBlocks.add(EUBlocks.MARS_BLOCKS.get("mars_deepslate_bricks_slab"));
        langExcludedBlocks.add(EUBlocks.MARS_BLOCKS.get("mars_deepslate_tiles_slab"));

        langExcludedBlocks.add(EUBlocks.MERCURY_BLOCKS.get("mercury_deepslate_bricks_slab"));
        langExcludedBlocks.add(EUBlocks.MERCURY_BLOCKS.get("mercury_deepslate_tiles_slab"));

        langExcludedBlocks.add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_bricks_slab"));
        langExcludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks_slab"));
        langExcludedBlocks.add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles_slab"));

        langExcludedBlocks.add(EUBlocks.SALT_CRYSTAL_BLOCKS.get("salt_crystal_block"));
        langExcludedBlocks.add(EUBlocks.SALT_CRYSTAL_BLOCKS.get("polished_salt_crystal_block"));
        langExcludedBlocks.add(EUBlocks.SALT_DUST_BLOCK);
        langExcludedBlocks.add(EUBlocks.SALT_PACKED_BLOCKS.get("salt_block"));
        langExcludedBlocks.add(EUBlocks.SALT_PACKED_BLOCKS.get("salt_block_slab"));
        langExcludedBlocks.add(EUBlocks.SALT_PACKED_BLOCKS.get("salt_bricks_slab"));
        langExcludedBlocks.add(EUBlocks.SALT_PACKED_BLOCKS.get("salt_tiles_slab"));

        langExcludedBlocks.add(EUBlocks.SULFUR_CRYSTAL_BLOCKS.get("sulfur_crystal_block"));
        langExcludedBlocks.add(EUBlocks.SULFUR_CRYSTAL_BLOCKS.get("polished_sulfur_crystal_block"));
        langExcludedBlocks.add(EUBlocks.SULFUR_DUST_BLOCK);
        langExcludedBlocks.add(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_block"));
        langExcludedBlocks.add(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_block_slab"));
        langExcludedBlocks.add(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_bricks_slab"));
        langExcludedBlocks.add(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_tiles_slab"));

        langExcludedBlocks.add(EUBlocks.GRAPHITE_CRYSTAL_BLOCKS.get("graphite_crystal_block"));
        langExcludedBlocks.add(EUBlocks.GRAPHITE_CRYSTAL_BLOCKS.get("polished_graphite_crystal_block"));
        langExcludedBlocks.add(EUBlocks.GRAPHITE_DUST_BLOCK);
        langExcludedBlocks.add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_block"));
        langExcludedBlocks.add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("polished_graphite"));
        langExcludedBlocks.add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_block_slab"));
        langExcludedBlocks.add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_bricks_slab"));
        langExcludedBlocks.add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_tiles_slab"));

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
        addBlock(EUBlocks.MOON_BLOCKS.get("moon_deepslate_bricks_slab"), "Moon Deepslate Brick Slab");
        addBlock(EUBlocks.MOON_BLOCKS.get("moon_deepslate_tiles_slab"), "Moon Deepslate Tile Slab");

        addBlock(EUBlocks.MARS_BLOCKS.get("mars_deepslate_bricks_slab"), "Mars Deepslate Brick Slab");
        addBlock(EUBlocks.MARS_BLOCKS.get("mars_deepslate_tiles_slab"), "Mars Deepslate Tile Slab");

        addBlock(EUBlocks.MERCURY_BLOCKS.get("mercury_deepslate_bricks_slab"), "Mercury Deepslate Brick Slab");
        addBlock(EUBlocks.MERCURY_BLOCKS.get("mercury_deepslate_tiles_slab"), "Mercury Deepslate Tile Slab");

        addBlock(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_bricks_slab"), "Frigus Stone Brick Slab");
        addBlock(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks_slab"), "Frigus Deepslate Brick Slab");
        addBlock(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles_slab"), "Frigus Deepslate Tile Slab");

        addBlock(EUBlocks.SALT_CRYSTAL_BLOCKS.get("salt_crystal_block"), "Block of Salt Crystal");
        addBlock(EUBlocks.SALT_CRYSTAL_BLOCKS.get("polished_salt_crystal_block"), "Polished Salt Crystal");
        addBlock(EUBlocks.SALT_PACKED_BLOCKS.get("salt_block"), "Block of Salt");
        addBlock(EUBlocks.SALT_DUST_BLOCK, "Block of Salt Dust");
        addBlock(EUBlocks.SALT_PACKED_BLOCKS.get("salt_block_slab"), "Salt Slab");
        addBlock(EUBlocks.SALT_PACKED_BLOCKS.get("salt_bricks_slab"), "Salt Brick Slab");
        addBlock(EUBlocks.SALT_PACKED_BLOCKS.get("salt_tiles_slab"), "Salt Tile Slab");

        addBlock(EUBlocks.SULFUR_CRYSTAL_BLOCKS.get("sulfur_crystal_block"), "Block of Sulfur Crystal");
        addBlock(EUBlocks.SULFUR_CRYSTAL_BLOCKS.get("polished_sulfur_crystal_block"), "Polished Sulfur Crystal");
        addBlock(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_block"), "Block of Sulfur");
        addBlock(EUBlocks.SULFUR_DUST_BLOCK, "Block of Sulfur Dust");
        addBlock(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_block_slab"), "Sulfur Slab");
        addBlock(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_bricks_slab"), "Sulfur Brick Slab");
        addBlock(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_tiles_slab"), "Sulfur Tile Slab");

        addBlock(EUBlocks.GRAPHITE_CRYSTAL_BLOCKS.get("graphite_crystal_block"), "Block of Graphite");
        addBlock(EUBlocks.GRAPHITE_CRYSTAL_BLOCKS.get("polished_graphite_crystal_block"), "Polished Graphite");
        addBlock(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_block"), "Packed Graphite");
        addBlock(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("polished_graphite"), "Polished Packed Graphite");
        addBlock(EUBlocks.GRAPHITE_DUST_BLOCK, "Block of Graphite Dust");
        addBlock(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_block_slab"), "Graphite Slab");
        addBlock(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_bricks_slab"), "Graphite Brick Slab");
        addBlock(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_tiles_slab"), "Graphite Tile Slab");

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
