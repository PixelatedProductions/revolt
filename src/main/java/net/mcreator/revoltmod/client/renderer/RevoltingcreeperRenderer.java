package net.mcreator.revoltmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.revoltmod.entity.RevoltingcreeperEntity;

public class RevoltingcreeperRenderer extends MobRenderer<RevoltingcreeperEntity, CreeperModel<RevoltingcreeperEntity>> {
	public RevoltingcreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RevoltingcreeperEntity entity) {
		return new ResourceLocation("revoltmod:textures/entities/forest-creeper-on-planetminecraft-com.png");
	}
}
