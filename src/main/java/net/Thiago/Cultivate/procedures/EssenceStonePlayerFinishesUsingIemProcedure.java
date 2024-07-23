package net.Thiago.Cultivate.procedures;

import net.Thiago.Cultivate.init.CultivateModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class EssenceStonePlayerFinishesUsingIemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(CultivateModMobEffects.ESSENCE_BOOST.get(), 3600, 1, false, true));
	}
}
