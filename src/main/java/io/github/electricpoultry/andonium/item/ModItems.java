package io.github.electricpoultry.andonium.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static io.github.electricpoultry.andonium.Andonium.MOD_ID;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(BuiltInRegistries.ITEM, MOD_ID);

    // Ingots and Shards
    public static final DeferredHolder<Item, Item> ANDONIUM = ITEMS.register("andonium",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> DIAMOND_SHARD = ITEMS.register("diamond_shard",
            () -> new Item(new Item.Properties()));

    // Tools
    public static final DeferredHolder<Item, PickaxeItem> ANDONIUM_PICKAXE = ITEMS.register("andonium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ANDONIUM_PICKAXE, new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ANDONIUM_PICKAXE, 6.0f, -2.0f))));

    public static final DeferredHolder<Item, AxeItem> ANDONIUM_AXE = ITEMS.register("andonium_axe",
            () -> new AxeItem(ModToolTiers.ANDONIUM_AXE, new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .attributes(AxeItem.createAttributes(ModToolTiers.ANDONIUM_AXE, 6.0f, -2.0f))));

    public static final DeferredHolder<Item, ShovelItem> ANDONIUM_SHOVEL = ITEMS.register("andonium_shovel",
            () -> new ShovelItem(ModToolTiers.ANDONIUM_PICKAXE, new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ANDONIUM_PICKAXE, 6.0f, -2.0f))));

    public static final DeferredHolder<Item, HoeItem> ANDONIUM_HOE = ITEMS.register("andonium_hoe",
            () -> new HoeItem(ModToolTiers.ANDONIUM_AXE, new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .attributes(HoeItem.createAttributes(ModToolTiers.ANDONIUM_AXE, 6.0f, -2.0f))));

    public static final DeferredHolder<Item, ArmorItem> ANDONIUM_HELMET = ITEMS.register("andonium_helmet",
            () -> new ArmorItem(ModArmorMaterials.ANDONIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final DeferredHolder<Item, ArmorItem> ANDONIUM_CHESTPLATE = ITEMS.register("andonium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ANDONIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final DeferredHolder<Item, ArmorItem> ANDONIUM_LEGGINGS = ITEMS.register("andonium_leggings",
            () -> new ArmorItem(ModArmorMaterials.ANDONIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final DeferredHolder<Item, ArmorItem> ANDONIUM_BOOTS = ITEMS.register("andonium_boots",
            () -> new ArmorItem(ModArmorMaterials.ANDONIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()));

    // Food and Drinks
    public static final DeferredHolder<Item, Item> HOT_CHOCOLATE = ITEMS.register("hot_chocolate",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HOT_CHOCOLATE)));
    public static final DeferredHolder<Item, Item> HOT_CHOCOLATE_WITH_WHIPPED_CREAM = ITEMS.register("hot_chocolate_with_whipped_cream",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HOT_CHOCOLATE))); // Assuming same food prop as base
    public static final DeferredHolder<Item, Item> HOT_CHOCOLATE_WITH_MARSHMALLOW = ITEMS.register("hot_chocolate_with_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HOT_CHOCOLATE))); // Assuming same food prop as base
    public static final DeferredHolder<Item, Item> HOT_CHOCOLATE_WITH_WHIPPED_CREAM_AND_MARSHMALLOW = ITEMS.register("hot_chocolate_with_whipped_cream_and_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HOT_CHOCOLATE_WITH_WHIPPED_CREAM_AND_MARSHMALLOW)));

    // Food Ingredients & Misc
    public static final DeferredHolder<Item, Item> HOT_CHOCOLATE_POWDER = ITEMS.register("hot_chocolate_powder",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> HOT_CHOCOLATE_POWDER_WITH_MARSHMALLOW = ITEMS.register("hot_chocolate_powder_with_marshmallow",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> WHIPPED_CREAM = ITEMS.register("whipped_cream",
            () -> new Item(new Item.Properties().food(ModFoodProperties.WHIPPED_CREAM)));
    public static final DeferredHolder<Item, Item> MARSHMALLOW = ITEMS.register("marshmallow",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MARSHMALLOW)));
    public static final DeferredHolder<Item, Item> CUP = ITEMS.register("cup",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> BUTTER = ITEMS.register("butter",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> HEAVY_CREAM = ITEMS.register("heavy_cream",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> VANILLA_BEANS = ITEMS.register("vanilla_beans",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> VANILLA_EXTRACT = ITEMS.register("vanilla_extract",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
