package io.github.nebulamodding.datagen.providers.tags;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EtUltraBlocks;
import io.github.nebulamodding.registry.EtUltraTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EtUltraBlockTagProvider extends BlockTagsProvider {
    public EtUltraBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EtUltra.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                // Moon
                .add(EtUltraBlocks.MOON_BLOCKS.get("cobbled_moon_deepslate").get())
                .add(EtUltraBlocks.MOON_BLOCKS.get("chiseled_moon_deepslate").get())
                .add(EtUltraBlocks.MOON_BLOCKS.get("polished_moon_deepslate").get())
                .add(EtUltraBlocks.MOON_BLOCKS.get("moon_deepslate_bricks").get())
                .add(EtUltraBlocks.MOON_BLOCKS.get("cracked_moon_deepslate_bricks").get())
                .add(EtUltraBlocks.MOON_BLOCKS.get("moon_deepslate_tiles").get())
                .add(EtUltraBlocks.MOON_BLOCKS.get("moon_deepslate_pillar").get())

                // Mars
                .add(EtUltraBlocks.MARS_BLOCKS.get("mars_deepslate").get())
                .add(EtUltraBlocks.MARS_BLOCKS.get("cobbled_mars_deepslate").get())
                .add(EtUltraBlocks.MARS_BLOCKS.get("chiseled_mars_deepslate").get())
                .add(EtUltraBlocks.MARS_BLOCKS.get("polished_mars_deepslate").get())
                .add(EtUltraBlocks.MARS_BLOCKS.get("mars_deepslate_bricks").get())
                .add(EtUltraBlocks.MARS_BLOCKS.get("cracked_mars_deepslate_bricks").get())
                .add(EtUltraBlocks.MARS_BLOCKS.get("mars_deepslate_tiles").get())
                .add(EtUltraBlocks.MARS_BLOCKS.get("mars_deepslate_pillar").get())

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
                .add(EtUltraBlocks.MERCURY_BLOCKS.get("mercury_deepslate").get())
                .add(EtUltraBlocks.MERCURY_BLOCKS.get("cobbled_mercury_deepslate").get())
                .add(EtUltraBlocks.MERCURY_BLOCKS.get("chiseled_mercury_deepslate").get())
                .add(EtUltraBlocks.MERCURY_BLOCKS.get("polished_mercury_deepslate").get())
                .add(EtUltraBlocks.MERCURY_BLOCKS.get("mercury_deepslate_bricks").get())
                .add(EtUltraBlocks.MERCURY_BLOCKS.get("cracked_mercury_deepslate_bricks").get())
                .add(EtUltraBlocks.MERCURY_BLOCKS.get("mercury_deepslate_tiles").get())
                .add(EtUltraBlocks.MERCURY_BLOCKS.get("mercury_deepslate_pillar").get())

                // Salt
                .add(EtUltraBlocks.SALT_CRYSTAL_BLOCKS.get("salt_crystal_block").get())
                .add(EtUltraBlocks.SALT_CRYSTAL_BLOCKS.get("polished_salt_crystal_block").get())
                .add(EtUltraBlocks.SALT_COMPRESSED_BLOCKS.get("salt_block").get())
                .add(EtUltraBlocks.SALT_COMPRESSED_BLOCKS.get("chiseled_salt").get())
                .add(EtUltraBlocks.SALT_COMPRESSED_BLOCKS.get("polished_salt").get())
                .add(EtUltraBlocks.SALT_COMPRESSED_BLOCKS.get("salt_bricks").get())
                .add(EtUltraBlocks.SALT_COMPRESSED_BLOCKS.get("cracked_salt_bricks").get())
                .add(EtUltraBlocks.SALT_COMPRESSED_BLOCKS.get("salt_tiles").get())
                .add(EtUltraBlocks.SALT_COMPRESSED_BLOCKS.get("salt_pillar").get())

                // Graphite
                .add(EtUltraBlocks.GRAPHITE_BLOCKS.get("graphite_block").get())
                .add(EtUltraBlocks.GRAPHITE_BLOCKS.get("chiseled_graphite").get())
                .add(EtUltraBlocks.GRAPHITE_BLOCKS.get("polished_graphite").get())
                .add(EtUltraBlocks.GRAPHITE_BLOCKS.get("graphite_bricks").get())
                .add(EtUltraBlocks.GRAPHITE_BLOCKS.get("cracked_graphite_bricks").get())
                .add(EtUltraBlocks.GRAPHITE_BLOCKS.get("graphite_tiles").get())
                .add(EtUltraBlocks.GRAPHITE_BLOCKS.get("graphite_pillar").get())
        ;

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(EtUltraBlocks.SALT_DUST_BLOCK.get())
                .add(EtUltraBlocks.GRAPHITE_DUST_BLOCK.get())
        ;
    }
}