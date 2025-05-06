package io.github.electricpoultry.andonium.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

public class ModFoodProperties {
    public static final FoodProperties HOT_CHOCOLATE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 1.0f) // 400 ticks = 20 seconds
            .alwaysEdible()
            .build();

    public static final FoodProperties HOT_CHOCOLATE_WITH_WHIPPED_CREAM_AND_MARSHMALLOW = new FoodProperties.Builder()
            .nutrition(14)
            .saturationModifier(2.0f) // Using 2.0f for clarity, 2f is also valid
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 4000), 1.0f) // 4000 ticks = 200 seconds
            .alwaysEdible()
            .build();

    public static final FoodProperties MARSHMALLOW = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .alwaysEdible()
            .fast() // Makes the food be eaten quickly
            .build();

    public static final FoodProperties WHIPPED_CREAM = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .alwaysEdible()
            .fast() // Makes the food be eaten quickly
            .build();
}
