package net.mcreator.willywonka.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.willywonka.item.WillyWonkaChoclateItem;
import net.mcreator.willywonka.item.LollypopItem;
import net.mcreator.willywonka.item.JawBreakerItem;
import net.mcreator.willywonka.item.GummyBearItem;
import net.mcreator.willywonka.item.FiizyDrinkItem;
import net.mcreator.willywonka.block.TaffyBlockBlock;
import net.mcreator.willywonka.block.LollyPopBlockBlock;
import net.mcreator.willywonka.block.HardenedChoclateBlock;
import net.mcreator.willywonka.WillywonkaMod;

import java.util.function.Supplier;
import java.util.Map;

public class SetPageTradesProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WillywonkaMod.LOGGER.warn("Failed to load dependency entity for procedure SetPageTrades!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getDouble("playerTradePage") == 1) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (0)) == 0) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity.getPersistentData().getDouble("playerTradeItem1") == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(WillyWonkaChoclateItem.block);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 2) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(FiizyDrinkItem.block);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 3) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(TaffyBlockBlock.block);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 4) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(LollyPopBlockBlock.block);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 5) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(JawBreakerItem.block);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 6) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(GummyBearItem.block);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			} else {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (2))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity.getPersistentData().getDouble("playerTradeItem1") == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(HardenedChoclateBlock.block);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 2) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(LollypopItem.block);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 3) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.BIRCH_LOG);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 4) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.JUNGLE_LOG);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 5) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.ACACIA_LOG);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 6) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_LOG);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 2) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (0)) == 0) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity.getPersistentData().getDouble("playerTradeItem2") == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.OAK_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 2) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.SPRUCE_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 3) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.BIRCH_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 4) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.JUNGLE_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 5) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.ACACIA_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 6) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			} else {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (2))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity.getPersistentData().getDouble("playerTradeItem2") == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.OAK_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 2) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.SPRUCE_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 3) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.BIRCH_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 4) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.JUNGLE_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 5) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.ACACIA_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 6) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 3) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (0)) == 0) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity.getPersistentData().getDouble("playerTradeItem3") == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.OAK_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 2) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.SPRUCE_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 3) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.BIRCH_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 4) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.JUNGLE_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 5) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.ACACIA_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 6) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			} else {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (2))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity.getPersistentData().getDouble("playerTradeItem3") == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.OAK_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 2) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.SPRUCE_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 3) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.BIRCH_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 4) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.JUNGLE_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 5) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.ACACIA_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 6) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
		}
	}
}
