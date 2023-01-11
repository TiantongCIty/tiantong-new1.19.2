
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minemtrnew.init;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.minemtrnew.MinemtrNewMod;

public class MinemtrNewModBiomes {
	public static ResourceKey<Biome> CHAO_PING_TAN = ResourceKey.create(Registry.BIOME_REGISTRY,
			new ResourceLocation(MinemtrNewMod.MODID, "chao_ping_tan"));

	public static void load() {
		ChaoPingTanBiome.createBiome();
	}
}
