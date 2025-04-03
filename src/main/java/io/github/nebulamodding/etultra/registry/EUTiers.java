package io.github.nebulamodding.etultra.registry;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class EUTiers {
    public static final Tier
            OBDURIUM = new SimpleTier(EUTags.EUBlockTags.NEEDS_OBDURIUM_TOOL, 10000, 6, 5, 15, () -> Ingredient.of(EUTags.EUItemTags.INGOTS_OBDURIUM)),
            MALUNITE = new SimpleTier(EUTags.EUBlockTags.NEEDS_MALUNITE_TOOL, 10000, 6, 5, 22, () -> Ingredient.of(EUTags.EUItemTags.INGOTS_MALUNITE));
}