package me.zdany.worldcrafter.lib.seed;

import java.util.Random;

public class RandomSeed implements Seed {

    private final long min, max;

    public RandomSeed() {
        this.min = Long.MIN_VALUE;
        this.max = Long.MAX_VALUE;
    }

    public RandomSeed(long min, long max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public long get() {
        Random random = new Random();
        long seed;
        do {
            seed = random.nextLong();
        }while(seed < this.min || seed > this.max);
        return seed;
    }
}
