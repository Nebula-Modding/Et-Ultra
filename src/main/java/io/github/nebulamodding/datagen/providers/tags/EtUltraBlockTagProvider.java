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
        /*
        To add tags, it's pretty easy. For example:

        tag(EtUltraTags.EtUltraBlockTags.EXAMPLE_BLOCK_TAG)
                .add(EtUltraBlocks.EXAMPLE_BLOCK.get());

        And if you want to add other tags to the tag?

                .addTag(EtUltraTags.EtUltraBlockTags.EXAMPLE_BLOCK_TAG);

                Please separate every tag with one line of whitespace, thank you!
         */

        tag(EtUltraTags.EtUltraBlockTags.TEST_BLOCKS)
                .add(EtUltraBlocks.MARS_DEEPSLATE.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                // Moon
                .add(EtUltraBlocks.COBBLED_MOON_DEEPSLATE.get())
                .add(EtUltraBlocks.CHISELED_MOON_DEEPSLATE.get())
                .add(EtUltraBlocks.POLISHED_MOON_DEEPSLATE.get())
                .add(EtUltraBlocks.MOON_DEEPSLATE_BRICKS.get())
                .add(EtUltraBlocks.CRACKED_MOON_DEEPSLATE_BRICKS.get())
                .add(EtUltraBlocks.MOON_DEEPSLATE_TILES.get())

                // Mars
                .add(EtUltraBlocks.MARS_DEEPSLATE.get())
                .add(EtUltraBlocks.COBBLED_MARS_DEEPSLATE.get())
                .add(EtUltraBlocks.CHISELED_MARS_DEEPSLATE.get())
                .add(EtUltraBlocks.POLISHED_MARS_DEEPSLATE.get())
                .add(EtUltraBlocks.MARS_DEEPSLATE_BRICKS.get())
                .add(EtUltraBlocks.CRACKED_MARS_DEEPSLATE_BRICKS.get())
                .add(EtUltraBlocks.MARS_DEEPSLATE_TILES.get())

                // Salt
                .add(EtUltraBlocks.SALT_CRYSTAL_BLOCK.get())
                .add(EtUltraBlocks.POLISHED_SALT_CRYSTAL_BLOCK.get())
                .add(EtUltraBlocks.SALT_BLOCK.get())
                .add(EtUltraBlocks.CHISELED_SALT.get())
                .add(EtUltraBlocks.POLISHED_SALT.get())
                .add(EtUltraBlocks.SALT_BRICKS.get())
                .add(EtUltraBlocks.CRACKED_SALT_BRICKS.get())
                .add(EtUltraBlocks.SALT_TILES.get())

                // Graphite
                .add(EtUltraBlocks.GRAPHITE_BLOCK.get())
                .add(EtUltraBlocks.CHISELED_GRAPHITE.get())
                .add(EtUltraBlocks.POLISHED_GRAPHITE.get())
                .add(EtUltraBlocks.GRAPHITE_BRICKS.get())
                .add(EtUltraBlocks.CRACKED_GRAPHITE_BRICKS.get())
                .add(EtUltraBlocks.GRAPHITE_TILES.get())

        // Note To Self: Move this semicolon whenever I finish adding tags
        ;

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(EtUltraBlocks.SALT_DUST_BLOCK.get())
                .add(EtUltraBlocks.GRAPHITE_DUST_BLOCK.get());
    }
}