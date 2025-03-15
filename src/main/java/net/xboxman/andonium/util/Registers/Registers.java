package net.xboxman.andonium.util.Registers;

import net.neoforged.bus.api.IEventBus;
import net.xboxman.andonium.block.ModBlocks;
import net.xboxman.andonium.item.KotlinModItems;
import net.xboxman.andonium.item.ModCreativeModeTabs;
import net.xboxman.andonium.item.ModItems;
import net.xboxman.andonium.util.ModMenus;

public class Registers {

    public static void registerAll(IEventBus eventBus) {
        ModItems.register(eventBus);
        KotlinModItems.INSTANCE.register(eventBus);
        ModBlocks.register(eventBus);
        ModCreativeModeTabs.register(eventBus);
        ModMenus.REGISTRY.register(eventBus);
    }
}
