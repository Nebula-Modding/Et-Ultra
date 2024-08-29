package io.github.nebulamodding.datagen.providers;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EtUltraBlocks;
import io.github.nebulamodding.registry.EtUltraItems;
import io.github.nebulamodding.registry.EtUltraCreativeTab;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

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
        addItem(EtUltraItems.MARS_DEEPSLATE, "Mars Deepslate");
        addItem(EtUltraItems.COBBLED_MARS_DEEPSLATE, "Cobbled Mars Deepslate");
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
