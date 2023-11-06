package dragonquestminecraft.event;

import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.entity.client.ModModelLayers;
import dragonquestminecraft.entity.client.bubble_slime.BubbleSlimeModel;
import dragonquestminecraft.entity.client.golem.GolemModel;
import dragonquestminecraft.entity.client.king_slime.KingSlimeModel;
import dragonquestminecraft.entity.client.mischievous_mole.MischievousMoleModel;
import dragonquestminecraft.entity.client.slime.SlimeModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DragonQuestMinecraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.SLIME_LAYER, SlimeModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.GOLEM_LAYER, GolemModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.MISCHIEVOUS_MOLE_LAYER, MischievousMoleModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.KING_SLIME_LAYER, KingSlimeModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BUBBLE_SLIME_LAYER, BubbleSlimeModel::createBodyLayer);
    }
}
