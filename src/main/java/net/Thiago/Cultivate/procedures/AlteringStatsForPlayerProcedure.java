package net.Thiago.Cultivate.procedures;

import net.Thiago.Cultivate.network.CultivateModVariables;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;

public class AlteringStatsForPlayerProcedure {
    public static void execute(Entity entity) {

        if (entity instanceof Player _plr0) {
            _plr0.setHealth(_plr0.getMaxHealth() + (_plr0.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY,null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio / 250000);

       ;}
    }

}
