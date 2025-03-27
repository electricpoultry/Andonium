package io.github.coolman4567.andonium.datagen;

import io.github.coolman4567.andonium.item.ModItems;
import io.github.coolman4567.andonium.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTagsProvider, String modId) {
        super(packOutput, lookupProvider, blockTagsProvider, modId);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        tag(ModTags.Items.INSTANCE.getANDONIUM_REPAIR())
                .add(ModItems.INSTANCE.getAndonium().get());

        tag(ItemTags.AXES)
                .add(ModItems.INSTANCE.getAndonium_Axe().get());

        tag(ItemTags.PICKAXES)
                .add(ModItems.INSTANCE.getAndonium_Pickaxe().get());
    }
}
