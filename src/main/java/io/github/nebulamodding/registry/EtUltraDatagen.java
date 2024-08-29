package io.github.nebulamodding.registry;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.datagen.providers.EtUltraLangProvider;
import io.github.nebulamodding.datagen.providers.EtUltraRecipeProvider;
import io.github.nebulamodding.datagen.providers.tags.EtUltraBlockTagProvider;
import io.github.nebulamodding.datagen.providers.tags.EtUltraItemTagProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class EtUltraDatagen {

    public static void gatherData(GatherDataEvent event) {
        //try {
            DataGenerator generator = event.getGenerator();
            PackOutput output = generator.getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

            generator.addProvider(true, new EtUltraLangProvider(output));
            //generator.addProvider(true, new ModItemStateProvider(output, existingFileHelper));
            //generator.addProvider(true, new ModBlockStateProvider(output, existingFileHelper));
            EtUltraBlockTagProvider modBlockTagsProvider = new EtUltraBlockTagProvider(output, event.getLookupProvider(), existingFileHelper);
            generator.addProvider(true, modBlockTagsProvider);
            generator.addProvider(true, new EtUltraItemTagProvider(output, event.getLookupProvider(), modBlockTagsProvider, existingFileHelper));
            generator.addProvider(true, new EtUltraLootTables(output, event.getLookupProvider()));
            //generator.addProvider(true, new EtUltraWorldGenProvider(output, event.getLookupProvider()));
            generator.addProvider(true, new EtUltraRecipeProvider(generator, event.getLookupProvider()));
            //generator.addProvider(true, new ModGlobalLootModifiersProvider(output, event.getLookupProvider()));
        //} catch (RuntimeException e) {
            //EtUltra.logger.error("Failed to gather data", e);
        //}
    }
}