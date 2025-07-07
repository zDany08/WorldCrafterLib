package me.zdany.worldcrafter;

public final class Logger {

    private final WorldCrafter instance;

    public Logger(WorldCrafter instance) {
        this.instance = instance;
    }

    public void info(String message) {
        this.instance.getLogger().info(message);
    }

    public void warn(String message) {
        this.instance.getLogger().warning(message);
    }

    public void error(String message) {
        this.instance.getLogger().severe(message);
    }
}
