package io.github.nebulamodding.datagen.providers.tags;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EtUltraBlocks;
import io.github.nebulamodding.registry.EtUltraTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EtUltraBlockTagProvider extends BlockTagsProvider {
    public EtUltraBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EtUltra.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

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
                .add(EtUltraBlocks.MARS_DEEPSLATE.get())
                .add(EtUltraBlocks.COBBLED_MARS_DEEPSLATE.get())
                .add(EtUltraBlocks.GRAPHITE_BLOCK.get());

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(EtUltraBlocks.GRAPHITE_DUST.get());
    }
}