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

        addItem(EtUltraItems.MARS_DEEPSLATE, "Mars Deepslate");

        /*
        How to add Blocks:

        addItem(EtUltraBlocks.EXAMPLE_BLOCK, "Example Translation");
         */

        addBlock(EtUltraBlocks.MARS_DEEPSLATE, "Mars Deepslate");

        // Other Stuff

        add(EtUltraCreativeTab.ETULTRA_TAB_TITLE, "Et Ultra");
    }
}
