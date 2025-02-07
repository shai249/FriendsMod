package net.kubiia.friendsmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;

import static net.minecraft.entity.effect.StatusEffects.*;
import static net.kubiia.friendsmod.effect.ModEffects.*;

public class ModFoodComponents {
    public static final FoodComponent KINDER = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(SLOWNESS, 200, 5), 1f)
            .statusEffect(new StatusEffectInstance(BLINDNESS, 200, 5), 1f)
            .statusEffect(new StatusEffectInstance(WEAKNESS, 200, 5), 1f)
            .build();
    public static final FoodComponent FALAFEL = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f).build();

    public static final FoodComponent GEFILTE_FISH = new FoodComponent.Builder().nutrition(7).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(GLOWING, 200, 100), 1f)
            .build();

    public static final FoodComponent PROTEIN_SNACK = new FoodComponent.Builder().nutrition(20).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(NADI_STRENGTH, 200,3), 1f)
            .build();

    public static final FoodComponent SUMSUM = new FoodComponent.Builder().nutrition(20).saturationModifier(3f)
            .build();

    public static final FoodComponent CUCUMBER = new FoodComponent.Builder().nutrition(10).saturationModifier(2f)
            .build();

    public static final FoodComponent COUGH_SYRUP = new FoodComponent.Builder().nutrition(0).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(NAUSEA, 200,0), 0.5f)
            .build();
}
