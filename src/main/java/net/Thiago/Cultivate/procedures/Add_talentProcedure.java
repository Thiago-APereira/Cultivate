package net.Thiago.Cultivate.procedures;

import net.Thiago.Cultivate.network.CultivateModVariables;
import net.minecraft.world.entity.Entity;

public class Add_talentProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).italent + 2;
			entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.talent = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).italent + 2;
			entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.italent = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = true;
			entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.enable_cultivation = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
