package io.github.coolman4567.andonium.kotlin.util.registers

import io.github.coolman4567.andonium.block.ModBlocks
import io.github.coolman4567.andonium.item.ModCreativeModeTabs
import io.github.coolman4567.andonium.item.ModItems
import io.github.coolman4567.andonium.kotlin.block.KotlinModBlocks
import io.github.coolman4567.andonium.kotlin.item.KotlinModItems
import io.github.coolman4567.andonium.util.ModMenus
import net.neoforged.bus.api.IEventBus

object Registers {
    @JvmStatic
    fun registerAll(eventBus: IEventBus) {
        ModItems.register(eventBus)
        KotlinModItems.register(eventBus)
        KotlinModBlocks.register(eventBus)
        ModBlocks.register(eventBus)
        ModCreativeModeTabs.register(eventBus)
        ModMenus.REGISTRY.register(eventBus)
    }
}
