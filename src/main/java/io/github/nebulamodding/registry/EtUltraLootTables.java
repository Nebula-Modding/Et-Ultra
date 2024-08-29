package io.github.nebulamodding.registry;

import com.google.common.collect.Sets;
import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.datagen.providers.EtUltraBlockLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.WritableRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ModLootTables extends LootTableProvider {
    public ModLootTables(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, Set.of(), List.of(new SubProviderEntry(EtUltraBlockLootTables::new, LootContextParamSets.BLOCK)), pRegistries);
    }


    @Override
    protected void validate(WritableRegistry<LootTable> writableregistry, ValidationContext validationcontext, ProblemReporter.Collector problemreporter$collector) {
        var modLootTablesId = BuiltInLootTables.all()
                .stream()
                .filter(id -> id.registry().getNamespace().equals(EtUltra.MOD_ID))
                .collect(Collectors.toSet());

        for (var id : Sets.difference(modLootTablesId, writableregistry.keySet())) {
            validationcontext.reportProblem("Missing built-in table: " + id);
        }

        writableregistry.forEach((lootTable -> lootTable.validate(validationcontext)));
    }
}