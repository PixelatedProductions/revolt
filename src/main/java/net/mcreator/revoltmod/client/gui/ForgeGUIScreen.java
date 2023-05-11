
package net.mcreator.revoltmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.revoltmod.world.inventory.ForgeGUIMenu;
import net.mcreator.revoltmod.network.ForgeGUISlotMessage;
import net.mcreator.revoltmod.network.ForgeGUIButtonMessage;
import net.mcreator.revoltmod.RevoltmodMod;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ForgeGUIScreen extends AbstractContainerScreen<ForgeGUIMenu> {
	private final static HashMap<String, Object> guistate = ForgeGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_forge;

	public ForgeGUIScreen(ForgeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("revoltmod:textures/screens/forge_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_forge = new Button(this.leftPos + 12, this.topPos + 56, 51, 20, Component.translatable("gui.revoltmod.forge_gui.button_forge"), e -> {
			if (true) {
				ClientPlayNetworking.send(new ResourceLocation("revoltmod:forgegui_button_" + 0), new ForgeGUIButtonMessage(0, x, y, z));
			}
		});
		guistate.put("button:button_forge", button_forge);
		this.addRenderableWidget(button_forge);
	}

	public static void screenInit() {
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(RevoltmodMod.MODID, "forgegui_slot_0"), ForgeGUISlotMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(RevoltmodMod.MODID, "forgegui_button_0"), ForgeGUIButtonMessage::apply);
	}
}
