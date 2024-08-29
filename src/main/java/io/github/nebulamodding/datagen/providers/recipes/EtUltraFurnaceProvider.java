package io.github.nebulamodding.datagen.providers.recipes;

import io.github.nebulamodding.datagen.providers.EtUltraRecipeProvider;
import io.github.nebulamodding.registry.EtUltraTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.concurrent.CompletableFuture;

public class EtUltraFurnaceProvider extends EtUltraRecipeProvider {
    private final RecipeOutput recipeOutput;

    public EtUltraFurnaceProvider(DataGenerator generator, CompletableFuture<HolderLookup.Provider> pRegistries, RecipeOutput recipeOutput) {
        super(generator, pRegistries);
        this.recipeOutput = recipeOutput;
    }

    public void build() {
        //Remind me to make a tutorial on this

//        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EtUltraTags.EtUltraItemTags.EXAMPLE_RAW_TAG), RecipeCategory.MISC, ItemInit.EXAMPLE_ITEM, 0.6f, 300)
//                .unlockedBy("has_item", has(EtUltraTags.EtUltraItemTags.EXAMPLE_RAW_TAG))
//                .save(this.recipeOutput, getModId("example_item_smelting"));
//
//        SimpleCookingRecipeBuilder.blasting(Ingredient.of(TagsInit.ItemTagsInit.EXAMPLE_RAW_TAG), RecipeCategory.MISC, ItemInit.EXAMPLE_ITEM, 0.6f, 100)
//                .unlockedBy("has_item", has(TagsInit.ItemTagsInit.EXAMPLE_RAW_TAG))
//                .save(this.recipeOutput, getModId("example_item_blasting"));
    }
}