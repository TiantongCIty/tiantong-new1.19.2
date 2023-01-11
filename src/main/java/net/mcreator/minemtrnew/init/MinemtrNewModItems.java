
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minemtrnew.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.minemtrnew.item.MtrmonnyItem;
import net.mcreator.minemtrnew.MinemtrNewMod;

public class MinemtrNewModItems {
	public static Item IRONSTEPS;
	public static Item MTRMONNY;

	public static void load() {
		IRONSTEPS = Registry.register(Registry.ITEM, new ResourceLocation(MinemtrNewMod.MODID, "ironsteps"),
				new BlockItem(MinemtrNewModBlocks.IRONSTEPS, new Item.Properties().tab(MinemtrNewModTabs.TAB_TRAIN)));
		MTRMONNY = Registry.register(Registry.ITEM, new ResourceLocation(MinemtrNewMod.MODID, "mtrmonny"), new MtrmonnyItem());
	}
}
