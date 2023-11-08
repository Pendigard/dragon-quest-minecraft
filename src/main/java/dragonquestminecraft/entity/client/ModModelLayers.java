package dragonquestminecraft.entity.client;

import dragonquestminecraft.DragonQuestMinecraft;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation SLIME_LAYER = new ModelLayerLocation(
            new ResourceLocation(DragonQuestMinecraft.MODID, "slime_layer"), "main");
    public static final ModelLayerLocation GOLEM_LAYER = new ModelLayerLocation(
            new ResourceLocation(DragonQuestMinecraft.MODID, "golem_layer"), "main");

    public static final ModelLayerLocation MISCHIEVOUS_MOLE_LAYER = new ModelLayerLocation(
            new ResourceLocation(DragonQuestMinecraft.MODID, "mischievous_mole_layer"), "main");

    public static final ModelLayerLocation KING_SLIME_LAYER = new ModelLayerLocation(
            new ResourceLocation(DragonQuestMinecraft.MODID, "king_slime_layer"), "main");

    public static final ModelLayerLocation BUBBLE_SLIME_LAYER = new ModelLayerLocation(
            new ResourceLocation(DragonQuestMinecraft.MODID, "bubble_slime_layer"), "main");

    public static final ModelLayerLocation DRACKY_LAYER = new ModelLayerLocation(
            new ResourceLocation(DragonQuestMinecraft.MODID, "dracky_layer"), "main");
}
