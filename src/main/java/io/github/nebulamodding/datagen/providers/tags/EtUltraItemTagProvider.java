package io.github.nebulamodding.datagen.providers.tags;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EtUltraBlocks;
import io.github.nebulamodding.registry.EtUltraItems;
import io.github.nebulamodding.registry.EtUltraTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
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
        //copy(EtUltraTags.EtUltraBlockTags.TEST_BLOCKS, EtUltraTags.EtUltraItemTags.TEST_BLOCKS);

        // Item Tags
        //tag(EtUltraTags.EtUltraItemTags.TEST_ITEMS)
        //        .add(EtUltraBlocks.MARS_BLOCKS.get("mars_deepslate").get().asItem());

        // Tool Tags
        tag(ItemTags.SHOVELS)
                .add(EtUltraItems.DESH_SHOVEL.get())
                .add(EtUltraItems.OSTRUM_AXE.get())
        ;

        tag(ItemTags.PICKAXES)
                .add(EtUltraItems.DESH_PICKAXE.get())
                .add(EtUltraItems.OSTRUM_PICKAXE.get())
        ;

        tag(ItemTags.AXES)
                .add(EtUltraItems.DESH_AXE.get())
                .add(EtUltraItems.OSTRUM_AXE.get())
        ;

        tag(ItemTags.HOES)
                .add(EtUltraItems.DESH_HOE.get())
                .add(EtUltraItems.OSTRUM_HOE.get())
        ;

        tag(ItemTags.SWORDS)
                .add(EtUltraItems.DESH_SWORD.get())
                .add(EtUltraItems.OSTRUM_SWORD.get())
        ;
    }
}