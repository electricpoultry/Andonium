package io.github.coolman4567.andonium.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import io.github.coolman4567.andonium.item.custom.ModintroBook;

import static io.github.coolman4567.andonium.Andonium.MOD_ID;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredItem<Item> ANDONIUM = ITEMS.register("andonium", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard", () -> new Item(new Item.Properties()));

    public static final DeferredItem<PickaxeItem> ANDONIUM_PICKAXE = ITEMS.register("andonium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ANDONIUM_PICKAXE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ANDONIUM_PICKAXE, 6.0F, -2.0f))));

    public static final DeferredItem<AxeItem> ANDONIUM_AXE = ITEMS.register("andonium_axe",
            () -> new AxeItem(ModToolTiers.ANDONIUM_AXE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ANDONIUM_AXE, 6.0F, -2.0f))));

    public static final DeferredItem<ArmorItem> ANDONIUM_HELMET = ITEMS.register("andonium_helmet",
            () -> new ArmorItem(ModArmorMaterials.ANDONIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<ArmorItem> ANDONIUM_CHESTPLATE = ITEMS.register("andonium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ANDONIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<ArmorItem> ANDONIUM_LEGGINGS = ITEMS.register("andonium_leggings",
            () -> new ArmorItem(ModArmorMaterials.ANDONIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<ArmorItem> ANDONIUM_BOOTS = ITEMS.register("andonium_boots",
            () -> new ArmorItem(ModArmorMaterials.ANDONIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));

    public static final DeferredItem<Item> INTRO_BOOK = ITEMS.register("andonium_intro_book", ModintroBook::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
