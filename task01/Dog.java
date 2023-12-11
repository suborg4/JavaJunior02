package javajunior02.task01;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    public String getBreed() {
        return breed;
    }
}