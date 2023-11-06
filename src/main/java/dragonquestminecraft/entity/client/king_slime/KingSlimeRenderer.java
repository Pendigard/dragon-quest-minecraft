package dragonquestminecraft.entity.client.king_slime;

import com.mojang.blaze3d.vertex.PoseStack;
import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.entity.client.ModModelLayers;
import dragonquestminecraft.entity.custom.*;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class KingSlimeRenderer extends MobRenderer<KingSlimeEntity, KingSlimeModel<KingSlimeEntity>> {

    public KingSlimeRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new KingSlimeModel<>(p_174304_.bakeLayer(ModModelLayers.KING_SLIME_LAYER)), 2f);
        // p_174306 is the shadow radius
    }

    @Override
    public ResourceLocation getTextureLocation(KingSlimeEntity p_114482_) {
        if (p_114482_ instanceof KingCureslimeEntity) {
            return new ResourceLocation(DragonQuestMinecraft.MODID, "textures/entity/king_cureslime.png");
        }
        else if (p_114482_ instanceof MetalKingSlimeEntity) {
            return new ResourceLocation(DragonQuestMinecraft.MODID, "textures/entity/metal_king_slime.png");
        }
        else {
            return new ResourceLocation(DragonQuestMinecraft.MODID, "textures/entity/king_slime.png");
        }
    }

    @Override
    public void render(KingSlimeEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {
            pMatrixStack.scale(1f, 1f, 1f);
        }
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
