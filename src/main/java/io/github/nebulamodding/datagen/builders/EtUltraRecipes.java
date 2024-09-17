package io.github.nebulamodding.datagen.builders;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.datagen.providers.recipes.EtUltraCraftingProvider;
import io.github.nebulamodding.datagen.providers.recipes.EtUltraFurnaceProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class EtUltraRecipes extends RecipeProvider {
    protected final DataGenerator generator;
    private final CompletableFuture<HolderLookup.Provider> registries;

    public EtUltraRecipes(DataGenerator generator, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(generator.getPackOutput(), pRegistries);
        this.generator = generator;
        this.registries = pRegistries;
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        new EtUltraCraftingProvider(generator, registries, recipeOutput).build();
        new EtUltraFurnaceProvider(generator, registries, recipeOutput).build();
    }

    public ResourceLocation getModId(String path) {
        return ResourceLocation.fromNamespaceAndPath(EtUltra.MOD_ID, path);
    }
}