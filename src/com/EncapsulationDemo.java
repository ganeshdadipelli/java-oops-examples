
package com.dadipelli.oopsexamples;

public class EncapsulationDemo {
    private String name;
    private int age;

    public EncapsulationDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age >= 0) this.age = age;
    }

    @Override
    public String toString() {
        return "EncapsulationDemo{name='" + name + "', age=" + age + "}";
    }
}
