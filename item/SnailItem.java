
package net.mcreator.willywonka.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.block.BlockState;

import net.mcreator.willywonka.itemgroup.WillyWonkaItemGroup;
import net.mcreator.willywonka.WillywonkaModElements;

@WillywonkaModElements.ModElement.Tag
public class SnailItem extends WillywonkaModElements.ModElement {
	@ObjectHolder("willywonka:snail")
	public static final Item block = null;

	public SnailItem(WillywonkaModElements instance) {
		super(instance, 73);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(WillyWonkaItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(1).saturation(0.3f)

							.build()));
			setRegistryName("snail");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
