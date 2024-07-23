
package net.Thiago.Cultivate.item;

import net.Thiago.Cultivate.procedures.EssenceStonePlayerFinishesUsingIemProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class EssenceStoneItem extends Item {
	public EssenceStoneItem() {
		super(new Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 1;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("right-click to increase cultivation speed"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> retrieval = super.use( world, entity, hand);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		EssenceStonePlayerFinishesUsingIemProcedure.execute(entity);
		return retrieval;
	}
}
