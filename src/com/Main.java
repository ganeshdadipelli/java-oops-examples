package com.dadipelli.oopsexamples;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Encapsulation Demo ===");
        EncapsulationDemo e = new EncapsulationDemo("Ganesh", 22);
        System.out.println(e);
        e.setAge(23);
        System.out.println("Updated: " + e);

        System.out.println("\n=== Abstraction Demo ===");
        AbstractionDemo.demo();

        System.out.println("\n=== Inheritance Demo ===");
        InheritanceDemo.demo();

        System.out.println("\n=== Polymorphism Demo ===");
        PolymorphismDemo.demo();

        System.out.println("\n=== Interface Demo ===");
        InterfaceDemo.demo();
    }
}
