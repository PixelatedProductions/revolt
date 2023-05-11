package net.mcreator.revoltmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.revoltmod.entity.CorruptedocelotEntity;
import net.mcreator.revoltmod.client.model.Modelocelot;

public class CorruptedocelotRenderer extends MobRenderer<CorruptedocelotEntity, Modelocelot<CorruptedocelotEntity>> {
	public CorruptedocelotRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelocelot(context.bakeLayer(Modelocelot.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedocelotEntity entity) {
		return new ResourceLocation("revoltmod:textures/entities/ocelot.png");
	}
}
