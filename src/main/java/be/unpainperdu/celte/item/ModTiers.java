package be.unpainperdu.celte.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier BRONZE = new ForgeTier(2, 200, 5.0f,
            2f, 15, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.BRONZE_INGOT.get())); // item pour réparer

}
