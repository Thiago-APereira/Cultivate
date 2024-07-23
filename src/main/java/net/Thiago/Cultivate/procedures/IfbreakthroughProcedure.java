package net.Thiago.Cultivate.procedures;

import net.Thiago.Cultivate.network.CultivateModVariables;
import net.minecraft.world.entity.Entity;

public class IfbreakthroughProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
        return (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio >= (entity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new CultivateModVariables.PlayerVariables())).stageCap;
    }
}
