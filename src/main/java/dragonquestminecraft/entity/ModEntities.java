package dragonquestminecraft.entity;

import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.entity.custom.*;
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
                    .fireImmune().sized(1f, 1f).build("slime"));

    public static final RegistryObject<EntityType<GolemEntity>> GOLEM =
            ENTITY_TYPES.register("golem", () -> EntityType.Builder.of(GolemEntity::new, MobCategory.MONSTER)
                    .sized(3f, 5f).build("golem"));

    public static final RegistryObject<EntityType<StoneGolemEntity>> STONE_GOLEM =
            ENTITY_TYPES.register("stone_golem", () -> EntityType.Builder.of(StoneGolemEntity::new, MobCategory.MONSTER)
                    .sized(3f, 5f).build("golem"));

    public static final RegistryObject<EntityType<GlacialGolemEntity>> GLACIAL_GOLEM =
            ENTITY_TYPES.register("glacial_golem", () -> EntityType.Builder.of(GlacialGolemEntity::new, MobCategory.MONSTER)
                    .sized(3f, 5f).build("golem"));

    public static final RegistryObject<EntityType<GoldGolemEntity>> GOLD_GOLEM =
            ENTITY_TYPES.register("gold_golem", () -> EntityType.Builder.of(GoldGolemEntity::new, MobCategory.MONSTER)
                    .sized(3f, 5f).build("golem"));

    public static final RegistryObject<EntityType<MischievousMoleEntity>> MISCHIEVOUS_MOLE =
            ENTITY_TYPES.register("mischievous_mole", () -> EntityType.Builder.of(MischievousMoleEntity::new, MobCategory.MONSTER)
                    .sized(1.2f, 1.8f).build("mischievous_mole"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);


    }
}
