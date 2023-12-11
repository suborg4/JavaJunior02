package javajunior02.task01;

/*
* Создайте абстрактный класс "Animal" с полями "name" и "age".
* Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat")
* с уникальными полями и методами.
* Создайте массив объектов типа "Animal" и с использованием Reflection API
* выполните следующие действия:
* Выведите на экран информацию о каждом объекте.
* Вызовите метод "makeSound()" у каждого объекта,
* если такой метод присутствует.
*/

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Найда", 3, "Эскобар");
        animals[1] = new Cat("Дикий", 5, true);

        for (Animal animal : animals) {
            System.out.println("Имя: " + animal.getName());
            System.out.println("Возраст: " + animal.getAge());
            animal.makeSound();

            // Проверка на "makeSound()"
            try {
                Method makeSoundMethod = animal.getClass().getMethod("makeSound");
                makeSoundMethod.invoke(animal);
            } catch (Exception e) {
                // если "makeSound()" не найден
            }

            System.out.println();
        }
    }
}