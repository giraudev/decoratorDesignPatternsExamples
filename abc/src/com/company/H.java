package com.company;

public class H extends G {

    public H(I inner) {
        super(inner);
    }

    @Override
    public void doIt() {
        super.doIt();
        doH();
    }

    private void doH() {
        System.out.print('H');    }

}
