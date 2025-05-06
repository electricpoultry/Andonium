package io.github.electricpoultry.andonium.item;

import io.github.electricpoultry.andonium.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier ANDONIUM_PICKAXE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ANDONIUM_TOOL, 3300, 65f, 6f, 58, () -> Ingredient.of(ModItems.ANDONIUM.get()));
    public static final Tier ANDONIUM_AXE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ANDONIUM_TOOL, 3300, 35f, 6f, 58, () -> Ingredient.of(ModItems.ANDONIUM.get()));
}
