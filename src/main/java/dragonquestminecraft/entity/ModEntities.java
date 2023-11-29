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

    public static final RegistryObject<EntityType<KingSlimeEntity>> KING_SLIME =
            ENTITY_TYPES.register("king_slime", () -> EntityType.Builder.of(KingSlimeEntity::new, MobCategory.MONSTER)
                    .sized(2.8f, 1.9f).build("king_slime"));

    public static final RegistryObject<EntityType<MetalKingSlimeEntity>> METAL_KING_SLIME =
            ENTITY_TYPES.register("metal_king_slime", () -> EntityType.Builder.of(MetalKingSlimeEntity::new, MobCategory.MONSTER)
                    .sized(2.8f, 1.9f).build("metal_king_slime"));

    public static final RegistryObject<EntityType<KingCureslimeEntity>> KING_CURESLIME =
            ENTITY_TYPES.register("king_cureslime", () -> EntityType.Builder.of(KingCureslimeEntity::new, MobCategory.MONSTER)
                    .sized(2.8f, 1.9f).build("king_cureslime"));

    public static final RegistryObject<EntityType<BubbleSlimeEntity>> BUBBLE_SLIME =
            ENTITY_TYPES.register("bubble_slime", () -> EntityType.Builder.of(BubbleSlimeEntity::new, MobCategory.MONSTER)
                    .sized(1f, 0.5f).build("bubble_slime"));

    public static final RegistryObject<EntityType<LiquidMetalSlimeEntity>> LIQUID_METAL_SLIME =
            ENTITY_TYPES.register("liquid_metal_slime", () -> EntityType.Builder.of(LiquidMetalSlimeEntity::new, MobCategory.MONSTER)
                    .sized(1f, 0.5f).build("liquid_metal_slime"));

    public static final RegistryObject<EntityType<DrackyEntity>> DRACKY =
            ENTITY_TYPES.register("dracky", () -> EntityType.Builder.of(DrackyEntity::new, MobCategory.MONSTER)
                    .sized(1f, 1.5f).build("dracky"));

    public static final RegistryObject<EntityType<GiganteEntity>> GIGANTE =
            ENTITY_TYPES.register("gigante", () -> EntityType.Builder.of(GiganteEntity::new, MobCategory.MONSTER)
                    .sized(3.7f, 6f).build("gigante"));

    public static final RegistryObject<EntityType<AtlasEntity>> ATLAS =
            ENTITY_TYPES.register("atlas", () -> EntityType.Builder.of(AtlasEntity::new, MobCategory.MONSTER)
                    .sized(3.7f, 6f).build("atlas"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);


    }
}
