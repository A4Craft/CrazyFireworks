package zhscraft.mod.net.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import zhscraft.mod.net.main;

public class FireworksetType implements CommandExecutor {
	main m;

	public FireworksetType(main m) {
		this.m = m;
	}

	public boolean onCommand(CommandSender Sender, Command command, String cmd, String[] a) {
		Player p = (Player) Sender;
		if ((p.hasPermission("z.firework.type")) && (cmd.equalsIgnoreCase("fwtype"))) {
			if (a[0].equalsIgnoreCase("ball")) {
				this.m.setFireworkType("ball", p.getDisplayName());
				p.sendMessage("you have selected " + a[0] + " has you're default firework star/ball");
			} else if (a[0].equalsIgnoreCase("burst")) {
				this.m.setFireworkType("burst", p.getDisplayName());
				p.sendMessage("you have selected " + a[0] + " has you're default firework star/ball");
			} else if (a[0].equalsIgnoreCase("creeper")) {
				this.m.setFireworkType("creeper", p.getDisplayName());
				p.sendMessage("you have selected " + a[0] + " has you're default firework star/ball");
			} else if (a[0].equalsIgnoreCase("star")) {
				this.m.setFireworkType("star", p.getDisplayName());
				p.sendMessage("you have selected " + a[0] + " has you're default firework star/ball");
			} else if (a[0].equalsIgnoreCase("ball large")) {
				this.m.setFireworkType("ball large", p.getDisplayName());
				p.sendMessage("you have selected " + a[0] + " has you're default firework star/ball");
			} else if (a[0].equalsIgnoreCase("-t")) {
				p.sendMessage("types [ball,burst,creeper,star,ball large]");
			}
		}
		return false;
	}
}
