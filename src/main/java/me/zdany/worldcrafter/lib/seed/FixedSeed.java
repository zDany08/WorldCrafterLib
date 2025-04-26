package me.zdany.worldcrafter.lib.seed;

public class FixedSeed implements Seed {

    private final long seed;

    public FixedSeed(long seed) {
        this.seed = seed;
    }

    @Override
    public long get() {
        return this.seed;
    }
}
