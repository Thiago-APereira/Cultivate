
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.Thiago.Cultivate.init;

import net.Thiago.Cultivate.Cultivate;
import net.Thiago.Cultivate.Item.CultivationBook;
import net.Thiago.Cultivate.Item.CultivationInsights;
import net.Thiago.Cultivate.Item.EssenceStoneItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CultivateModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Cultivate.MOD_ID);
	public static final RegistryObject<Item> CULTIVATOR_SPAWN_EGG = REGISTRY.register("cultivator_spawn_egg", () -> new ForgeSpawnEggItem(CultivateModEntities.CULTIVATOR, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> CULTIVATION_BOOK = REGISTRY.register("cultivation_book", CultivationBook::new);
	public static final RegistryObject<Item> ESSENCE_STONE = REGISTRY.register("essence_stone", EssenceStoneItem::new);
	public static final RegistryObject<Item> CULTIVATION_INSIGHTS = REGISTRY.register("cultivation_insights", CultivationInsights::new);
}
