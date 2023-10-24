package dragonquestminecraft.item;

import dragonquestminecraft.DragonQuestMinecraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DragonQuestMinecraft.MODID);

    public static final RegistryObject<Item> SLIME_DROP = ITEMS.register("slime_drop",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ORICHALCUM = ITEMS.register("raw_orichalcum",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ORICHALCUM_INGOT = ITEMS.register("orichalcum_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MINI_MEDAL = ITEMS.register("mini_medal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOLTEN_GLOBULES = ITEMS.register("molten_globules",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MAGIC_BEAST_HIDE = ITEMS.register("magic_beast_hide",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MIRROR_STONE = ITEMS.register("mirror_stone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHRONOCRYSTAL = ITEMS.register("chronocrystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  ETHEREAL_STONE = ITEMS.register("ethereal_stone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  SAINTED_SOMA = ITEMS.register("sainted_soma",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  ROYAL_RUBY = ITEMS.register("royal_ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  SAVVY_SAPPHIRE = ITEMS.register("savvy_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  EQUABLE_EMERALD = ITEMS.register("equable_emerald",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  SUNNY_CITRINE = ITEMS.register("sunny_citrine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  ARTFUL_AMETHYST = ITEMS.register("artful_amethyst",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  SLIME_CROWN = ITEMS.register("slime_crown",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  ROYAL_SOIL = ITEMS.register("royal_soil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  DENSINIUM = ITEMS.register("densinium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  MAGIC_BEAST_HORN = ITEMS.register("magic_beast_horn",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  METAL_SLIME_SWORD = ITEMS.register("metal_slime_sword",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
