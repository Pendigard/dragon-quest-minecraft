package dragonquestminecraft.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class ChimaeraWingItem extends Item {
    public ChimaeraWingItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        //Get the world spawn coordinates
        BlockPos pos = pLevel.getSharedSpawnPos();
        //Teleport the player to the spawn coordinates
        pPlayer.teleportTo(pos.getX(), pos.getY(), pos.getZ());
        //Remove the item from the player's inventory
        //pPlayer.getInventory().clearOrCountMatchingItems(this::equals, 1, pPlayer.getInventory());
        pPlayer.getInventory().removeItem(new ItemStack(this));
        return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));
    }
}
