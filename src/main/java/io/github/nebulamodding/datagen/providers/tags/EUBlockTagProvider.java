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

        // Neoforge Tags
        tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTag(EUTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM)
        ;

        // Minecraft Tags
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                // Moon
                .add(EUBlocks.MOON_BLOCKS.get("cobbled_moon_deepslate").get())
                .add(EUBlocks.MOON_BLOCKS.get("chiseled_moon_deepslate").get())
                .add(EUBlocks.MOON_BLOCKS.get("polished_moon_deepslate").get())
                .add(EUBlocks.MOON_BLOCKS.get("moon_deepslate_bricks").get())
                .add(EUBlocks.MOON_BLOCKS.get("cracked_moon_deepslate_bricks").get())
                .add(EUBlocks.MOON_BLOCKS.get("moon_deepslate_tiles").get())
                .add(EUBlocks.MOON_BLOCKS.get("moon_deepslate_pillar").get())
                // Mars
                .add(EUBlocks.MARS_BLOCKS.get("mars_deepslate").get())
                .add(EUBlocks.MARS_BLOCKS.get("cobbled_mars_deepslate").get())
                .add(EUBlocks.MARS_BLOCKS.get("chiseled_mars_deepslate").get())
                .add(EUBlocks.MARS_BLOCKS.get("polished_mars_deepslate").get())
                .add(EUBlocks.MARS_BLOCKS.get("mars_deepslate_bricks").get())
                .add(EUBlocks.MARS_BLOCKS.get("cracked_mars_deepslate_bricks").get())
                .add(EUBlocks.MARS_BLOCKS.get("mars_deepslate_tiles").get())
                .add(EUBlocks.MARS_BLOCKS.get("mars_deepslate_pillar").get())
                // Venus
                //.add(EtUltraBlocks.VENUS_BLOCKS.get("venus_deepslate").get())
                //.add(EtUltraBlocks.VENUS_BLOCKS.get("cobbled_venus_deepslate").get())
                //.add(EtUltraBlocks.VENUS_BLOCKS.get("chiseled_venus_deepslate").get())
                //.add(EtUltraBlocks.VENUS_BLOCKS.get("polished_venus_deepslate").get())
                //.add(EtUltraBlocks.VENUS_BLOCKS.get("venus_deepslate_bricks").get())
                //.add(EtUltraBlocks.VENUS_BLOCKS.get("cracked_venus_deepslate_bricks").get())
                //.add(EtUltraBlocks.VENUS_BLOCKS.get("venus_deepslate_tiles").get())
                //.add(EtUltraBlocks.VENUS_BLOCKS.get("venus_deepslate_pillar").get())
                // Mercury
                .add(EUBlocks.MERCURY_BLOCKS.get("mercury_deepslate").get())
                .add(EUBlocks.MERCURY_BLOCKS.get("cobbled_mercury_deepslate").get())
                .add(EUBlocks.MERCURY_BLOCKS.get("chiseled_mercury_deepslate").get())
                .add(EUBlocks.MERCURY_BLOCKS.get("polished_mercury_deepslate").get())
                .add(EUBlocks.MERCURY_BLOCKS.get("mercury_deepslate_bricks").get())
                .add(EUBlocks.MERCURY_BLOCKS.get("cracked_mercury_deepslate_bricks").get())
                .add(EUBlocks.MERCURY_BLOCKS.get("mercury_deepslate_tiles").get())
                .add(EUBlocks.MERCURY_BLOCKS.get("mercury_deepslate_pillar").get())
                // Salt
                .add(EUBlocks.SALT_CRYSTAL_BLOCKS.get("salt_crystal_block").get())
                .add(EUBlocks.SALT_CRYSTAL_BLOCKS.get("polished_salt_crystal_block").get())
                .add(EUBlocks.SALT_PACKED_BLOCKS.get("salt_block").get())
                .add(EUBlocks.SALT_PACKED_BLOCKS.get("chiseled_salt").get())
                .add(EUBlocks.SALT_PACKED_BLOCKS.get("polished_salt").get())
                .add(EUBlocks.SALT_PACKED_BLOCKS.get("salt_bricks").get())
                .add(EUBlocks.SALT_PACKED_BLOCKS.get("cracked_salt_bricks").get())
                .add(EUBlocks.SALT_PACKED_BLOCKS.get("salt_tiles").get())
                .add(EUBlocks.SALT_PACKED_BLOCKS.get("salt_pillar").get())
                // Sulfur
                .add(EUBlocks.SULFUR_CRYSTAL_BLOCKS.get("sulfur_crystal_block").get())
                .add(EUBlocks.SULFUR_CRYSTAL_BLOCKS.get("polished_sulfur_crystal_block").get())
                .add(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_block").get())
                .add(EUBlocks.SULFUR_PACKED_BLOCKS.get("chiseled_sulfur").get())
                .add(EUBlocks.SULFUR_PACKED_BLOCKS.get("polished_sulfur").get())
                .add(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_bricks").get())
                .add(EUBlocks.SULFUR_PACKED_BLOCKS.get("cracked_sulfur_bricks").get())
                .add(EUBlocks.SULFUR_PACKED_BLOCKS.get("sulfur_pillar").get())
                // Graphite
                .add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_block").get())
                .add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("chiseled_graphite").get())
                .add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("polished_graphite").get())
                .add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_bricks").get())
                .add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("cracked_graphite_bricks").get())
                .add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_tiles").get())
                .add(EUBlocks.GRAPHITE_PACKED_BLOCKS.get("graphite_pillar").get())
        ;

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(EUBlocks.SALT_DUST_BLOCK.get())
                .add(EUBlocks.SULFUR_DUST_BLOCK.get())
                .add(EUBlocks.GRAPHITE_DUST_BLOCK.get())
        ;
    }
}