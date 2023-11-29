package dragonquestminecraft.entity.client.gigante;
// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import dragonquestminecraft.entity.animations.ModAnimationGiganteDefinitions;
import dragonquestminecraft.entity.custom.GiganteEntity;
import net.minecraft.client.model.HierarchicalModel;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class GiganteModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "gigantemodel"), "main");
	private final ModelPart gigante;
	private final ModelPart head;

	public GiganteModel(ModelPart root) {
		this.gigante = root.getChild("gigante");
		this.head = gigante.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition gigante = partdefinition.addOrReplaceChild("gigante", CubeListBuilder.create(), PartPose.offset(0.0F, -20.0F, 0.0F));

		PartDefinition chest = gigante.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 37).addBox(-24.0F, -47.0F, -12.0F, 48.0F, 20.0F, 21.0F, new CubeDeformation(0.0F))
				.texOffs(1, 79).addBox(-22.0F, -27.0F, -10.0F, 44.0F, 27.0F, 19.0F, new CubeDeformation(0.0F))
				.texOffs(268, 43).addBox(1.0F, -47.0F, -14.0F, 23.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(259, 100).addBox(-18.0F, -27.0F, -11.0F, 36.0F, 15.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(208, 140).addBox(-24.0F, -47.0F, -14.0F, 23.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = gigante.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-29.0F, -43.0F, 0.0F, 0.0F, 0.3927F, -1.1781F));

		PartDefinition right_biceps = right_arm.addOrReplaceChild("right_biceps", CubeListBuilder.create().texOffs(184, 194).addBox(-81.1667F, -0.0417F, -9.5F, 19.0F, 13.0F, 19.0F, new CubeDeformation(0.0F))
				.texOffs(196, 29).addBox(-62.1667F, -1.0417F, -10.5F, 15.0F, 14.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(52.1667F, -4.9583F, -1.5F));

		PartDefinition right_forearm = right_arm.addOrReplaceChild("right_forearm", CubeListBuilder.create().texOffs(180, 72).addBox(-13.0F, -6.25F, -11.5F, 19.0F, 12.75F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-34.0F, 1.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition right_fist = right_forearm.addOrReplaceChild("right_fist", CubeListBuilder.create().texOffs(184, 194).addBox(-91.0F, -50.0F, 5.0F, 3.0F, 14.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 78).addBox(-91.0F, -50.0F, -1.0F, 3.0F, 14.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 37).addBox(-91.0F, -50.0F, -7.0F, 3.0F, 14.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(190, 0).addBox(-91.0F, -50.0F, -12.0F, 3.0F, 14.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(220, 233).addBox(-88.0F, -50.0F, -12.0F, 12.0F, 14.0F, 21.0F, new CubeDeformation(0.0F))
				.texOffs(168, 50).addBox(-88.0F, -38.0F, -12.0F, 6.0F, 5.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(57, 195).addBox(-82.0F, -38.0F, -12.0F, 6.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(63.0F, 42.0F, 0.0F));

		PartDefinition left_arm = gigante.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(29.1667F, -44.9583F, -1.5F, 0.0F, 0.5236F, 1.0472F));

		PartDefinition left_biceps = left_arm.addOrReplaceChild("left_biceps", CubeListBuilder.create().texOffs(0, 195).addBox(15.8333F, -0.0417F, -9.5F, 19.0F, 13.0F, 19.0F, new CubeDeformation(0.0F))
				.texOffs(208, 105).addBox(0.8333F, -1.0417F, -10.5F, 15.0F, 14.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -3.0F, 0.0F));

		PartDefinition left_forearm = left_arm.addOrReplaceChild("left_forearm", CubeListBuilder.create().texOffs(184, 161).addBox(-4.0F, -5.25F, -11.5F, 19.0F, 12.75F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(32.8333F, 1.9583F, 1.5F, 0.0F, 0.6981F, 0.0F));

		PartDefinition left_fist = left_forearm.addOrReplaceChild("left_fist", CubeListBuilder.create().texOffs(0, 195).addBox(15.7143F, -9.1429F, 7.6429F, 3.0F, 14.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 168).addBox(15.7143F, -9.1429F, 1.6429F, 3.0F, 14.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(184, 161).addBox(15.7143F, -9.1429F, -4.3571F, 3.0F, 14.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(220, 226).addBox(15.7143F, -9.1429F, -9.3571F, 3.0F, 14.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(241, 173).addBox(3.7143F, -9.1429F, -9.3571F, 12.0F, 14.0F, 21.0F, new CubeDeformation(0.0F))
				.texOffs(268, 278).addBox(9.7143F, 2.8571F, -9.3571F, 6.0F, 5.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(52, 227).addBox(3.7143F, 2.8571F, -9.3571F, 6.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.2857F, 2.1429F, -2.6429F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cloth = gigante.addOrReplaceChild("cloth", CubeListBuilder.create().texOffs(258, 64).addBox(-22.0F, -28.0F, -16.0F, 23.0F, 28.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(136, 254).addBox(-22.0F, -28.0F, 4.0F, 23.0F, 28.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(96, 264).addBox(-24.0F, -49.0F, -16.0F, 14.0F, 49.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(242, 140).addBox(-24.0F, -49.0F, -12.0F, 14.0F, 9.0F, 20.0F, new CubeDeformation(0.0F))
				.texOffs(60, 264).addBox(-24.0F, -49.0F, 8.0F, 14.0F, 49.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(110, 50).addBox(-36.0F, -52.0F, -16.0F, 15.0F, 14.0F, 28.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-26.0F, 0.0F, -17.0F, 49.0F, 7.0F, 30.0F, new CubeDeformation(0.0F))
				.texOffs(0, 155).addBox(-25.0F, 7.0F, -16.0F, 47.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(117, 37).addBox(-25.0F, 7.0F, 9.0F, 47.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = cloth.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(264, 246).addBox(-1.0F, 1.0F, -13.0F, 4.0F, 10.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.5672F));

		PartDefinition cube_r2 = cloth.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(238, 278).addBox(-1.0F, 1.0F, -13.0F, 4.0F, 10.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.0F, 6.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r3 = cloth.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(92, 161).addBox(-4.5F, -23.5F, 16.0F, 15.0F, 58.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(138, 161).addBox(-4.5F, -23.5F, -4.0F, 15.0F, 58.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5F, -23.5F, -12.0F, 0.0F, 0.0F, -0.5672F));

		PartDefinition head = gigante.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 168).addBox(-10.0F, -7.0F, -9.0F, 23.0F, 8.0F, 19.0F, new CubeDeformation(0.0F))
				.texOffs(190, 0).addBox(-10.0F, -18.0F, -9.0F, 23.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
				.texOffs(247, 213).addBox(-10.0F, -14.0F, -3.0F, 23.0F, 7.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(65, 168).addBox(-10.0F, -14.0F, -9.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(62, 125).addBox(-4.0F, -14.0F, -10.0F, 11.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(128, 0).addBox(8.0F, -14.0F, -9.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(180, 105).addBox(-3.0F, -21.0F, -4.0F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.0F, -26.0F, -3.0F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -48.0F, -6.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(168, 50).addBox(-24.0F, -13.5F, -1.5F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, -10.5F, -1.5F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(76, 210).addBox(-3.0F, -3.5F, -1.5F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, -10.5F, -1.5F, 0.0F, 0.0F, 0.4363F));

		PartDefinition left_leg = gigante.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition left_thigh = left_leg.addOrReplaceChild("left_thigh", CubeListBuilder.create(), PartPose.offset(13.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = left_thigh.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(68, 227).addBox(-9.0F, -2.0F, -7.0F, 18.0F, 21.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition left_ankle = left_leg.addOrReplaceChild("left_ankle", CubeListBuilder.create(), PartPose.offset(14.0F, 18.0F, 0.0F));

		PartDefinition cube_r7 = left_ankle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 264).addBox(-8.0F, -2.0F, -10.0F, 16.0F, 20.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition left_feet = left_leg.addOrReplaceChild("left_feet", CubeListBuilder.create().texOffs(128, 0).addBox(-9.5F, -0.6429F, -15.5714F, 19.0F, 6.0F, 24.0F, new CubeDeformation(0.0F))
				.texOffs(207, 105).addBox(-9.5F, 0.3571F, -19.5714F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(168, 71).addBox(-8.5F, 1.3571F, -22.5714F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(120, 227).addBox(-2.5F, 0.3571F, -19.5714F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(130, 161).addBox(-1.5F, 1.3571F, -22.5714F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(62, 139).addBox(3.5F, 0.3571F, -19.5714F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(172, 30).addBox(4.5F, 1.3571F, -22.5714F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.5F, 38.6429F, -1.4286F, 0.0F, -0.2618F, 0.0F));

		PartDefinition right_leg = gigante.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.0F, 0.0F, -2.0F, 0.0F, 0.48F, 0.0F));

		PartDefinition right_thigh = right_leg.addOrReplaceChild("right_thigh", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r8 = right_thigh.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 227).addBox(-9.0F, -2.0F, -7.0F, 18.0F, 21.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition right_ankle = right_leg.addOrReplaceChild("right_ankle", CubeListBuilder.create(), PartPose.offset(0.0F, 19.0F, -1.0F));

		PartDefinition cube_r9 = right_ankle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(260, 9).addBox(-8.0F, -4.0F, -13.0F, 16.0F, 20.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 0.0F, 1.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition right_feet = right_leg.addOrReplaceChild("right_feet", CubeListBuilder.create().texOffs(0, 125).addBox(-9.5F, -0.6429F, -15.5714F, 19.0F, 6.0F, 24.0F, new CubeDeformation(0.0F))
				.texOffs(0, 137).addBox(-9.5F, 0.3571F, -19.5714F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(158, 30).addBox(-8.5F, 1.3571F, -22.5714F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(82, 139).addBox(-2.5F, 0.3571F, -19.5714F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(117, 50).addBox(-1.5F, 1.3571F, -22.5714F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(128, 13).addBox(3.5F, 0.3571F, -19.5714F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(86, 148).addBox(4.5F, 1.3571F, -22.5714F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 38.6429F, -2.4286F, 0.0F, -0.3491F, 0.0F));

		PartDefinition club = gigante.addOrReplaceChild("club", CubeListBuilder.create().texOffs(132, 290).addBox(-6.0833F, 11.0F, -2.8333F, 7.0F, 44.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(163, 226).addBox(-11.0833F, 4.0F, -7.8333F, 18.0F, 7.0F, 21.0F, new CubeDeformation(0.0F))
				.texOffs(198, 268).addBox(-9.0833F, 11.0F, -5.8333F, 14.0F, 7.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(100, 97).addBox(-15.0833F, -32.0F, -10.8333F, 26.0F, 36.0F, 28.0F, new CubeDeformation(0.0F))
				.texOffs(0, 125).addBox(-9.0833F, -18.0F, -16.8333F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(9.9167F, -29.0F, 3.1667F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(51.0833F, -44.0F, -45.1667F, 0.2284F, -0.2046F, 0.151F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationGiganteDefinitions.GIGANTE_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((GiganteEntity) entity).idleAnimationState, ModAnimationGiganteDefinitions.GIGANTE_IDLE, ageInTicks, 1f);
		this.animate(((GiganteEntity) entity).attackAnimationState, ModAnimationGiganteDefinitions.GIGANTE_ATTACK, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = (pNetHeadYaw * ((float)Math.PI / 180F));
		this.head.xRot = (pHeadPitch * ((float)Math.PI / 180F));
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		gigante.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return gigante;
	}
}