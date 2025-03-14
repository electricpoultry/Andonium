package net.xboxman.andonium.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.xboxman.andonium.util.ModTags;

public class ModToolTiers {
    public static final Tier ANDONIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ANDONIUM_TOOL,
            2200, 19f, 0f, 58, () -> Ingredient.of(ModItems.ANDONIUM));
}
