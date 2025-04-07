package io.github.electricpoultry.andonium.util

import io.github.electricpoultry.andonium.Andonium
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.BlockTags
import net.minecraft.tags.ItemTags
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block

class ModTags {
    object Blocks {
        val NEEDS_ANDONIUM_TOOL: TagKey<Block> = createTag("needs_andonium_tool")
        val INCORRECT_FOR_ANDONIUM_TOOL: TagKey<Block> = createTag("incorrect_for_andonium_tool")

        private fun createTag(name: String): TagKey<Block> {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Andonium.MOD_ID, name))
        }
    }

    object Items {
        val FAKE_TAG_ITEMS: TagKey<Item> = createTag("fake_tag_items")
        val ANDONIUM_REPAIR: TagKey<Item> = createTag("andonium_repair")

        private fun createTag(name: String): TagKey<Item> {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Andonium.MOD_ID, name))
        }
    }
}
