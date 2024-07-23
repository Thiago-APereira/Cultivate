package net.Thiago.Cultivate.procedures;

import net.Thiago.Cultivate.network.CultivateModVariables;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class RetterProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 2nd stage\"")) {
			CultivateModVariables.MapVariables.get(world).salve = "Foundation 2nd stage:";
			CultivateModVariables.MapVariables.get(world).syncData(world);
			return CultivateModVariables.MapVariables.get(world).salve;
		} else if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 3rd stage\"")) {
			CultivateModVariables.MapVariables.get(world).salve = "Foundation 3rd stage:";
			CultivateModVariables.MapVariables.get(world).syncData(world);
			return CultivateModVariables.MapVariables.get(world).salve;
		} else if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 4th stage\"")) {
			CultivateModVariables.MapVariables.get(world).salve = "Foundation 4th stage:";
			CultivateModVariables.MapVariables.get(world).syncData(world);
			return CultivateModVariables.MapVariables.get(world).salve;
		} else if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 5th stage\"")) {
			CultivateModVariables.MapVariables.get(world).salve = "Foundation 5th stage:";
			CultivateModVariables.MapVariables.get(world).syncData(world);
			return CultivateModVariables.MapVariables.get(world).salve;
		} else if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 6th stage\"")) {
			CultivateModVariables.MapVariables.get(world).salve = "Foundation 6th stage:";
			CultivateModVariables.MapVariables.get(world).syncData(world);
			return CultivateModVariables.MapVariables.get(world).salve;
		} else if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 7th stage\"")) {
			CultivateModVariables.MapVariables.get(world).salve = "Foundation 7th stage:";
			CultivateModVariables.MapVariables.get(world).syncData(world);
			return CultivateModVariables.MapVariables.get(world).salve;
		} else if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 8th stage\"")) {
			CultivateModVariables.MapVariables.get(world).salve = "Foundation 8th stage:";
			CultivateModVariables.MapVariables.get(world).syncData(world);
			return CultivateModVariables.MapVariables.get(world).salve;
		} else if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 9th stage\"")) {
			CultivateModVariables.MapVariables.get(world).salve = "Foundation 9th stage:";
			CultivateModVariables.MapVariables.get(world).syncData(world);
			return CultivateModVariables.MapVariables.get(world).salve;
		} else if (((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("Foundation 10th stage:")) {
			CultivateModVariables.MapVariables.get(world).salve = "Foundation 10th stage:";
			CultivateModVariables.MapVariables.get(world).syncData(world);
			return CultivateModVariables.MapVariables.get(world).salve;
		}
		return CultivateModVariables.MapVariables.get(world).salve;
	}
}
