package me.zdany.worldcrafter.lib.configuration;

import me.zdany.worldcrafter.lib.seed.Seed;
import org.bukkit.World;
import org.bukkit.WorldType;

public class SurfaceWorldConfiguration implements WorldConfiguration {

    private final Seed seed;
    private final WorldType type;
    private final boolean generateStructures;

    public SurfaceWorldConfiguration(Seed seed, WorldType type, boolean generateStructures) {
        this.seed = seed;
        this.type = type;
        this.generateStructures = generateStructures;
    }

    @Override
    public Seed getSeed() {
        return this.seed;
    }

    @Override
    public World.Environment getEnvironment() {
        return World.Environment.NORMAL;
    }

    @Override
    public WorldType getType() {
        return this.type;
    }

    @Override
    public boolean canGenerateStructures() {
        return this.generateStructures;
    }
}
