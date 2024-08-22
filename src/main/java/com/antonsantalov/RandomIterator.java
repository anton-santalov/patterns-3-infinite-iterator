package com.antonsantalov;

import java.util.Iterator;

class RandomIterator implements Iterator<Integer> {

    private final Randoms integers;

    public RandomIterator(Randoms integers) {
        this.integers = integers;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return integers.random.nextInt(integers.max - integers.min + 1) + integers.min;
    }
}
