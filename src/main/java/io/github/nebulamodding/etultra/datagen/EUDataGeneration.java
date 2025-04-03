package io.github.nebulamodding.etultra.datagen;

import io.github.nebulamodding.etultra.EtUltra;
import io.github.nebulamodding.etultra.datagen.assets.EUBlockStateProvider;
import io.github.nebulamodding.etultra.datagen.assets.EUItemModelProvider;
import io.github.nebulamodding.etultra.datagen.assets.EUSoundDefinitionsProvider;
import io.github.nebulamodding.etultra.datagen.assets.EULanguageProvider;
import io.github.nebulamodding.etultra.datagen.data.EUBuiltinEntriesProvider;
import io.github.nebulamodding.etultra.datagen.data.loot.EULootTableProvider;
import io.github.nebulamodding.etultra.datagen.data.tags.EUBlockTagsProvider;
import io.github.nebulamodding.etultra.datagen.data.tags.EUItemTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class EUDataGeneration {
    public static void gatherData(GatherDataEvent event) {
        try {
            DataGenerator generator = event.getGenerator();
            PackOutput output = generator.getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

            if (event.includeClient()) {
                // Generates the client-sided assets
                generator.addProvider(true, new EULanguageProvider(output));
                generator.addProvider(true, new EUBlockStateProvider(output, existingFileHelper));
                generator.addProvider(true, new EUItemModelProvider(output, existingFileHelper));
                generator.addProvider(true, new EUSoundDefinitionsProvider(output, existingFileHelper));
            }
            if (event.includeServer()) {
                // Generates the server-sided data
                EUBlockTagsProvider blockTagsProvider = new EUBlockTagsProvider(output, event.getLookupProvider(), existingFileHelper);
                generator.addProvider(true, blockTagsProvider);
                generator.addProvider(true, new EUItemTagProvider(output, event.getLookupProvider(), blockTagsProvider, existingFileHelper));

                CompletableFuture<HolderLookup.Provider> newLookup = generator.addProvider(event.includeServer(), new EUBuiltinEntriesProvider(output, event.getLookupProvider())).getRegistryProvider();
                generator.addProvider(true, new EULootTableProvider(output, newLookup));
            }
        } catch (RuntimeException e) {
            EtUltra.LOGGER.error("Failed to gather Et Ultra's data", e);
        }
    }
}