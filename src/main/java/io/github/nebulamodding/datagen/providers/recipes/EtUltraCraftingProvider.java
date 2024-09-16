package io.github.nebulamodding.datagen.providers.recipes;

import io.github.nebulamodding.datagen.builders.EtUltraRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.RecipeOutput;

import java.util.concurrent.CompletableFuture;

public class EtUltraCraftingProvider extends EtUltraRecipes {
    private final RecipeOutput recipeOutput;


    public EtUltraCraftingProvider(DataGenerator generator, CompletableFuture<HolderLookup.Provider> pRegistries, RecipeOutput recipeOutput) {
        super(generator, pRegistries);
        this.recipeOutput = recipeOutput;
    }

    public void build() {
        // Recipe Stuff
    }
}