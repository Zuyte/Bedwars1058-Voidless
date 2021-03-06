package me.zuyte.voidless;

import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.configuration.ConfigManager;
import me.zuyte.voidless.commands.voidless;
import me.zuyte.voidless.match.finder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public final class Main extends JavaPlugin {
    private static ConfigManager cfg;
    private static Main instance;

    @Override
    public void onEnable() {
        if (Bukkit.getPluginManager().getPlugin("BedWars1058") == null) {
            getLogger().severe("BedWars1058 was not found. Disabling...");
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        } else {
            instance = this;
            getServer().getPluginManager().registerEvents(new finder(), this);
            BedWars bedwarsAPI = Bukkit.getServicesManager().getRegistration(BedWars .class).getProvider();
            new voidless(bedwarsAPI.getBedWarsCommand(), "voidless");
            cfg = new ConfigManager(this, "config", "plugins/BedWars1058/Addons/Voidless");
            setupConfiguration();
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&b=========================================="));
            Bukkit.getConsoleSender().sendMessage(" ");
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&aRunning Bedwars1058-Voidless &7-&r " + "v" + getDescription().getVersion()));
            Bukkit.getConsoleSender().sendMessage(" ");
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&fFound &eBedwars1058&f and hooked into."));
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&fBedwars1058-Voidless Enabled successfully!"));
            Bukkit.getConsoleSender().sendMessage(" ");
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&fCreated by &cZuyte"));
            Bukkit.getConsoleSender().sendMessage(" ");
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&b=========================================="));
        }
    }

    private static void setupConfiguration() {
        YamlConfiguration yml = getCfg().getYml();
        yml.options().header("Bedwars1058 voidless addon helps you creating uhh.. A bed defence :D!" +
                "\nDocumentation: Soon.\n \nSet your voidless arena's group below!\nTo create a group and set it use these commands\n/bw arenaGroup create <name>, /bw arenaGroup  set <arenaName> <groupName>");
        // if anyone is wondering what debug does currently, there's no use.
        yml.addDefault(ConfigPath.DEBUG, false);
        yml.addDefault(ConfigPath.ARENA_GROUP, Arrays.asList("4v4v4v4", "ExampleGroup2"));
        yml.options().copyDefaults(true);
        getCfg().save();
    }
    public static ConfigManager getCfg() {
        return cfg;
    }

    public static Main getInstance(){
        return instance;
    }
}
