package dragonquestminecraft.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.entity.custom.SheSlimeEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SheSlimeRenderer extends MobRenderer<SheSlimeEntity, SlimeModel<SheSlimeEntity>> {

    public SheSlimeRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new SlimeModel<>(p_174304_.bakeLayer(ModModelLayers.SLIME_LAYER)), 0.5f);
        // p_174306 is the shadow radius
    }

    @Override
    public ResourceLocation getTextureLocation(SheSlimeEntity p_114482_) {
        return new ResourceLocation(DragonQuestMinecraft.MODID, "textures/entity/sheslime.png");
    }

    @Override
    public void render(SheSlimeEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
