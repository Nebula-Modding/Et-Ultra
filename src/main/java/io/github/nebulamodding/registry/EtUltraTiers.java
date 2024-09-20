package io.github.nebulamodding.registry;


import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;

public class EtUltraTiers {
    public static final Tier DESH = new SimpleTier(Tags.Blocks.NEEDS_WOOD_TOOL, 500, 6, 2, 20, () -> Ingredient.of(Tags.Items.INGOTS_COPPER));
    public static final Tier OSTRUM = new SimpleTier(Tags.Blocks.NEEDS_WOOD_TOOL, 1000, 7, 4, 20, () -> Ingredient.of(Tags.Items.INGOTS_COPPER));
}