package io.github.nebulamodding.datagen.providers;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.datagen.providers.recipes.EtUltraCraftingProvider;
import io.github.nebulamodding.datagen.providers.recipes.EtUltraFurnaceProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;

import java.util.concurrent.CompletableFuture;

public class EtUltraRecipeProvider extends RecipeProvider {
    protected final DataGenerator generator;
    private final CompletableFuture<HolderLookup.Provider> registries;

    public EtUltraRecipeProvider(DataGenerator generator, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(generator.getPackOutput(), pRegistries);
        this.generator = generator;
        this.registries = pRegistries;
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        new EtUltraCraftingProvider(generator, registries, pRecipeOutput).build();
        new EtUltraFurnaceProvider(generator, registries, pRecipeOutput).build();
    }

    public ResourceLocation getModId(String path) {
        return ResourceLocation.fromNamespaceAndPath(EtUltra.MOD_ID, path);
    }
}