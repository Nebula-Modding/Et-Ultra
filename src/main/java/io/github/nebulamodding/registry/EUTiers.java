package io.github.nebulamodding.registry;


import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;

public class EUTiers {
    public static final Tier DESH = new SimpleTier(Tags.Blocks.NEEDS_WOOD_TOOL, 500, 6, 2, 20, () -> Ingredient.of(Tags.Items.INGOTS_COPPER));
    public static final Tier THERMALYTE = new SimpleTier(Tags.Blocks.NEEDS_WOOD_TOOL, 1000, 7, 4, 20, () -> Ingredient.of(Tags.Items.INGOTS_COPPER));
    public static final Tier OBDURIUM = new SimpleTier(Tags.Blocks.NEEDS_WOOD_TOOL, 10000, 6, 5, 20, () -> Ingredient.of(EUTags.EtUltraItemTags.INGOTS_OBDURIUM));
}