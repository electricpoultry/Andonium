package net.xboxman.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.xboxman.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIAMOND, 1)
                .requires(ModItems.DIAMOND_SHARD)
                .requires(ModItems.DIAMOND_SHARD)
                .requires(ModItems.DIAMOND_SHARD)
                .requires(ModItems.DIAMOND_SHARD)
                .unlockedBy("has_andonium", has(ModItems.ANDONIUM)).save(recipeOutput);
    }
}
