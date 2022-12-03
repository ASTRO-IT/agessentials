package dev.astrogames.agessentials;

import dev.astrogames.agessentials.listeners.DeathListener;
import dev.astrogames.agessentials.listeners.QuitListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    public static String prefix = "§bAstro§3Games §8— §7 ";
    public static String nopermissions = "§bAstro§3Games §8— §cDazu hast du keine Rechte!";
    public static String Version = "1.1";

    @Override
    public void onEnable() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new DeathListener(), this);
        pluginManager.registerEvents(new DeathListener(), this);
        pluginManager.registerEvents(new QuitListener(), this);

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
