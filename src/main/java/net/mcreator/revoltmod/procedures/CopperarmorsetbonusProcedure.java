package net.mcreator.revoltmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.revoltmod.init.RevoltmodModItems;
import net.mcreator.revoltmod.RevoltmodMod;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

import io.github.fabricators_of_create.porting_lib.event.common.PlayerTickEvents;

public class CopperarmorsetbonusProcedure {
	public CopperarmorsetbonusProcedure() {
		PlayerTickEvents.END.register((player) -> {
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("entity", player);
			dependencies.put("x", player.getX());
			dependencies.put("y", player.getY());
			dependencies.put("z", player.getZ());
			dependencies.put("world", player.level);
			execute(dependencies);
		});
	}

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RevoltmodMod.LOGGER.warn("Failed to load dependency entity for procedure Copperarmorsetbonus!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == RevoltmodModItems.COPPER_ARMOR_BOOTS) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == RevoltmodModItems.COPPER_ARMOR_LEGGINGS) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == RevoltmodModItems.COPPER_ARMOR_CHESTPLATE) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == RevoltmodModItems.COPPER_ARMOR_HELMET) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 0, (false), (false)));
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("revoltmod:lightning_fast"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
					}
				}
			}
		}
	}
}
