
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revoltmod.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.revoltmod.block.entity.ForgeBlockEntity;
import net.mcreator.revoltmod.RevoltmodMod;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class RevoltmodModBlockEntities {
	public static BlockEntityType<?> FORGE;

	public static void load() {
		FORGE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(RevoltmodMod.MODID, "forge"), FabricBlockEntityTypeBuilder.create(ForgeBlockEntity::new, RevoltmodModBlocks.FORGE).build(null));
	}
}
