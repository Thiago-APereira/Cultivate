
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.Thiago.Cultivate.init;

import net.Thiago.Cultivate.client.renderer.CultivatorRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CultivateModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CultivateModEntities.CULTIVATOR.get(), CultivatorRenderer::new);
	}
}
