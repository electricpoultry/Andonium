package io.github.electricpoultry.andonium.worldgen

import io.github.electricpoultry.andonium.Andonium
import io.github.electricpoultry.andonium.block.ModBlocks
import net.minecraft.core.registries.Registries
import net.minecraft.data.worldgen.BootstrapContext
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.BlockTags
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature
import net.minecraft.world.level.levelgen.feature.Feature
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest
import java.util.List

object ModConfiguredFeatures {
    val OVERWORLD_ANDONIUM_ORE_KEY: ResourceKey<ConfiguredFeature<*, *>> = registerKey("andonium_ore")

    fun bootstrap(context: BootstrapContext<ConfiguredFeature<*, *>>) {
        val stoneReplaceables: RuleTest = TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES)

        val overworldBismuthOres = List.of(
            OreConfiguration.target(stoneReplaceables, ModBlocks.ANDONIUM_ORE.get().defaultBlockState())
        )

        register(context, OVERWORLD_ANDONIUM_ORE_KEY, Feature.ORE, OreConfiguration(overworldBismuthOres, 8))
    }

    fun registerKey(name: String): ResourceKey<ConfiguredFeature<*, *>> {
        return ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(Andonium.MOD_ID, name)
        )
    }

    private fun <FC : FeatureConfiguration?, F : Feature<FC>?> register(
        context: BootstrapContext<ConfiguredFeature<*, *>>,
        key: ResourceKey<ConfiguredFeature<*, *>>,
        feature: F,
        configuration: FC
    ) {
        context.register(key, ConfiguredFeature(feature, configuration))
    }
}
