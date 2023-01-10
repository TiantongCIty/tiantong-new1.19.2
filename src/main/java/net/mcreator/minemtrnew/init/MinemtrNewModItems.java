
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minemtrnew.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.minemtrnew.MinemtrNewMod;

public class MinemtrNewModItems {
	public static Item IRONSTEPS;

	public static void load() {
		IRONSTEPS = Registry.register(Registry.ITEM, new ResourceLocation(MinemtrNewMod.MODID, "ironsteps"),
				new BlockItem(MinemtrNewModBlocks.IRONSTEPS, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	}
}
