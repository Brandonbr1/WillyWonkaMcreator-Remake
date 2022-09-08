package net.mcreator.willywonka.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.willywonka.WillywonkaMod;

import java.util.Map;

public class TaffyPlayerFinishesUsingItemProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WillywonkaMod.LOGGER.warn("Failed to load dependency entity for procedure TaffyPlayerFinishesUsingItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 500, (int) 2));
	}
}
