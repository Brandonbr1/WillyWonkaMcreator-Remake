
package net.mcreator.willywonka.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.willywonka.block.TaffyBlockBlock;
import net.mcreator.willywonka.WillywonkaModElements;

@WillywonkaModElements.ModElement.Tag
public class WillyWonkaItemGroup extends WillywonkaModElements.ModElement {
	public WillyWonkaItemGroup(WillywonkaModElements instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabwilly_wonka") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TaffyBlockBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
