
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revoltmod.init;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.revoltmod.client.renderer.StoneSpearRenderer;
import net.mcreator.revoltmod.client.renderer.RevoltingcreeperRenderer;
import net.mcreator.revoltmod.client.renderer.GolemBossRenderer;
import net.mcreator.revoltmod.client.renderer.DarkDolphinRenderer;
import net.mcreator.revoltmod.client.renderer.CorruptedocelotRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class RevoltmodModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(RevoltmodModEntities.REVOLTINGCREEPER, RevoltingcreeperRenderer::new);
		EntityRendererRegistry.register(RevoltmodModEntities.DARK_DOLPHIN, DarkDolphinRenderer::new);
		EntityRendererRegistry.register(RevoltmodModEntities.STONE_SPEAR, StoneSpearRenderer::new);
		EntityRendererRegistry.register(RevoltmodModEntities.GOLEM_BOSS, GolemBossRenderer::new);
		EntityRendererRegistry.register(RevoltmodModEntities.VOID_BOW, ThrownItemRenderer::new);
		EntityRendererRegistry.register(RevoltmodModEntities.GAMINGGUN, ThrownItemRenderer::new);
		EntityRendererRegistry.register(RevoltmodModEntities.CORRUPTEDOCELOT, CorruptedocelotRenderer::new);
	}
}
