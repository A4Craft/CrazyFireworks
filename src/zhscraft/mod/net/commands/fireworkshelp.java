package zhscraft.mod.net.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import zhscraft.mod.net.main;

public class fireworkshelp implements CommandExecutor {
	main m;

	public fireworkshelp(main main) {
		this.m = main;
	}

	public boolean onCommand(CommandSender Sender, Command command, String cmd, String[] a) {
		Player p = (Player) Sender;
		if (p.hasPermission("z.firework.help")) {
			if (cmd.equalsIgnoreCase("fwhelp")) {
				if (p.hasPermission("z.firework.other")) {
					p.sendMessage(ChatColor.GREEN + "/fwo <player>     | allows you to shoot a firework out of someone else's head");
				}
				if (p.hasPermission("z.firework.style")) {
					p.sendMessage(ChatColor.GREEN + "/fw     | allows you to shoot a firework out you're head");
				}
				if (p.hasPermission("z.firework.type")) {
					p.sendMessage(ChatColor.GREEN + "/fwtype <type>     | allows you to change the type of firework ball/star");
					p.sendMessage(ChatColor.GREEN + "/fwtype -t         | to list all types");
				}
			}
		} else {
			p.sendMessage(ChatColor.GOLD + "--------- you do not have permission to use this command ---------");
		}
		return false;
	}
}
