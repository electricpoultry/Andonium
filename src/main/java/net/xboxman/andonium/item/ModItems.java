package net.xboxman.andonium.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.xboxman.andonium.Andonium.MOD_ID;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredItem<Item> ANDONIUM = ITEMS.register("andonium", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard", () -> new Item(new Item.Properties()));

    public static final DeferredItem<PickaxeItem> ANDONIUM_PICKAXE = ITEMS.register("andonium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ANDONIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ANDONIUM, 6.0F, -1.0f))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
