package dragonquestminecraft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties MEDICINAL_HERB = new FoodProperties.Builder().alwaysEat()
            .nutrition(0)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 5), 1f)
            .build();
}
