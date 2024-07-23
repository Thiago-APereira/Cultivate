package net.Thiago.Cultivate.procedures;

import net.Thiago.Cultivate.network.CultivateModVariables;
import net.minecraft.world.entity.Entity;

public class ReturnStageProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
        return ((entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation\"");
    }
}
