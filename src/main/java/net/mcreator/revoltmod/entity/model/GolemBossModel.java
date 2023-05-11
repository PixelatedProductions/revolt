package net.mcreator.revoltmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.revoltmod.entity.GolemBossEntity;

public class GolemBossModel extends AnimatedGeoModel<GolemBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(GolemBossEntity entity) {
		return new ResourceLocation("revoltmod", "animations/golem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GolemBossEntity entity) {
		return new ResourceLocation("revoltmod", "geo/golem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GolemBossEntity entity) {
		return new ResourceLocation("revoltmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
