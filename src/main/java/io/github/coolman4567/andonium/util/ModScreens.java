package io.github.coolman4567.andonium.util;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import io.github.coolman4567.andonium.client.gui.ModIntroBookGUI;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModScreens {
    @SubscribeEvent
    public static void clientLoad(RegisterMenuScreensEvent event) {
        event.register(ModMenus.ANDONIUMBOOKGUI.get(), ModIntroBookGUI::new);
    }
}
