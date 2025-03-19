package io.github.nebulamodding.datagen.data.loot;

import io.github.nebulamodding.registry.EUEntities;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.NotNull;

import java.util.stream.Stream;

public class EUEntityLootProvider extends EntityLootSubProvider {
    protected EUEntityLootProvider(HolderLookup.Provider registries) {
        super(FeatureFlags.REGISTRY.allFlags(), registries);
    }
    @Override
    public void generate() {
        // Entity loot stuffs go here
    }
    @Override
    protected @NotNull Stream<EntityType<?>> getKnownEntityTypes() {
        return EUEntities.ENTITIES.getEntries()
                .stream()
                .map(DeferredHolder::get);
    }
}
