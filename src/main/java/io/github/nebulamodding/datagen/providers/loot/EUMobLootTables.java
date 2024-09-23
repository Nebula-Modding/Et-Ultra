package io.github.nebulamodding.datagen.providers.loot;

import io.github.nebulamodding.EtUltra;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;

import java.util.concurrent.CompletableFuture;

// see https://github.com/Luohuayu/CatServer/blob/1c92118fcca69ffac97a48c8e1f6e1bb861b41d1/src/main/java/org/bukkit/loot/LootTables.java#L71 for some loot tables
public class EUMobLootTables extends GlobalLootModifierProvider {
    public EUMobLootTables(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, EtUltra.MOD_ID);
    }

    @Override
    protected void start() {
        // Rewriting later
    }
}