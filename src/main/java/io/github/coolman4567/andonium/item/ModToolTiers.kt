package io.github.coolman4567.andonium.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import io.github.coolman4567.andonium.util.ModTags;

public class ModToolTiers {
    public static final Tier ANDONIUM_PICKAXE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ANDONIUM_TOOL,
            3300, 65f, 6f, 58, () -> Ingredient.of(ModItems.ANDONIUM));

    public static final Tier ANDONIUM_AXE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ANDONIUM_TOOL,
            3300, 35f, 6f, 58, () -> Ingredient.of(ModItems.ANDONIUM));
}
