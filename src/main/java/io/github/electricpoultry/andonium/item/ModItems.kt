package io.github.electricpoultry.andonium.item

import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredItem
import net.neoforged.neoforge.registries.DeferredRegister
import io.github.electricpoultry.andonium.Andonium.MOD_ID
import net.minecraft.world.item.*
import java.util.function.Supplier

object ModItems {
    val ITEMS: DeferredRegister.Items = DeferredRegister.createItems(MOD_ID)

    val Kotonium: DeferredItem<Item> = ITEMS.register("kotonium", Supplier { Item(Item.Properties()) })
    val Andonium: DeferredItem<Item> = ITEMS.register("andonium", Supplier { Item(Item.Properties()) })
    val Diamond_Shard: DeferredItem<Item> = ITEMS.register("diamond_shard", Supplier { Item(Item.Properties()) })
    val Andonium_Pickaxe: DeferredItem<PickaxeItem> = ITEMS.register("andonium_pickaxe", Supplier { PickaxeItem(ModToolTiers.ANDONIUM_PICKAXE, Item.Properties().rarity(Rarity.EPIC).attributes(PickaxeItem.createAttributes(ModToolTiers.ANDONIUM_PICKAXE, 6.0f, -2.0f))) })
    val Andonium_Axe: DeferredItem<AxeItem> = ITEMS.register("andonium_axe", Supplier { AxeItem(ModToolTiers.ANDONIUM_AXE, Item.Properties().rarity(Rarity.EPIC).attributes(AxeItem.createAttributes(ModToolTiers.ANDONIUM_AXE, 6.0f, -2.0f))) })
    val Andonium_Helmet: DeferredItem<ArmorItem> = ITEMS.register("andonium_helmet", Supplier { ArmorItem(ModArmorMaterials.ANDONIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))) })
    val Andonium_Chestplate: DeferredItem<ArmorItem> = ITEMS.register("andonium_chestplate", Supplier { ArmorItem(ModArmorMaterials.ANDONIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))) })
    val Andonium_Leggings: DeferredItem<ArmorItem> = ITEMS.register("andonium_leggings", Supplier { ArmorItem(ModArmorMaterials.ANDONIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))) })
    val Andonium_Boots: DeferredItem<ArmorItem> = ITEMS.register("andonium_boots", Supplier { ArmorItem(ModArmorMaterials.ANDONIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))) })
    val Hot_Chocolate: DeferredItem<Item> = ITEMS.register("hot_chocolate", Supplier { Item(Item.Properties().food(ModFoodProperties.HOT_CHOCOLATE)) })
    val Hot_Chocolate_With_Whipped_Cream: DeferredItem<Item> = ITEMS.register("hot_chocolate_with_whipped_cream", Supplier { Item(Item.Properties().food(ModFoodProperties.HOT_CHOCOLATE)) })
    val Hot_Chocolate_With_Marshmallow: DeferredItem<Item> = ITEMS.register("hot_chocolate_with_marshmallow", Supplier { Item(Item.Properties().food(ModFoodProperties.HOT_CHOCOLATE)) })
    val Hot_Chocolate_With_Whipped_Cream_And_Marshmallow: DeferredItem<Item> = ITEMS.register("hot_chocolate_with_whipped_cream_and_marshmallow", Supplier { Item(Item.Properties().food(ModFoodProperties.HOT_CHOCOLATE_WITH_WHIPPED_CREAM_AND_MARSHMALLOW)) })
    val Hot_Chocolate_Powder: DeferredItem<Item> = ITEMS.register("hot_chocolate_powder", Supplier { Item(Item.Properties()) })
    val Hot_Chocolate_Powder_With_Marshmallow: DeferredItem<Item> = ITEMS.register("hot_chocolate_powder_with_marshmallow", Supplier { Item(Item.Properties()) })
    val Whipped_cream: DeferredItem<Item> = ITEMS.register("whipped_cream", Supplier { Item(Item.Properties().food(ModFoodProperties.WHIPPED_CREAM)) })
    val Marshmallow: DeferredItem<Item> = ITEMS.register("marshmallow", Supplier { Item(Item.Properties().food(ModFoodProperties.MARSHMALLOW)) })
    val Cup: DeferredItem<Item> = ITEMS.register("cup", Supplier { Item(Item.Properties()) })
    val Butter: DeferredItem<Item> = ITEMS.register("butter", Supplier { Item(Item.Properties()) })
    val Heavy_Cream: DeferredItem<Item> = ITEMS.register("heavy_cream", Supplier { Item(Item.Properties()) })
    val Vanilla_Beans: DeferredItem<Item> = ITEMS.register("vanilla_beans", Supplier { Item(Item.Properties()) })
    val Vanilla_Extract: DeferredItem<Item> = ITEMS.register("vanilla_extract", Supplier { Item(Item.Properties()) })

    fun register(eventBus: IEventBus) {
        ITEMS.register(eventBus)
    }
}
