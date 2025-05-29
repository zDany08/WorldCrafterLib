package me.zdany.worldcrafter;

import me.zdany.worldcrafter.lib.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public final class WorldCrafter extends JavaPlugin {

    private final Logger logger = new Logger(this);

    @Override
    public void onEnable() {
        this.logger.info("Plugin Enabled!");
    }

    @Override
    public void onDisable() {
        this.logger.info("Plugin Disabled!");
    }

    public Logger getPluginLogger() {
        return this.logger;
    }
}
