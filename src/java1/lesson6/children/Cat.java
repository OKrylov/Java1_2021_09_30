package java1.lesson6.children;

import java1.lesson6.Animal;
import java1.lesson6.test.Test6;

import java.util.Objects;

public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public void play() {
        System.out.println("Our cat is playing!");
    }

    public void sleep() {
        System.out.println("Zzzz...Zzzzzz...");
    }

    @Override
    public void voice() {
        System.out.println("Meow!");
    }

//    public void printInfo() {
//        System.out.println(toString());
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }



}
