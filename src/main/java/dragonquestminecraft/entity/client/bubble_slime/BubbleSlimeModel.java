package dragonquestminecraft.entity.client.bubble_slime;
// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import dragonquestminecraft.entity.animations.ModAnimationBubbleSlimeDefinitions;
import dragonquestminecraft.entity.custom.BubbleSlimeEntity;
import net.minecraft.client.model.HierarchicalModel;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class BubbleSlimeModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "bubbleslimemodel"), "main");
	private final ModelPart bubble_slime;

	public BubbleSlimeModel(ModelPart root) {
		this.bubble_slime = root.getChild("bubble_slime");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bubble_slime = partdefinition.addOrReplaceChild("bubble_slime", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition face = bubble_slime.addOrReplaceChild("face", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, -5.0F, -1.0F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = face.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(29, 29).addBox(-7.75F, 1.75F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -2.5F, 1.5F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r2 = face.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(31, 39).addBox(0.5F, -2.75F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -3.0F, 5.0F, 0.4666F, 0.4098F, 0.9015F));

		PartDefinition cube_r3 = face.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 30).addBox(-0.25F, -2.25F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -2.5F, 1.5F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r4 = face.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 15).addBox(-3.5F, -1.5F, -0.5F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.5F, 4.5F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r5 = face.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -2.75F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -3.0F, -2.0F, -0.4382F, -0.4403F, 0.8326F));

		PartDefinition cube_r6 = face.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(36, 0).addBox(-3.5F, -1.5F, -0.5F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.5F, -1.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r7 = face.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(14, 40).addBox(-1.5F, -2.75F, -1.5F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, -3.0F, -2.0F, -0.6214F, 0.5901F, -0.9101F));

		PartDefinition cube_r8 = face.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(25, 37).addBox(-2.25F, -3.0F, 0.0F, 1.0F, 5.25F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, -3.0F, 5.0F, 0.3819F, -0.4891F, -0.7073F));

		PartDefinition body = bubble_slime.addOrReplaceChild("body", CubeListBuilder.create().texOffs(19, 11).addBox(-4.0F, -1.0F, 5.0F, 11.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(-4.0F, -1.0F, -8.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(36, 34).addBox(-8.0F, -1.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(28, 23).addBox(8.0F, -1.0F, 0.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-5.0F, -1.0F, -5.0F, 13.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(16, 23).addBox(-0.75F, 0.0F, -3.25F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -1.0F, 5.0F, 0.0F, -0.9599F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(17, 15).addBox(-1.75F, 0.0F, -4.0F, 3.0F, 1.0F, 6.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -1.0F, 5.0F, 0.0F, 0.6545F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(36, 6).addBox(-3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -1.0F, -4.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 35).addBox(-3.0F, 0.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -1.0F, -4.0F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(20, 30).addBox(-3.0F, -3.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 2.0F, -4.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 27).addBox(-3.5F, -0.5F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, -0.5F, -1.5F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(36, 29).addBox(-2.5F, 0.0F, -5.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -1.0F, -2.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition bubble_1 = bubble_slime.addOrReplaceChild("bubble_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bubble_1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(6, 43).addBox(-1.0F, 0.0F, -0.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -2.0F, 2.0F, -0.8345F, 0.3035F, -0.3185F));

		PartDefinition bubble_2 = bubble_slime.addOrReplaceChild("bubble_2", CubeListBuilder.create().texOffs(8, 20).addBox(-8.0F, -1.0F, 4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -7.0F));

		PartDefinition bubble_3 = bubble_slime.addOrReplaceChild("bubble_3", CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -7.0F));

		PartDefinition bubble_4 = bubble_slime.addOrReplaceChild("bubble_4", CubeListBuilder.create(), PartPose.offset(-3.0F, -9.0F, -2.0F));

		PartDefinition cube_r17 = bubble_4.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(41, 21).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9058F, 0.3463F, -0.189F));

		PartDefinition bubble_5 = bubble_slime.addOrReplaceChild("bubble_5", CubeListBuilder.create(), PartPose.offset(5.0F, -7.0F, 6.0F));

		PartDefinition cube_r18 = bubble_5.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2836F, 0.2087F, 0.4495F));

		PartDefinition bubble_6 = bubble_slime.addOrReplaceChild("bubble_6", CubeListBuilder.create(), PartPose.offset(-1.0F, -7.0F, 3.0F));

		PartDefinition cube_r19 = bubble_6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(6, 2).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 0.5F, -0.5F, -0.3058F, -0.432F, 0.2521F));

		PartDefinition bubble_7 = bubble_slime.addOrReplaceChild("bubble_7", CubeListBuilder.create(), PartPose.offset(6.0F, -5.0F, -3.0F));

		PartDefinition cube_r20 = bubble_7.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1077F, 0.7403F, -0.4363F, 0.1107F, -0.2685F, 0.3974F));

		PartDefinition bubble_8 = bubble_slime.addOrReplaceChild("bubble_8", CubeListBuilder.create(), PartPose.offset(8.0F, -11.0F, 1.0F));

		PartDefinition cube_r21 = bubble_8.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(37, 40).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8487F, 0.27F, -0.1446F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animateWalk(ModAnimationBubbleSlimeDefinitions.BUBBLE_SLIME_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((BubbleSlimeEntity) entity).idleAnimationState, ModAnimationBubbleSlimeDefinitions.BUBBLE_SLIME_IDLE, ageInTicks, 1f);

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bubble_slime.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return bubble_slime;
	}
}