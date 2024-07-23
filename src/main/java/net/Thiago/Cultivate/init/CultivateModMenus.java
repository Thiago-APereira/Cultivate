
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.Thiago.Cultivate.init;

import net.Thiago.Cultivate.Cultivate;
import net.Thiago.Cultivate.world.inventory.LMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CultivateModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Cultivate.MOD_ID);
	public static final RegistryObject<MenuType<LMenu>> L = REGISTRY.register("l", () -> IForgeMenuType.create(LMenu::new));
}
