package net.Thiago.Cultivate.procedures;

import net.Thiago.Cultivate.network.CultivateModVariables;
import net.minecraft.world.entity.Entity;

public class UpdateStageProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			float _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower
					+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
					/ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stageCap * 1.5f;
			entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.stagePower = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			float _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).damage2
					+ (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio / 50000;
			entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.damage2 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			float _setval = 0;
			entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.foundation_ratio = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval =  switch (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables()).cultivation_stage){
				case "\"Foundation\"" : yield "\"Foundation 2nd stage\"";
				case "\"Foundation 2nd stage\"" : yield "\"Foundation 3rd stage\"";
				case "\"Foundation 3rd stage\"" : yield "\"Foundation 4th stage\"";
				case "\"Foundation 4th stage\"" : yield "\"Foundation 5th  stage\"";
				case "\"Foundation 5th stage\"" : yield "\"Foundation 6th  stage\"";
				case "\"Foundation 6th stage\"" : yield "\"Foundation 7th  stage\"";
				case "\"Foundation 7th stage\"" : yield "\"Foundation 8th  stage\"";
				case "\"Foundation 8th stage\"" : yield "\"Foundation 9th  stage\"";

				default:
					yield "\"Foundation 10th stage\"";
			};
			entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.cultivation_stage = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
