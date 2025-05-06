package io.github.electricpoultry.andonium.worldgen;

import io.github.electricpoultry.andonium.Andonium;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.biome.Biome;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_ANDONIUM_ORE = registerKey("add_andonium_ore");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);

        // Get the HolderSet for the IS_OVERWORLD biome tag
        HolderSet<Biome> overworldBiomes = biomes.getOrThrow(BiomeTags.IS_OVERWORLD);

        // Get the Holder for the placed feature
        Holder<PlacedFeature> andoniumOrePlaced = placedFeatures.getOrThrow(ModPlacedFeatures.ANDONIUM_ORE_PLACED_KEY);

        context.register(
                ADD_ANDONIUM_ORE,
                new BiomeModifiers.AddFeaturesBiomeModifier( // Use BiomeModifiers.AddFeaturesBiomeModifier
                        overworldBiomes,
                        HolderSet.direct(andoniumOrePlaced), // Create a direct HolderSet from the single Holder
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(
                NeoForgeRegistries.Keys.BIOME_MODIFIERS, // Correctly reference the registry key
                ResourceLocation.fromNamespaceAndPath(Andonium.MOD_ID, name) // Use your actual MOD_ID
        );
    }
}
