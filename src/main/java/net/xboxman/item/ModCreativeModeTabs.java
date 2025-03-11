package net.xboxman.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.xboxman.Andonium.MOD_ID;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final Supplier<CreativeModeTab> ANDONIUM_ITEMS_TAB = CREATIVE_MODE_TAB.register("andonium_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ANDONIUM.get()))
                    .title(Component.translatable("creativetab.andonium.andonium_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ANDONIUM);
                        output.accept(ModItems.DIAMOND_SHARD);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
