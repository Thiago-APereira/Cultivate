package net.Thiago.Cultivate.procedures;

import net.Thiago.Cultivate.network.CultivateModVariables;
import net.minecraft.world.entity.Entity;

public class UpdateStageProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation\"")) {
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
						/ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stageCap;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.stagePower = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio / 5000;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.damage2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.foundation_ratio = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\"Foundation 2nd stage\"";
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cultivation_stage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 2nd stage\"")) {
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower
						+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
								/ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stageCap;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.stagePower = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
						+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio / 5000;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.damage2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.foundation_ratio = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\"Foundation 3rd stage\"";
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cultivation_stage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 3rd stage\"")) {
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower
						+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
								/ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stageCap;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.stagePower = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
						+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio / 5000;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.damage2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.foundation_ratio = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\"Foundation 4th stage\"";
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cultivation_stage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 4th stage\"")) {
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower
						+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
								/ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stageCap;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.stagePower = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
						+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio / 5000;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.damage2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.foundation_ratio = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\"Foundation 5th stage\"";
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cultivation_stage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 5th stage\"")) {
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower
						+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
								/ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stageCap;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.stagePower = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
						+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio / 5000;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.damage2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.foundation_ratio = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\"Foundation 6th stage\"";
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cultivation_stage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 6th stage\"")) {
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower
						+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
								/ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stageCap;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.stagePower = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
						+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio / 5000;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.damage2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.foundation_ratio = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\"Foundation 7th stage\"";
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cultivation_stage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 7th stage\"")) {
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower
						+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
								/ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stageCap;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.stagePower = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
						+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio / 5000;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.damage2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.foundation_ratio = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\"Foundation 8th stage\"";
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cultivation_stage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 8th stage\"")) {
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower
						+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
								/ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stageCap;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.stagePower = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
						+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio / 5000;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.damage2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.foundation_ratio = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\"Foundation 9th stage\"";
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cultivation_stage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 9th stage\"")) {
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower
						+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
								/ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stageCap;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.stagePower = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
						+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio / 5000;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.damage2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.foundation_ratio = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\"Foundation 10th stage\"";
				entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cultivation_stage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
