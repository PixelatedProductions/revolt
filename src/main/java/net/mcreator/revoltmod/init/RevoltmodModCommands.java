
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revoltmod.init;

import net.mcreator.revoltmod.command.TogglerevoltCommand;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class RevoltmodModCommands {
	public static void load() {
		CommandRegistrationCallback.EVENT.register((dispatcher, commandBuildContext, dedicated) -> {
			TogglerevoltCommand.register(dispatcher, commandBuildContext);
		});
	}
}
