package net.gigachad.tutorialmod.item;

import net.gigachad.tutorialmod.TutorialMod;
import net.gigachad.tutorialmod.block.ModBlocks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);


    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.no_a_sus_shit)));

    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.no_a_sus_shit)));

    public static final RegistryObject<Item> amogus = ITEMS.register("amogus",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.no_a_sus_shit)));

    public static final RegistryObject<Item> BLUEBERRY_SEEDS = ITEMS.register("blueberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.no_a_sus_shit)));

    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.no_a_sus_shit)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
