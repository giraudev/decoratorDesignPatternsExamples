package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        I[] array = {new X(new A()), new Y(new X(new A())), new Z(new Y(new A())), new G(new A()), new H(new A()),
        new J(new A())};
        for (I anArray:array){
            anArray.doIt();
            System.out.print(" ");
        }
    }
}
