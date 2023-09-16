
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecredit.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.minecredit.item.WornoutWalletItem;
import net.mcreator.minecredit.item.WalletItem;
import net.mcreator.minecredit.item.TwoMCItem;
import net.mcreator.minecredit.item.TwoHundredthMCItem;
import net.mcreator.minecredit.item.TwentyMCItem;
import net.mcreator.minecredit.item.TwentithMCItem;
import net.mcreator.minecredit.item.TenthMCItem;
import net.mcreator.minecredit.item.TenThousandMCItem;
import net.mcreator.minecredit.item.TenMCItem;
import net.mcreator.minecredit.item.OneMCItem;
import net.mcreator.minecredit.item.OneHundredthMCItem;
import net.mcreator.minecredit.item.OneHundredMCItem;
import net.mcreator.minecredit.item.FiveMCItem;
import net.mcreator.minecredit.item.FiveHundredthMCItem;
import net.mcreator.minecredit.item.FiftyMCItem;
import net.mcreator.minecredit.item.FifthMCItem;
import net.mcreator.minecredit.item.CashCardItem;
import net.mcreator.minecredit.MinecreditMod;

public class MinecreditModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinecreditMod.MODID);
	public static final RegistryObject<Item> ONE_HUNDREDTH_MC = REGISTRY.register("one_hundredth_mc", () -> new OneHundredthMCItem());
	public static final RegistryObject<Item> TWO_HUNDREDTH_MC = REGISTRY.register("two_hundredth_mc", () -> new TwoHundredthMCItem());
	public static final RegistryObject<Item> FIVE_HUNDREDTH_MC = REGISTRY.register("five_hundredth_mc", () -> new FiveHundredthMCItem());
	public static final RegistryObject<Item> TENTH_MC = REGISTRY.register("tenth_mc", () -> new TenthMCItem());
	public static final RegistryObject<Item> TWENTITH_MC = REGISTRY.register("twentith_mc", () -> new TwentithMCItem());
	public static final RegistryObject<Item> FIFTH_MC = REGISTRY.register("fifth_mc", () -> new FifthMCItem());
	public static final RegistryObject<Item> ONE_MC = REGISTRY.register("one_mc", () -> new OneMCItem());
	public static final RegistryObject<Item> TWO_MC = REGISTRY.register("two_mc", () -> new TwoMCItem());
	public static final RegistryObject<Item> FIVE_MC = REGISTRY.register("five_mc", () -> new FiveMCItem());
	public static final RegistryObject<Item> TEN_MC = REGISTRY.register("ten_mc", () -> new TenMCItem());
	public static final RegistryObject<Item> TWENTY_MC = REGISTRY.register("twenty_mc", () -> new TwentyMCItem());
	public static final RegistryObject<Item> FIFTY_MC = REGISTRY.register("fifty_mc", () -> new FiftyMCItem());
	public static final RegistryObject<Item> ONE_HUNDRED_MC = REGISTRY.register("one_hundred_mc", () -> new OneHundredMCItem());
	public static final RegistryObject<Item> TEN_THOUSAND_MC = REGISTRY.register("ten_thousand_mc", () -> new TenThousandMCItem());
	public static final RegistryObject<Item> CASH_CARD = REGISTRY.register("cash_card", () -> new CashCardItem());
	public static final RegistryObject<Item> WALLET = REGISTRY.register("wallet", () -> new WalletItem());
	public static final RegistryObject<Item> WORNOUT_WALLET = REGISTRY.register("wornout_wallet", () -> new WornoutWalletItem());
}
