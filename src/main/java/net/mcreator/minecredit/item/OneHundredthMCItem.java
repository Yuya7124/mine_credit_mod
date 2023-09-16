
package net.mcreator.minecredit.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.minecredit.init.MinecreditModTabs;

public class OneHundredthMCItem extends Item {
	public OneHundredthMCItem() {
		super(new Item.Properties().tab(MinecreditModTabs.TAB_MINE_CREDIT).stacksTo(64).rarity(Rarity.COMMON));
	}
}
