package net.mcreator.revoltmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.Component;

import net.mcreator.revoltmod.init.RevoltmodModGameRules;
import net.mcreator.revoltmod.RevoltmodMod;

import java.util.Map;

import io.github.fabricators_of_create.porting_lib.util.ServerLifecycleHooks;

public class CommandingrevolutionProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RevoltmodMod.LOGGER.warn("Failed to load dependency world for procedure Commandingrevolution!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("revolution has started"), false);
		}
		if (world instanceof Level _level)
			_level.getGameRules().getRule(RevoltmodModGameRules.REVOLT).set((true), _level.getServer());
	}
}
