package dragonquestminecraft.item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItemWithDescription extends Item {
    public ModItemWithDescription(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        String itemName = this.toString();
        if (Screen.hasShiftDown())
            pTooltipComponents.add(Component.translatable("tooltip.dragonquestminecraft." + itemName + ".tooltip"));
        else {
            pTooltipComponents.add(Component.translatable("tooltip.dragonquestminecraft.slime_drop.tooltip.shift"));
        }
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
