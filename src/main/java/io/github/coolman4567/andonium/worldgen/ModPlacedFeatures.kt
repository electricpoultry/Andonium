package io.github.coolman4567.andonium.worldgen

import io.github.coolman4567.andonium.Andonium
import net.minecraft.core.Holder
import net.minecraft.core.registries.Registries
import net.minecraft.data.worldgen.BootstrapContext
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.levelgen.VerticalAnchor
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement
import net.minecraft.world.level.levelgen.placement.PlacedFeature
import net.minecraft.world.level.levelgen.placement.PlacementModifier

object ModPlacedFeatures {
    val ANDONIUM_ORE_PLACED_KEY: ResourceKey<PlacedFeature> = registerKey("andonium_ore_placed")

    fun bootstrap(context: BootstrapContext<PlacedFeature>) {
        val configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE)

        register(
            context,
            ANDONIUM_ORE_PLACED_KEY,
            configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ANDONIUM_ORE_KEY),
            ModOrePlacement.commonOrePlacement(
                12,
                HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(92))
            )
        )
    }

    private fun registerKey(name: String): ResourceKey<PlacedFeature> {
        return ResourceKey.create(
            Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(Andonium.MOD_ID, name)
        )
    }

    private fun register(
        context: BootstrapContext<PlacedFeature>,
        key: ResourceKey<PlacedFeature>,
        configuration: Holder<ConfiguredFeature<*, *>?>,
        modifiers: List<PlacementModifier?>
    ) {
        context.register(key, PlacedFeature(configuration, java.util.List.copyOf(modifiers)))
    }
}
