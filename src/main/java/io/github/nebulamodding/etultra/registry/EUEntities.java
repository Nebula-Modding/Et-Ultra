package io.github.nebulamodding.etultra.registry;

import io.github.nebulamodding.etultra.EtUltra;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EUEntities {

    // damn i got my hopes up
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, EtUltra.MOD_ID);
}
