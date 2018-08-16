package com.company;

public class Decorator implements LCD {
    private LCD inner;

    public Decorator(LCD i) {
        inner = i;
    }

    @Override
    public void write(String[] s) {
        inner.write(s);
    }

    @Override
    public void read(String[] s) {
        inner.read(s);
    }
}
