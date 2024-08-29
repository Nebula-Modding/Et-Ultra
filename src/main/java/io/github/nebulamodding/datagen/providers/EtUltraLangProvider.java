package io.github.nebulamodding.datagen.providers;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EtUltraBlocks;
import io.github.nebulamodding.registry.EtUltraItems;
import io.github.nebulamodding.registry.EtUltraCreativeTab;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.codehaus.plexus.util.StringUtils;

public class EtUltraLangProvider extends LanguageProvider {

    public EtUltraLangProvider(PackOutput output) {
        super(output, EtUltra.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        /*
        How to add Items:

        addItem(EtUltraBlocks.EXAMPLE_ITEM, "Example Translation");
         */

        //Items
        addItem(EtUltraItems.PENCIL, "Pencil");

        // Block Items
        addItem(EtUltraItems.COBBLED_MOON_DEEPSLATE, "Cobbled Moon Deepslate");
        addItem(EtUltraItems.CHISELED_MOON_DEEPSLATE, "Chiseled Moon Deepslate");
        addItem(EtUltraItems.POLISHED_MOON_DEEPSLATE, "Polished Moon Deepslate");
        addItem(EtUltraItems.MOON_DEEPSLATE_BRICKS, "Moon Deepslate Bricks");
        addItem(EtUltraItems.CRACKED_MOON_DEEPSLATE_BRICKS, "Cracked Moon Deepslate Bricks");
        addItem(EtUltraItems.MOON_DEEPSLATE_TILES, "Moon Deepslate Tiles");

        addItem(EtUltraItems.MARS_DEEPSLATE, "Mars Deepslate");
        addItem(EtUltraItems.COBBLED_MARS_DEEPSLATE, "Cobbled Mars Deepslate");
        addItem(EtUltraItems.CHISELED_MARS_DEEPSLATE, "Chiseled Mars Deepslate");
        addItem(EtUltraItems.POLISHED_MARS_DEEPSLATE, "Polished Mars Deepslate");
        addItem(EtUltraItems.MARS_DEEPSLATE_BRICKS, "Mars Deepslate Bricks");
        addItem(EtUltraItems.CRACKED_MARS_DEEPSLATE_BRICKS, "Cracked Mars Deepslate Bricks");
        addItem(EtUltraItems.MARS_DEEPSLATE_TILES, "Mars Deepslate Tiles");

        addItem(EtUltraItems.GRAPHITE_BLOCK, "Graphite Block");
        addItem(EtUltraItems.GRAPHITE_DUST, "Graphite Dust");

        /*
        How to add Blocks:

        addItem(EtUltraBlocks.EXAMPLE_BLOCK, "Example Translation");

        (might be broken)
         */

        //addBlock(EtUltraBlocks.MARS_DEEPSLATE, "Mars Deepslate");
        //addBlock(EtUltraBlocks.COBBLED_MARS_DEEPSLATE, "Cobbled Mars Deepslate");
        //addBlock(EtUltraBlocks.GRAPHITE_BLOCK, "Graphite Block");
        //addBlock(EtUltraBlocks.GRAPHITE_DUST, "Graphite Dust");

        // Other Stuff

        add(EtUltraCreativeTab.ETULTRA_TAB_TITLE, "Et Ultra");
    }
}
