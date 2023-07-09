package net.gigachad.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab no_a_sus_shit = new CreativeModeTab("no_a_sus_shit") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.amogus.get());
        }
    };
}
