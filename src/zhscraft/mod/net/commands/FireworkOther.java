package zhscraft.mod.net.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import zhscraft.mod.net.core.CoreSystemEffectFirework;
import zhscraft.mod.net.main;

public class FireworkOther implements CommandExecutor {
	main m;

	public FireworkOther(main m) {
		this.m = m;
	}

	public boolean onCommand(CommandSender Sender, Command command, String cmd, String[] a) {
		Player p = (Player) Sender;
		try {
			Player p2 = Bukkit.getPlayer(a[0]);

			double x = p2.getLocation().getX();
			double y = p2.getLocation().getY();
			double z = p2.getLocation().getZ();
			if (p.hasPermission("z.firework.other")) {
				if (cmd.equalsIgnoreCase("fwo")) {
					CoreSystemEffectFirework.RandomFireworks(p2, new Location(p2.getWorld(), x, y, z), this.m.getFireworkType(p.getDisplayName()));
					p.sendMessage("you have fireworked " + a[0]);
				}
			} else {
				p.sendMessage(ChatColor.GOLD + "--------- you do not have permission to use this command ---------");
			}
		} catch (Exception ex) {
			if (p.hasPermission("z.firework.other")) {
				p.sendMessage("Error Player offline or has never played befor");
			} else {
				p.sendMessage(ChatColor.GOLD + "--------- you do not have permission to use this command ---------");
			}
		}
		return false;
	}
}
