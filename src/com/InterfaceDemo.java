package com.dadipelli.oopsexamples;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    private String model;
    public Car(String model) { this.model = model; }
    @Override
    public void start() { System.out.println(model + " starting"); }
    @Override
    public void stop() { System.out.println(model + " stopping"); }
}

public class InterfaceDemo {
    public static void demo() {
        Vehicle v = new Car("Swift");
        v.start();
        v.stop();
    }
}
