package net.xboxman.andonium.item

import net.minecraft.world.item.Item
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredItem
import net.neoforged.neoforge.registries.DeferredRegister
import net.xboxman.andonium.Andonium
import java.util.function.Supplier

object KotlinModItems {
    val ITEMS: DeferredRegister.Items = DeferredRegister.createItems(Andonium.MOD_ID)

    val Kotonium: DeferredItem<Item> = ITEMS.register("kotonium", Supplier { Item(Item.Properties()) })

    fun register(eventBus: IEventBus) {
        ITEMS.register(eventBus)
    }
}
