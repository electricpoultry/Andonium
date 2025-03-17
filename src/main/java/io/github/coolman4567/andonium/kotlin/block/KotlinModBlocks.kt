package io.github.coolman4567.andonium.kotlin.block

import io.github.coolman4567.andonium.Andonium
import io.github.coolman4567.andonium.item.ModItems
import net.minecraft.util.valueproviders.UniformInt
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.DropExperienceBlock
import net.minecraft.world.level.block.SoundType
import net.minecraft.world.level.block.state.BlockBehaviour
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredBlock
import net.neoforged.neoforge.registries.DeferredRegister
import java.util.function.Supplier

object KotlinModBlocks {
    val BLOCKS: DeferredRegister.Blocks = DeferredRegister.createBlocks(Andonium.MOD_ID)

    val KOTONIUM_ORE: DeferredBlock<Block> = registerBlock(
        "kotonium_ore"
    ) {
        DropExperienceBlock(
            UniformInt.of(2, 4),
            BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                .sound(SoundType.STONE)
        )
    }

    private fun <T : Block?> registerBlock(name: String, block: Supplier<T>): DeferredBlock<T> {
        val toReturn = BLOCKS.register(name, block)
        registerBlockItem(name, toReturn)
        return toReturn
    }

    private fun <T : Block?> registerBlockItem(name: String, block: DeferredBlock<T>) {
        ModItems.ITEMS.register(name, Supplier { BlockItem(block.get(), Item.Properties()) })
    }

    fun register(eventBus: IEventBus) {
        BLOCKS.register(eventBus)
    }
}
