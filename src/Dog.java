public class Dog extends Animal {
    @Override
    public void makeSound()
    {
        System.out.println("Bark");
    }

    @Override
    public void move()
    {
        System.out.println("Moving to the left on four 2 steps");
    }

    @Override
    public void eat()
    {
        System.out.println("My favorite food is eggs");
    }
}
