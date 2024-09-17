package io.github.nebulamodding.datagen.builders;

import com.google.common.collect.Sets;
import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.datagen.providers.loot.EtUltraBlockLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.WritableRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class EtUltraLootTables extends LootTableProvider {
    public EtUltraLootTables(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, Set.of(), List.of(new SubProviderEntry(EtUltraBlockLootTables::new, LootContextParamSets.BLOCK)), registries);
    }

    @Override
    protected void validate(
            WritableRegistry<LootTable> writableRegistry,
            @NotNull ValidationContext validationContext,
            ProblemReporter.@NotNull Collector problemReporterCollector
    ) {
        var modLootTablesId = BuiltInLootTables.all()
                .stream()
                .filter(id -> id.registry().getNamespace().equals(EtUltra.MOD_ID))
                .collect(Collectors.toSet());

        for (var id : Sets.difference(modLootTablesId, writableRegistry.keySet())) {
            validationContext.reportProblem("Missing built-in table: " + id);
        }

        writableRegistry.forEach((lootTable -> lootTable.validate(validationContext)));
    }
}