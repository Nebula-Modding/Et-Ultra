package io.github.nebulamodding.datagen.providers.tags;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EUItems;
import io.github.nebulamodding.registry.EUTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class EUItemTagProvider extends ItemTagsProvider {
    public EUItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider provider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, provider.contentsGetter(), EtUltra.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        // Copy block tags onto the item
        //copy(EtUltraTags.EtUltraBlockTags.TEST_BLOCKS, EtUltraTags.EtUltraItemTags.TEST_BLOCKS);

        // Item Tags

        // Obdurium
        tag(EUTags.EtUltraItemTags.NUGGETS_OBDURIUM)
                .add(EUItems.OBDURIUM_ITEMS.get("obdurium_nugget").get())
        ;

        tag(EUTags.EtUltraItemTags.INGOTS_OBDURIUM)
                .add(EUItems.OBDURIUM_INGOT.get())
        ;

        // General Minecraft Stuff
        // Metal Stuffs
        tag(Tags.Items.INGOTS)
                .add(EUItems.OBDURIUM_INGOT.get())
        ;

        // Tool Tags
        tag(ItemTags.SHOVELS)
                .add(EUItems.DESH_SHOVEL.get())
                .add(EUItems.OSTRUM_SHOVEL.get())
        ;

        tag(ItemTags.PICKAXES)
                .add(EUItems.DESH_PICKAXE.get())
                .add(EUItems.OSTRUM_PICKAXE.get())
        ;

        tag(ItemTags.AXES)
                .add(EUItems.DESH_AXE.get())
                .add(EUItems.OSTRUM_AXE.get())
        ;

        tag(ItemTags.HOES)
                .add(EUItems.DESH_HOE.get())
                .add(EUItems.OSTRUM_HOE.get())
        ;

        tag(ItemTags.SWORDS)
                .add(EUItems.DESH_SWORD.get())
                .add(EUItems.OSTRUM_SWORD.get())
        ;
    }
}