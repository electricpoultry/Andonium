package io.github.coolman4567.andonium.item;

import io.github.coolman4567.andonium.kotlin.item.KotlinModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import io.github.coolman4567.andonium.block.ModBlocks;

import java.util.function.Supplier;

import static io.github.coolman4567.andonium.Andonium.MOD_ID;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final Supplier<CreativeModeTab> ANDONIUM_ITEMS_TAB = CREATIVE_MODE_TAB.register("andonium_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ANDONIUM.get()))
                    .title(Component.translatable("creativetab.andonium.andonium_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ANDONIUM);
                        output.accept(ModItems.DIAMOND_SHARD);
                        output.accept(ModItems.ANDONIUM_PICKAXE);
                        output.accept(ModItems.ANDONIUM_HELMET);
                        output.accept(ModItems.ANDONIUM_CHESTPLATE);
                        output.accept(ModItems.ANDONIUM_LEGGINGS);
                        output.accept(ModItems.ANDONIUM_BOOTS);
                        output.accept(ModItems.INTRO_BOOK);
                        output.accept(KotlinModItems.INSTANCE.getKotonium());
                        output.accept(KotlinModItems.INSTANCE.getHot_Chocolate());
                        output.accept(KotlinModItems.INSTANCE.getHot_Chocolate_With_Whipped_Cream());
                        output.accept(KotlinModItems.INSTANCE.getHot_Chocolate_With_Marshmallow());
                        output.accept(KotlinModItems.INSTANCE.getHot_Chocolate_With_Whipped_Cream_And_Marshmallow());
                        output.accept(KotlinModItems.INSTANCE.getHot_Chocolate_Powder());
                        output.accept(KotlinModItems.INSTANCE.getHot_Chocolate_Powder_With_Marshmallow());
                        output.accept(KotlinModItems.INSTANCE.getWhipped_cream());
                        output.accept(KotlinModItems.INSTANCE.getMarshmallow());
                        output.accept(KotlinModItems.INSTANCE.getCup());
                        output.accept(KotlinModItems.INSTANCE.getButter());
                        output.accept(KotlinModItems.INSTANCE.getHeavy_Cream());
                        output.accept(KotlinModItems.INSTANCE.getVanilla_Beans());
                        output.accept(KotlinModItems.INSTANCE.getVanilla_Extract());
                    }).build());

    public static final Supplier<CreativeModeTab> ANDONIUM_BLOCKS_TAB = CREATIVE_MODE_TAB.register("andonium_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ANDONIUM_ORE.get()))
                    .title(Component.translatable("creativetab.andonium.andonium_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ANDONIUM_ORE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
