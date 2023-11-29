package dragonquestminecraft.item.custom;

import dragonquestminecraft.item.ModItemWithDescription;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class ChimaeraWingItem extends ModItemWithDescription {
    public ChimaeraWingItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public int getUseDuration(ItemStack itemStack) {
        return 32;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pUsedHand);
        if (!pLevel.isClientSide()) {
            ServerPlayer player = (ServerPlayer) pPlayer;
            pLevel.playSound(null, player, SoundEvents.PORTAL_TRIGGER, SoundSource.PLAYERS, 0.1f, 2f);
        }
        pPlayer.startUsingItem(pUsedHand);
        return InteractionResultHolder.consume(itemstack);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntity) {
        if (!pLevel.isClientSide() && pEntity instanceof ServerPlayer) {
            ServerPlayer player = (ServerPlayer) pEntity;
            BlockPos pos = player.getRespawnPosition();
            //Teleport the player to the spawn coordinates
            player.teleportTo(pos.getX(), pos.getY(), pos.getZ());
            //Remove the item from the player's inventory
            if (!player.getAbilities().instabuild) {
                pStack.shrink(1);
            }
        }
        return pStack;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.BOW;
    }
}
