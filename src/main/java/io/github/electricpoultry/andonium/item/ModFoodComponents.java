package io.github.electricpoultry.andonium.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent HOT_CHOCOLATE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 400), 1f).alwaysEdible().build();

    public static final FoodComponent HOT_CHOCOLATE_WITH_WHIPPED_CREAM_AND_MARSHMALLOW = new FoodComponent.Builder().nutrition(14).saturationModifier(2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 4000), 1f).alwaysEdible().build();

    public static final FoodComponent MARSHMALLOW = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .alwaysEdible().build();

    public static final FoodComponent WHIPPED_CREAM = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .alwaysEdible().build();
}
