package io.github.coolman4567.andonium.item

import io.github.coolman4567.andonium.item.ModItems.Andonium
import io.github.coolman4567.andonium.util.ModTags
import net.minecraft.world.item.ToolMaterial
import net.minecraft.world.item.crafting.Ingredient
import net.neoforged.neoforge.common.SimpleTier

object ModToolTiers {
    val ANDONIUM_PICKAXE: ToolMaterial = ToolMaterial(ModTags.Blocks.INCORRECT_FOR_ANDONIUM_TOOL, 3300, 65f, 6f, 58, ModTags.Items.ANDONIUM_REPAIR)
    val ANDONIUM_AXE: ToolMaterial = ToolMaterial(ModTags.Blocks.INCORRECT_FOR_ANDONIUM_TOOL, 3300, 65f, 6f, 58, ModTags.Items.ANDONIUM_REPAIR)
}
