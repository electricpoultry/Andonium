package io.github.coolman4567.andonium.item

import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.food.FoodProperties

object ModFoodProperties {
    val HOT_CHOCOLATE: FoodProperties = FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
        .effect({ MobEffectInstance(MobEffects.HEALTH_BOOST, 400) }, 1f).alwaysEdible().build()

    val HOT_CHOCOLATE_WITH_WHIPPED_CREAM_AND_MARSHMALLOW: FoodProperties =
        FoodProperties.Builder().nutrition(14).saturationModifier(2f)
            .effect({ MobEffectInstance(MobEffects.HEALTH_BOOST, 4000) }, 1f).alwaysEdible().build()

    val MARSHMALLOW: FoodProperties =
        FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).alwaysEdible().fast().build()

    val WHIPPED_CREAM: FoodProperties =
        FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).alwaysEdible().fast().build()
}
