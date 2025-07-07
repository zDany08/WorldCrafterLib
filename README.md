# WorldCrafterLib
WorldCrafterLib was born to make world creation easier. The library is based on reusable world configurations you can make as shown below:

```java
import java.util.UUID;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.WorldType;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Player;
import org.bukkit.World;

import me.zdany.worldcrafter.lib.configuration.EndWorldConfiguration;
import me.zdany.worldcrafter.lib.configuration.NetherWorldConfiguration;
import me.zdany.worldcrafter.lib.configuration.SurfaceWorldConfiguration;
import me.zdany.worldcrafter.lib.configuration.WorldConfiguration;
import me.zdany.worldcrafter.lib.seed.FixedSeed;
import me.zdany.worldcrafter.lib.seed.RandomSeed;
import me.zdany.worldcrafter.lib.seed.Seed;
import me.zdany.worldcrafter.lib.WorldCrafterLib;

public class MyPlugin extends JavaPlugin implements Listener {

    private final Seed randomSeed = new RandomSeed(Long.MIN_VALUE, Long.MAX_VALUE);
    private final Seed myFavoriteSeed = new FixedSeed(-29238473L);
    private final WorldConfiguration surfaceConfig = new SurfaceWorldConfiguration(randomSeed, WorldType.NORMAL, true);
    private final WorldConfiguration netherConfig = new NetherWorldConfiguration(myFavoriteSeed, true);
    private final WorldConfiguration endConfig = new EndWorldConfiguration(myFavoriteSeed, true);

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        World world = WorldCrafterLib.craft(UUID.randomUUID().toString(), surfaceConfig);
        // WORLD GENERATION PROCESS...
        player.teleport(world.getSpawnLocation());
    }
}

```
This code creates a new world every time a player joins and teleports him there. WorldCrafterLib provides various types of configurations to choose:

- **SurfaceWorldConfiguration** to create a surface world
- **NetherWorldConfiguration** to create a nether world
- **EndWorldConfiguration** to create an end world

All of these types have a boolean parameter called _generateStructures_ (that, as its name suggests, enables/disables structure generation) and a Seed one called _seed_. There are two types of seeds to use:

- **RandomSeed** to generate a random seed every time a configuration its used
- **FixedSeed** to use the same seed every time

## Maven Implementation

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>com.github.zDany08</groupId>
        <artifactId>WorldCrafterLib</artifactId>
        <version>0.2.1</version>
    </dependency>
</dependencies>
```

## Gradle Implementation
```groovy
repositories {
    maven { url = "https://jitpack.io" }
}
dependencies {
    compileOnly "com.github.zDany08:WorldCrafterLib:0.2.1"
}
```
