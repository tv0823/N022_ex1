public class Bird extends Animal {
    @Override
    public void makeSound()
    {
        System.out.println("Chirp");
    }

    @Override
    public void move()
    {
        System.out.println("flying six meters");
    }

    @Override
    public void eat()
    {
        System.out.println("My favorite food is sunflower seeds");
    }
}
