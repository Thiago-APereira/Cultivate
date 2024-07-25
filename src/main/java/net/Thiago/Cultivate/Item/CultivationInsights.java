
package net.Thiago.Cultivate.Item;

import net.Thiago.Cultivate.procedures.EnableCultivationProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class CultivationInsights extends Item {
	public CultivationInsights() {
		super(new Properties().stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("right-click to increase your cultivation"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> retval = super.use( world, entity, hand);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		EnableCultivationProcedure.execute(entity);
		return retval;
	}
}
