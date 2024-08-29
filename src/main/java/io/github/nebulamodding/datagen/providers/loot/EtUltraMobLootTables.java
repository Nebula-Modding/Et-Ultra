package io.github.nebulamodding.datagen.providers.loot;

import io.github.nebulamodding.EtUltra;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;

import java.util.concurrent.CompletableFuture;

// see https://github.com/Luohuayu/CatServer/blob/1c92118fcca69ffac97a48c8e1f6e1bb861b41d1/src/main/java/org/bukkit/loot/LootTables.java#L71 for some loot tables
public class EtUltraMobLootTables extends GlobalLootModifierProvider {
    public EtUltraMobLootTables(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, EtUltra.MOD_ID);
    }

    @Override
    protected void start() {
        //Remind me to make a tutorial

        /*
        add("example_item_from_igloo_chest", new EtUltraItemModifiers(new LootItemCondition[]{
                LootTableIdCondition.builder(ResourceLocation.parse("chests/igloo_chest")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()},
                ItemInit.EXAMPLE_ITEM.get()));

        add("example_item_from_iron_golem", new EtUltraItemModifiers(new LootItemCondition[]{
                LootTableIdCondition.builder(ResourceLocation.parse("entities/iron_golem")).build()},
                EtUltraItems.EXAMPLE_ITEM.get()));
         */
    }
}