package dragonquestminecraft.entity.client.bubble_slime;

import com.mojang.blaze3d.vertex.PoseStack;
import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.entity.client.ModModelLayers;
import dragonquestminecraft.entity.client.bubble_slime.BubbleSlimeModel;
import dragonquestminecraft.entity.custom.*;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BubbleSlimeRenderer extends MobRenderer<BubbleSlimeEntity, BubbleSlimeModel<BubbleSlimeEntity>> {

    public BubbleSlimeRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new BubbleSlimeModel<>(p_174304_.bakeLayer(ModModelLayers.GOLEM_LAYER)), 2f);
        // p_174306 is the shadow radius
    }

    @Override
    public ResourceLocation getTextureLocation(BubbleSlimeEntity p_114482_) {
        if (p_114482_ instanceof LiquidMetalSlimeEntity) {
            return new ResourceLocation(DragonQuestMinecraft.MODID, "textures/entity/liquid_metal_slime.png");
        }
        else {
            return new ResourceLocation(DragonQuestMinecraft.MODID, "textures/entity/bubble_slime.png");
        }
    }

    @Override
    public void render(BubbleSlimeEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {
            pMatrixStack.scale(1f, 1f, 1f);
        }
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
