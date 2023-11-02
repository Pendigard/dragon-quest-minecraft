package dragonquestminecraft.event;

import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.entity.ModEntities;
import dragonquestminecraft.entity.custom.*;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DragonQuestMinecraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent event) {
        event.register(
                ModEntities.SLIME.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                SlimeEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
        event.register(
                ModEntities.SHESLIME.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                SheSlimeEntity::canSheSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
        event.register(
                ModEntities.METAL_SLIME.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                MetalSlimeEntity::canMetalSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
    }


    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.SLIME.get(), SlimeEntity.createAttributes().build());
        event.put(ModEntities.SHESLIME.get(), SheSlimeEntity.createAttributes().build());
        event.put(ModEntities.METAL_SLIME.get(), MetalSlimeEntity.createAttributes().build());
        event.put(ModEntities.GOLEM.get(), GolemEntity.createAttributes().build());
        event.put(ModEntities.STONE_GOLEM.get(), StoneGolemEntity.createAttributes().build());
        event.put(ModEntities.GLACIAL_GOLEM.get(), GlacialGolemEntity.createAttributes().build());
        event.put(ModEntities.GOLD_GOLEM.get(), GoldGolemEntity.createAttributes().build());
        event.put(ModEntities.MISCHIEVOUS_MOLE.get(), MischievousMoleEntity.createAttributes().build());
    }
}
