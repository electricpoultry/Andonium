package net.xboxman.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CampfireCookingRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.xboxman.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> ANDONIUM_TO_DIAMOND_SHARDS = List.of(ModItems.ANDONIUM);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIAMOND, 1)
                .requires(ModItems.DIAMOND_SHARD)
                .requires(ModItems.DIAMOND_SHARD)
                .requires(ModItems.DIAMOND_SHARD)
                .requires(ModItems.DIAMOND_SHARD)
                .unlockedBy("has_andonium", has(ModItems.ANDONIUM)).save(recipeOutput);

        campfireCooking(recipeOutput, ANDONIUM_TO_DIAMOND_SHARDS, RecipeCategory.MISC, ModItems.DIAMOND_SHARD.get(), 2f, 620, "diamond_andonium");
    }

    protected static void campfireCooking(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.CAMPFIRE_COOKING_RECIPE, CampfireCookingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }
}
