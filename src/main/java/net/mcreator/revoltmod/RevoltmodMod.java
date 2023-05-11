/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.revoltmod;

import software.bernie.geckolib3.GeckoLib;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.nbt.CompoundTag;

import net.mcreator.revoltmod.init.RevoltmodModProcedures;
import net.mcreator.revoltmod.init.RevoltmodModMenus;
import net.mcreator.revoltmod.init.RevoltmodModItems;
import net.mcreator.revoltmod.init.RevoltmodModGameRules;
import net.mcreator.revoltmod.init.RevoltmodModEntities;
import net.mcreator.revoltmod.init.RevoltmodModCommands;
import net.mcreator.revoltmod.init.RevoltmodModBlocks;
import net.mcreator.revoltmod.init.RevoltmodModBlockEntities;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.api.ModInitializer;

public class RevoltmodMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "revoltmod";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing RevoltmodMod");

		RevoltmodModGameRules.load();

		RevoltmodModEntities.load();
		RevoltmodModBlocks.load();
		RevoltmodModItems.load();
		RevoltmodModBlockEntities.load();

		RevoltmodModProcedures.load();
		RevoltmodModCommands.load();

		RevoltmodModMenus.load();

		GeckoLib.initialize();
		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			if (handler.getPlayer().getExtraCustomData().getCompound("PlayerPersisted").isEmpty()) {
				handler.getPlayer().getExtraCustomData().put("PlayerPersisted", new CompoundTag());
			}
			RevoltmodMod.LOGGER.info(handler.getPlayer().getExtraCustomData());
		});
	}
}
