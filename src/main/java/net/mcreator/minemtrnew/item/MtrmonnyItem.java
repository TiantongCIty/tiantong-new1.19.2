
package net.mcreator.minemtrnew.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minemtrnew.init.MinemtrNewModTabs;

public class MtrmonnyItem extends Item {
	public MtrmonnyItem() {
		super(new Item.Properties().tab(MinemtrNewModTabs.TAB_TRAIN).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
