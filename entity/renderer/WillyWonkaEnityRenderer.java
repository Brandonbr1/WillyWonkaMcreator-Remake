
package net.mcreator.willywonka.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.willywonka.entity.WillyWonkaEnityEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WillyWonkaEnityRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WillyWonkaEnityEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelWillyWonka(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("willywonka:textures/entities/willywonkanice.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.3.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelWillyWonka extends EntityModel<Entity> {
		private final ModelRenderer leg1;
		private final ModelRenderer leg2;
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer hands;
		private final ModelRenderer hands2;
		private final ModelRenderer hat;
		private final ModelRenderer shoes;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;

		public ModelWillyWonka() {
			textureWidth = 64;
			textureHeight = 64;
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(0.0F, 24.0F, 0.0F);
			leg1.setTextureOffset(20, 31).addBox(-2.0F, -10.0F, -0.75F, 1.0F, 9.0F, 1.0F, 0.0F, false);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(0.0F, 24.0F, 0.0F);
			leg2.setTextureOffset(16, 31).addBox(3.0F, -10.0F, -0.75F, 1.0F, 9.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 23.0F, 0.0F);
			body.setTextureOffset(0, 26).addBox(-2.0F, -16.0F, -1.0F, 6.0F, 7.0F, 2.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 23.0F, 0.0F);
			head.setTextureOffset(18, 20).addBox(-2.0F, -21.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);
			hands = new ModelRenderer(this);
			hands.setRotationPoint(0.0F, 24.0F, 0.0F);
			hands.setTextureOffset(0, 20).addBox(-4.0F, -16.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -18.4272F, 7.7754F);
			hands.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(14, 19).addBox(-4.0F, 1.0F, -14.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
			hands2 = new ModelRenderer(this);
			hands2.setRotationPoint(8.0F, 24.0F, 0.0F);
			hands2.setTextureOffset(18, 0).addBox(-4.0F, -16.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -18.4272F, 7.7754F);
			hands2.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 15).addBox(-4.0F, 1.0F, -14.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
			hat = new ModelRenderer(this);
			hat.setRotationPoint(0.0F, 24.0F, 0.0F);
			hat.setTextureOffset(0, 15).addBox(-4.0F, -23.0F, -5.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
			hat.setTextureOffset(14, 5).addBox(4.0F, -23.0F, -5.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
			hat.setTextureOffset(28, 12).addBox(-2.0F, -23.0F, -5.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			hat.setTextureOffset(14, 16).addBox(-2.0F, -23.0F, 3.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			hat.setTextureOffset(0, 0).addBox(-2.0F, -31.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);
			shoes = new ModelRenderer(this);
			shoes.setRotationPoint(0.0F, 24.0F, 0.0F);
			shoes.setTextureOffset(28, 6).addBox(-3.0F, -2.0F, -2.75F, 3.0F, 2.0F, 4.0F, 0.0F, false);
			shoes.setTextureOffset(28, 0).addBox(2.0F, -2.0F, -2.75F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			leg1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			leg2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			hands.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			hands2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			hat.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			shoes.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}

}
