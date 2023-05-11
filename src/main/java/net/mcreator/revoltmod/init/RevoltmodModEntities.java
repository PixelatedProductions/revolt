
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revoltmod.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.revoltmod.entity.VoidBowEntity;
import net.mcreator.revoltmod.entity.StoneSpearEntity;
import net.mcreator.revoltmod.entity.RevoltingcreeperEntity;
import net.mcreator.revoltmod.entity.GolemBossEntity;
import net.mcreator.revoltmod.entity.GaminggunEntity;
import net.mcreator.revoltmod.entity.DarkDolphinEntity;
import net.mcreator.revoltmod.entity.CorruptedocelotEntity;
import net.mcreator.revoltmod.RevoltmodMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class RevoltmodModEntities {
	public static EntityType<RevoltingcreeperEntity> REVOLTINGCREEPER;
	public static EntityType<DarkDolphinEntity> DARK_DOLPHIN;
	public static EntityType<StoneSpearEntity> STONE_SPEAR;
	public static EntityType<GolemBossEntity> GOLEM_BOSS;
	public static EntityType<VoidBowEntity> VOID_BOW;
	public static EntityType<GaminggunEntity> GAMINGGUN;
	public static EntityType<CorruptedocelotEntity> CORRUPTEDOCELOT;

	public static void load() {
		REVOLTINGCREEPER = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(RevoltmodMod.MODID, "revoltingcreeper"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, RevoltingcreeperEntity::new).dimensions(new EntityDimensions(0.6f, 1.7f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		RevoltingcreeperEntity.init();
		FabricDefaultAttributeRegistry.register(REVOLTINGCREEPER, RevoltingcreeperEntity.createAttributes());
		DARK_DOLPHIN = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(RevoltmodMod.MODID, "dark_dolphin"),
				FabricEntityTypeBuilder.create(MobCategory.WATER_CREATURE, DarkDolphinEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).fireImmune().trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		DarkDolphinEntity.init();
		FabricDefaultAttributeRegistry.register(DARK_DOLPHIN, DarkDolphinEntity.createAttributes());
		STONE_SPEAR = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(RevoltmodMod.MODID, "stone_spear"), createArrowEntityType(StoneSpearEntity::new));
		GOLEM_BOSS = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(RevoltmodMod.MODID, "golem_boss"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, GolemBossEntity::new).dimensions(new EntityDimensions(0.8f, 2f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		GolemBossEntity.init();
		FabricDefaultAttributeRegistry.register(GOLEM_BOSS, GolemBossEntity.createAttributes());
		VOID_BOW = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(RevoltmodMod.MODID, "void_bow"), createArrowEntityType(VoidBowEntity::new));
		GAMINGGUN = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(RevoltmodMod.MODID, "gaminggun"), createArrowEntityType(GaminggunEntity::new));
		CORRUPTEDOCELOT = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(RevoltmodMod.MODID, "corruptedocelot"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, CorruptedocelotEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		CorruptedocelotEntity.init();
		FabricDefaultAttributeRegistry.register(CORRUPTEDOCELOT, CorruptedocelotEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
