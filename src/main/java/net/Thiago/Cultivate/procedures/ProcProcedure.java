package net.Thiago.Cultivate.procedures;

import net.Thiago.Cultivate.network.CultivateModVariables;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ProcProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double novo = 0;
		StageCapProcedure.execute(entity);
		if (sourceentity instanceof Player) {
			if ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).enable_cultivation) {
				if ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio > 499999) {
					{
						double _setval = 500000;
						sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.foundation_ratio = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if (((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation\"")) {
					if ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio > 100000) {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent * 10;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					} else {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent * 10;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1000;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				} else if (((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 2nd stage\"")) {
					if ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio > 200000) {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 4 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					} else {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 1 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
									* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 1 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				} else if (((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 3rd stage\"")) {
					if ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio > 300000) {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 4 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					} else {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 1 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1000;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				} else if (((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 4th stage\"")) {
					if ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio > 400000) {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 4 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					} else {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 1 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1000;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				} else if (((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 5th stage\"")) {
					if ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio > 500000) {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 3 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					} else {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 1 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1000;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				} else if (((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 6th stage\"")) {
					if ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio > 600000) {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 3 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					} else {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 1 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1000;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				} else if (((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 7th stage\"")) {
					if ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio > 700000) {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 3 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					} else {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 1 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1000;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				} else if (((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 8th stage\"")) {
					if ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio > 800000) {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 2 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					} else {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 1 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1000;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				} else if (((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 9th stage\"")) {
					if ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio > 900000) {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 2 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					} else {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 1 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1000;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				} else if (((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).cultivation_stage).equals("\"Foundation 10th stage\"")) {
					if ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio > 1000000) {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 2 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					} else {
						{
							double _setval = (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).foundation_ratio
									+ (sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).talent
											* ((sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CultivateModVariables.PlayerVariables())).stagePower / 1 + 10);
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.foundation_ratio = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						{
							double _setval = 1000;
							sourceentity.getCapability(CultivateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.test = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				}
			}
		}
	}
}
