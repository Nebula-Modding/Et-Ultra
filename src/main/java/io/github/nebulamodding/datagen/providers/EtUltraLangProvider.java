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

    private static final Set<RegistryAccess.RegistryEntry<Item>> ITEM_NAME_OVERRIDES = Set.of();
    private static final Set<RegistryAccess.RegistryEntry<Block>> BLOCK_NAME_OVERRIDES = Set.of();

    @Override
    protected void addTranslations() {
        // Auto Generation
        EtUltraBlocks.BLOCKS.getEntries()
                .forEach(entry -> addBlock(entry,
                        StringUtils.capitaliseAllWords(entry
                                .getId()
                                .getPath()
                                .replace("_", " "))));


        // Items
        addItem(EtUltraItems.PENCIL, "Pencil");

        // Block Items
        //addItem(EtUltraItems.MARS_DEEPSLATE, "Mars Deepslate");

        // Blocks
        //addBlock(EtUltraBlocks.MARS_DEEPSLATE, "Mars Deepslate");
        //addBlock(EtUltraBlocks.COBBLED_MARS_DEEPSLATE, "Cobbled Mars Deepslate");
        //addBlock(EtUltraBlocks.GRAPHITE_BLOCK, "Graphite Block");
        //addBlock(EtUltraBlocks.GRAPHITE_DUST, "Graphite Dust");

        // Other Stuff

        add(EtUltraCreativeTab.ETULTRA_TAB_TITLE, "Et Ultra");
    }
}
