package io.github.electricpoultry.andonium.item

import io.github.electricpoultry.andonium.Andonium.MOD_ID
import io.github.electricpoultry.andonium.block.ModBlocks
import io.github.electricpoultry.andonium.item.ModItems.Andonium
import io.github.electricpoultry.andonium.item.ModItems.Andonium_Axe
import io.github.electricpoultry.andonium.item.ModItems.Andonium_Boots
import io.github.electricpoultry.andonium.item.ModItems.Andonium_Chestplate
import io.github.electricpoultry.andonium.item.ModItems.Andonium_Helmet
import io.github.electricpoultry.andonium.item.ModItems.Andonium_Leggings
import io.github.electricpoultry.andonium.item.ModItems.Andonium_Pickaxe
import io.github.electricpoultry.andonium.item.ModItems.Butter
import io.github.electricpoultry.andonium.item.ModItems.Cup
import io.github.electricpoultry.andonium.item.ModItems.Diamond_Shard
import io.github.electricpoultry.andonium.item.ModItems.Heavy_Cream
import io.github.electricpoultry.andonium.item.ModItems.Hot_Chocolate
import io.github.electricpoultry.andonium.item.ModItems.Hot_Chocolate_Powder
import io.github.electricpoultry.andonium.item.ModItems.Hot_Chocolate_Powder_With_Marshmallow
import io.github.electricpoultry.andonium.item.ModItems.Hot_Chocolate_With_Marshmallow
import io.github.electricpoultry.andonium.item.ModItems.Hot_Chocolate_With_Whipped_Cream
import io.github.electricpoultry.andonium.item.ModItems.Hot_Chocolate_With_Whipped_Cream_And_Marshmallow
import io.github.electricpoultry.andonium.item.ModItems.Kotonium
import io.github.electricpoultry.andonium.item.ModItems.Marshmallow
import io.github.electricpoultry.andonium.item.ModItems.Vanilla_Beans
import io.github.electricpoultry.andonium.item.ModItems.Vanilla_Extract
import io.github.electricpoultry.andonium.item.ModItems.Whipped_cream
import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.CreativeModeTab.ItemDisplayParameters
import net.minecraft.world.item.ItemStack
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredRegister
import java.util.function.Supplier

object ModCreativeModeTabs {
    val CREATIVE_MODE_TAB: DeferredRegister<CreativeModeTab> =
        DeferredRegister.create<CreativeModeTab>(Registries.CREATIVE_MODE_TAB, MOD_ID)

    val ANDONIUM_ITEMS_TAB: Supplier<CreativeModeTab> = CREATIVE_MODE_TAB.register(
        "andonium_items_tab",
        Supplier {
            CreativeModeTab.builder().icon { ItemStack(Andonium.get()) }
                .title(Component.translatable("creativetab.andonium.andonium_items"))
                .displayItems { itemDisplayParameters: ItemDisplayParameters?, output: CreativeModeTab.Output ->
                    output.accept(Andonium)
                    output.accept(Diamond_Shard)
                    output.accept(Andonium_Axe)
                    output.accept(Andonium_Pickaxe)
                    output.accept(Andonium_Helmet)
                    output.accept(Andonium_Chestplate)
                    output.accept(Andonium_Leggings)
                    output.accept(Andonium_Boots)
                    output.accept(Kotonium)
                    output.accept(Hot_Chocolate)
                    output.accept(Hot_Chocolate_With_Whipped_Cream)
                    output.accept(Hot_Chocolate_With_Marshmallow)
                    output.accept(Hot_Chocolate_With_Whipped_Cream_And_Marshmallow)
                    output.accept(Hot_Chocolate_Powder)
                    output.accept(Hot_Chocolate_Powder_With_Marshmallow)
                    output.accept(Whipped_cream)
                    output.accept(Marshmallow)
                    output.accept(Cup)
                    output.accept(Butter)
                    output.accept(Heavy_Cream)
                    output.accept(Vanilla_Beans)
                    output.accept(Vanilla_Extract)
                }.build()
        })

    val ANDONIUM_BLOCKS_TAB: Supplier<CreativeModeTab> = CREATIVE_MODE_TAB.register(
        "andonium_blocks_tab",
        Supplier {
            CreativeModeTab.builder().icon { ItemStack(ModBlocks.ANDONIUM_ORE.get()) }
                .title(Component.translatable("creativetab.andonium.andonium_blocks"))
                .displayItems { itemDisplayParameters: ItemDisplayParameters?, output: CreativeModeTab.Output ->
                    output.accept(ModBlocks.ANDONIUM_ORE)
                }.build()
        })

    fun register(eventBus: IEventBus) {
        CREATIVE_MODE_TAB.register(eventBus)
    }
}
