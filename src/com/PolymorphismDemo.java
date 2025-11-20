package com.dadipelli.oopsexamples;

class Calculator {
    // compile-time polymorphism (overloading)
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }

    // runtime polymorphism (overriding)
    public String describe() { return "Generic Calculator"; }
}

class ScientificCalculator extends Calculator {
    @Override
    public String describe() { return "Scientific Calculator"; }
}

public class PolymorphismDemo {
    public static void demo() {
        Calculator c1 = new Calculator();
        Calculator c2 = new ScientificCalculator(); // runtime polymorphism
        System.out.println("int add: " + c1.add(2, 3));
        System.out.println("double add: " + c1.add(2.5, 3.7));
        System.out.println("c1 type: " + c1.describe());
        System.out.println("c2 type: " + c2.describe());
    }
}
