package io.github.electricpoultry.andonium.worldgen

import io.github.electricpoultry.andonium.Andonium
import net.minecraft.core.HolderSet
import net.minecraft.core.registries.Registries
import net.minecraft.data.worldgen.BootstrapContext
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.BiomeTags
import net.minecraft.world.level.levelgen.GenerationStep
import net.neoforged.neoforge.common.world.BiomeModifier
import net.neoforged.neoforge.common.world.BiomeModifiers.AddFeaturesBiomeModifier
import net.neoforged.neoforge.registries.NeoForgeRegistries

object ModBiomeModifiers {
    val ADD_ANDONIUM_ORE: ResourceKey<BiomeModifier> = registerKey("add_andonium_ore")

    fun bootstrap(context: BootstrapContext<BiomeModifier>) {
        val placedFeatures = context.lookup(Registries.PLACED_FEATURE)
        val biomes = context.lookup(Registries.BIOME)

        context.register(
            ADD_ANDONIUM_ORE, AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ANDONIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
            )
        )
    }

    private fun registerKey(name: String): ResourceKey<BiomeModifier> {
        return ResourceKey.create(
            NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(Andonium.MOD_ID, name)
        )
    }
}
