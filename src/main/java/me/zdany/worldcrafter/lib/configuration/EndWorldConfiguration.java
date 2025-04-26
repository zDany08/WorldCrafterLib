package me.zdany.worldcrafter.lib.configuration;

import me.zdany.worldcrafter.lib.seed.Seed;
import org.bukkit.World;
import org.bukkit.WorldType;

public class EndWorldConfiguration implements WorldConfiguration {

    private final Seed seed;
    private final boolean generateStructures;

    public EndWorldConfiguration(Seed seed, boolean generateStructures) {
        this.seed = seed;
        this.generateStructures = generateStructures;
    }

    @Override
    public Seed getSeed() {
        return this.seed;
    }

    @Override
    public World.Environment getEnvironment() {
        return World.Environment.THE_END;
    }

    @Override
    public WorldType getType() {
        return WorldType.NORMAL;
    }

    @Override
    public boolean canGenerateStructures() {
        return this.generateStructures;
    }
}
