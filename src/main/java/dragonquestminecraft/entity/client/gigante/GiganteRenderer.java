package dragonquestminecraft.entity.client.gigante;

import com.mojang.blaze3d.vertex.PoseStack;
import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.entity.client.ModModelLayers;
import dragonquestminecraft.entity.custom.AtlasEntity;
import dragonquestminecraft.entity.custom.GiganteEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GiganteRenderer extends MobRenderer<GiganteEntity, GiganteModel<GiganteEntity>> {

    public GiganteRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new GiganteModel<>(p_174304_.bakeLayer(ModModelLayers.GIGANTE_LAYER)), 0.5f);
        // p_174306 is the shadow radius
    }

    @Override
    public ResourceLocation getTextureLocation(GiganteEntity p_114482_) {
        if (p_114482_ instanceof AtlasEntity) {
            return new ResourceLocation(DragonQuestMinecraft.MODID, "textures/entity/atlas.png");
        }
        else {
            return new ResourceLocation(DragonQuestMinecraft.MODID, "textures/entity/gigante.png");
        }
    }

    @Override
    public void render(GiganteEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {
            pMatrixStack.scale(1f, 1f, 1f);
        }
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
