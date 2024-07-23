package net.Thiago.Cultivate.procedures;

import net.Thiago.Cultivate.network.CultivateModVariables;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FirstBornProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double firstTime = 0;
		if ((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).setInt == 0) {
			{
				double _setval = Mth.nextInt(RandomSource.create(), 10, 15);
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.talent = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.italent = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		{
			double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).setInt + 1;
			entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.setInt = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
