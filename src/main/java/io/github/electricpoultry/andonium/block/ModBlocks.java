package io.github.electricpoultry.andonium.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import static io.github.electricpoultry.andonium.Andonium.LOGGER;
import static io.github.electricpoultry.andonium.Andonium.MOD_ID;

public class ModBlocks {
    public static final Block ANDONIUM_ORE = registerBlock("andonium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.create().strength(2f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDONIUM_DEEPSLATE_ORE = registerBlock("andonium_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        LOGGER.info("Registering Mod Blocks for " + MOD_ID);
    }
}
