package io.github.electricpoultry.andonium.worldgen

import net.minecraft.world.level.levelgen.placement.*

object ModOrePlacement {
    fun orePlacement(pCountPlacement: PlacementModifier, pHeightRange: PlacementModifier): List<PlacementModifier> {
        return java.util.List.of(pCountPlacement, InSquarePlacement.spread(), pHeightRange, BiomeFilter.biome())
    }

    fun commonOrePlacement(pCount: Int, pHeightRange: PlacementModifier): List<PlacementModifier> {
        return orePlacement(CountPlacement.of(pCount), pHeightRange)
    }

    fun rareOrePlacement(pChance: Int, pHeightRange: PlacementModifier): List<PlacementModifier> {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange)
    }
}
