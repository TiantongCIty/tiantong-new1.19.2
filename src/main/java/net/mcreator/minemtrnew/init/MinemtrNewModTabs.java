
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minemtrnew.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class MinemtrNewModTabs {
	public static CreativeModeTab TAB_TRAIN;

	public static void load() {
		TAB_TRAIN = FabricItemGroupBuilder.create(new ResourceLocation("minemtr_new", "train"))
				.icon(() -> new ItemStack(MinemtrNewModBlocks.IRONSTEPS)).build();
	}
}
