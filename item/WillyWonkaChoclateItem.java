
package net.mcreator.willywonka.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.BlockState;

import net.mcreator.willywonka.procedures.WillyWonkaChoclatePlayerFinishesUsingItemProcedure;
import net.mcreator.willywonka.WillywonkaModElements;

import java.util.Collections;

@WillywonkaModElements.ModElement.Tag
public class WillyWonkaChoclateItem extends WillywonkaModElements.ModElement {
	@ObjectHolder("willywonka:willy_wonka_choclate")
	public static final Item block = null;

	public WillyWonkaChoclateItem(WillywonkaModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("willy_wonka_choclate");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			WillyWonkaChoclatePlayerFinishesUsingItemProcedure.executeProcedure(Collections.emptyMap());
			return retval;
		}
	}
}
