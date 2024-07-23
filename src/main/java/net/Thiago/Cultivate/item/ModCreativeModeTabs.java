package net.Thiago.Cultivate.item;

import net.Thiago.Cultivate.Cultivate;
import net.Thiago.Cultivate.init.CultivateModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(modid = Cultivate.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab CULTIVATE_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.@NotNull Register event){
        CULTIVATE_TAB  = event.registerCreativeModeTab(new ResourceLocation(Cultivate.MOD_ID,"cultivate_tab"),
                builder -> builder.icon(()->new ItemStack(CultivateModItems.CULTIVATION_BOOK.get()))
                        .title(Component.translatable("creativemodetab.cultivate_tab")));
    }
}
