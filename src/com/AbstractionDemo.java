package com.dadipelli.oopsexamples;

abstract class Animal {
    protected String name;
    public Animal(String name) { this.name = name; }
    public abstract void sound();
    public void sleep() { System.out.println(name + " is sleeping."); }
}

class Dog extends Animal {
    public Dog(String name) { super(name); }
    @Override
    public void sound() { System.out.println(name + " says: Woof!"); }
}

class Cat extends Animal {
    public Cat(String name) { super(name); }
    @Override
    public void sound() { System.out.println(name + " says: Meow!"); }
}

public class AbstractionDemo {
    public static void demo() {
        Animal d = new Dog("Rex");
        Animal c = new Cat("Mittens");
        d.sound();
        c.sound();
        d.sleep();
    }
}
