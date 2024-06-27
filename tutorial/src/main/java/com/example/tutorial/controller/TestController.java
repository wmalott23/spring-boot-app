package com.example.tutorial.controller;


import com.example.tutorial.ExampleChild;
import com.example.tutorial.MethodExample;

public class TestController {
    public static void main(String[] args) {
//  "Method Overriding example"
//        MethodExample e = new MethodExample();
//        e.printStuff(10);

//  "Deep Copy Example"
        MethodExample example1 = new MethodExample();
        example1.x = 50;
        MethodExample example2 = example1;
        example2.x = 100;

        System.out.print(example1.x);


    }
}
