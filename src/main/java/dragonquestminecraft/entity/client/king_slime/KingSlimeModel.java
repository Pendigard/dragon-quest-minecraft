package dragonquestminecraft.entity.client.king_slime;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dragonquestminecraft.entity.animations.ModAnimationKingSlimeDefinitions;
import dragonquestminecraft.entity.custom.KingSlimeEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;


public class KingSlimeModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "kingslimemodel"), "main");
	private final ModelPart king_slime;

	public KingSlimeModel(ModelPart root) {
		this.king_slime = root.getChild("king_slime");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition king_slime = partdefinition.addOrReplaceChild("king_slime", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = king_slime.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 56).addBox(-16.0F, -2.0F, -15.0F, 32.0F, 2.0F, 30.0F, new CubeDeformation(0.0F))
		.texOffs(0, 88).addBox(-16.0F, -25.0F, -15.0F, 32.0F, 1.0F, 30.0F, new CubeDeformation(0.0F))
		.texOffs(94, 56).addBox(-14.0F, -26.0F, -13.0F, 28.0F, 1.0F, 26.0F, new CubeDeformation(0.0F))
		.texOffs(106, 21).addBox(-6.0F, -27.0F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, -28.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 9).addBox(-3.0F, -30.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 17).addBox(-2.0F, -34.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-18.0F, -24.0F, -17.0F, 36.0F, 22.0F, 34.0F, new CubeDeformation(0.0F))
		.texOffs(12, 28).addBox(-8.0F, -19.0F, -18.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(4.0F, -19.0F, -18.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition crown = king_slime.addOrReplaceChild("crown", CubeListBuilder.create().texOffs(106, 0).addBox(-7.0F, -5.0F, -7.0F, 14.0F, 7.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(94, 107).addBox(-5.0F, -6.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(16, 17).addBox(-2.0F, -8.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(94, 88).addBox(-8.0F, -1.0F, -8.0F, 16.0F, 3.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(22, 25).addBox(-9.0F, -3.0F, -9.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 25).addBox(6.0F, -3.0F, -9.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(13, 23).addBox(6.0F, -3.0F, 6.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(18, 9).addBox(-9.0F, -3.0F, 6.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 56).addBox(-1.0F, -3.0F, -9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 30).addBox(-1.0F, -3.0F, 7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 30).addBox(-9.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(12, 17).addBox(7.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -28.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animateWalk(ModAnimationKingSlimeDefinitions.KING_SLIME_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((KingSlimeEntity) entity).idleAnimationState, ModAnimationKingSlimeDefinitions.KING_SLIME_IDLE, ageInTicks, 1f);
		this.animate(((KingSlimeEntity) entity).attackAnimationState, ModAnimationKingSlimeDefinitions.KING_SLIME_ATTACK, ageInTicks, 1f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		king_slime.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return king_slime;
	}
}