package javajunior02.task01;

public class Cat extends Animal {
    private boolean isLazy;

    public Cat(String name, int age, boolean isLazy) {
        super(name, age);
        this.isLazy = isLazy;
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу-мяу!");
    }

    public boolean isLazy() {
        return isLazy;
    }
}