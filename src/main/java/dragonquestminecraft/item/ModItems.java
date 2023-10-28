package dragonquestminecraft.item;

import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.entity.ModEntities;
import net.minecraft.world.item.Item;
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
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SLIME_SPAWN_EGG = ITEMS.register("dq_slime_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.SLIME, 0x00c9ff, 0x0083ff,
                    new Item.Properties()));

    public static final RegistryObject<Item> MEDICINAL_HERB = ITEMS.register("medicinal_herb",
            () -> new ModItemWithDescription(new Item.Properties().food(ModFoods.MEDICINAL_HERB)));

    public static final RegistryObject<Item> STRONG_MEDICINE = ITEMS.register("strong_medicine",
            () -> new ModItemWithDescription(new Item.Properties().food(ModFoods.STRONG_MEDICINE)));

    public static final RegistryObject<Item> SUPERIOR_MEDICINE = ITEMS.register("superior_medicine",
            () -> new ModItemWithDescription(new Item.Properties().food(ModFoods.SUPERIOR_MEDICINE)));

    public static final RegistryObject<Item> YGGDRASIL_LEAF = ITEMS.register("yggdrasil_leaf",
            () -> new ModItemWithDescription(new Item.Properties().food(ModFoods.YGGDRASIL_LEAF)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
