package dragonquestminecraft.entity.client.dracky;
// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dragonquestminecraft.entity.animations.ModAnimationDrackyDefinitions;
import dragonquestminecraft.entity.custom.DrackyEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class DrackyModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "drackymodel"), "main");
	private final ModelPart dracky;

	public DrackyModel(ModelPart root) {
		this.dracky = root.getChild("dracky");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition dracky = partdefinition.addOrReplaceChild("dracky", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tail = dracky.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, 3.0F));

		PartDefinition bone_1 = tail.addOrReplaceChild("bone_1", CubeListBuilder.create(), PartPose.offset(0.0F, 9.0F, -3.0F));

		PartDefinition cube_r1 = bone_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0F, 3.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition bone_2 = tail.addOrReplaceChild("bone_2", CubeListBuilder.create(), PartPose.offset(2.0F, 4.0F, 0.0F));

		PartDefinition cube_r2 = bone_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, -1.1781F));

		PartDefinition cube_r3 = bone_2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(4, 0).addBox(-0.25F, 0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, 0.0F, -0.4971F, -0.1719F, -1.4834F));

		PartDefinition body = dracky.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 18).addBox(-5.0F, -9.0F, -3.0F, 10.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 25).addBox(-5.0F, -20.0F, -3.0F, 10.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.0F, -19.0F, -4.0F, 12.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = body.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-3.0F, -18.0F, -3.0F));

		PartDefinition cube_r4 = right_ear.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, -1.0F, 0.3054F, 0.0F, -0.6545F));

		PartDefinition cube_r5 = right_ear.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.2182F, 0.0F, -0.2182F));

		PartDefinition left_ear = body.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(3.0F, -18.0F, -3.0F));

		PartDefinition cube_r6 = left_ear.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(31, 33).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.2182F, 0.0F, 0.2182F));

		PartDefinition cube_r7 = left_ear.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -1.0F, 0.3054F, 0.0F, 0.6545F));

		PartDefinition wings = dracky.addOrReplaceChild("wings", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_wing = wings.addOrReplaceChild("left_wing", CubeListBuilder.create(), PartPose.offset(5.0F, -17.0F, -1.0F));

		PartDefinition cube_r8 = left_wing.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(14, 32).addBox(-5.75F, -0.25F, 0.5F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(32, 23).addBox(-5.75F, -0.25F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r9 = left_wing.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(26, 25).addBox(-1.0F, 0.0F, 0.0F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-1.0F, 0.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition right_wing = wings.addOrReplaceChild("right_wing", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, -17.0F, -1.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r10 = right_wing.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(32, 0).addBox(-5.75F, -0.25F, -0.5F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(32, 5).addBox(-5.75F, -0.25F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r11 = right_wing.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 18).addBox(-1.0F, 0.0F, -1.0F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(31, 31).addBox(-1.0F, 0.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition foot = dracky.addOrReplaceChild("foot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_feet = foot.addOrReplaceChild("right_feet", CubeListBuilder.create().texOffs(8, 34).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 32).addBox(-3.0F, 2.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -9.0F, -3.0F, -0.1309F, 0.0F, 0.3927F));

		PartDefinition left_feet = foot.addOrReplaceChild("left_feet", CubeListBuilder.create().texOffs(4, 34).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 6).addBox(0.0F, 2.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -9.0F, -3.0F, -0.1309F, 0.0F, -0.3927F));

		return LayerDefinition.create(meshdefinition, 45, 37);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animateWalk(ModAnimationDrackyDefinitions.DRACKY_IDLE, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((DrackyEntity) entity).idleAnimationState, ModAnimationDrackyDefinitions.DRACKY_IDLE, ageInTicks, 1f);

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		dracky.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return dracky;
	}
}