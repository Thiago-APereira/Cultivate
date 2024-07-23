package net.Thiago.Cultivate.procedures;

import net.Thiago.Cultivate.network.CultivateModVariables;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class RatioChangerProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		CultivateModVariables.MapVariables.get(world).ratio = Proc4Procedure.execute(entity);
		CultivateModVariables.MapVariables.get(world).syncData(world);
		return CultivateModVariables.MapVariables.get(world).ratio;
	}
}
