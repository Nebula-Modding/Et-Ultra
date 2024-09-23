package io.github.nebulamodding.datagen.providers.recipes;

import io.github.nebulamodding.datagen.builders.EURecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.RecipeOutput;

import java.util.concurrent.CompletableFuture;

public class EUCraftingProvider extends EURecipes {
    private final RecipeOutput recipeOutput;

    public EUCraftingProvider(DataGenerator generator, CompletableFuture<HolderLookup.Provider> registries, RecipeOutput recipeOutput) {
        super(generator, registries);
        this.recipeOutput = recipeOutput;
    }

    public void build() {
        // Recipe Stuff
    }
}