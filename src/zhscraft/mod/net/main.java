package zhscraft.mod.net;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.PluginCommand;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import zhscraft.mod.net.commands.*;
import zhscraft.mod.net.events.*;

public class main extends JavaPlugin {

	public static main plugin;

	public void setupCommands(String cmd, CommandExecutor args) {
		Bukkit.getServer().getPluginCommand(cmd).setExecutor(args);
	}

	public void setupEvents(Listener list, Plugin plug) {
		Bukkit.getServer().getPluginManager().registerEvents(list, plug);
	}

	public void createDir(String path) {
		File file = new File(path);
		if (!file.exists()) {
			file.mkdirs();
		}
	}

	public void onEnable() {
		plugin = this;

		createDir("./plugins/crazyfireworks/players/");
		createDir("./plugins/crazyfireworks/shows/");

		setupEvents(new Login(this), this);

		setupCommands("fw", new Firework(this));
		setupCommands("fwo", new FireworkOther(this));
		setupCommands("fwhelp", new fireworkshelp(this));
		setupCommands("fwtype", new FireworksetType(this));
		setupCommands("fwshow", new FireworkShow(this));

	}

	public void setFireworkType(String type, String name) {
		File file = new File("./plugins/crazyfireworks/players/" + name + ".yml");
		YamlConfiguration yml = new YamlConfiguration();
		try {
			yml.load(file);
			yml.set("fireworkstarType", type);
			yml.save(file);
		} catch (IOException | InvalidConfigurationException e) {
			e.printStackTrace();
		}
	}

	public String getFireworkType(String name) {
		File file = new File("./plugins/crazyfireworks/players/" + name + ".yml");
		YamlConfiguration yml = new YamlConfiguration();
		try {
			yml.load(file);
			return yml.getString("fireworkstarType");
		} catch (IOException | InvalidConfigurationException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void CreatePlayerRightsData(String name) {
		File Dir = new File("./plugins/crazyfireworks/players/");
		if (!Dir.exists()) {
			Dir.mkdirs();
			System.out.println(ChatColor.RED + " creating DIR");
		}
		File file = new File("./plugins/crazyfireworks/players/" + name + ".yml");
		YamlConfiguration yml = new YamlConfiguration();
		if (!file.exists()) {
			try {
				file.createNewFile();
				yml.load(file);
				yml.set("fireworkstarType", "ball");
				yml.save(file);
			} catch (IOException | InvalidConfigurationException e) {
				e.printStackTrace();
			}
		}
	}
}
