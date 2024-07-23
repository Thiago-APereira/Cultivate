
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.Thiago.Cultivate.init;

import net.Thiago.Cultivate.Cultivate;
import net.Thiago.Cultivate.potion.EssenceBoostMobEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CultivateModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Cultivate.MOD_ID);
	public static final RegistryObject<MobEffect> ESSENCE_BOOST = REGISTRY.register("essence_boost", () -> new EssenceBoostMobEffect());
}
