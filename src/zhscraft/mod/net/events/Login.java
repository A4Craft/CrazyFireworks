package zhscraft.mod.net.events;

import java.io.File;
import java.io.IOException;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import zhscraft.mod.net.main;

public class Login implements Listener {
	main m;

	public Login(main m) {
		this.m = m;
	}

	public void checkPlayerFileIfCreated(Player p) {
		File file = new File("./plugins/crazyfireworks/players/" + p.getName() + ".yml");
		
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@EventHandler
	public void _Login(PlayerLoginEvent e) {
		Player p = e.getPlayer();
		this.m.CreatePlayerRightsData(p.getDisplayName());
	}
}
