package me.zdany.worldcrafter;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class WorldCrafter extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + getName() + " has been enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + getName() + " has been disabled!");
    }
}
