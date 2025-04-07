package io.github.electricpoultry.andonium.item;

import io.github.electricpoultry.andonium.util.ModTags;
import net.minecraft.Util;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.EnumMap;

import static io.github.electricpoultry.andonium.Andonium.MOD_ID;

public class ModArmorMaterials {
    public static final ArmorMaterial ANDONIUM_ARMOR_MATERIAL = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 5);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 6);
            }), 30, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.1f, 0.2f, ModTags.Items.INSTANCE.getANDONIUM_REPAIR(), ResourceKey.create(ResourceKey.createRegistryKey(ResourceLocation.fromNamespaceAndPath(MOD_ID, "andonium")), ResourceLocation.fromNamespaceAndPath(MOD_ID, "andonium")));

}
