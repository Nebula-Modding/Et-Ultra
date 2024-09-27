package io.github.nebulamodding.datagen.providers;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EUBlocks;
import io.github.nebulamodding.registry.EUItems;
import io.github.nebulamodding.registry.EUCreativeTab;
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
        // To exclude an item, just add it to the list using #add
        final List<DeferredBlock<? extends Block>> langExcludedBlocks = new ArrayList<>();
        langExcludedBlocks.add(EUBlocks.SALT_CRYSTAL_BLOCKS.get("salt_crystal_block"));
        langExcludedBlocks.add(EUBlocks.SALT_COMPRESSED_BLOCKS.get("salt_block"));
        langExcludedBlocks.add(EUBlocks.SALT_DUST_BLOCK);
        langExcludedBlocks.add(EUBlocks.SALT_COMPRESSED_BLOCKS.get("salt_block_slab"));
        langExcludedBlocks.add(EUBlocks.SALT_COMPRESSED_BLOCKS.get("salt_bricks_slab"));
        langExcludedBlocks.add(EUBlocks.SALT_COMPRESSED_BLOCKS.get("salt_tiles_slab"));
        langExcludedBlocks.add(EUBlocks.GRAPHITE_BLOCKS.get("graphite_block"));
        langExcludedBlocks.add(EUBlocks.GRAPHITE_DUST_BLOCK);
        langExcludedBlocks.add(EUBlocks.GRAPHITE_BLOCKS.get("graphite_block_slab"));
        langExcludedBlocks.add(EUBlocks.GRAPHITE_BLOCKS.get("graphite_bricks_slab"));
        langExcludedBlocks.add(EUBlocks.GRAPHITE_BLOCKS.get("graphite_tiles_slab"));
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
                .stream().filter(i -> !(i.get() instanceof BlockItem))
                .forEach(entry -> addItem(entry,
                        StringUtils.capitaliseAllWords(entry
                                .getId()
                                .getPath()
                                .replace("_", " "))));

        //Blocks
        addBlock(EUBlocks.SALT_CRYSTAL_BLOCKS.get("salt_crystal_block"), "Block of Salt Crystals");
        addBlock(EUBlocks.SALT_COMPRESSED_BLOCKS.get("salt_block"), "Block of Salt");
        addBlock(EUBlocks.SALT_DUST_BLOCK, "Block of Salt Dust");
        addBlock(EUBlocks.SALT_COMPRESSED_BLOCKS.get("salt_block_slab"), "Salt Slab");
        addBlock(EUBlocks.SALT_COMPRESSED_BLOCKS.get("salt_bricks_slab"), "Salt Brick Slab");
        addBlock(EUBlocks.SALT_COMPRESSED_BLOCKS.get("salt_tiles_slab"), "Salt Tile Slab");

        addBlock(EUBlocks.GRAPHITE_BLOCKS.get("graphite_block"), "Block of Graphite");
        addBlock(EUBlocks.GRAPHITE_DUST_BLOCK, "Block of Graphite Dust");
        addBlock(EUBlocks.GRAPHITE_BLOCKS.get("graphite_block_slab"), "Graphite Slab");
        addBlock(EUBlocks.GRAPHITE_BLOCKS.get("graphite_bricks_slab"), "Graphite Brick Slab");
        addBlock(EUBlocks.GRAPHITE_BLOCKS.get("graphite_tiles_slab"), "Graphite Tile Slab");

        // Items
        // Items go here

        // Other Stuff
        add(EUCreativeTab.ETULTRA_TAB_TITLE, "Et Ultra");
    }
}
