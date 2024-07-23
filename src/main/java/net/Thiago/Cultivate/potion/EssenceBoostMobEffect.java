
package net.Thiago.Cultivate.potion;

import net.Thiago.Cultivate.procedures.EssenceBoostEffectExpiresProcedure;
import net.Thiago.Cultivate.procedures.EssenceStonePlayerFinishesUsingItemProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class EssenceBoostMobEffect extends MobEffect {
	public EssenceBoostMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16738345);
	}

	@Override
	public String getDescriptionId() {
		return "effect.cultivate.essence_boost";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		EssenceStonePlayerFinishesUsingItemProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		EssenceBoostEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
