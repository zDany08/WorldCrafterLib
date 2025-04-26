package me.zdany.worldcrafter.lib;

import me.zdany.worldcrafter.lib.configuration.WorldConfiguration;
import org.bukkit.World;
import org.bukkit.WorldCreator;

public final class WorldCrafterLib {

    /**
     * Creates a world
     *
     * @param name Name of the world
     * @param configuration Set of configuration options to customize the world
     * @return The world just created
     */
    public static World craft(String name, WorldConfiguration configuration) {
        WorldCreator creator = new WorldCreator(name);
        creator.seed(configuration.getSeed().get());
        creator.environment(configuration.getEnvironment());
        creator.type(configuration.getType());
        creator.generateStructures(configuration.canGenerateStructures());
        return creator.createWorld();
    }
}
