package io.github.coolman4567.andonium.item

import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredItem
import net.neoforged.neoforge.registries.DeferredRegister
import io.github.coolman4567.andonium.Andonium.MOD_ID
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.*
import net.minecraft.world.item.equipment.ArmorType
import java.util.function.Supplier

object ModItems {
    val ITEMS: DeferredRegister.Items = DeferredRegister.createItems(MOD_ID)

    val Kotonium: DeferredItem<Item> = ITEMS.register("kotonium", Supplier { Item(Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "kotonium")))) })
    val Andonium: DeferredItem<Item> = ITEMS.register("andonium", Supplier { Item(Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "andonium")))) })
    val Diamond_Shard: DeferredItem<Item> = ITEMS.register("diamond_shard", Supplier { Item(Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "diamond_shard")))) })
    val Andonium_Pickaxe: DeferredItem<Item> = ITEMS.register("andonium_pickaxe", Supplier { Item(Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "andonium_pickaxe"))) .pickaxe(ModToolTiers.ANDONIUM_PICKAXE, 6.0f, -2.0f).rarity(Rarity.EPIC)) })
    val Andonium_Axe: DeferredItem<AxeItem> = ITEMS.register("andonium_axe", Supplier { AxeItem(ModToolTiers.ANDONIUM_AXE, 35f, 35f, Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "andonium_axe"))).rarity(Rarity.EPIC).axe(ModToolTiers.ANDONIUM_AXE, 6.0f, -2.0f)) })
    val Andonium_Helmet: DeferredItem<Item> = ITEMS.register("andonium_helmet", Supplier { Item(Item.Properties().humanoidArmor(ModArmorMaterials.ANDONIUM_ARMOR_MATERIAL, ArmorType.HELMET).durability(ArmorType.HELMET.getDurability(15)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "andonium_helmet")))) })
    val Andonium_Chestplate: DeferredItem<Item> = ITEMS.register("andonium_chestplate", Supplier { Item(Item.Properties().humanoidArmor(ModArmorMaterials.ANDONIUM_ARMOR_MATERIAL, ArmorType.CHESTPLATE).durability(ArmorType.CHESTPLATE.getDurability(15)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "andonium_chestplate")))) })
    val Andonium_Leggings: DeferredItem<Item> = ITEMS.register("andonium_leggings", Supplier { Item(Item.Properties().humanoidArmor(ModArmorMaterials.ANDONIUM_ARMOR_MATERIAL, ArmorType.LEGGINGS).durability(ArmorType.LEGGINGS.getDurability(15)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "andonium_leggings")))) })
    val Andonium_Boots: DeferredItem<Item> = ITEMS.register("andonium_boots", Supplier { Item(Item.Properties().humanoidArmor(ModArmorMaterials.ANDONIUM_ARMOR_MATERIAL, ArmorType.BOOTS).durability(ArmorType.BOOTS.getDurability(15)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "andonium_boots")))) })
    val Hot_Chocolate: DeferredItem<Item> = ITEMS.register("hot_chocolate", Supplier { Item(Item.Properties().food(ModFoodProperties.HOT_CHOCOLATE).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "hot_chocolate")))) })
    val Hot_Chocolate_With_Whipped_Cream: DeferredItem<Item> = ITEMS.register("hot_chocolate_with_whipped_cream", Supplier { Item(Item.Properties().food(ModFoodProperties.HOT_CHOCOLATE).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "hot_chocolate_with_whipped_cream")))) })
    val Hot_Chocolate_With_Marshmallow: DeferredItem<Item> = ITEMS.register("hot_chocolate_with_marshmallow", Supplier { Item(Item.Properties().food(ModFoodProperties.HOT_CHOCOLATE).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "hot_chocolate_with_marshmallow")))) })
    val Hot_Chocolate_With_Whipped_Cream_And_Marshmallow: DeferredItem<Item> = ITEMS.register("hot_chocolate_with_whipped_cream_and_marshmallow", Supplier { Item(Item.Properties().food(ModFoodProperties.HOT_CHOCOLATE_WITH_WHIPPED_CREAM_AND_MARSHMALLOW).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "hot_chocolate_with_whipped_cream_and_marshmallow")))) })
    val Hot_Chocolate_Powder: DeferredItem<Item> = ITEMS.register("hot_chocolate_powder", Supplier { Item(Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "hot_chocolate_powder")))) })
    val Hot_Chocolate_Powder_With_Marshmallow: DeferredItem<Item> = ITEMS.register("hot_chocolate_powder_with_marshmallow", Supplier { Item(Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "hot_chocolate_powder_with_marshmallow")))) })
    val Whipped_cream: DeferredItem<Item> = ITEMS.register("whipped_cream", Supplier { Item(Item.Properties().food(ModFoodProperties.WHIPPED_CREAM).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "whipped_cream")))) })
    val Marshmallow: DeferredItem<Item> = ITEMS.register("marshmallow", Supplier { Item(Item.Properties().food(ModFoodProperties.MARSHMALLOW).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "marshmallow")))) })
    val Cup: DeferredItem<Item> = ITEMS.register("cup", Supplier { Item(Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "cup")))) })
    val Butter: DeferredItem<Item> = ITEMS.register("butter", Supplier { Item(Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "butter")))) })
    val Heavy_Cream: DeferredItem<Item> = ITEMS.register("heavy_cream", Supplier { Item(Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "heavy_cream")))) })
    val Vanilla_Beans: DeferredItem<Item> = ITEMS.register("vanilla_beans", Supplier { Item(Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "vanilla_beans")))) })
    val Vanilla_Extract: DeferredItem<Item> = ITEMS.register("vanilla_extract", Supplier { Item(Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "vanilla_extract")))) })

    fun register(eventBus: IEventBus) {
        ITEMS.register(eventBus)
    }
}
