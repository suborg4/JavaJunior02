package javajunior02.task01;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Дикий", 3));
        animals.add(new Dog("Эскобар", 5));
        animals.add(new Cat("Чупамяй", 2));

        animals.stream()
                .forEach(Animal::makeSound);
    }
}
