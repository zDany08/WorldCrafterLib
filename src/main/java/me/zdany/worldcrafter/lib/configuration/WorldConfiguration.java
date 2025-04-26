package me.zdany.worldcrafter.lib.configuration;

import me.zdany.worldcrafter.lib.seed.Seed;
import org.bukkit.World;
import org.bukkit.WorldType;

public interface WorldConfiguration {

    Seed getSeed();
    World.Environment getEnvironment();
    WorldType getType();
    boolean canGenerateStructures();
}
