package dragonquestminecraft.util;

import dragonquestminecraft.DragonQuestMinecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_SLIME_TOOL = tag("metal_slime_tool");
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(DragonQuestMinecraft.MODID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(DragonQuestMinecraft.MODID, name));
        }

    }
}
