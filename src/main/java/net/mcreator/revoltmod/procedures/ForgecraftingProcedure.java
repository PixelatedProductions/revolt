package net.mcreator.revoltmod.procedures;

import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.revoltmod.init.RevoltmodModItems;
import net.mcreator.revoltmod.RevoltmodMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class ForgecraftingProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RevoltmodMod.LOGGER.warn("Failed to load dependency world for procedure Forgecrafting!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RevoltmodMod.LOGGER.warn("Failed to load dependency x for procedure Forgecrafting!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RevoltmodMod.LOGGER.warn("Failed to load dependency y for procedure Forgecrafting!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RevoltmodMod.LOGGER.warn("Failed to load dependency z for procedure Forgecrafting!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger count = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
				if (_ent != null)
					count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
				return count.get();
			}
		}.getAmount(world, (new BlockPos(x, y, z)), 3) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, (new BlockPos(x, y, z)), 0)).getItem() == RevoltmodModItems.SHARD_OF_DEFENSE && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, (new BlockPos(x, y, z)), 1)).getItem() == RevoltmodModItems.SHARD_OF_MAGIC && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, (new BlockPos(x, y, z)), 2)).getItem() == RevoltmodModItems.SHARD_OF_STRENGTH) {
			BlockEntity _ent7 = world.getBlockEntity(new BlockPos(x, y, z));
			if (_ent7 != null) {
				((RandomizableContainerBlockEntity) _ent7).removeItem(0, 1);
			}
			BlockEntity _ent8 = world.getBlockEntity(new BlockPos(x, y, z));
			if (_ent8 != null) {
				((RandomizableContainerBlockEntity) _ent8).removeItem(1, 1);
			}
			BlockEntity _ent9 = world.getBlockEntity(new BlockPos(x, y, z));
			if (_ent9 != null) {
				((RandomizableContainerBlockEntity) _ent9).removeItem(2, 1);
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				ItemStack stack = new ItemStack(RevoltmodModItems.SHARD_OF_REVOLUTION);
				stack.setCount((int) (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger count = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
						if (_ent != null)
							count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
						return count.get();
					}
				}.getAmount(world, (new BlockPos(x, y, z)), 3) + 1));
				if (_ent != null) {
					((RandomizableContainerBlockEntity) _ent).setItem(3, stack);
				}
			}
		}
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger count = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
				if (_ent != null)
					count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
				return count.get();
			}
		}.getAmount(world, (new BlockPos(x, y, z)), 3) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, (new BlockPos(x, y, z)), 0)).getItem() == Items.NETHERITE_INGOT && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, (new BlockPos(x, y, z)), 1)).getItem() == RevoltmodModItems.SHARD_OF_REVOLUTION) {
			BlockEntity _ent17 = world.getBlockEntity(new BlockPos(x, y, z));
			if (_ent17 != null) {
				((RandomizableContainerBlockEntity) _ent17).removeItem(0, 1);
			}
			BlockEntity _ent18 = world.getBlockEntity(new BlockPos(x, y, z));
			if (_ent18 != null) {
				((RandomizableContainerBlockEntity) _ent18).removeItem(1, 1);
			}
			BlockEntity _ent19 = world.getBlockEntity(new BlockPos(x, y, z));
			if (_ent19 != null) {
				((RandomizableContainerBlockEntity) _ent19).removeItem(2, 1);
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				ItemStack stack = new ItemStack(RevoltmodModItems.SHADOWSPEC_BAR);
				stack.setCount((int) (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger count = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
						if (_ent != null)
							count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
						return count.get();
					}
				}.getAmount(world, (new BlockPos(x, y, z)), 3) + 1));
				if (_ent != null) {
					((RandomizableContainerBlockEntity) _ent).setItem(3, stack);
				}
			}
		}
	}
}
