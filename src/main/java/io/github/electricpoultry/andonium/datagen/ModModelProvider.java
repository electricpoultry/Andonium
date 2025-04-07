package io.github.electricpoultry.andonium.datagen;

import io.github.electricpoultry.andonium.block.ModBlocks;
import io.github.electricpoultry.andonium.item.ModEquipmentAssets;
import io.github.electricpoultry.andonium.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.renderer.item.BlockModelWrapper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.level.block.Block;

import java.util.Collections;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output, String modId) {
        super(output, modId);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        blockModel(blockModels, ModBlocks.INSTANCE.getANDONIUM_ORE().get());
        blockModel(blockModels, ModBlocks.INSTANCE.getKOTONIUM_ORE().get());

        itemModel(itemModels, ModItems.INSTANCE.getAndonium().get());
        itemModel(itemModels, ModItems.INSTANCE.getButter().get());
        itemModel(itemModels, ModItems.INSTANCE.getCup().get());
        itemModel(itemModels, ModItems.INSTANCE.getDiamond_Shard().get());
        itemModel(itemModels, ModItems.INSTANCE.getWhipped_cream().get());
        itemModel(itemModels, ModItems.INSTANCE.getHeavy_Cream().get());
        itemModel(itemModels, ModItems.INSTANCE.getHot_Chocolate().get());
        itemModel(itemModels, ModItems.INSTANCE.getHot_Chocolate_Powder().get());
        itemModel(itemModels, ModItems.INSTANCE.getHot_Chocolate_Powder_With_Marshmallow().get());
        itemModel(itemModels, ModItems.INSTANCE.getHot_Chocolate_With_Marshmallow().get());
        itemModel(itemModels, ModItems.INSTANCE.getHot_Chocolate_With_Whipped_Cream().get());
        itemModel(itemModels, ModItems.INSTANCE.getHot_Chocolate_With_Whipped_Cream_And_Marshmallow().get());
        itemModel(itemModels, ModItems.INSTANCE.getVanilla_Beans().get());
        itemModel(itemModels, ModItems.INSTANCE.getVanilla_Extract().get());
        itemModel(itemModels, ModItems.INSTANCE.getMarshmallow().get());
        itemModel(itemModels, ModItems.INSTANCE.getKotonium().get());

        toolModel(itemModels, ModItems.INSTANCE.getAndonium_Axe().get());
        toolModel(itemModels, ModItems.INSTANCE.getAndonium_Pickaxe().get());

        armorModel(itemModels, ModItems.INSTANCE.getAndonium_Helmet().get(), ModEquipmentAssets.ANDONIUM);
        armorModel(itemModels, ModItems.INSTANCE.getAndonium_Chestplate().get(), ModEquipmentAssets.ANDONIUM);
        armorModel(itemModels, ModItems.INSTANCE.getAndonium_Leggings().get(), ModEquipmentAssets.ANDONIUM);
        armorModel(itemModels, ModItems.INSTANCE.getAndonium_Boots().get(), ModEquipmentAssets.ANDONIUM);
    }

    public void blockModel(BlockModelGenerators blockModels, Block block) {
        blockModels.createTrivialCube(block);
    }

    public void itemModel(ItemModelGenerators itemModels, Item item) {
        this.itemModel(itemModels, item, ModelTemplates.FLAT_ITEM);
    }

    public void toolModel(ItemModelGenerators itemModels, Item item) {
        this.itemModel(itemModels, item, ModelTemplates.FLAT_HANDHELD_ITEM);
    }

    public void itemModel(ItemModelGenerators itemModels, Item item, ModelTemplate template) {
        ResourceLocation itemId = BuiltInRegistries.ITEM.getKey(item);
        ResourceLocation textureLoc = ResourceLocation.fromNamespaceAndPath(itemId.getNamespace(), "item/" + itemId.getPath());
        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.LAYER0, textureLoc);
        itemModels.itemModelOutput.accept(item, new BlockModelWrapper.Unbaked(template.create(item, textureMapping, itemModels.modelOutput), Collections.emptyList()));
    }

    public void armorModel(ItemModelGenerators itemModels, Item item, ResourceKey<EquipmentAsset> equipmentKey) {
        ResourceLocation id = BuiltInRegistries.ITEM.getKey(item);
        ResourceLocation armorType = null;
        if (id.getPath().contains("helmet"))
            armorType = ItemModelGenerators.TRIM_PREFIX_HELMET;
        else if (id.getPath().contains("chestplate"))
            armorType = ItemModelGenerators.TRIM_PREFIX_CHESTPLATE;
        else if (id.getPath().contains("leggings"))
            armorType = ItemModelGenerators.TRIM_PREFIX_LEGGINGS;
        else if (id.getPath().contains("boots"))
            armorType = ItemModelGenerators.TRIM_PREFIX_BOOTS;
        itemModels.generateTrimmableItem(item, equipmentKey, armorType, false);
    }
}
