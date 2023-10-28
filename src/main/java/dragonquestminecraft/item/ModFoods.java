package dragonquestminecraft.item;

import dragonquestminecraft.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties MEDICINAL_HERB = new FoodProperties.Builder().alwaysEat()
            .nutrition(0)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 0), 1f)
            .build();

    public static final FoodProperties STRONG_MEDICINE = new FoodProperties.Builder().alwaysEat()
            .nutrition(0)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 1), 1f)
            .build();

    public static final FoodProperties SUPERIOR_MEDICINE = new FoodProperties.Builder().alwaysEat()
            .nutrition(0)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 2), 1f)
            .build();

    public static final FoodProperties YGGDRASIL_LEAF = new FoodProperties.Builder().alwaysEat()
            .nutrition(0)
            .effect(() -> new MobEffectInstance(ModEffects.YGGDRASIL_BLESSING.get(), 300, 0), 1f)
            .build();
}
