package com.example.tutorial;

public class ConstructorExample {
//  "Constructor Example"
    public ConstructorExample() {
        System.out.println("Constructor Example. Constructors are Implicit Methods");
    }

    public void ExampleMethod() {
        System.out.println("This Won't Run because Methods are explicit and need to be called. Also Methods are not Constructors");
    }
}
