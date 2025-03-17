package io.github.coolman4567.andonium.kotlin.item

import net.minecraft.world.item.Item
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredItem
import net.neoforged.neoforge.registries.DeferredRegister
import io.github.coolman4567.andonium.Andonium
import io.github.coolman4567.andonium.item.ModFoodProperties
import java.util.function.Supplier

object KotlinModItems {
    val ITEMS: DeferredRegister.Items = DeferredRegister.createItems(Andonium.MOD_ID)

    val Kotonium: DeferredItem<Item> = ITEMS.register("kotonium", Supplier { Item(Item.Properties()) })
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
