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
                                p_259752_.accept(ModItems.SLIME_DROP.get());
                                p_259752_.accept(ModItems.RAW_ORICHALCUM.get());
                                p_259752_.accept(ModItems.ORICHALCUM_INGOT.get());
                                p_259752_.accept(ModBlocks.ORICHALCUM_ORE.get());
                            })
                            .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
