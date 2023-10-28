package dragonquestminecraft.effect;

import dragonquestminecraft.DragonQuestMinecraft;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DragonQuestMinecraft.MODID);

    public static final RegistryObject<MobEffect> YGGDRASIL_BLESSING = MOB_EFFECTS.register("yggdrasil_blessing",
            () -> new YggdrasilBlessingEffect(MobEffectCategory.BENEFICIAL, 0xFEFFBD));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
