package net.mcreator.willywonka.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.willywonka.WillywonkaMod;

import java.util.Map;

public class CandyManNpcOnInitialEntitySpawnProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WillywonkaMod.LOGGER.warn("Failed to load dependency world for procedure CandyManNpcOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WillywonkaMod.LOGGER.warn("Failed to load dependency entity for procedure CandyManNpcOnInitialEntitySpawn!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		double tradeNumber = 0;
		double randomNumber = 0;
		double randomAmount = 0;
		tradeNumber = 1;
		for (int index0 = 0; index0 < (int) (3); index0++) {
			if (!world.isRemote()) {
				randomNumber = Math.random();
			}
			if (randomNumber >= 0.83) {
				entity.getPersistentData().putDouble(("tradeItem" + new java.text.DecimalFormat("##").format(tradeNumber)), 1);
			} else if (randomNumber >= 0.664) {
				entity.getPersistentData().putDouble(("tradeItem" + new java.text.DecimalFormat("##").format(tradeNumber)), 2);
			} else if (randomNumber >= 0.498) {
				entity.getPersistentData().putDouble(("tradeItem" + new java.text.DecimalFormat("##").format(tradeNumber)), 3);
			} else if (randomNumber >= 0.332) {
				entity.getPersistentData().putDouble(("tradeItem" + new java.text.DecimalFormat("##").format(tradeNumber)), 4);
			} else if (randomNumber >= 0.166) {
				entity.getPersistentData().putDouble(("tradeItem" + new java.text.DecimalFormat("##").format(tradeNumber)), 5);
			} else if (randomNumber >= 0) {
				entity.getPersistentData().putDouble(("tradeItem" + new java.text.DecimalFormat("##").format(tradeNumber)), 6);
			}
			if (!world.isRemote()) {
				randomNumber = Math.random();
			}
			if (randomNumber >= 0.75) {
				entity.getPersistentData().putDouble(("tradeCount" + new java.text.DecimalFormat("##").format(tradeNumber)), 2);
			} else if (randomNumber >= 0.5) {
				entity.getPersistentData().putDouble(("tradeCount" + new java.text.DecimalFormat("##").format(tradeNumber)), 4);
			} else if (randomNumber >= 0.25) {
				if (!world.isRemote()) {
					randomAmount = Math.random();
				}
				entity.getPersistentData().putDouble(("tradeCount" + new java.text.DecimalFormat("##").format(tradeNumber)),
						Math.ceil(randomAmount * 64));
			} else if (randomNumber >= 0) {
				if (!world.isRemote()) {
					randomAmount = Math.random();
				}
				entity.getPersistentData().putDouble(("tradeCount" + new java.text.DecimalFormat("##").format(tradeNumber)),
						Math.ceil(randomAmount * 64));
			}
			tradeNumber = (tradeNumber + 1);
		}
	}
}
