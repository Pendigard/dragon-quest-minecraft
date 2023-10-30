package dragonquestminecraft.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class GoldGolemEntity extends GolemEntity {
    public GoldGolemEntity(EntityType<? extends Monster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 200D)
                .add(Attributes.ARMOR_TOUGHNESS, 4D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 1D)
                .add(Attributes.FOLLOW_RANGE, 25D)
                .add(Attributes.MOVEMENT_SPEED, 0.3D)
                .add(Attributes.JUMP_STRENGTH, 2D)
                .add(Attributes.ATTACK_DAMAGE, 15f)
                .add(Attributes.ATTACK_KNOCKBACK, 1f);
    }
}
