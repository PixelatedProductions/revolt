package net.mcreator.revoltmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.revoltmod.init.RevoltmodModGameRules;
import net.mcreator.revoltmod.RevoltmodMod;

import java.util.Map;

public class AssOnInitialEntitySpawnProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RevoltmodMod.LOGGER.warn("Failed to load dependency world for procedure AssOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RevoltmodMod.LOGGER.warn("Failed to load dependency entity for procedure AssOnInitialEntitySpawn!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (world.getLevelData().getGameRules().getBoolean(RevoltmodModGameRules.REVOLT) == false) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
