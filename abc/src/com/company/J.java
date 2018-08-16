package com.company;

public class J extends H {
    public J(I inner) {
        super(inner);
    }

    private void doJ(){
        System.out.println('J');
    }

    @Override
    public void doIt() {
        super.doIt();
        doJ();
    }
}
