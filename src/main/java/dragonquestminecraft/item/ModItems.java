package dragonquestminecraft.item;

import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.entity.ModEntities;
import dragonquestminecraft.item.custom.ChimaeraWingItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DragonQuestMinecraft.MODID);

    public static final RegistryObject<Item> SLIME_DROP = ITEMS.register("slime_drop",
            () -> new ModItemWithDescription(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ORICHALCUM = ITEMS.register("raw_orichalcum",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ORICHALCUM_INGOT = ITEMS.register("orichalcum_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MINI_MEDAL = ITEMS.register("mini_medal",
            () -> new ModItemWithDescription(new Item.Properties()));

    public static final RegistryObject<Item> MOLTEN_GLOBULES = ITEMS.register("molten_globules",
            () -> new ModItemWithDescription(new Item.Properties()));

    public static final RegistryObject<Item> MAGIC_BEAST_HIDE = ITEMS.register("magic_beast_hide",
            () -> new ModItemWithDescription(new Item.Properties()));

    public static final RegistryObject<Item> MIRROR_STONE = ITEMS.register("mirror_stone",
            () -> new ModItemWithDescription(new Item.Properties()));

    public static final RegistryObject<Item> CHRONOCRYSTAL = ITEMS.register("chronocrystal",
            () -> new ModItemWithDescription(new Item.Properties()));

    public static final RegistryObject<Item>  ETHEREAL_STONE = ITEMS.register("ethereal_stone",
            () -> new ModItemWithDescription(new Item.Properties()));

    public static final RegistryObject<Item>  SAINTED_SOMA = ITEMS.register("sainted_soma",
            () -> new ModItemWithDescription(new Item.Properties()));

    public static final RegistryObject<Item>  ROYAL_RUBY = ITEMS.register("royal_ruby",
            () -> new ModItemWithDescription(new Item.Properties()));

    public static final RegistryObject<Item>  SAVVY_SAPPHIRE = ITEMS.register("savvy_sapphire",
            () -> new ModItemWithDescription(new Item.Properties()));

    public static final RegistryObject<Item>  EQUABLE_EMERALD = ITEMS.register("equable_emerald",
            () -> new ModItemWithDescription(new Item.Properties()));
    public static final RegistryObject<Item>  SUNNY_CITRINE = ITEMS.register("sunny_citrine",
            () -> new ModItemWithDescription(new Item.Properties()));
    public static final RegistryObject<Item>  ARTFUL_AMETHYST = ITEMS.register("artful_amethyst",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  SLIME_CROWN = ITEMS.register("slime_crown",
            () -> new ModItemWithDescription(new Item.Properties()));

    public static final RegistryObject<Item>  ROYAL_SOIL = ITEMS.register("royal_soil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  DENSINIUM = ITEMS.register("densinium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  MAGIC_BEAST_HORN = ITEMS.register("magic_beast_horn",
            () -> new ModItemWithDescription(new Item.Properties()));

    public static final RegistryObject<Item>  METAL_SLIME_SWORD = ITEMS.register("metal_slime_sword",
            () -> new SwordItem(ModToolTiers.METAL_SLIME, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> SLIME_SPAWN_EGG = ITEMS.register("dq_slime_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.SLIME, 0x00c9ff, 0x0083ff,
                    new Item.Properties()));

    public static final RegistryObject<Item> SHESLIME_SPAWN_EGG = ITEMS.register("sheslime_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.SHESLIME, 0xe69219, 0xb96408,
                    new Item.Properties()));

    public static final RegistryObject<Item> METAL_SLIME_SPAWN_EGG = ITEMS.register("metal_slime_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.METAL_SLIME, 0xc4c4c4, 0xe4e4e4,
                    new Item.Properties()));

    public static final RegistryObject<Item> GOLEM_SPAWN_EGG = ITEMS.register("golem_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.GOLEM, 0xb67c3a, 0x936027,
                    new Item.Properties()));

    public static final RegistryObject<Item> STONE_GOLEM_SPAWN_EGG = ITEMS.register("stone_golem_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.STONE_GOLEM, 0x37555b, 0x23383c,
                    new Item.Properties()));

    public static final RegistryObject<Item> GLACIAL_GOLEM_SPAWN_EGG = ITEMS.register("glacial_golem_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.GLACIAL_GOLEM, 0x30bce3, 0x7fd7f0,
                    new Item.Properties()));

    public static final RegistryObject<Item> GOLD_GOLEM_SPAWN_EGG = ITEMS.register("gold_golem_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.GOLD_GOLEM, 0xd7cd3c, 0x8d7700,
                    new Item.Properties()));

    public static final RegistryObject<Item> KING_SLIME_SPAWN_EGG = ITEMS.register("king_slime_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.KING_SLIME, 0x37a1e3, 0x780b92,
                    new Item.Properties()));

    public static final RegistryObject<Item> METAL_KING_SLIME_SPAWN_EGG = ITEMS.register("metal_king_slime_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.METAL_KING_SLIME, 0xa7a7a7, 0x780b92,
                    new Item.Properties()));

    public static final RegistryObject<Item> KING_CURESLIME_SPAWN_EGG = ITEMS.register("king_cureslime_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.KING_CURESLIME, 0x55e334, 0x780b92,
                    new Item.Properties()));

    public static final RegistryObject<Item> MISCHIEVOUS_MOLE_SPAWN_EGG = ITEMS.register("mischievous_mole_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.MISCHIEVOUS_MOLE, 0x9e9e9e, 0x343434,
                    new Item.Properties()));

    public static final RegistryObject<Item> BUBBLE_SLIME_SPAWN_EGG = ITEMS.register("bubble_slime_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BUBBLE_SLIME, 0x3ab236, 0x57c754,
                    new Item.Properties()));

    public static final RegistryObject<Item> LIQUID_METAL_SLIME_SPAWN_EGG = ITEMS.register("liquid_metal_slime_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.LIQUID_METAL_SLIME, 0xb4b4b4, 0xd6d6d6,
                    new Item.Properties()));

    public static final RegistryObject<Item> DRACKY_SPAWN_EGG = ITEMS.register("dracky_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.DRACKY, 0x25215a, 0x1a164b,
                    new Item.Properties()));

    public static final RegistryObject<Item> GIGANTE_SPAWN_EGG = ITEMS.register("gigante_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.GIGANTE, 0x4dc5f0, 0x1326a7,
                    new Item.Properties()));

    public static final RegistryObject<Item> ATLAS_SPAWN_EGG = ITEMS.register("atlas_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.ATLAS, 0xf5a75a, 0x1a6d53,
                    new Item.Properties()));

    public static final RegistryObject<Item> MEDICINAL_HERB = ITEMS.register("medicinal_herb",
            () -> new ModItemWithDescription(new Item.Properties().food(ModFoods.MEDICINAL_HERB)));

    public static final RegistryObject<Item> STRONG_MEDICINE = ITEMS.register("strong_medicine",
            () -> new ModItemWithDescription(new Item.Properties().food(ModFoods.STRONG_MEDICINE)));

    public static final RegistryObject<Item> SUPERIOR_MEDICINE = ITEMS.register("superior_medicine",
            () -> new ModItemWithDescription(new Item.Properties().food(ModFoods.SUPERIOR_MEDICINE)));

    public static final RegistryObject<Item> YGGDRASIL_LEAF = ITEMS.register("yggdrasil_leaf",
            () -> new ModItemWithDescription(new Item.Properties().food(ModFoods.YGGDRASIL_LEAF)));

    public static final RegistryObject<Item> CHIMAERA_WING = ITEMS.register("chimaera_wing",
            () -> new ChimaeraWingItem(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
