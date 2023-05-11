package net.mcreator.revoltmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.advancements.Advancement;

import net.mcreator.revoltmod.init.RevoltmodModGameRules;
import net.mcreator.revoltmod.RevoltmodMod;

import java.util.Map;
import java.util.HashMap;

import io.github.fabricators_of_create.porting_lib.util.ServerLifecycleHooks;
import io.github.fabricators_of_create.porting_lib.event.common.AdvancementCallback;

public class RevolutionProcedure {
	public RevolutionProcedure() {
		AdvancementCallback.EVENT.register((player, advancement) -> {
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("entity", player);
			dependencies.put("advancement", advancement);
			dependencies.put("x", player.getX());
			dependencies.put("y", player.getY());
			dependencies.put("z", player.getZ());
			dependencies.put("world", player.level);
			execute(dependencies);
		});
	}

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RevoltmodMod.LOGGER.warn("Failed to load dependency world for procedure Revolution!");
			return;
		}
		if (dependencies.get("advancement") == null) {
			if (!dependencies.containsKey("advancement"))
				RevoltmodMod.LOGGER.warn("Failed to load dependency advancement for procedure Revolution!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		Advancement advancement = (Advancement) dependencies.get("advancement");
		if (world instanceof Level _lvl && _lvl.getServer() != null ? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:end/kill_dragon")).equals(advancement) : false) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("revolution has begun"), false);
			}
			if (world instanceof Level _level)
				_level.getGameRules().getRule(RevoltmodModGameRules.REVOLT).set((true), _level.getServer());
		}
	}
}
