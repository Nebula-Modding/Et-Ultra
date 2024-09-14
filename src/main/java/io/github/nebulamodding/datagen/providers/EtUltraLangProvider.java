package io.github.nebulamodding.datagen.providers;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EtUltraBlocks;
import io.github.nebulamodding.registry.EtUltraItems;
import io.github.nebulamodding.registry.EtUltraCreativeTab;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.codehaus.plexus.util.StringUtils;

import java.util.Set;

public class EtUltraLangProvider extends LanguageProvider {

    public EtUltraLangProvider(PackOutput output) {
        super(output, EtUltra.MOD_ID, "en_us");
    }

    private static final Set<RegistryAccess.RegistryEntry<Block>> BLOCK_NAME_OVERRIDES = Set.of(
            // Block name overrides here
    );

    private static final Set<RegistryAccess.RegistryEntry<Item>> ITEM_NAME_OVERRIDES = Set.of(
            // Item name overrides here
            //EtUltraBlocks.GRAPHITE_BLOCK
    );

    @Override
    protected void addTranslations() {
        // Automatically provide translations
        EtUltraBlocks.BLOCKS.getEntries()
                .stream().filter(b -> !(BLOCK_NAME_OVERRIDES.contains(b)))
                .forEach(entry -> addBlock(entry,
                        StringUtils.capitaliseAllWords(entry
                                .getId()
                                .getPath()
                                .replace("_", " "))));

        EtUltraItems.ITEMS.getEntries()
                .stream().filter(i -> !(i.get() instanceof BlockItem))
                .filter(i -> !(ITEM_NAME_OVERRIDES.contains(i)))
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
        add(EtUltraCreativeTab.ETULTRA_TAB_TITLE, "Et Ultra");
    }
}
