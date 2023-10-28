package dragonquestminecraft.event;

import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.entity.ModEntities;
import dragonquestminecraft.entity.custom.SlimeEntity;
import dragonquestminecraft.entity.custom.SheSlimeEntity;
import dragonquestminecraft.entity.custom.MetalSlimeEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DragonQuestMinecraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.SLIME.get(), SlimeEntity.createAttributes().build());
        event.put(ModEntities.SHESLIME.get(), SheSlimeEntity.createAttributes().build());
        event.put(ModEntities.METAL_SLIME.get(), MetalSlimeEntity.createAttributes().build());
    }
}
