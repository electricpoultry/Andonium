package io.github.electricpoultry.andonium.item

import io.github.electricpoultry.andonium.item.ModItems.Andonium
import io.github.electricpoultry.andonium.util.ModTags
import net.minecraft.world.item.Tier
import net.minecraft.world.item.crafting.Ingredient
import net.neoforged.neoforge.common.SimpleTier

object ModToolTiers {
    val ANDONIUM_PICKAXE: Tier = SimpleTier(ModTags.Blocks.INCORRECT_FOR_ANDONIUM_TOOL, 3300, 65f, 6f, 58) { Ingredient.of(Andonium) }
    val ANDONIUM_AXE: Tier = SimpleTier(ModTags.Blocks.INCORRECT_FOR_ANDONIUM_TOOL, 3300, 35f, 6f, 58) { Ingredient.of(Andonium) }
}
