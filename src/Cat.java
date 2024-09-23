public class Cat extends Animal {
    @Override
    public void makeSound()
    {
        System.out.println("Meow");
    }

    @Override
    public void move()
    {
        System.out.println("Moving straight on four 4 steps and meowing");
    }

    @Override
    public void eat()
    {
        System.out.println("My favorite food is fish");
    }
}
