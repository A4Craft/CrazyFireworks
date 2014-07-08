package zhscraft.mod.net.commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import zhscraft.mod.net.main;
import zhscraft.mod.net.core.Cast;

public class FireworkShow implements CommandExecutor {

	main m;

	public FireworkShow(main m) {
		this.m = m;
	}

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String command, String[] a) {
		Player p = (Player) arg0;
		if (command.equalsIgnoreCase("fwshow") && a.length > 0) {
			if (a[0].equalsIgnoreCase("set")) {
				p.sendMessage("you have set the show coords to this point");
				setCoords(p.getWorld().getName(), new Vector(p.getLocation().getX(), p.getLocation().getY(), p.getLocation().getZ()));
			}

			if (getCoords() != null) {
				double x = getCoords().getX();
				double y = getCoords().getY();
				double z = getCoords().getZ();

				showType(a[0], x, y, z, getWorld());

			} else {
				p.sendMessage("please you /fwshow set  to set the location");
			}
		} else {
			p.sendMessage("/fwshow set | sets the show location");
		}
		return false;
	}

	private void showType(String show, double x, double y, double z, String w) {

		if (show.equalsIgnoreCase("0")) {
			Cast.LongShow(x, y, z, w);
		}
		if (show.equalsIgnoreCase("1")) {
			Cast.CreeperShow(x, y, z, w);
		}

		if (show.equalsIgnoreCase("2")) {
			Cast.TemplateShow(x, y, z, w);
		}

		if (show.equalsIgnoreCase("3")) {
			Cast.alphaOMaga(x, y, z, w);
		}
		if(show.equalsIgnoreCase("zhscraft")){
			Cast.LongSmallShow(x, y, z, w);
		}

	}

	public void setCoords(String string, Vector v) {
		File file = new File("./plugins/crazyfireworks/shows/show.yml");
		YamlConfiguration t = new YamlConfiguration();

		try {
			file.createNewFile();
			t.load(file);
			t.set("Vector", v);
			t.set("world", string);
			t.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getWorld() {
		File file = new File("./plugins/crazyfireworks/shows/show.yml");
		YamlConfiguration t = new YamlConfiguration();

		try {
			t.load(file);
			return t.getString("world");
		} catch (IOException | InvalidConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Vector getCoords() {
		File file = new File("./plugins/crazyfireworks/shows/show.yml");
		YamlConfiguration t = new YamlConfiguration();

		try {
			t.load(file);
			return t.getVector("Vector");
		} catch (IOException | InvalidConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
