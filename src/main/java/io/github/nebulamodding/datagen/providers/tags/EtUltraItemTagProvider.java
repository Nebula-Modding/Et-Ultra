package io.github.nebulamodding.datagen.providers.tags;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EtUltraItems;
import io.github.nebulamodding.registry.EtUltraTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class EtUltraItemTagProvider extends ItemTagsProvider {
    public EtUltraItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, BlockTagsProvider provider, ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, provider.contentsGetter(), EtUltra.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // Copy block tags onto the item

        copy(EtUltraTags.EtUltraBlockTags.TEST_BLOCKS, EtUltraTags.EtUltraItemTags.TEST_BLOCKS);


        /*
        Adding Item Tags:

        tag(EtUltraTags.EtUltraItemTags.EXAMPLE_ITEMS).add(EtUltraItems.EXAMPLE_BLOCK.get());
         */

        tag(EtUltraTags.EtUltraItemTags.TEST_ITEMS).add(EtUltraItems.MARS_DEEPSLATE.get());
    }
}