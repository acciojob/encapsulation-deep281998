package com.driver;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String agrs[]){
        RWOnly r = new RWOnly("name");
        System.out.println(r.getName());
        r.setName("name");
        System.out.println(r.getName());
    }
}