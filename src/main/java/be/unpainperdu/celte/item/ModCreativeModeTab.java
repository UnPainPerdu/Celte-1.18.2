package be.unpainperdu.celte.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CELTE_TAB = new CreativeModeTab( "celtetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BRONZE_SWORD.get());
        }
    };
}
