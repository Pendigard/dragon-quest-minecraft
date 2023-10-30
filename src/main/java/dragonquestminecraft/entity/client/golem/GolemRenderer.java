package dragonquestminecraft.entity.client.golem;

import com.mojang.blaze3d.vertex.PoseStack;
import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.entity.client.ModModelLayers;
import dragonquestminecraft.entity.custom.GolemEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GolemRenderer extends MobRenderer<GolemEntity, GolemModel<GolemEntity>> {

    public GolemRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new GolemModel<>(p_174304_.bakeLayer(ModModelLayers.GOLEM_LAYER)), 2f);
        // p_174306 is the shadow radius
    }

    @Override
    public ResourceLocation getTextureLocation(GolemEntity p_114482_) {
        return new ResourceLocation(DragonQuestMinecraft.MODID, "textures/entity/golem.png");
    }

    @Override
    public void render(GolemEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {
            pMatrixStack.scale(1f, 1f, 1f);
        }
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
