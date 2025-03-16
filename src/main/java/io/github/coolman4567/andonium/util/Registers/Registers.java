package io.github.coolman4567.andonium.util.Registers;

import net.neoforged.bus.api.IEventBus;
import io.github.coolman4567.andonium.block.ModBlocks;
import io.github.coolman4567.andonium.kotlin.item.KotlinModItems;
import io.github.coolman4567.andonium.item.ModCreativeModeTabs;
import io.github.coolman4567.andonium.item.ModItems;
import io.github.coolman4567.andonium.util.ModMenus;

public class Registers {

    public static void registerAll(IEventBus eventBus) {
        ModItems.register(eventBus);
        KotlinModItems.INSTANCE.register(eventBus);
        ModBlocks.register(eventBus);
        ModCreativeModeTabs.register(eventBus);
        ModMenus.REGISTRY.register(eventBus);
    }
}
