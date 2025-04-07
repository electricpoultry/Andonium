package io.github.electricpoultry.andonium.datagen;

import io.github.electricpoultry.andonium.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId) {
        super(packOutput, lookupProvider, modId);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.INSTANCE.getANDONIUM_ORE().get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.INSTANCE.getANDONIUM_ORE().get());
    }
}
