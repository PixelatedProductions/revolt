
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revoltmod.init;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.revoltmod.client.gui.ForgeGUIScreen;

public class RevoltmodModScreens {
	public static void load() {
		MenuScreens.register(RevoltmodModMenus.FORGE_GUI, ForgeGUIScreen::new);
	}
}
