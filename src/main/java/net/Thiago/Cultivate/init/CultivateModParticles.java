
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.Thiago.Cultivate.init;

import net.Thiago.Cultivate.client.particle.KiParticle;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CultivateModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(CultivateModParticleTypes.KI.get(), KiParticle::provider);
	}
}
