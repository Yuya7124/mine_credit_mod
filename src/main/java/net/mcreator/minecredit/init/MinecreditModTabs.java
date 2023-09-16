
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecredit.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MinecreditModTabs {
	public static CreativeModeTab TAB_MINE_CREDIT;

	public static void load() {
		TAB_MINE_CREDIT = new CreativeModeTab("tabmine_credit") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MinecreditModItems.TEN_THOUSAND_MC.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
