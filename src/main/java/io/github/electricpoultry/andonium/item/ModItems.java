package io.github.electricpoultry.andonium.item;

import io.github.electricpoultry.andonium.Andonium;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import static io.github.electricpoultry.andonium.Andonium.LOGGER;
import static io.github.electricpoultry.andonium.Andonium.MOD_ID;

public class ModItems {
    // Basic Items
    public static final Item ANDONIUM = registerItem("andonium", new Item(new Item.Settings()));
    public static final Item DIAMOND_SHARD = registerItem("diamond_shard", new Item(new Item.Settings()));

    // Tools
    public static final Item ANDONIUM_PICKAXE = registerItem("andonium_pickaxe",
            new PickaxeItem(ModToolMaterials.ANDONIUM_PICKAXE,
                    new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item ANDONIUM_AXE = registerItem("andonium_axe",
            new AxeItem(ModToolMaterials.ANDONIUM_AXE, new Item.Settings().rarity(Rarity.EPIC)));

    // Armor
    public static final Item ANDONIUM_HELMET = registerItem("andonium_helmet",
            new ArmorItem(ModArmorMaterials.ANDONIUM, ArmorItem.Type.HELMET,
                    new Item.Settings()));
    public static final Item ANDONIUM_CHESTPLATE = registerItem("andonium_chestplate",
            new ArmorItem(ModArmorMaterials.ANDONIUM, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
    public static final Item ANDONIUM_LEGGINGS = registerItem("andonium_leggings",
            new ArmorItem(ModArmorMaterials.ANDONIUM, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
    public static final Item ANDONIUM_BOOTS = registerItem("andonium_boots",
            new ArmorItem(ModArmorMaterials.ANDONIUM, ArmorItem.Type.BOOTS,
                    new Item.Settings()));

    // Food Items
    public static final Item HOT_CHOCOLATE = registerItem("hot_chocolate",
            new Item(new Item.Settings().food(ModFoodComponents.HOT_CHOCOLATE)));
    public static final Item HOT_CHOCOLATE_WITH_WHIPPED_CREAM = registerItem("hot_chocolate_with_whipped_cream",
            new Item(new Item.Settings().food(ModFoodComponents.HOT_CHOCOLATE)));
    public static final Item HOT_CHOCOLATE_WITH_MARSHMALLOW = registerItem("hot_chocolate_with_marshmallow",
            new Item(new Item.Settings().food(ModFoodComponents.HOT_CHOCOLATE)));
    public static final Item HOT_CHOCOLATE_WITH_WHIPPED_CREAM_AND_MARSHMALLOW = registerItem("hot_chocolate_with_whipped_cream_and_marshmallow",
            new Item(new Item.Settings().food(ModFoodComponents.HOT_CHOCOLATE_WITH_WHIPPED_CREAM_AND_MARSHMALLOW)));

    // Ingredients
    public static final Item HOT_CHOCOLATE_POWDER = registerItem("hot_chocolate_powder", new Item(new Item.Settings()));
    public static final Item HOT_CHOCOLATE_POWDER_WITH_MARSHMALLOW = registerItem("hot_chocolate_powder_with_marshmallow", new Item(new Item.Settings()));
    public static final Item WHIPPED_CREAM = registerItem("whipped_cream",
            new Item(new Item.Settings().food(ModFoodComponents.WHIPPED_CREAM)));
    public static final Item MARSHMALLOW = registerItem("marshmallow",
            new Item(new Item.Settings().food(ModFoodComponents.MARSHMALLOW)));
    public static final Item CUP = registerItem("cup", new Item(new Item.Settings()));
    public static final Item BUTTER = registerItem("butter", new Item(new Item.Settings()));
    public static final Item HEAVY_CREAM = registerItem("heavy_cream", new Item(new Item.Settings()));
    public static final Item VANILLA_BEANS = registerItem("vanilla_beans", new Item(new Item.Settings()));
    public static final Item VANILLA_EXTRACT = registerItem("vanilla_extract", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }

    public static void registerModItems() {
        LOGGER.info("Registering Mod Items for " + MOD_ID);
    }
}
