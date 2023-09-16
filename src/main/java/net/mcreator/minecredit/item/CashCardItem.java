
package net.mcreator.minecredit.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.minecredit.init.MinecreditModTabs;

public class CashCardItem extends Item {
	public CashCardItem() {
		super(new Item.Properties().tab(MinecreditModTabs.TAB_MINE_CREDIT).stacksTo(1).rarity(Rarity.COMMON));
	}
}
