package io.github.nebulamodding.etultra.datagen.data.tags;

import io.github.nebulamodding.etultra.EtUltra;
import io.github.nebulamodding.etultra.registry.EUBlocks;
import io.github.nebulamodding.etultra.registry.EUItems;
import io.github.nebulamodding.etultra.registry.EUTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class EUItemTagsProvider extends ItemTagsProvider {
    public EUItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider provider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, provider.contentsGetter(), EtUltra.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        /*
        Tool Tags
         */

        // None applied yet :^

        /*
        Block Variant Tags
         */

        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.WOODEN_PRESSURE_PLATES, ItemTags.WOODEN_PRESSURE_PLATES);
        copy(BlockTags.BUTTONS, ItemTags.BUTTONS);
        copy(BlockTags.STONE_BUTTONS, ItemTags.STONE_BUTTONS);
        copy(BlockTags.WOODEN_BUTTONS, ItemTags.WOODEN_BUTTONS);

        /*
        Ore Tags
         */

        copy(BlockTags.COAL_ORES, ItemTags.COAL_ORES);
        copy(BlockTags.IRON_ORES, ItemTags.IRON_ORES);
        copy(BlockTags.COPPER_ORES, ItemTags.COPPER_ORES);
        copy(BlockTags.GOLD_ORES, ItemTags.GOLD_ORES);
        copy(BlockTags.REDSTONE_ORES, ItemTags.REDSTONE_ORES);
        copy(BlockTags.EMERALD_ORES, ItemTags.EMERALD_ORES);
        copy(BlockTags.LAPIS_ORES, ItemTags.LAPIS_ORES);
        copy(BlockTags.DIAMOND_ORES, ItemTags.DIAMOND_ORES);
        copy(EUTags.EUBlockTags.ORES_OBDURIUM, EUTags.EUItemTags.ORES_OBDURIUM);
        copy(EUTags.EUBlockTags.ORES_MALUNITE, EUTags.EUItemTags.ORES_MALUNITE);
        copy(Tags.Blocks.ORE_RATES_DENSE, Tags.Items.ORE_RATES_SINGULAR);
        copy(Tags.Blocks.ORE_RATES_SINGULAR, Tags.Items.ORE_RATES_SINGULAR);
        copy(Tags.Blocks.ORE_RATES_SPARSE, Tags.Items.ORE_RATES_SPARSE);
        copy(EUTags.EUBlockTags.ORE_BEARING_GROUND_FRIGUS_STONE, EUTags.EUItemTags.ORE_BEARING_GROUND_FRIGUS_STONE);
        copy(EUTags.EUBlockTags.ORE_BEARING_GROUND_FRIGUS_DEEPSLATE, EUTags.EUItemTags.ORE_BEARING_GROUND_FRIGUS_DEEPSLATE);
        copy(EUTags.EUBlockTags.ORES_IN_GROUND_FRIGUS_STONE, EUTags.EUItemTags.ORES_IN_GROUND_FRIGUS_STONE);
        copy(EUTags.EUBlockTags.ORES_IN_GROUND_FRIGUS_DEEPSLATE, EUTags.EUItemTags.ORES_IN_GROUND_FRIGUS_DEEPSLATE);
        tag(ItemTags.BEACON_PAYMENT_ITEMS)
                .addTag(EUTags.EUItemTags.INGOTS_OBDURIUM)
        ;
        tag(ItemTags.TRIM_MATERIALS)
                .addTag(EUTags.EUItemTags.INGOTS_OBDURIUM)
        ;
        tag(Tags.Items.RAW_MATERIALS)
                .addTag(EUTags.EUItemTags.RAW_MATERIALS_OBDURIUM)
        ;
        tag(Tags.Items.NUGGETS)
                .addTag(EUTags.EUItemTags.NUGGETS_OBDURIUM)
        ;
        tag(Tags.Items.INGOTS)
                .addTag(EUTags.EUItemTags.INGOTS_OBDURIUM)
        ;
        tag(EUTags.EUItemTags.PLATES)
                .addTag(EUTags.EUItemTags.PLATES_OBDURIUM)
        ;
        tag(Tags.Items.RODS)
                .addTag(EUTags.EUItemTags.RODS_OBDURIUM)
        ;
        tag(EUTags.EUItemTags.RAW_MATERIALS_OBDURIUM)
                .add(EUItems.OBDURIUM_ITEMS.get("raw_obdurium").get())
        ;
        tag(EUTags.EUItemTags.NUGGETS_OBDURIUM)
                .add(EUItems.OBDURIUM_ITEMS.get("obdurium_nugget").get())
        ;
        tag(EUTags.EUItemTags.INGOTS_OBDURIUM)
                .add(EUItems.OBDURIUM_ITEMS.get("obdurium_ingot").get())
        ;
        tag(EUTags.EUItemTags.PLATES_OBDURIUM)
                .add(EUItems.OBDURIUM_ITEMS.get("obdurium_plate").get())
        ;
        tag(EUTags.EUItemTags.RODS_OBDURIUM)
                .add(EUItems.OBDURIUM_ITEMS.get("obdurium_rod").get())
        ;

        /*
        Stone Tags
         */

        copy(Tags.Blocks.STONES, Tags.Items.STONES);
        copy(Tags.Blocks.COBBLESTONES, Tags.Items.COBBLESTONES);
        copy(EUTags.EUBlockTags.COBBLESTONES_FRIGUS_STONE, EUTags.EUItemTags.COBBLESTONES_FRIGUS_STONE);
        copy(EUTags.EUBlockTags.COBBLESTONES_FRIGUS_DEEPSLATE, EUTags.EUItemTags.COBBLESTONES_FRIGUS_DEEPSLATE);
        tag(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_cobblestone").get().asItem())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get().asItem())
        ;
        tag(ItemTags.STONE_TOOL_MATERIALS)
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_cobblestone").get().asItem())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get().asItem())
        ;

        /*
        Storage Block Tags
         */

        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        copy(EUTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM, EUTags.EUItemTags.STORAGE_BLOCKS_OBDURIUM);
        copy(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_OBDURIUM, EUTags.EUItemTags.STORAGE_BLOCKS_RAW_OBDURIUM);
        copy(EUTags.EUBlockTags.STORAGE_BLOCKS_MALUNITE, EUTags.EUItemTags.STORAGE_BLOCKS_MALUNITE);
        copy(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_MALUNITE, EUTags.EUItemTags.STORAGE_BLOCKS_RAW_MALUNITE);

        /*
        Soil Tags
         */

        copy(BlockTags.DIRT, ItemTags.DIRT);

        /*
        Plant Tags
         */

        copy(BlockTags.SAPLINGS, ItemTags.SAPLINGS);
        copy(BlockTags.SMALL_FLOWERS, ItemTags.SMALL_FLOWERS);
        copy(BlockTags.TALL_FLOWERS, ItemTags.TALL_FLOWERS);


        /*
        Wood Tags
         */
        copy(BlockTags.LEAVES, ItemTags.LEAVES);

        copy(BlockTags.LOGS, ItemTags.LOGS);

        copy(BlockTags.LOGS_THAT_BURN, ItemTags.LOGS_THAT_BURN);

        copy(BlockTags.PLANKS, ItemTags.PLANKS);
        /*
        Miscellaneous Tags
         */

        // Miscellaneous tags go here
    }
}