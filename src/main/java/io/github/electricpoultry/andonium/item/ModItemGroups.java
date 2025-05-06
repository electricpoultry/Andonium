package io.github.electricpoultry.andonium.item;

import io.github.electricpoultry.andonium.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static io.github.electricpoultry.andonium.Andonium.LOGGER;
import static io.github.electricpoultry.andonium.Andonium.MOD_ID;

public class ModItemGroups {
    public static final ItemGroup ANDONIUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MOD_ID, "andonium_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ANDONIUM))
                    .displayName(Text.translatable("creativetab.andonium.andonium_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ANDONIUM);
                        entries.add(ModItems.DIAMOND_SHARD);
                        entries.add(ModItems.HOT_CHOCOLATE);
                        entries.add(ModItems.HOT_CHOCOLATE_WITH_WHIPPED_CREAM);
                        entries.add(ModItems.HOT_CHOCOLATE_WITH_MARSHMALLOW);
                        entries.add(ModItems.HOT_CHOCOLATE_WITH_WHIPPED_CREAM_AND_MARSHMALLOW);
                        entries.add(ModItems.HOT_CHOCOLATE_POWDER);
                        entries.add(ModItems.HOT_CHOCOLATE_POWDER_WITH_MARSHMALLOW);
                        entries.add(ModItems.WHIPPED_CREAM);
                        entries.add(ModItems.MARSHMALLOW);
                        entries.add(ModItems.CUP);
                        entries.add(ModItems.BUTTER);
                        entries.add(ModItems.HEAVY_CREAM);
                        entries.add(ModItems.VANILLA_BEANS);
                        entries.add(ModItems.VANILLA_EXTRACT);
                    }).build());

    public static final ItemGroup ANDONIUM_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MOD_ID, "andonium_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.ANDONIUM_ORE))
                    .displayName(Text.translatable("creativetab.andonium.andonium_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ANDONIUM_ORE);
                        entries.add(ModBlocks.ANDONIUM_DEEPSLATE_ORE);
                    }).build());

    public static final ItemGroup ANDONIUM_EQUIPMENT_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MOD_ID, "andonium_equipment"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ANDONIUM_AXE))
                    .displayName(Text.translatable("creativetab.andonium.andonium_equipment"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ANDONIUM_AXE);
                        entries.add(ModItems.ANDONIUM_PICKAXE);
                        entries.add(ModItems.ANDONIUM_HELMET);
                        entries.add(ModItems.ANDONIUM_CHESTPLATE);
                        entries.add(ModItems.ANDONIUM_LEGGINGS);
                        entries.add(ModItems.ANDONIUM_BOOTS);
                    }).build());



    public static void registerItemGroups() {
        LOGGER.info("Registering Item Groups for " + MOD_ID);
    }
}
