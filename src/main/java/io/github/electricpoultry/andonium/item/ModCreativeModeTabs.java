package io.github.electricpoultry.andonium.item;

import java.util.function.Supplier;

import io.github.electricpoultry.andonium.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static io.github.electricpoultry.andonium.Andonium.MOD_ID;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final Supplier<CreativeModeTab> ANDONIUM_ITEMS_TAB = CREATIVE_MODE_TAB.register(
            "andonium_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ANDONIUM.get()))
                    .title(Component.translatable("creativetab.andonium.andonium_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ANDONIUM.get());
                        output.accept(ModItems.DIAMOND_SHARD.get());
                        output.accept(ModItems.HOT_CHOCOLATE.get());
                        output.accept(ModItems.HOT_CHOCOLATE_WITH_WHIPPED_CREAM.get());
                        output.accept(ModItems.HOT_CHOCOLATE_WITH_MARSHMALLOW.get());
                        output.accept(ModItems.HOT_CHOCOLATE_WITH_WHIPPED_CREAM_AND_MARSHMALLOW.get());
                        output.accept(ModItems.HOT_CHOCOLATE_POWDER.get());
                        output.accept(ModItems.HOT_CHOCOLATE_POWDER_WITH_MARSHMALLOW.get());
                        output.accept(ModItems.WHIPPED_CREAM.get());
                        output.accept(ModItems.MARSHMALLOW.get());
                        output.accept(ModItems.CUP.get());
                        output.accept(ModItems.BUTTER.get());
                        output.accept(ModItems.HEAVY_CREAM.get());
                        output.accept(ModItems.VANILLA_BEANS.get());
                        output.accept(ModItems.VANILLA_EXTRACT.get());
                    })
                    .build());

    public static final Supplier<CreativeModeTab> ANDONIUM_BLOCKS_TAB = CREATIVE_MODE_TAB.register(
            "andonium_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.ANDONIUM_ORE.get())) // Assuming ModBlocks.ANDONIUM_ORE is a Supplier<Block>
                    .title(Component.translatable("creativetab.andonium.andonium_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ANDONIUM_ORE.get());
                        output.accept(ModBlocks.ANDONIUM_DEEPSLATE_ORE.get());
                    })
                    .build());

    public static final Supplier<CreativeModeTab> ANDONIUM_EQUIPMENT_TAB = CREATIVE_MODE_TAB.register(
            "andonium_equipment_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ANDONIUM_AXE.get())) // Assuming ModBlocks.ANDONIUM_ORE is a Supplier<Block>
                    .title(Component.translatable("creativetab.andonium.andonium_equipment"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ANDONIUM_AXE.get());
                        output.accept(ModItems.ANDONIUM_PICKAXE.get());
                        output.accept(ModItems.ANDONIUM_HELMET.get());
                        output.accept(ModItems.ANDONIUM_CHESTPLATE.get());
                        output.accept(ModItems.ANDONIUM_LEGGINGS.get());
                        output.accept(ModItems.ANDONIUM_BOOTS.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
