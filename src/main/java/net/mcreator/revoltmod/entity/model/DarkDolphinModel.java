package net.mcreator.revoltmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.revoltmod.entity.DarkDolphinEntity;

public class DarkDolphinModel extends AnimatedGeoModel<DarkDolphinEntity> {
	@Override
	public ResourceLocation getAnimationResource(DarkDolphinEntity entity) {
		return new ResourceLocation("revoltmod", "animations/dolphin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DarkDolphinEntity entity) {
		return new ResourceLocation("revoltmod", "geo/dolphin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DarkDolphinEntity entity) {
		return new ResourceLocation("revoltmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
