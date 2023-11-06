package dragonquestminecraft.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

public class SheSlimeEntity extends SlimeEntity {
    public SheSlimeEntity(EntityType<? extends Monster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 6D)
                .add(Attributes.FOLLOW_RANGE, 20D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.JUMP_STRENGTH, 6D)
                .add(Attributes.ATTACK_DAMAGE, 1.5f)
                .add(Attributes.ATTACK_KNOCKBACK, 0.25f);
    }

    public static boolean canSheSpawn(EntityType<SheSlimeEntity> entityType, ServerLevelAccessor level, MobSpawnType spawnType, BlockPos pos, RandomSource random) {
        return level.getDifficulty() != Difficulty.PEACEFUL && pos.getY() >= 62;
    }
}
