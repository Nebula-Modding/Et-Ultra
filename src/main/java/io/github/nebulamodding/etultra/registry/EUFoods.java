package io.github.nebulamodding.etultra.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class EUFoods {
    public static final FoodProperties BRUMA_LOAF = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.7F)
            .build();
    public static final FoodProperties AZURE_ROOT = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.2F)
            .alwaysEdible()
            .build();
    public static final FoodProperties GOLDEN_AZURE_ROOT = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.8F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2000, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 1), 0.2F)
            .alwaysEdible()
            .build();
    public static final FoodProperties ENCHANTED_GOLDEN_AZURE_ROOT = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.8F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 400, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 1800, 2), 1.0F)
            .alwaysEdible()
            .build();
    public static final FoodProperties FLESH = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.2F)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F)
            .build();
    public static final FoodProperties COOKED_FLESH = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.6F)
            .build();
}