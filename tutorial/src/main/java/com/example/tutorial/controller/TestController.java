package com.example.tutorial.controller;


import com.example.tutorial.*;

public class TestController {
    public static void main(String[] args) {
//  "Method Overriding example"
//        MethodExample e = new MethodExample();
//        e.printStuff(10);

//  "Deep Copy Example"
//        MethodExample example1 = new MethodExample();
//        example1.x = 50;
//        MethodExample example2 = example1;
//        example2.x = 100;
//
//        System.out.print(example1.x);

//   "Constructor Example"
//        ConstructorExample conex1 = new ConstructorExample();

//   "AbstractClass Example"
//        AbstractClassExample example = new AbstractClassExample();
//   "This does not work because abstract classes cannot be instantiated"
//        AbstractClass example4 = new AbstractClass();
//   "SuperClass Example"
        SuperClass superClass = new SuperClass();
        superClass.superFunction();
    }
}
