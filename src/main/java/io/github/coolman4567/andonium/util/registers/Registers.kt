package io.github.coolman4567.andonium.util.registers

import io.github.coolman4567.andonium.item.ModCreativeModeTabs
import io.github.coolman4567.andonium.block.ModBlocks
import io.github.coolman4567.andonium.item.ModItems
import net.neoforged.bus.api.IEventBus

object Registers {
    @JvmStatic
    fun registerAll(eventBus: IEventBus) {
        ModItems.register(eventBus)
        ModBlocks.register(eventBus)
        ModCreativeModeTabs.register(eventBus)
    }
}
