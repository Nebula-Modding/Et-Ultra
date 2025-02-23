package io.github.nebulamodding.datagen.providers.tags;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.blocks.EUBlocks;
import io.github.nebulamodding.registry.items.EUItems;
import io.github.nebulamodding.registry.registers.EUTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
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
        // Copy Et Ultra Block Tags
        copy(EUTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM, EUTags.EUItemTags.STORAGE_BLOCKS_OBDURIUM);
        // Copy Neoforge Block Tags
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        // Copy Minecraft Block Tags
        //copy(BlockTags.TAGHERE, BlockTags.TAGHERE);

        // Et Ultra Common Tags
        tag(EUTags.EUItemTags.ORE_BEARING_GROUND_FRIGUS_STONE)
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").asItem())
        ;
        tag(EUTags.EUItemTags.ORE_BEARING_GROUND_FRIGUS_DEEPSLATE)
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").asItem())
        ;
        tag(EUTags.EUItemTags.RAW_MATERIALS_OBDURIUM)
                .add(EUItems.OBDURIUM_ITEMS.get("raw_obdurium").get())
        ;
        tag(EUTags.EUItemTags.NUGGETS_OBDURIUM)
                .add(EUItems.OBDURIUM_ITEMS.get("obdurium_nugget").get())
        ;
        tag(EUTags.EUItemTags.INGOTS_OBDURIUM)
                .add(EUItems.OBDURIUM_INGOT.get())
        ;
        // Common Tags
        tag(Tags.Items.STONES)
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").asItem())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").asItem())
        ;
        tag(Tags.Items.RAW_MATERIALS)
                .addTag(EUTags.EUItemTags.RAW_MATERIALS_OBDURIUM)
        ;
        tag(Tags.Items.RAW_MATERIALS)
                .addTag(EUTags.EUItemTags.RAW_MATERIALS_OBDURIUM)
        ;
        tag(Tags.Items.INGOTS)
                .addTag(EUTags.EUItemTags.INGOTS_OBDURIUM)
        ;
        tag(Tags.Items.NUGGETS)
                .addTag(EUTags.EUItemTags.NUGGETS_OBDURIUM)
        ;
        tag(Tags.Items.MELEE_WEAPON_TOOLS)
                .addTag(ItemTags.AXES)
                .addTag(ItemTags.SWORDS)
        ;
        tag(Tags.Items.MINING_TOOL_TOOLS)
                .addTag(ItemTags.PICKAXES)
        ;

        // Minecraft Tags
        tag(ItemTags.DIRT)
                .add(EUBlocks.FRIGUS_GRASS_BLOCK.get().asItem())
                .add(EUBlocks.FRIGUS_DIRT.get().asItem())
        ;
        tag(ItemTags.BEACON_PAYMENT_ITEMS)
                .addTag(EUTags.EUItemTags.INGOTS_OBDURIUM)
        ;
        tag(ItemTags.TRIM_MATERIALS)
                .addTag(EUTags.EUItemTags.INGOTS_OBDURIUM)
        ;
        tag(ItemTags.CLUSTER_MAX_HARVESTABLES)
                .addTag(ItemTags.PICKAXES)
        ;
    }
}