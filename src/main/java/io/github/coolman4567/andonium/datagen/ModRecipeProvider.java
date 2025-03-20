package io.github.coolman4567.andonium.datagen;

import io.github.coolman4567.andonium.kotlin.item.KotlinModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.BlastingRecipe;
import net.minecraft.world.item.crafting.CampfireCookingRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import io.github.coolman4567.andonium.block.ModBlocks;
import io.github.coolman4567.andonium.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static io.github.coolman4567.andonium.Andonium.MOD_ID;

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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, KotlinModItems.INSTANCE.getCup(), 1)
                .requires(Items.BUCKET)
                .unlockedBy("has_cup", has(KotlinModItems.INSTANCE.getCup())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ANDONIUM_PICKAXE.get())
                .pattern("ANA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.ANDONIUM.get())
                .define('S', Items.STICK)
                .define('N', Items.NETHERITE_PICKAXE)
                .unlockedBy("has_andonium", has(ModItems.ANDONIUM)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ANDONIUM_AXE.get())
                .pattern("AN ")
                .pattern("AS ")
                .pattern(" S ")
                .define('A', ModItems.ANDONIUM.get())
                .define('S', Items.STICK)
                .define('N', Items.NETHERITE_AXE)
                .unlockedBy("has_andonium", has(ModItems.ANDONIUM)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, KotlinModItems.INSTANCE.getHot_Chocolate())
                .pattern("CH ")
                .pattern("B  ")
                .pattern("   ")
                .define('C', KotlinModItems.INSTANCE.getCup())
                .define('H', KotlinModItems.INSTANCE.getHot_Chocolate_Powder())
                .define('B', Items.WATER_BUCKET)
                .unlockedBy("has_cup", has(KotlinModItems.INSTANCE.getCup())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, KotlinModItems.INSTANCE.getHot_Chocolate_With_Marshmallow())
                .pattern("CH ")
                .pattern("B  ")
                .pattern("   ")
                .define('C', KotlinModItems.INSTANCE.getCup())
                .define('H', KotlinModItems.INSTANCE.getHot_Chocolate_Powder_With_Marshmallow())
                .define('B', Items.WATER_BUCKET)
                .unlockedBy("has_hot_chocolate", has(KotlinModItems.INSTANCE.getHot_Chocolate())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, KotlinModItems.INSTANCE.getHot_Chocolate_With_Whipped_Cream())
                .pattern("CH ")
                .pattern("   ")
                .pattern("   ")
                .define('C', KotlinModItems.INSTANCE.getHot_Chocolate())
                .define('H', KotlinModItems.INSTANCE.getWhipped_cream())
                .unlockedBy("has_hot_chocolate", has(KotlinModItems.INSTANCE.getHot_Chocolate())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, KotlinModItems.INSTANCE.getHot_Chocolate_With_Whipped_Cream_And_Marshmallow())
                .pattern("CH ")
                .pattern("E  ")
                .pattern("   ")
                .define('C', KotlinModItems.INSTANCE.getHot_Chocolate())
                .define('H', KotlinModItems.INSTANCE.getWhipped_cream())
                .define('E', KotlinModItems.INSTANCE.getMarshmallow())
                .unlockedBy("has_hot_chocolate", has(KotlinModItems.INSTANCE.getHot_Chocolate())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, KotlinModItems.INSTANCE.getButter())
                .pattern("H  ")
                .pattern("   ")
                .pattern("   ")
                .define('H', Items.MILK_BUCKET)
                .unlockedBy("has_milk_bucket", has(Items.MILK_BUCKET)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, KotlinModItems.INSTANCE.getHeavy_Cream())
                .pattern("HB ")
                .pattern("   ")
                .pattern("   ")
                .define('H', Items.MILK_BUCKET)
                .define('B', KotlinModItems.INSTANCE.getButter())
                .unlockedBy("has_butter", has(KotlinModItems.INSTANCE.getButter())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, KotlinModItems.INSTANCE.getVanilla_Extract())
                .pattern("HB ")
                .pattern("   ")
                .pattern("   ")
                .define('H', Items.WATER_BUCKET)
                .define('B', KotlinModItems.INSTANCE.getVanilla_Beans())
                .unlockedBy("has_vanilla_beans", has(KotlinModItems.INSTANCE.getVanilla_Beans())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, KotlinModItems.INSTANCE.getWhipped_cream())
                .pattern("HB ")
                .pattern("T  ")
                .pattern("   ")
                .define('H', Items.SUGAR)
                .define('B', KotlinModItems.INSTANCE.getVanilla_Extract())
                .define('T', KotlinModItems.INSTANCE.getHeavy_Cream())
                .unlockedBy("has_sugar", has(Items.SUGAR)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, KotlinModItems.INSTANCE.getHot_Chocolate_Powder())
                .pattern("HB ")
                .pattern("T  ")
                .pattern("   ")
                .define('H', Items.SUGAR)
                .define('B', Items.COCOA_BEANS)
                .define('T', Items.MILK_BUCKET)
                .unlockedBy("has_sugar", has(Items.SUGAR)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, KotlinModItems.INSTANCE.getMarshmallow())
                .pattern("HB ")
                .pattern("T  ")
                .pattern("   ")
                .define('H', Items.SUGAR)
                .define('B', Items.WATER_BUCKET)
                .define('T', KotlinModItems.INSTANCE.getButter())
                .unlockedBy("has_butter", has(KotlinModItems.INSTANCE.getButter())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, KotlinModItems.INSTANCE.getHot_Chocolate_Powder_With_Marshmallow())
                .pattern("HB ")
                .pattern("   ")
                .pattern("   ")
                .define('H', KotlinModItems.INSTANCE.getHot_Chocolate_Powder())
                .define('B', KotlinModItems.INSTANCE.getMarshmallow())
                .unlockedBy("has_hot_chocolate_powder", has(KotlinModItems.INSTANCE.getHot_Chocolate_Powder())).save(recipeOutput);

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
