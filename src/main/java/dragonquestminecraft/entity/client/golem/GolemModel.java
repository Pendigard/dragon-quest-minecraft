package dragonquestminecraft.entity.client.golem;
// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dragonquestminecraft.entity.animations.ModAnimationGolemDefinitions;
import dragonquestminecraft.entity.custom.GolemEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;


public class GolemModel<T extends Entity> extends HierarchicalModel<T>  {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "golem"), "main");
	private final ModelPart golem;
	private final ModelPart head;

	public GolemModel(ModelPart root) {
		this.golem = root.getChild("golem");
		this.head = golem.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition golem = partdefinition.addOrReplaceChild("golem", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition head = golem.addOrReplaceChild("head", CubeListBuilder.create().texOffs(146, 155).addBox(5.0F, -7.0F, -1.0F, 3.0F, 4.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(151, 3).addBox(-8.0F, -7.0F, -1.0F, 3.0F, 4.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(105, 0).addBox(-8.0F, -3.0F, -1.0F, 16.0F, 3.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(140, 95).addBox(-5.0F, -8.0F, -1.0F, 10.0F, 5.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(0, 86).addBox(-10.0F, -20.0F, -3.0F, 20.0F, 13.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -60.0F, 1.0F));

		PartDefinition chest = golem.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 35).addBox(-22.0F, 7.5F, -8.5F, 44.0F, 9.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-22.0F, -22.5F, -8.5F, 44.0F, 18.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(0, 61).addBox(-20.0F, -4.5F, -6.5F, 40.0F, 12.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -42.5F, -1.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm = golem.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-22.0F, -64.0F, 2.0F, 0.0F, -0.2618F, -0.6981F));

		PartDefinition left_biceps = left_arm.addOrReplaceChild("left_biceps", CubeListBuilder.create().texOffs(118, 129).addBox(-40.0F, -69.0F, -5.0F, 18.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(22.0F, 68.0F, 0.0F));

		PartDefinition left_forearm = left_arm.addOrReplaceChild("left_forearm", CubeListBuilder.create().texOffs(76, 86).addBox(-18.0F, -6.0F, -7.0F, 18.0F, 12.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(60, 112).addBox(-31.0F, -7.0F, -8.0F, 13.0F, 14.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.0F, 3.0F, 0.0F, 0.1745F, 0.5672F, -0.8727F));

		PartDefinition right_arm = golem.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(22.0F, -64.0F, 2.0F, 0.0F, 0.2618F, 0.6981F));

		PartDefinition right_biceps = right_arm.addOrReplaceChild("right_biceps", CubeListBuilder.create().texOffs(126, 77).addBox(-40.0F, -69.0F, -5.0F, 18.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(40.0F, 68.0F, 0.0F));

		PartDefinition right_forearm = right_arm.addOrReplaceChild("right_forearm", CubeListBuilder.create().texOffs(108, 21).addBox(0.0F, -6.0F, -7.0F, 18.0F, 12.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(106, 47).addBox(18.0F, -7.0F, -8.0F, 13.0F, 14.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.0F, 3.0F, 0.0F, -0.1745F, -0.5672F, 0.8727F));

		PartDefinition right_leg = golem.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(16.0F, -26.0F, 0.0F));

		PartDefinition right_thigh = right_leg.addOrReplaceChild("right_thigh", CubeListBuilder.create().texOffs(88, 142).addBox(-4.0F, -13.0F, -5.0F, 9.0F, 13.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 8.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition right_foot = right_leg.addOrReplaceChild("right_foot", CubeListBuilder.create().texOffs(118, 112).addBox(-7.0F, 16.0F, -8.0F, 15.0F, 2.0F, 15.0F, new CubeDeformation(0.0F))
				.texOffs(44, 142).addBox(-5.0F, 0.0F, -6.0F, 11.0F, 16.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 8.0F, 0.0F));

		PartDefinition left_leg = golem.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(-16.0F, -26.0F, 0.0F));

		PartDefinition left_thigh = left_leg.addOrReplaceChild("left_thigh", CubeListBuilder.create().texOffs(124, 147).addBox(-4.0F, -15.0F, -5.0F, 9.0F, 13.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition left_foot = left_leg.addOrReplaceChild("left_foot", CubeListBuilder.create().texOffs(0, 117).addBox(-16.0F, -2.0F, -8.0F, 15.0F, 2.0F, 15.0F, new CubeDeformation(0.0F))
				.texOffs(0, 134).addBox(-14.0F, -18.0F, -6.0F, 11.0F, 16.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 26.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 190, 190);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationGolemDefinitions.GOLEM_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((GolemEntity) entity).idleAnimationState, ModAnimationGolemDefinitions.GOLEM_IDLE, ageInTicks, 1f);
		this.animate(((GolemEntity) entity).attackAnimationState, ModAnimationGolemDefinitions.GOLEM_ATTACK, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = (pNetHeadYaw * ((float)Math.PI / 180F));
		this.head.xRot = -(pHeadPitch * ((float)Math.PI / 180F));
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		golem.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return golem;
	}
}