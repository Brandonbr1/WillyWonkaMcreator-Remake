package net.mcreator.willywonka.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;

import net.mcreator.willywonka.WillywonkaMod;

import java.util.Map;

public class ExplosiveCandyProjectileHitsBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WillywonkaMod.LOGGER.warn("Failed to load dependency world for procedure ExplosiveCandyProjectileHitsBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WillywonkaMod.LOGGER.warn("Failed to load dependency x for procedure ExplosiveCandyProjectileHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WillywonkaMod.LOGGER.warn("Failed to load dependency y for procedure ExplosiveCandyProjectileHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WillywonkaMod.LOGGER.warn("Failed to load dependency z for procedure ExplosiveCandyProjectileHitsBlock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.BREAK);
		}
	}
}
