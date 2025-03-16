package io.github.coolman4567.andonium.item.inventory;

import net.neoforged.neoforge.items.ComponentItemHandler;
import net.neoforged.neoforge.event.entity.item.ItemTossEvent;
import net.neoforged.neoforge.common.MutableDataComponentHolder;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;
import net.minecraft.client.Minecraft;

import io.github.coolman4567.andonium.client.gui.ModIntroBookGUI;
import io.github.coolman4567.andonium.item.ModItems;

import javax.annotation.Nonnull;

public class AndoniumModIntroBookInventoryCapability extends ComponentItemHandler {
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onItemDropped(ItemTossEvent event) {
        if (event.getEntity().getItem().getItem() == ModItems.INTRO_BOOK.get()) {
            if (Minecraft.getInstance().screen instanceof ModIntroBookGUI) {
                Minecraft.getInstance().player.closeContainer();
            }
        }
    }

    public AndoniumModIntroBookInventoryCapability(MutableDataComponentHolder parent) {
        super(parent, DataComponents.CONTAINER, 0);
    }

    @Override
    public int getSlotLimit(int slot) {
        return 64;
    }

    @Override
    public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
        return stack.getItem() != ModItems.INTRO_BOOK.get();
    }

    @Override
    public ItemStack getStackInSlot(int slot) {
        return super.getStackInSlot(slot).copy();
    }
}
