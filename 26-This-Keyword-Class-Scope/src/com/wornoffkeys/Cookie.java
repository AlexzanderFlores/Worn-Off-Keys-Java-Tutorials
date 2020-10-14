package com.wornoffkeys;

public class Cookie {
    public String name = "None";
    public int age = 27;
    public Cookie cookie;

    public Cookie() {
        System.out.println("A new cookie was created");
    }

    public Cookie(String name) {
        this.name = name;
        System.out.println("A new cookie was created, it was " + name);
    }

    public void printText() {
        if (name == null) {
            System.out.println("Hello world");
        } else {
            System.out.println("Hello world from " + name);
        }
    }
}
