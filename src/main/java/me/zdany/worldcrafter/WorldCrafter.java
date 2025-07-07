package me.zdany.worldcrafter;

import org.bukkit.plugin.java.JavaPlugin;

public final class WorldCrafter extends JavaPlugin {

    private final Logger logger = new Logger(this);

    @Override
    public void onEnable() {
        this.logger.info("Plugin enabled!");
    }

    @Override
    public void onDisable() {
        this.logger.info("Plugin disabled!");
    }

    public Logger getPluginLogger() {
        return this.logger;
    }
}
