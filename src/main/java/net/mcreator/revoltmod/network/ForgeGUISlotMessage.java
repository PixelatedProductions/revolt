
package net.mcreator.revoltmod.network;

import net.minecraft.world.level.Level;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.revoltmod.world.inventory.ForgeGUIMenu;
import net.mcreator.revoltmod.procedures.ForgecraftingProcedure;

import net.fabricmc.fabric.api.networking.v1.PacketSender;

import java.util.HashMap;

import io.netty.buffer.Unpooled;

public class ForgeGUISlotMessage extends FriendlyByteBuf {
	public ForgeGUISlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		super(Unpooled.buffer());
		writeInt(slotID);
		writeInt(x);
		writeInt(y);
		writeInt(z);
		writeInt(changeType);
		writeInt(meta);
	}

	public static void apply(MinecraftServer server, ServerPlayer entity, ServerGamePacketListenerImpl handler, FriendlyByteBuf buf, PacketSender responseSender) {
		int slotID = buf.readInt();
		double x = buf.readInt();
		double y = buf.readInt();
		double z = buf.readInt();
		int changeType = buf.readInt();
		int meta = buf.readInt();
		server.execute(() -> {
			Level world = entity.getLevel();
			HashMap guistate = ForgeGUIMenu.guistate;
			if (slotID == 3 && changeType == 0) {

				ForgecraftingProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
		});
	}
}
