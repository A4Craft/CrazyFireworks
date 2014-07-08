package zhscraft.mod.net.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import zhscraft.mod.net.core.CoreSystemEffectFirework;
import zhscraft.mod.net.main;

public class Firework implements CommandExecutor {
	main m;

	public Firework(main m) {
		this.m = m;
	}

	public boolean onCommand(CommandSender Sender, Command command, String cmd, String[] a) {
		Player p = (Player) Sender;
		if (p.hasPermission("z.firework.style")) {
			double x = p.getLocation().getX();
			double y = p.getLocation().getY();
			double z = p.getLocation().getZ();
			if (cmd.equalsIgnoreCase("fw")) {
				CoreSystemEffectFirework.RandomFireworks(p, new Location(p.getWorld(), x, y, z), this.m.getFireworkType(p.getDisplayName()));
				p.sendMessage("you have fireworked you're self");
			}
		} else {
			p.sendMessage(ChatColor.GOLD + "--------- you do not have permission to use this command ---------");
		}
		return false;
	}
}
