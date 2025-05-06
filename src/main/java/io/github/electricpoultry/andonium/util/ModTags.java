package io.github.electricpoultry.andonium.util;

import io.github.electricpoultry.andonium.Andonium;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_ANDONIUM_TOOL = createTag("needs_andonium_tool");
        public static final TagKey<Block> INCORRECT_FOR_ANDONIUM_TOOL = createTag("incorrect_for_andonium_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Andonium.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> FAKE_TAG_ITEMS = createTag("fake_tag_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Andonium.MOD_ID, name));
        }
    }
}
