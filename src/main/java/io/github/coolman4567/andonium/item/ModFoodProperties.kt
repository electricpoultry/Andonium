package io.github.coolman4567.andonium.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties HOT_CHOCOLATE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 1f).alwaysEdible().build();

    public static final FoodProperties HOT_CHOCOLATE_WITH_WHIPPED_CREAM_AND_MARSHMALLOW = new FoodProperties.Builder().nutrition(14).saturationModifier(2f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 4000), 1f).alwaysEdible().build();

    public static final FoodProperties MARSHMALLOW = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).alwaysEdible().fast().build();

    public static final FoodProperties WHIPPED_CREAM = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).alwaysEdible().fast().build();
}
