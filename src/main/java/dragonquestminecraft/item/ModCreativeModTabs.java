package dragonquestminecraft.item;

import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DragonQuestMinecraft.MODID);

    public static final RegistryObject<CreativeModeTab> DRAGONQUESTMINECRAFT_TAB =
            CREATIVE_MODE_TABS.register("dragon_quest_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SLIME_DROP.get()))
                            .title(Component.translatable("creativetab.dragon_quest_tab"))
                            .displayItems((p_270258_, p_259752_) ->  {
                                p_259752_.accept(ModItems.MINI_MEDAL.get());
                                p_259752_.accept(ModItems.SLIME_DROP.get());
                                p_259752_.accept(ModItems.MOLTEN_GLOBULES.get());
                                p_259752_.accept(ModItems.SLIME_CROWN.get());
                                p_259752_.accept(ModItems.MAGIC_BEAST_HIDE.get());
                                p_259752_.accept(ModItems.MAGIC_BEAST_HORN.get());
                                p_259752_.accept(ModItems.MIRROR_STONE.get());
                                p_259752_.accept(ModItems.CHRONOCRYSTAL.get());
                                p_259752_.accept(ModItems.ETHEREAL_STONE.get());
                                p_259752_.accept(ModItems.SAINTED_SOMA.get());
                                p_259752_.accept(ModItems.ROYAL_RUBY.get());
                                p_259752_.accept(ModItems.SAVVY_SAPPHIRE.get());
                                p_259752_.accept(ModItems.EQUABLE_EMERALD.get());
                                p_259752_.accept(ModItems.SUNNY_CITRINE.get());
                                p_259752_.accept(ModItems.ARTFUL_AMETHYST.get());
                                p_259752_.accept(ModItems.ROYAL_SOIL.get());
                                p_259752_.accept(ModItems.DENSINIUM.get());
                                p_259752_.accept(ModItems.MEDICINAL_HERB.get());
                                p_259752_.accept(ModItems.STRONG_MEDICINE.get());
                                p_259752_.accept(ModItems.SUPERIOR_MEDICINE.get());
                                p_259752_.accept(ModItems.YGGDRASIL_LEAF.get());
                                p_259752_.accept(ModItems.METAL_SLIME_SWORD.get());
                                p_259752_.accept(ModItems.RAW_ORICHALCUM.get());
                                p_259752_.accept(ModItems.ORICHALCUM_INGOT.get());
                                p_259752_.accept(ModBlocks.ORICHALCUM_ORE.get());
                                p_259752_.accept(ModItems.SLIME_SPAWN_EGG.get());
                                p_259752_.accept(ModItems.SHESLIME_SPAWN_EGG.get());
                                p_259752_.accept(ModItems.METAL_SLIME_SPAWN_EGG.get());
                                p_259752_.accept(ModItems.GOLEM_SPAWN_EGG.get());
                            })
                            .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
