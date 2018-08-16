package com.company;

public class G extends Z {
    public G(I inner) {
        super(inner);
    }

    public void doIt(){
        super.doIt();
        doG();
    }

    private void doG(){
        System.out.print("G");
    }

}
