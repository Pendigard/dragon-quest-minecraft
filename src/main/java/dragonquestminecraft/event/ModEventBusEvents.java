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
        event.register(
                ModEntities.GOLEM.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                GolemEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
        event.register(
                ModEntities.GOLD_GOLEM.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                GoldGolemEntity::canGoldSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
        event.register(
                ModEntities.STONE_GOLEM.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                StoneGolemEntity::canStoneSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
        event.register(
                ModEntities.GLACIAL_GOLEM.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                GlacialGolemEntity::canGlacialSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
        event.register(
                ModEntities.MISCHIEVOUS_MOLE.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                MischievousMoleEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
        event.register(
                ModEntities.KING_SLIME.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                KingSlimeEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
        event.register(
                ModEntities.METAL_KING_SLIME.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                MetalKingSlimeEntity::canMetalSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
        event.register(
                ModEntities.KING_CURESLIME.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                KingCureslimeEntity::canCureSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
        event.register(
                ModEntities.BUBBLE_SLIME.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                BubbleSlimeEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
        event.register(
                ModEntities.LIQUID_METAL_SLIME.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                LiquidMetalSlimeEntity::canLiquidMetalSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
        event.register(
                ModEntities.DRACKY.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                DrackyEntity::canSpawn,
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
        event.put(ModEntities.KING_SLIME.get(), KingSlimeEntity.createAttributes().build());
        event.put(ModEntities.METAL_KING_SLIME.get(), MetalKingSlimeEntity.createAttributes().build());
        event.put(ModEntities.KING_CURESLIME.get(), KingCureslimeEntity.createAttributes().build());
        event.put(ModEntities.BUBBLE_SLIME.get(), BubbleSlimeEntity.createAttributes().build());
        event.put(ModEntities.LIQUID_METAL_SLIME.get(), LiquidMetalSlimeEntity.createAttributes().build());
        event.put(ModEntities.DRACKY.get(), DrackyEntity.createAttributes().build());
    }
}
