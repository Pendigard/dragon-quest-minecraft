package dragonquestminecraft.entity.client.dracky;

import com.mojang.blaze3d.vertex.PoseStack;
import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.entity.client.ModModelLayers;
import dragonquestminecraft.entity.client.dracky.DrackyModel;
import dragonquestminecraft.entity.custom.DrackyEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DrackyRenderer extends MobRenderer<DrackyEntity, DrackyModel<DrackyEntity>> {

    public DrackyRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new DrackyModel<>(p_174304_.bakeLayer(ModModelLayers.DRACKY_LAYER)), 0.5f);
        // p_174306 is the shadow radius
    }

    @Override
    public ResourceLocation getTextureLocation(DrackyEntity p_114482_) {
        return new ResourceLocation(DragonQuestMinecraft.MODID, "textures/entity/dracky.png");
    }

    @Override
    public void render(DrackyEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {
            pMatrixStack.scale(1f, 1f, 1f);
        }
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
