package io.github.nebulamodding.datagen.providers;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EUBlocks;
import io.github.nebulamodding.registry.EUItems;
import io.github.nebulamodding.registry.EUCreativeTab;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.codehaus.plexus.util.StringUtils;

public class EULangProvider extends LanguageProvider {

    public EULangProvider(PackOutput output) {
        super(output, EtUltra.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Automatically provide translations
        EUBlocks.BLOCKS.getEntries()
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

        //addBlock(EtUltraBlocks.GRAPHITE_BLOCK, "Block of Graphite");
        //addBlock(EtUltraBlocks.GRAPHITE_DUST, "Block of Graphite Dust");

        // Items

        // Items go here

        // Other Stuff
        add(EUCreativeTab.ETULTRA_TAB_TITLE, "Et Ultra");
    }
}
