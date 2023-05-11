package net.mcreator.revoltmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.revoltmod.entity.model.GolemBossModel;
import net.mcreator.revoltmod.entity.GolemBossEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GolemBossRenderer extends GeoEntityRenderer<GolemBossEntity> {
	public GolemBossRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GolemBossModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(GolemBossEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
