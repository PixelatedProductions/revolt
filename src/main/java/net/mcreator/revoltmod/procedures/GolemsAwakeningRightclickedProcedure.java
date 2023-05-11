package net.mcreator.revoltmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.Component;

import net.mcreator.revoltmod.init.RevoltmodModItems;
import net.mcreator.revoltmod.init.RevoltmodModEntities;
import net.mcreator.revoltmod.entity.GolemBossEntity;
import net.mcreator.revoltmod.RevoltmodMod;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import java.util.Map;

import io.github.fabricators_of_create.porting_lib.util.ServerLifecycleHooks;

public class GolemsAwakeningRightclickedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RevoltmodMod.LOGGER.warn("Failed to load dependency world for procedure GolemsAwakeningRightclicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RevoltmodMod.LOGGER.warn("Failed to load dependency x for procedure GolemsAwakeningRightclicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RevoltmodMod.LOGGER.warn("Failed to load dependency y for procedure GolemsAwakeningRightclicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RevoltmodMod.LOGGER.warn("Failed to load dependency z for procedure GolemsAwakeningRightclicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RevoltmodMod.LOGGER.warn("Failed to load dependency entity for procedure GolemsAwakeningRightclicked!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("Golem Is Awakening!"), false);
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(RevoltmodModItems.GOLEMS_AWAKENING);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 40) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new GolemBossEntity(RevoltmodModEntities.GOLEM_BOSS, _level);
							entityToSpawn.moveTo(x, y, z, 0, 0);
							entityToSpawn.setYBodyRot(0);
							entityToSpawn.setYHeadRot(0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						return;
					}
				});
			}
		}.startDelay(world);
	}
}
