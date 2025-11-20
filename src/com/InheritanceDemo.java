package com.dadipelli.oopsexamples;

class Person {
    protected String name;
    public Person(String name) { this.name = name; }
    public void show() { System.out.println("Person: " + name); }
}

class Student extends Person {
    private String college;
    public Student(String name, String college) {
        super(name);
        this.college = college;
    }
    public void show() {
        System.out.println("Student: " + name + ", College: " + college);
    }
}

public class InheritanceDemo {
    public static void demo() {
        Person p = new Person("Ram");
        p.show();
        Student s = new Student("Ganesh", "Malla Reddy");
        s.show();
    }
}
