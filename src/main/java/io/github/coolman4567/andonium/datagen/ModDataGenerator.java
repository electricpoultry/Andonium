package io.github.coolman4567.andonium.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.ApiStatus;

import java.util.concurrent.CompletableFuture;

import static io.github.coolman4567.andonium.Andonium.MOD_ID;

@ApiStatus.Internal
@EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModDataGenerator {
    private ModDataGenerator() {
    }
    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onGatherData(final GatherDataEvent.Client event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ModBlockTagsProvider blockTagsProvider = new ModBlockTagsProvider(packOutput, lookupProvider, MOD_ID);

        event.addProvider(blockTagsProvider);
        event.addProvider(new ModItemTagsProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), MOD_ID));
        event.addProvider(new ModEquipmentAssetProvider(packOutput));
        event.addProvider(new ModModelProvider(packOutput, MOD_ID));
    }
}
