package dragonquestminecraft.item;

import dragonquestminecraft.DragonQuestMinecraft;
import dragonquestminecraft.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier METAL_SLIME = TierSortingRegistry.registerTier(
            new ForgeTier(7, 1500, 1.8f, 10f, 25,
                    ModTags.Blocks.METAL_SLIME_TOOL, () -> Ingredient.of(ModItems.MOLTEN_GLOBULES.get())),
            new ResourceLocation(DragonQuestMinecraft.MODID, "metal_slime"), List.of(Tiers.NETHERITE), List.of()
    );
}
