
package net.mcreator.willywonka.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.willywonka.item.TaffyItem;
import net.mcreator.willywonka.WillywonkaModElements;

import java.util.List;
import java.util.Collections;

@WillywonkaModElements.ModElement.Tag
public class TaffyOreBlock extends WillywonkaModElements.ModElement {
	@ObjectHolder("willywonka:taffy_ore")
	public static final Block block = null;

	public TaffyOreBlock(WillywonkaModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES)
					.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("willywonka:taffy_break_main_1")),
							() -> new SoundEvent(new ResourceLocation("block.slime_block.step")),
							() -> new SoundEvent(new ResourceLocation("willywonka:taffy_break_main_1")),
							() -> new SoundEvent(new ResourceLocation("willywonka:taffy_break_main_1")),
							() -> new SoundEvent(new ResourceLocation("willywonka:taffy_break_main_1"))))
					.hardnessAndResistance(1f, 10f).setLightLevel(s -> 0).notSolid().setOpaque((bs, br, bp) -> false));
			setRegistryName("taffy_ore");
		}

		@Override
		public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
			return true;
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 0;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(TaffyItem.block));
		}
	}
}
