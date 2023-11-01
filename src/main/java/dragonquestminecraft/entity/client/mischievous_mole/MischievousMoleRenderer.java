package dragonquestminecraft.entity.client.mischievous_mole;

import com.mojang.blaze3d.vertex.PoseStack;
import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.entity.client.ModModelLayers;
import dragonquestminecraft.entity.custom.MischievousMoleEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MischievousMoleRenderer extends MobRenderer<MischievousMoleEntity, MischievousMoleModel<MischievousMoleEntity>> {

    public MischievousMoleRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new MischievousMoleModel<>(p_174304_.bakeLayer(ModModelLayers.MISCHIEVOUS_MOLE_LAYER)), 1.2f);
        // p_174306 is the shadow radius
    }

    @Override
    public ResourceLocation getTextureLocation(MischievousMoleEntity p_114482_) {
        return new ResourceLocation(DragonQuestMinecraft.MODID, "textures/entity/mischievous_mole.png");
    }

    @Override
    public void render(MischievousMoleEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {
            pMatrixStack.scale(1f, 1f, 1f);
        }
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
