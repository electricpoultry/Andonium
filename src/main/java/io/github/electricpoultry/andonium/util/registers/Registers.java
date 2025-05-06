package io.github.electricpoultry.andonium.util.registers;

import io.github.electricpoultry.andonium.block.ModBlocks;
import io.github.electricpoultry.andonium.item.ModCreativeModeTabs;
import io.github.electricpoultry.andonium.item.ModItems;
import net.neoforged.bus.api.IEventBus;

public class Registers {
    public static void registerAll(IEventBus eventBus) {
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModCreativeModeTabs.register(eventBus);
    }
}
