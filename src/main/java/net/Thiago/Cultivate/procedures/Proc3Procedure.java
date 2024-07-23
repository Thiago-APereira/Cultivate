package net.Thiago.Cultivate.procedures;

import net.Thiago.Cultivate.network.CultivateModVariables;
import net.minecraft.world.entity.Entity;

public class Proc3Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##.##").format((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio);
	}
}
