package zhscraft.mod.net.core;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.util.Vector;

import zhscraft.mod.net.main;

public class Cast {

	public static void CreeperShow(final double x, final double y, final double z, final String world) {
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
			}
		}, 5);

		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
			}
		}, 15);

		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
			}
		}, 30);

	}

	public static void TemplateShow(final double x, final double y, final double z, final String world) {
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				APIFirework(world, x, y, z, Type.STAR);
				APIFirework(world, x + new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);
				APIFirework(world, x + new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);

				APIFirework(world, x, y, z, Type.STAR);
				APIFirework(world, x + new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);
				APIFirework(world, x + new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);

				APIFirework(world, x, y, z, Type.STAR);
				APIFirework(world, x + new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);
				APIFirework(world, x + new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);

				APIFirework(world, x, y, z, Type.STAR);
				APIFirework(world, x + new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);
				APIFirework(world, x + new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);

				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.BALL_LARGE);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.BALL_LARGE);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.BALL_LARGE);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
			}
		}, 5);

		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				APIFirework(world, x + new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);
				APIFirework(world, x + new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);
				APIFirework(world, x + new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);
				APIFirework(world, x + new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);
				APIFirework(world, x + new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);

				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
			}
		}, 15);

		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				APIFirework(world, x + new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);
				APIFirework(world, x + new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);
				APIFirework(world, x + new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);
				APIFirework(world, x + new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);
				APIFirework(world, x + new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z - new Random().nextInt(15), Type.BALL);
				APIFirework(world, x - new Random().nextInt(15), y, z + new Random().nextInt(15), Type.BALL);

				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);

				APIFirework(world, x, y, z, Type.CREEPER);
				APIFirework(world, x + new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
				APIFirework(world, x + new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z - new Random().nextInt(5), Type.BALL);
				APIFirework(world, x - new Random().nextInt(5), y, z + new Random().nextInt(5), Type.BALL);
			}
		}, 30);

	}

	public static void APIFirework(String world, double x, double y, double z, Type type) {

		Firework fw = (Firework) Bukkit.getWorld(world).spawnEntity(new Location(Bukkit.getWorld(world), x, y, z), EntityType.FIREWORK);

		FireworkMeta fwm = fw.getFireworkMeta();

		fw.setVelocity(new Vector(0, 0, 0));

		int r1i = new Random().nextInt(17) + 1;
		int r2i = new Random().nextInt(17) + 1;
		Color c1 = getColor(r1i);
		Color c2 = getColor(r2i);
		FireworkEffect effect = FireworkEffect.builder().flicker(new Random().nextBoolean()).withColor(c2).withFade(c1).with(type).trail(new Random().nextBoolean()).build();

		fwm.addEffect(effect);

		int rp = new Random().nextInt(2) + 1;
		fwm.setPower(rp);
		fw.setFireworkMeta(fwm);

		Bukkit.getWorld(world).spawnEntity(new Location(Bukkit.getWorld(world), x, y, z), EntityType.FIREWORK);

	}

	public static void APIFireworkRandomTypes(String world, double x, double y, double z) {

		Firework fw = (Firework) Bukkit.getWorld(world).spawnEntity(new Location(Bukkit.getWorld(world), x, y, z), EntityType.FIREWORK);

		FireworkMeta fwm = fw.getFireworkMeta();

		fw.setVelocity(new Vector(0, 0, 0));

		int r1i = new Random().nextInt(17) + 1;
		int r2i = new Random().nextInt(17) + 1;
		Color c1 = getColor(r1i);
		Color c2 = getColor(r2i);

		int random = new Random().nextInt(5);
		Type type = null;
		if (random == 0) {
			type = Type.STAR;
		}
		if (random == 1) {
			type = Type.BALL;
		}
		if (random == 2) {
			type = Type.BALL_LARGE;
		}
		if (random == 3) {
			type = Type.BURST;
		}
		if (random == 4) {
			type = Type.CREEPER;
		}

		FireworkEffect effect = FireworkEffect.builder().flicker(new Random().nextBoolean()).withColor(c2).withFade(c1).with(type).trail(new Random().nextBoolean()).build();

		fwm.addEffect(effect);

		int rp = new Random().nextInt(2) + 1;
		fwm.setPower(rp);
		fw.setFireworkMeta(fwm);

		Bukkit.getWorld(world).spawnEntity(new Location(Bukkit.getWorld(world), x, y, z), EntityType.FIREWORK);

	}

	private static Color getColor(int i) {
		Color c = null;
		if (i == 1) {
			c = Color.AQUA;
		}
		if (i == 2) {
			c = Color.BLACK;
		}
		if (i == 3) {
			c = Color.BLUE;
		}
		if (i == 4) {
			c = Color.FUCHSIA;
		}
		if (i == 5) {
			c = Color.GRAY;
		}
		if (i == 6) {
			c = Color.GREEN;
		}
		if (i == 7) {
			c = Color.LIME;
		}
		if (i == 8) {
			c = Color.MAROON;
		}
		if (i == 9) {
			c = Color.NAVY;
		}
		if (i == 10) {
			c = Color.OLIVE;
		}
		if (i == 11) {
			c = Color.ORANGE;
		}
		if (i == 12) {
			c = Color.PURPLE;
		}
		if (i == 13) {
			c = Color.RED;
		}
		if (i == 14) {
			c = Color.SILVER;
		}
		if (i == 15) {
			c = Color.TEAL;
		}
		if (i == 16) {
			c = Color.WHITE;
		}
		if (i == 17) {
			c = Color.YELLOW;
		}
		return c;
	}

	public static void alphaOMaga(final double x, final double y, final double z, final String world) {
		final int range = 40;
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
				}

			}
		}, 30);

		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
				}

			}
		}, 30 * 3);

	}

	public static void LongShow(final double x, final double y, final double z, final String world) {
		final int range = 25;
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30);

		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30 * 3);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30 * 4);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30 * 8);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30 * 12);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 40; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30 * 14);
		
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30 * 16);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30 * 18);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30 * 20);

	}

	public static void LongSmallShow(final double x, final double y, final double z, final String world) {
		final int range = 10;
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30);

		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30 * 3);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30 * 4);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30 * 8);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30 * 12);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 40; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30 * 14);
		
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30 * 16);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30 * 18);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					int newR = new Random().nextInt(3);

					if (newR == 0) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 1) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z + new Random().nextInt(range));
					}
					if (newR == 2) {
						APIFireworkRandomTypes(world, x - new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
					if (newR == 3) {
						APIFireworkRandomTypes(world, x + new Random().nextInt(range), y, z - new Random().nextInt(range));
					}
				}

			}
		}, 30 * 20);

	}

}

