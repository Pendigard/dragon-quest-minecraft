package dragonquestminecraft;

import com.mojang.logging.LogUtils;
import dragonquestminecraft.block.ModBlocks;
import dragonquestminecraft.effect.ModEffects;
import dragonquestminecraft.entity.ModEntities;
import dragonquestminecraft.entity.client.bubble_slime.BubbleSlimeRenderer;
import dragonquestminecraft.entity.client.dracky.DrackyRenderer;
import dragonquestminecraft.entity.client.gigante.GiganteModel;
import dragonquestminecraft.entity.client.gigante.GiganteRenderer;
import dragonquestminecraft.entity.client.golem.GolemRenderer;
import dragonquestminecraft.entity.client.king_slime.KingSlimeRenderer;
import dragonquestminecraft.entity.client.mischievous_mole.MischievousMoleRenderer;
import dragonquestminecraft.entity.client.slime.SlimeRenderer;
import dragonquestminecraft.item.ModCreativeModTabs;
import dragonquestminecraft.item.ModItems;
import dragonquestminecraft.loot.ModLootModifiers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(DragonQuestMinecraft.MODID)
public class DragonQuestMinecraft {
    public static final String MODID = "dragonquestminecraft";

    private static final Logger LOGGER = LogUtils.getLogger();

    public DragonQuestMinecraft() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModLootModifiers.register(modEventBus);
        ModEntities.register(modEventBus);
        ModEffects.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntities.SLIME.get(), SlimeRenderer::new);
            EntityRenderers.register(ModEntities.SHESLIME.get(), SlimeRenderer::new);
            EntityRenderers.register(ModEntities.METAL_SLIME.get(), SlimeRenderer::new);
            EntityRenderers.register(ModEntities.GOLEM.get(), GolemRenderer::new);
            EntityRenderers.register(ModEntities.STONE_GOLEM.get(), GolemRenderer::new);
            EntityRenderers.register(ModEntities.GLACIAL_GOLEM.get(), GolemRenderer::new);
            EntityRenderers.register(ModEntities.GOLD_GOLEM.get(), GolemRenderer::new);
            EntityRenderers.register(ModEntities.MISCHIEVOUS_MOLE.get(), MischievousMoleRenderer::new);
            EntityRenderers.register(ModEntities.KING_SLIME.get(), KingSlimeRenderer::new);
            EntityRenderers.register(ModEntities.METAL_KING_SLIME.get(), KingSlimeRenderer::new);
            EntityRenderers.register(ModEntities.KING_CURESLIME.get(), KingSlimeRenderer::new);
            EntityRenderers.register(ModEntities.BUBBLE_SLIME.get(), BubbleSlimeRenderer::new);
            EntityRenderers.register(ModEntities.LIQUID_METAL_SLIME.get(), BubbleSlimeRenderer::new);
            EntityRenderers.register(ModEntities.DRACKY.get(), DrackyRenderer::new);
            EntityRenderers.register(ModEntities.GIGANTE.get(), GiganteRenderer::new);
            EntityRenderers.register(ModEntities.ATLAS.get(), GiganteRenderer::new);
        }
    }
}

