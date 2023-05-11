
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revoltmod.init;

import net.minecraft.world.level.GameRules;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;

public class RevoltmodModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> REVOLT;

	public static void load() {
		REVOLT = GameRuleRegistry.register("revolt", GameRules.Category.MISC, GameRuleFactory.createBooleanRule(false));
	}
}
