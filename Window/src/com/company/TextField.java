package com.company;

// 3. "Core" class with "is a" relationship
public class TextField implements Widget {

    private int width, heignt;

    public TextField(int width, int heignt) {
        this.width = width;
        this.heignt = heignt;
    }

    @Override
    public void draw() {
        System.out.println("TextField: "+width+", "+heignt);
    }
}
