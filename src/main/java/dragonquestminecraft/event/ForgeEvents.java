package dragonquestminecraft.event;


import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.effect.ModEffects;
import dragonquestminecraft.entity.custom.LiquidMetalSlimeEntity;
import dragonquestminecraft.entity.custom.MetalKingSlimeEntity;
import dragonquestminecraft.entity.custom.MetalSlimeEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber(modid = DragonQuestMinecraft.MODID)
public class ForgeEvents {

    @SubscribeEvent
    public static void onLivingExperienceDrop(LivingExperienceDropEvent e) {
        if (e.getEntity() instanceof MetalSlimeEntity) {
            e.setDroppedExperience(56);
        }
        if (e.getEntity() instanceof LiquidMetalSlimeEntity) {
            e.setDroppedExperience(250);
        }
        if (e.getEntity() instanceof MetalKingSlimeEntity) {
            e.setDroppedExperience(1000);
        }
    }
    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent e) {
        if (e.getEntity().hasEffect(ModEffects.YGGDRASIL_BLESSING.get())) {
            if (e.getEntity().getHealth() - e.getAmount() <= 0) {
                e.getEntity().clearFire();
                e.getEntity().setHealth(6f);
                e.getEntity().removeEffect(ModEffects.YGGDRASIL_BLESSING.get());
                Level level = e.getEntity().level();
                if (!level.isClientSide()) {
                    level.playSound(null, e.getEntity().blockPosition(), SoundEvents.TOTEM_USE, SoundSource.PLAYERS, 0.1f, 4f);
                }
            }
        }
    }

    @SubscribeEvent
    public static void onLivingFall(LivingFallEvent e) {
        if (e.getEntity().hasEffect(ModEffects.YGGDRASIL_BLESSING.get())) {
            if (e.getEntity().getHealth() - (e.getDistance()-3) * e.getDamageMultiplier() <= 0) {
                // Check if the damage taken by the entity at the end of its fall is going to kill it
                // The damage calculation comes from : https://minecraft.fandom.com/wiki/Damage#Fall_damage
                e.setDistance(0.0f);
                e.getEntity().clearFire();
                e.getEntity().setHealth(6f);
                e.getEntity().removeEffect(ModEffects.YGGDRASIL_BLESSING.get());
                Level level = e.getEntity().level();
                if (!level.isClientSide()) {
                    level.playSound(null, e.getEntity().blockPosition(), SoundEvents.TOTEM_USE, SoundSource.PLAYERS, 0.1f, 2f);
                }
            }
        }
    }
}
