package io.github.nebulamodding.datagen.providers.recipes;

import io.github.nebulamodding.datagen.builders.EURecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.RecipeOutput;

import java.util.concurrent.CompletableFuture;

public class EUFurnaceProvider extends EURecipes {
    private final RecipeOutput recipeOutput;

    public EUFurnaceProvider(DataGenerator generator, CompletableFuture<HolderLookup.Provider> registries, RecipeOutput recipeOutput) {
        super(generator, registries);
        this.recipeOutput = recipeOutput;
    }

    public void build() {
        //Remind me to make a tutorial on this
        // This is your friendly reminder to make a tutorial on this (-Emma)

//        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EtUltraTags.EUItemTags.EXAMPLE_RAW_TAG), RecipeCategory.MISC, ItemInit.EXAMPLE_ITEM, 0.6f, 300)
//                .unlockedBy("has_item", has(EtUltraTags.EUItemTags.EXAMPLE_RAW_TAG))
//                .save(this.recipeOutput, getModId("example_item_smelting"));
//
//        SimpleCookingRecipeBuilder.blasting(Ingredient.of(TagsInit.ItemTagsInit.EXAMPLE_RAW_TAG), RecipeCategory.MISC, ItemInit.EXAMPLE_ITEM, 0.6f, 100)
//                .unlockedBy("has_item", has(TagsInit.ItemTagsInit.EXAMPLE_RAW_TAG))
//                .save(this.recipeOutput, getModId("example_item_blasting"));
    }
}