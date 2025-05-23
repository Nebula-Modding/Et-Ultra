package io.github.nebulamodding.etultra.datagen.data.tags;

import io.github.nebulamodding.etultra.EtUltra;
import io.github.nebulamodding.etultra.registry.block.EUBlocks;
import io.github.nebulamodding.etultra.registry.item.EUItems;
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
        copy(BlockTags.FENCES, ItemTags.FENCES);
        copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);
        copy(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES);
        copy(Tags.Blocks.FENCE_GATES, Tags.Items.FENCE_GATES);
        copy(Tags.Blocks.FENCE_GATES_WOODEN, Tags.Items.FENCE_GATES_WOODEN);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.DOORS, ItemTags.DOORS);
        copy(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
        copy(BlockTags.TRAPDOORS, ItemTags.TRAPDOORS);
        copy(BlockTags.WOODEN_TRAPDOORS, ItemTags.WOODEN_TRAPDOORS);
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
        copy(EUTags.EUBlockTags.ORES_LUTRUM, EUTags.EUItemTags.ORES_LUTRUM);
        copy(Tags.Blocks.ORE_RATES_DENSE, Tags.Items.ORE_RATES_SINGULAR);
        copy(Tags.Blocks.ORE_RATES_SINGULAR, Tags.Items.ORE_RATES_SINGULAR);
        copy(Tags.Blocks.ORE_RATES_SPARSE, Tags.Items.ORE_RATES_SPARSE);
        copy(EUTags.EUBlockTags.ORE_BEARING_GROUND_BLUESCHIST, EUTags.EUItemTags.ORE_BEARING_GROUND_BLUESCHIST);
        copy(EUTags.EUBlockTags.ORE_BEARING_GROUND_FRIGUS_DEEPSLATE, EUTags.EUItemTags.ORE_BEARING_GROUND_FRIGUS_DEEPSLATE);
        copy(EUTags.EUBlockTags.ORE_BEARING_GROUND_WATER_ICE, EUTags.EUItemTags.ORE_BEARING_GROUND_WATER_ICE);
        copy(EUTags.EUBlockTags.ORE_BEARING_GROUND_NITROGEN_ICE, EUTags.EUItemTags.ORE_BEARING_GROUND_NITROGEN_ICE);
        copy(EUTags.EUBlockTags.ORE_BEARING_GROUND_OXYGEN_ICE, EUTags.EUItemTags.ORE_BEARING_GROUND_OXYGEN_ICE);
        copy(EUTags.EUBlockTags.ORES_IN_GROUND_BLUESCHIST, EUTags.EUItemTags.ORES_IN_GROUND_BLUESCHIST);
        copy(EUTags.EUBlockTags.ORES_IN_GROUND_FRIGUS_DEEPSLATE, EUTags.EUItemTags.ORES_IN_GROUND_FRIGUS_DEEPSLATE);
        copy(EUTags.EUBlockTags.ORES_IN_GROUND_WATER_ICE, EUTags.EUItemTags.ORES_IN_GROUND_WATER_ICE);
        copy(EUTags.EUBlockTags.ORES_IN_GROUND_NITROGEN_ICE, EUTags.EUItemTags.ORES_IN_GROUND_NITROGEN_ICE);
        copy(EUTags.EUBlockTags.ORES_IN_GROUND_OXYGEN_ICE, EUTags.EUItemTags.ORES_IN_GROUND_OXYGEN_ICE);
        tag(ItemTags.BEACON_PAYMENT_ITEMS)
                .addTag(EUTags.EUItemTags.INGOTS_OBDURIUM)
                .addTag(EUTags.EUItemTags.INGOTS_MALUNITE)
                .addTag(EUTags.EUItemTags.INGOTS_LUTRUM)
        ;
        tag(ItemTags.TRIM_MATERIALS)
                .addTag(EUTags.EUItemTags.INGOTS_OBDURIUM)
                .addTag(EUTags.EUItemTags.INGOTS_MALUNITE)
                .addTag(EUTags.EUItemTags.INGOTS_LUTRUM)
        ;
        tag(Tags.Items.RAW_MATERIALS)
                .addTag(EUTags.EUItemTags.RAW_MATERIALS_OBDURIUM)
                .addTag(EUTags.EUItemTags.RAW_MATERIALS_MALUNITE)
                .addTag(EUTags.EUItemTags.RAW_MATERIALS_LUTRUM)
        ;
        tag(Tags.Items.NUGGETS)
                .addTag(EUTags.EUItemTags.NUGGETS_OBDURIUM)
                .addTag(EUTags.EUItemTags.NUGGETS_MALUNITE)
                .addTag(EUTags.EUItemTags.NUGGETS_LUTRUM)
        ;
        tag(Tags.Items.INGOTS)
                .addTag(EUTags.EUItemTags.INGOTS_OBDURIUM)
                .addTag(EUTags.EUItemTags.INGOTS_MALUNITE)
                .addTag(EUTags.EUItemTags.INGOTS_LUTRUM)
        ;
        tag(EUTags.EUItemTags.PLATES)
                .addTag(EUTags.EUItemTags.PLATES_OBDURIUM)
                .addTag(EUTags.EUItemTags.PLATES_MALUNITE)
                .addTag(EUTags.EUItemTags.PLATES_LUTRUM)
        ;
        tag(Tags.Items.RODS)
                .addTag(EUTags.EUItemTags.RODS_OBDURIUM)
                .addTag(EUTags.EUItemTags.RODS_MALUNITE)
                .addTag(EUTags.EUItemTags.RODS_LUTRUM)
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
        tag(EUTags.EUItemTags.RAW_MATERIALS_MALUNITE)
                .add(EUItems.MALUNITE_ITEMS.get("raw_malunite").get())
        ;
        tag(EUTags.EUItemTags.NUGGETS_MALUNITE)
                .add(EUItems.MALUNITE_ITEMS.get("malunite_nugget").get())
        ;
        tag(EUTags.EUItemTags.INGOTS_MALUNITE)
                .add(EUItems.MALUNITE_ITEMS.get("malunite_ingot").get())
        ;
        tag(EUTags.EUItemTags.PLATES_MALUNITE)
                .add(EUItems.MALUNITE_ITEMS.get("malunite_plate").get())
        ;
        tag(EUTags.EUItemTags.RODS_MALUNITE)
                .add(EUItems.MALUNITE_ITEMS.get("malunite_rod").get())
        ;
        tag(EUTags.EUItemTags.RAW_MATERIALS_LUTRUM)
                .add(EUItems.LUTRUM_ITEMS.get("raw_lutrum").get())
        ;
        tag(EUTags.EUItemTags.NUGGETS_LUTRUM)
                .add(EUItems.LUTRUM_ITEMS.get("lutrum_nugget").get())
        ;
        tag(EUTags.EUItemTags.INGOTS_LUTRUM)
                .add(EUItems.LUTRUM_ITEMS.get("lutrum_ingot").get())
        ;
        tag(EUTags.EUItemTags.PLATES_LUTRUM)
                .add(EUItems.LUTRUM_ITEMS.get("lutrum_plate").get())
        ;
        tag(EUTags.EUItemTags.RODS_LUTRUM)
                .add(EUItems.LUTRUM_ITEMS.get("lutrum_rod").get())
        ;

        /*
        Stone Tags
         */

        copy(Tags.Blocks.STONES, Tags.Items.STONES);
        copy(Tags.Blocks.COBBLESTONES, Tags.Items.COBBLESTONES);
        copy(EUTags.EUBlockTags.COBBLESTONES_BLUESCHIST, EUTags.EUItemTags.COBBLESTONES_BLUESCHIST);
        copy(EUTags.EUBlockTags.COBBLESTONES_FRIGUS_DEEPSLATE, EUTags.EUItemTags.COBBLESTONES_FRIGUS_DEEPSLATE);
        tag(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(EUBlocks.BLUESCHIST_BLOCKS.get("cobbled_blueschist").get().asItem())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get().asItem())
        ;
        tag(ItemTags.STONE_TOOL_MATERIALS)
                .add(EUBlocks.BLUESCHIST_BLOCKS.get("cobbled_blueschist").get().asItem())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get().asItem())
        ;

        /*
        Storage Block Tags
         */

        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        copy(EUTags.EUBlockTags.STORAGE_BLOCKS_BRUMA, EUTags.EUItemTags.STORAGE_BLOCKS_BRUMA);
        copy(EUTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM, EUTags.EUItemTags.STORAGE_BLOCKS_OBDURIUM);
        copy(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_OBDURIUM, EUTags.EUItemTags.STORAGE_BLOCKS_RAW_OBDURIUM);
        copy(EUTags.EUBlockTags.STORAGE_BLOCKS_MALUNITE, EUTags.EUItemTags.STORAGE_BLOCKS_MALUNITE);
        copy(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_MALUNITE, EUTags.EUItemTags.STORAGE_BLOCKS_RAW_MALUNITE);
        copy(EUTags.EUBlockTags.STORAGE_BLOCKS_LUTRUM, EUTags.EUItemTags.STORAGE_BLOCKS_LUTRUM);
        copy(EUTags.EUBlockTags.STORAGE_BLOCKS_RAW_LUTRUM, EUTags.EUItemTags.STORAGE_BLOCKS_RAW_LUTRUM);

        /*
        Soil Tags
         */

        copy(BlockTags.DIRT, ItemTags.DIRT);

        /*
        Tree Tags
         */

        copy(BlockTags.LEAVES, ItemTags.LEAVES);
        copy(BlockTags.LOGS, ItemTags.LOGS);
        copy(Tags.Blocks.STRIPPED_LOGS, Tags.Items.STRIPPED_LOGS);
        copy(Tags.Blocks.STRIPPED_WOODS, Tags.Items.STRIPPED_WOODS);
        copy(BlockTags.LOGS_THAT_BURN, ItemTags.LOGS_THAT_BURN);
        copy(BlockTags.PLANKS, ItemTags.PLANKS);
        copy(EUTags.EUBlockTags.MAYURA_LOGS, EUTags.EUItemTags.MAYURA_LOGS);
        copy(EUTags.EUBlockTags.GRIMWOOD_LOGS, EUTags.EUItemTags.GRIMWOOD_LOGS);

        /*
        Plant Tags
         */

        copy(BlockTags.SAPLINGS, ItemTags.SAPLINGS);
        copy(BlockTags.SMALL_FLOWERS, ItemTags.SMALL_FLOWERS);
        copy(BlockTags.TALL_FLOWERS, ItemTags.TALL_FLOWERS);
        tag(Tags.Items.CROPS_WHEAT)
                .add(EUItems.BRUMA.get())
        ;
        tag(Tags.Items.CROPS)
                .add(EUItems.BRUMA.get())
        ;

        /*
        Miscellaneous Tags
         */

        tag(ItemTags.GOAT_FOOD)
                .add(EUItems.BRUMA.get())
        ;
        tag(ItemTags.LLAMA_FOOD)
                .add(EUItems.BRUMA.get())
                .add(EUBlocks.BRUMA_BLOCK.get().asItem())
        ;
        tag(ItemTags.COW_FOOD)
                .add(EUItems.BRUMA.get())
        ;
        tag(ItemTags.SHEEP_FOOD)
                .add(EUItems.BRUMA.get())
        ;
        tag(ItemTags.HORSE_FOOD)
                .add(EUItems.BRUMA.get())
                .add(EUBlocks.BRUMA_BLOCK.get().asItem())
        ;
        tag(ItemTags.LLAMA_TEMPT_ITEMS)
                .add(EUBlocks.BRUMA_BLOCK.get().asItem())
        ;
        tag(ItemTags.HORSE_TEMPT_ITEMS)
        ;
        tag(Tags.Items.FOODS_BREAD)
                .add(EUItems.BRUMA_LOAF.get())
        ;
    }
}