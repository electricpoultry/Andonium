package io.github.coolman4567.andonium.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static io.github.coolman4567.andonium.Andonium.MOD_ID;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_ANDONIUM_TOOL = createTag("needs_andonium_tool");
        public static final TagKey<Block> INCORRECT_FOR_ANDONIUM_TOOL = createTag("incorrect_for_andonium_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> FAKE_TAG_ITEMS = createTag("fake_tag_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MOD_ID, name));
        }
    }
}
