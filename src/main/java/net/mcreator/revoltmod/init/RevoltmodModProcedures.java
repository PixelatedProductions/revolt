
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revoltmod.init;

import net.mcreator.revoltmod.procedures.RevolutionProcedure;
import net.mcreator.revoltmod.procedures.GolemsAwakeningRightclickedProcedure;
import net.mcreator.revoltmod.procedures.ForgecraftingProcedure;
import net.mcreator.revoltmod.procedures.CopperarmorsetbonusProcedure;
import net.mcreator.revoltmod.procedures.CommandingrevolutionProcedure;
import net.mcreator.revoltmod.procedures.AssOnInitialEntitySpawnProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class RevoltmodModProcedures {
	public static void load() {
		new CommandingrevolutionProcedure();
		new RevolutionProcedure();
		new CopperarmorsetbonusProcedure();
		new AssOnInitialEntitySpawnProcedure();
		new GolemsAwakeningRightclickedProcedure();
		new ForgecraftingProcedure();
	}
}
