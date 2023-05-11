
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revoltmod.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.revoltmod.block.ForgeBlock;
import net.mcreator.revoltmod.RevoltmodMod;

public class RevoltmodModBlocks {
	public static Block FORGE;

	public static void load() {
		FORGE = Registry.register(Registry.BLOCK, new ResourceLocation(RevoltmodMod.MODID, "forge"), new ForgeBlock());
	}

	public static void clientLoad() {
		ForgeBlock.clientInit();
	}
}
