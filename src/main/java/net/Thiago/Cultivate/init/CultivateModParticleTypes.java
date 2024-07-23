
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.Thiago.Cultivate.init;

import net.Thiago.Cultivate.Cultivate;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CultivateModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Cultivate.MOD_ID);
	public static final RegistryObject<SimpleParticleType> KI = REGISTRY.register("ki", () -> new SimpleParticleType(true));
}
