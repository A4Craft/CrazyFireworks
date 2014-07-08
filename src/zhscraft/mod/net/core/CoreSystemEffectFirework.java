package zhscraft.mod.net.core;

import java.util.Random;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Builder;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.util.Vector;

public class CoreSystemEffectFirework {
	public static void RandomFireworks(Player p, Location pz, String Types) {
		float x = (float) pz.getX();
		float y = (float) pz.getY();
		float z = (float) pz.getZ();

		Firework fw = (Firework) p.getWorld().spawnEntity(new Location(p.getWorld(), x, y, z), EntityType.FIREWORK);

		FireworkMeta fwm = fw.getFireworkMeta();

		FireworkEffect.Type type = null;
		if (Types.contains("ball")) {
			type = FireworkEffect.Type.BALL;
		} else if (Types.contains("ball large")) {
			type = FireworkEffect.Type.BALL_LARGE;
		} else if (Types.contains("burst")) {
			type = FireworkEffect.Type.BURST;
		} else if (Types.contains("creeper")) {
			type = FireworkEffect.Type.CREEPER;
		} else if (Types.contains("star")) {
			type = FireworkEffect.Type.STAR;
		} else {
			type = FireworkEffect.Type.BALL;
		}

		if (type == null) {
			type = FireworkEffect.Type.CREEPER;
		}
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

		p.getWorld().spawnEntity(new Location(p.getWorld(), x, y, z), EntityType.FIREWORK);
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
}
