package io.github.coolman4567.andonium.datagen;

import io.github.coolman4567.andonium.kotlin.item.KotlinModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import io.github.coolman4567.andonium.Andonium;
import io.github.coolman4567.andonium.item.ModItems;

import java.util.LinkedHashMap;

import static io.github.coolman4567.andonium.Andonium.MOD_ID;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ANDONIUM.get());
        basicItem(ModItems.DIAMOND_SHARD.get());

        basicItem(KotlinModItems.INSTANCE.getHot_Chocolate_Powder().get());
        basicItem(KotlinModItems.INSTANCE.getHot_Chocolate_Powder_With_Marshmallow().get());
        basicItem(KotlinModItems.INSTANCE.getHot_Chocolate().get());
        basicItem(KotlinModItems.INSTANCE.getHot_Chocolate_With_Marshmallow().get());
        basicItem(KotlinModItems.INSTANCE.getHot_Chocolate_With_Whipped_Cream().get());
        basicItem(KotlinModItems.INSTANCE.getHot_Chocolate_With_Whipped_Cream_And_Marshmallow().get());
        basicItem(KotlinModItems.INSTANCE.getWhipped_cream().get());
        basicItem(KotlinModItems.INSTANCE.getMarshmallow().get());
        basicItem(KotlinModItems.INSTANCE.getCup().get());
        basicItem(KotlinModItems.INSTANCE.getButter().get());
        basicItem(KotlinModItems.INSTANCE.getVanilla_Beans().get());
        basicItem(KotlinModItems.INSTANCE.getVanilla_Extract().get());
        basicItem(KotlinModItems.INSTANCE.getHeavy_Cream().get());

        basicItem(ModItems.INTRO_BOOK.get());

        handheldItem(ModItems.ANDONIUM_PICKAXE);

        trimmedArmorItem(ModItems.ANDONIUM_HELMET);
        trimmedArmorItem(ModItems.ANDONIUM_CHESTPLATE);
        trimmedArmorItem(ModItems.ANDONIUM_LEGGINGS);
        trimmedArmorItem(ModItems.ANDONIUM_BOOTS);
    }

    private void trimmedArmorItem(DeferredItem<ArmorItem> itemDeferredItem) {
        final String MOD_ID = Andonium.MOD_ID; // Change this to your mod id

        if(itemDeferredItem.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemDeferredItem.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemDeferredItem.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(MOD_ID,"item/" + item.getId().getPath()));
    }
}
