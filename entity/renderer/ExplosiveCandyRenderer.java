package net.mcreator.willywonka.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.willywonka.item.ExplosiveCandyItem;

@OnlyIn(Dist.CLIENT)
public class ExplosiveCandyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ExplosiveCandyItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
