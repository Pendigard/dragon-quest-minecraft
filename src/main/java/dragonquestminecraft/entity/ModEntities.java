package dragonquestminecraft.entity;

import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.entity.custom.MetalSlimeEntity;
import dragonquestminecraft.entity.custom.SlimeEntity;
import dragonquestminecraft.entity.custom.SheSlimeEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DragonQuestMinecraft.MODID);

    public static final RegistryObject<EntityType<SlimeEntity>> SLIME =
            ENTITY_TYPES.register("slime", () -> EntityType.Builder.of(SlimeEntity::new, MobCategory.MONSTER)
                    .sized(1f, 1f).build("slime"));

    public static final RegistryObject<EntityType<SheSlimeEntity>> SHESLIME =
            ENTITY_TYPES.register("sheslime", () -> EntityType.Builder.of(SheSlimeEntity::new, MobCategory.MONSTER)
                    .sized(1f, 1f).build("slime"));

    public static final RegistryObject<EntityType<MetalSlimeEntity>> METAL_SLIME =
            ENTITY_TYPES.register("metal_slime", () -> EntityType.Builder.of(MetalSlimeEntity::new, MobCategory.MONSTER)
                    .sized(1f, 1f).build("slime"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);


    }
}
