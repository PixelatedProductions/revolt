
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revoltmod.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.revoltmod.item.VoidSwordItem;
import net.mcreator.revoltmod.item.VoidScytheItem;
import net.mcreator.revoltmod.item.VoidFragmentItem;
import net.mcreator.revoltmod.item.VoidBowItem;
import net.mcreator.revoltmod.item.VeinshreederItem;
import net.mcreator.revoltmod.item.StoneSpearItem;
import net.mcreator.revoltmod.item.ShardOfStrengthItem;
import net.mcreator.revoltmod.item.ShardOfRevolutionItem;
import net.mcreator.revoltmod.item.ShardOfMagicItem;
import net.mcreator.revoltmod.item.ShardOfDefenseItem;
import net.mcreator.revoltmod.item.ShadowspecBarItem;
import net.mcreator.revoltmod.item.IronPlateItem;
import net.mcreator.revoltmod.item.GolemsAwakeningItem;
import net.mcreator.revoltmod.item.GaminggunItem;
import net.mcreator.revoltmod.item.CopperArmorItem;
import net.mcreator.revoltmod.RevoltmodMod;

public class RevoltmodModItems {
	public static Item SHARD_OF_STRENGTH;
	public static Item COPPER_ARMOR_HELMET;
	public static Item COPPER_ARMOR_CHESTPLATE;
	public static Item COPPER_ARMOR_LEGGINGS;
	public static Item COPPER_ARMOR_BOOTS;
	public static Item SHARD_OF_MAGIC;
	public static Item SHARD_OF_DEFENSE;
	public static Item SHARD_OF_REVOLUTION;
	public static Item VEINSHREEDER;
	public static Item STONE_SPEAR;
	public static Item IRON_PLATE;
	public static Item GOLEMS_AWAKENING;
	public static Item SHADOWSPEC_BAR;
	public static Item FORGE;
	public static Item VOID_FRAGMENT;
	public static Item VOID_SCYTHE;
	public static Item VOID_SWORD;
	public static Item VOID_BOW;
	public static Item GAMINGGUN;

	public static void load() {
		SHARD_OF_STRENGTH = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "shard_of_strength"), new ShardOfStrengthItem());
		COPPER_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "copper_armor_helmet"), new CopperArmorItem.Helmet());
		COPPER_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "copper_armor_chestplate"), new CopperArmorItem.Chestplate());
		COPPER_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "copper_armor_leggings"), new CopperArmorItem.Leggings());
		COPPER_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "copper_armor_boots"), new CopperArmorItem.Boots());
		SHARD_OF_MAGIC = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "shard_of_magic"), new ShardOfMagicItem());
		SHARD_OF_DEFENSE = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "shard_of_defense"), new ShardOfDefenseItem());
		SHARD_OF_REVOLUTION = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "shard_of_revolution"), new ShardOfRevolutionItem());
		VEINSHREEDER = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "veinshreeder"), new VeinshreederItem());
		STONE_SPEAR = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "stone_spear"), new StoneSpearItem());
		IRON_PLATE = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "iron_plate"), new IronPlateItem());
		GOLEMS_AWAKENING = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "golems_awakening"), new GolemsAwakeningItem());
		SHADOWSPEC_BAR = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "shadowspec_bar"), new ShadowspecBarItem());
		FORGE = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "forge"), new BlockItem(RevoltmodModBlocks.FORGE, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		VOID_FRAGMENT = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "void_fragment"), new VoidFragmentItem());
		VOID_SCYTHE = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "void_scythe"), new VoidScytheItem());
		VOID_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "void_sword"), new VoidSwordItem());
		VOID_BOW = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "void_bow"), new VoidBowItem());
		GAMINGGUN = Registry.register(Registry.ITEM, new ResourceLocation(RevoltmodMod.MODID, "gaminggun"), new GaminggunItem());
	}
}
