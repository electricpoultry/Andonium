package io.github.coolman4567.andonium.util;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import io.github.coolman4567.andonium.Andonium;
import io.github.coolman4567.andonium.client.inventory.ModIntroBookScreen;

public class ModMenus {
    public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, Andonium.MOD_ID);
    public static final DeferredHolder<MenuType<?>, MenuType<ModIntroBookScreen>> ANDONIUMBOOKGUI = REGISTRY.register("andoniumbookgui", () -> IMenuTypeExtension.create(ModIntroBookScreen::new));
}
