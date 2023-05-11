
package net.mcreator.revoltmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.revoltmod.init.RevoltmodModItems;

public class VoidScytheItem extends AxeItem {
	public VoidScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 4062;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 14f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RevoltmodModItems.VOID_FRAGMENT));
			}
		}, 1, -2.6f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
