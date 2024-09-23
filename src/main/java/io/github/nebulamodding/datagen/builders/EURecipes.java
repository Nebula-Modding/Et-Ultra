package io.github.nebulamodding.datagen.builders;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.datagen.providers.recipes.EUCraftingProvider;
import io.github.nebulamodding.datagen.providers.recipes.EUFurnaceProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class EURecipes extends RecipeProvider {
    protected final DataGenerator generator;
    private final CompletableFuture<HolderLookup.Provider> registries;

    public EURecipes(DataGenerator generator, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(generator.getPackOutput(), pRegistries);
        this.generator = generator;
        this.registries = pRegistries;
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        new EUCraftingProvider(generator, registries, recipeOutput).build();
        new EUFurnaceProvider(generator, registries, recipeOutput).build();
    }

    public ResourceLocation getModId(String path) {
        return ResourceLocation.fromNamespaceAndPath(EtUltra.MOD_ID, path);
    }
}