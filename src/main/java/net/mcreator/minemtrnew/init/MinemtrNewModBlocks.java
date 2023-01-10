
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minemtrnew.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.minemtrnew.block.IronstepsBlock;
import net.mcreator.minemtrnew.MinemtrNewMod;

public class MinemtrNewModBlocks {
	public static Block IRONSTEPS;

	public static void load() {
		IRONSTEPS = Registry.register(Registry.BLOCK, new ResourceLocation(MinemtrNewMod.MODID, "ironsteps"), new IronstepsBlock());
	}

	public static void clientLoad() {
		IronstepsBlock.clientInit();
	}
}
