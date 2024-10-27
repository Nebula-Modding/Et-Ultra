package io.github.nebulamodding.registry;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.datagen.builders.EtUltraLootTables;
import io.github.nebulamodding.datagen.providers.EULangProvider;
import io.github.nebulamodding.datagen.providers.models.EUBlockStateProvider;
import io.github.nebulamodding.datagen.providers.models.EUItemModelProvider;
import io.github.nebulamodding.datagen.builders.EURecipes;
import io.github.nebulamodding.datagen.providers.tags.EUBlockTagProvider;
import io.github.nebulamodding.datagen.providers.tags.EUItemTagProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class EUDataGeneration {

    public static void gatherData(GatherDataEvent event) {
        try {
            DataGenerator generator = event.getGenerator();
            PackOutput output = generator.getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

            if (event.includeClient()) {
                generator.addProvider(true, new EULangProvider(output));
                generator.addProvider(true, new EUItemModelProvider(output, existingFileHelper));
                generator.addProvider(true, new EUBlockStateProvider(output, existingFileHelper));
            }

            if (event.includeServer()) {
                EUBlockTagProvider modBlockTagsProvider = new EUBlockTagProvider(output, event.getLookupProvider(), existingFileHelper);
                generator.addProvider(true, modBlockTagsProvider);
                generator.addProvider(true, new EUItemTagProvider(output, event.getLookupProvider(), modBlockTagsProvider, existingFileHelper));
                generator.addProvider(true, new EtUltraLootTables(output, event.getLookupProvider()));
                generator.addProvider(true, new EURecipes(generator, event.getLookupProvider()));
                //generator.addProvider(true, new EUWorldGeneration(output, event.getLookupProvider()));
                //generator.addProvider(true, new EUMobLootTables(output, event.getLookupProvider()));
            }
        } catch (RuntimeException e) {
                EtUltra.LOGGER.error("Failed to gather Et Ultra's data", e);
        }
    }
}