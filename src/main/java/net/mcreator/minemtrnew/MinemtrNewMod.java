/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.minemtrnew;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.minemtrnew.init.MinemtrNewModItems;
import net.mcreator.minemtrnew.init.MinemtrNewModBlocks;
import net.mcreator.minemtrnew.init.MinemtrNewModBiomes;

import net.fabricmc.api.ModInitializer;

public class MinemtrNewMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "minemtr_new";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing MinemtrNewMod");

		MinemtrNewModBlocks.load();
		MinemtrNewModItems.load();

		MinemtrNewModBiomes.load();

	}
}
