package dragonquestminecraft.entity.client.mischievous_mole;
// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dragonquestminecraft.entity.animations.ModAnimationMischievousMoleDefinitions;
import dragonquestminecraft.entity.custom.MischievousMoleEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class MischievousMoleModel<T extends Entity> extends HierarchicalModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "mischievous_mole"), "main");
	private final ModelPart mole;

	public MischievousMoleModel(ModelPart root) {
		this.mole = root.getChild("mole");
	}

	public static LayerDefinition createBodyLayer() {

		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition mole = partdefinition.addOrReplaceChild("mole", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = mole.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 23).addBox(-7.0F, -11.0F, -5.0F, 14.0F, 11.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(45, 0).addBox(-6.0F, -12.0F, -4.0F, 12.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 23).addBox(-1.0F, 0.0F, -7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(38, 27).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -17.0F, 0.0F));

		PartDefinition body = mole.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 44).addBox(-8.0F, -2.0F, -3.0F, 16.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(41, 37).addBox(-8.0F, -17.0F, -3.0F, 16.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-9.0F, -16.0F, -4.0F, 18.0F, 14.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = mole.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 54).addBox(-3.0F, -1.0F, -2.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(48, 27).addBox(-4.0F, 4.0F, -3.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -15.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition left_arm = mole.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(54, 9).addBox(3.0F, -2.0F, -2.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(46, 45).addBox(2.0F, 3.0F, -3.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, -11.0F, 0.0F, -0.3054F, 0.0F, -1.5708F));

		PartDefinition shovel = left_arm.addOrReplaceChild("shovel", CubeListBuilder.create().texOffs(38, 23).addBox(-8.0F, 4.0F, -1.0F, 24.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 58).addBox(16.0F, 4.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = shovel.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.5F, 5.0F, 1.5F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r2 = shovel.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 52).addBox(-3.0F, -1.0F, 1.0F, 9.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.0F, 5.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = shovel.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(20, 52).addBox(-3.0F, -4.0F, 1.0F, 9.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.0F, 5.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_feet = mole.addOrReplaceChild("right_feet", CubeListBuilder.create().texOffs(52, 54).addBox(-1.5F, -0.5F, -2.3333F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-1.5F, -0.5F, -3.3333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 23).addBox(0.5F, -0.5F, -3.3333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, -0.5F, -0.6667F, 0.0F, -0.3054F, 0.0F));

		PartDefinition left_feet = mole.addOrReplaceChild("left_feet", CubeListBuilder.create().texOffs(54, 17).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 7).addBox(-2.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 6).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 0.0F, -1.0F, 0.0F, 0.3054F, 0.0F));

		return LayerDefinition.create(meshdefinition, 90, 70);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animateWalk(ModAnimationMischievousMoleDefinitions.MISCHIEVOUS_MOLE_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((MischievousMoleEntity) entity).idleAnimationState, ModAnimationMischievousMoleDefinitions.MISCHIEVOUS_MOLE_IDLE, ageInTicks, 1f);
		this.animate(((MischievousMoleEntity) entity).attackAnimationState, ModAnimationMischievousMoleDefinitions.MISCHIEVOUS_MOLE_ATTACK, ageInTicks, 1f);

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		mole.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return mole;
	}
}