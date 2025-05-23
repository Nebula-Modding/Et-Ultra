package io.github.nebulamodding.etultra.registry;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class EUTiers {
    public static final Tier
            OBDURIUM = new SimpleTier(EUTags.EUBlockTags.NEEDS_OBDURIUM_TOOL, 9327, 2, 5, 15, () -> Ingredient.of(EUTags.EUItemTags.INGOTS_OBDURIUM)),
            MALUNITE = new SimpleTier(EUTags.EUBlockTags.NEEDS_MALUNITE_TOOL, 713, 7, 3, 22, () -> Ingredient.of(EUTags.EUItemTags.INGOTS_MALUNITE)),
            LUTRUM = new SimpleTier(EUTags.EUBlockTags.NEEDS_LUTRUM_TOOL, 713, 7, 3, 17, () -> Ingredient.of(EUTags.EUItemTags.INGOTS_LUTRUM));
}