package io.github.nebulamodding.datagen.providers.tags;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EtUltraBlocks;
import io.github.nebulamodding.registry.EtUltraItems;
import io.github.nebulamodding.registry.EtUltraTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class EtUltraItemTagProvider extends ItemTagsProvider {
    public EtUltraItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider provider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, provider.contentsGetter(), EtUltra.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        // Copy block tags onto the item
        copy(EtUltraTags.EtUltraBlockTags.TEST_BLOCKS, EtUltraTags.EtUltraItemTags.TEST_BLOCKS);

        /*
        Adding Item Tags:

        tag(EtUltraTags.EtUltraItemTags.EXAMPLE_ITEMS).add(EtUltraItems.EXAMPLE_BLOCK.get());
         */

        tag(EtUltraTags.EtUltraItemTags.TEST_ITEMS)
                .add(EtUltraBlocks.MARS_DEEPSLATE.get().asItem());
    }
}