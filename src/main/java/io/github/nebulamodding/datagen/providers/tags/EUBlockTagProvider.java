package io.github.nebulamodding.datagen.providers.tags;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.blocks.EUBlocks;
import io.github.nebulamodding.registry.registers.EUTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EUBlockTagProvider extends BlockTagsProvider {
    public EUBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EtUltra.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        // Et Ultra Tags
        tag(EUTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM)
                .add(EUBlocks.OBDURIUM_BLOCKS.get("obdurium_block").get())
        ;
        tag(EUTags.EUBlockTags.ORES_IN_GROUND_FRIGUS_STONE)
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_coal_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_iron_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_copper_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_gold_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_redstone_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_emerald_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_lapis_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_diamond_ore").get())
        ;
        tag(EUTags.EUBlockTags.ORES_IN_GROUND_FRIGUS_DEEPSLATE)
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_coal_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_iron_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_copper_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_gold_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_redstone_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_emerald_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_lapis_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_diamond_ore").get())
        ;

        // Common Tags
        tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTag(EUTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM)
        ;
        tag(Tags.Blocks.ORE_RATES_DENSE)
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_copper_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_redstone_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_lapis_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_copper_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_redstone_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_lapis_ore").get())
        ;
        tag(Tags.Blocks.ORE_RATES_SINGULAR)
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_coal_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_iron_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_gold_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_emerald_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_diamond_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_coal_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_iron_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_gold_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_emerald_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_diamond_ore").get())
        ;
        tag(Tags.Blocks.STONES)
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get())
        ;
        tag(Tags.Blocks.COBBLESTONES)
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_cobblestone").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get())
        ;

        // Minecraft Tags
        // This tag prevents blocks from interfering with enchantment tables
        tag(BlockTags.ENCHANTMENT_POWER_TRANSMITTER)
                .add(EUBlocks.FRIGUS_SHORT_GRASS.get())
        ;
        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(EUBlocks.FRIGUS_GRASS_BLOCK.get())
                .add(EUBlocks.FRIGUS_DIRT_PATH.get())
                .add(EUBlocks.FRIGUS_DIRT.get())
                .add(EUBlocks.FRIGUS_COARSE_DIRT.get())
                .add(EUBlocks.FRIGUS_FARMLAND.get())

                .add(EUBlocks.SALT_DUST_BLOCK.get())
                .add(EUBlocks.SULFUR_DUST_BLOCK.get())
                .add(EUBlocks.GRAPHITE_DUST_BLOCK.get())
        ;
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                // Ores
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_coal_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_iron_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_copper_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_gold_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_redstone_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_emerald_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_lapis_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_diamond_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_coal_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_iron_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_copper_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_gold_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_redstone_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_emerald_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_lapis_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_diamond_ore").get())
                // Frigus
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get())
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_cobblestone").get())
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("chiseled_frigus_stone").get())
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("polished_frigus_stone").get())
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_bricks").get())
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("cracked_frigus_stone_bricks").get())
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_pillar").get())
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_slab").get())
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_cobblestone_slab").get())
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("polished_frigus_stone_slab").get())
                .add(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone_brick_slab").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("chiseled_frigus_deepslate").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("polished_frigus_deepslate").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cracked_frigus_deepslate_bricks").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_pillar").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_slab").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate_slab").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("polished_frigus_deepslate_slab").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_brick_slab").get())
        ;
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(EUBlocks.FRIGUS_SHORT_GRASS.get())
        ;
        tag(BlockTags.MINEABLE_WITH_HOE)
        ;
        tag(BlockTags.SWORD_EFFICIENT)
                .add(EUBlocks.FRIGUS_SHORT_GRASS.get())
        ;
        tag(BlockTags.COAL_ORES)
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_coal_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_coal_ore").get())
        ;
        tag(BlockTags.IRON_ORES)
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_iron_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_iron_ore").get())
        ;
        tag(BlockTags.COPPER_ORES)
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_copper_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_copper_ore").get())
        ;
        tag(BlockTags.GOLD_ORES)
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_gold_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_gold_ore").get())
        ;
        tag(BlockTags.REDSTONE_ORES)
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_redstone_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_redstone_ore").get())
        ;
        tag(BlockTags.EMERALD_ORES)
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_emerald_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_emerald_ore").get())
        ;
        tag(BlockTags.LAPIS_ORES)
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_lapis_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_lapis_ore").get())
        ;
        tag(BlockTags.DIAMOND_ORES)
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_diamond_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_diamond_ore").get())
        ;
        tag(BlockTags.REPLACEABLE)
                .add(EUBlocks.FRIGUS_SHORT_GRASS.get())
        ;
        tag(BlockTags.REPLACEABLE_BY_TREES)
                .add(EUBlocks.FRIGUS_SHORT_GRASS.get())
        ;
        tag(BlockTags.ANIMALS_SPAWNABLE_ON)
                .add(EUBlocks.FRIGUS_GRASS_BLOCK.get())
        ;
        tag(BlockTags.DIRT)
                .add(EUBlocks.FRIGUS_GRASS_BLOCK.get())
                .add(EUBlocks.FRIGUS_DIRT.get())
                .add(EUBlocks.FRIGUS_COARSE_DIRT.get())
        ;
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_copper_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_iron_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_lapis_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_copper_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_iron_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_lapis_ore").get())
        ;
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_gold_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_redstone_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_emerald_ore").get())
                .add(EUBlocks.FRIGUS_STONE_ORE_BLOCKS.get("frigus_diamond_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_gold_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_redstone_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_emerald_ore").get())
                .add(EUBlocks.FRIGUS_DEEPSLATE_ORE_BLOCKS.get("frigus_deepslate_diamond_ore").get())
        ;
    }
}