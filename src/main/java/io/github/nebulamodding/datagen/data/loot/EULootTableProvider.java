package io.github.nebulamodding.datagen.data.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class EULootTableProvider extends LootTableProvider {
    public EULootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, Set.of(), List.of(new SubProviderEntry(EUBlockLootProvider::new, LootContextParamSets.BLOCK), new SubProviderEntry(EUEntityLootProvider::new, LootContextParamSets.ENTITY)), registries);
    }
}
