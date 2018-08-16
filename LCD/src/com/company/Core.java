package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Core implements LCD {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    //metodos da interface
    @Override
    public void write(String[] s) {
        System.out.println("INPUT: ");
        try{
            s[0] = in.readLine();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    //metodos da interface
    @Override
    public void read(String[] s) {
        System.out.println("Output: "+s[0]);
    }
}
