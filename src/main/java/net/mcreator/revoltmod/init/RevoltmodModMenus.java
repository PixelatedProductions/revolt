
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revoltmod.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.revoltmod.world.inventory.ForgeGUIMenu;
import net.mcreator.revoltmod.client.gui.ForgeGUIScreen;
import net.mcreator.revoltmod.RevoltmodMod;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

public class RevoltmodModMenus {
	public static MenuType<ForgeGUIMenu> FORGE_GUI;

	public static void load() {
		FORGE_GUI = Registry.register(Registry.MENU, new ResourceLocation(RevoltmodMod.MODID, "forge_gui"), new ExtendedScreenHandlerType<>(ForgeGUIMenu::new));
		ForgeGUIScreen.screenInit();
	}
}
