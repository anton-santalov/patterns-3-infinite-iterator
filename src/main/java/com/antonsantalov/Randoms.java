package com.antonsantalov;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected final Random random;
    protected final int min;
    protected final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator(this);
    }
}
