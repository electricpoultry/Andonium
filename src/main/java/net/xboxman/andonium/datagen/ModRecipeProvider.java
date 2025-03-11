package net.xboxman.andonium.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.BlastingRecipe;
import net.minecraft.world.item.crafting.CampfireCookingRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.xboxman.andonium.block.ModBlocks;
import net.xboxman.andonium.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> ANDONIUM_TO_DIAMOND_SHARDS = List.of(ModItems.ANDONIUM);

        List<ItemLike> ANDONIUM_ORE_SMELTABLES = List.of(ModBlocks.ANDONIUM_ORE);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIAMOND, 1)
                .requires(ModItems.DIAMOND_SHARD)
                .requires(ModItems.DIAMOND_SHARD)
                .requires(ModItems.DIAMOND_SHARD)
                .requires(ModItems.DIAMOND_SHARD)
                .unlockedBy("has_andonium", has(ModItems.ANDONIUM)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ANDONIUM_PICKAXE.get())
                .pattern("ANA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.ANDONIUM.get())
                .define('S', Items.STICK)
                .define('N', Items.NETHERITE_PICKAXE)
                .unlockedBy("has_andonium", has(ModItems.ANDONIUM)).save(recipeOutput);

        campfireCooking(recipeOutput, ANDONIUM_TO_DIAMOND_SHARDS, RecipeCategory.MISC, ModItems.DIAMOND_SHARD.get(), 2f, 620, "diamond_andonium");

        oreSmelting(recipeOutput, ANDONIUM_ORE_SMELTABLES, RecipeCategory.MISC, ModItems.ANDONIUM.get(), 1f, 200, "andonium_smelting");
        oreBlasting(recipeOutput, ANDONIUM_ORE_SMELTABLES, RecipeCategory.MISC, ModItems.ANDONIUM.get(), 1f, 100, "andonium_smelting");
    }

    protected static void campfireCooking(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.CAMPFIRE_COOKING_RECIPE, CampfireCookingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

}
