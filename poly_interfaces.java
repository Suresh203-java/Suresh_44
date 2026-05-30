public class poly_interfaces
{
    interface Animal
    {
        void makesound();
    }
    static class Dog implements Animal
    {
        public void makesound()
        {
            System.out.println("Dog barks.");
        }
    }
    static class Cat implements Animal
    {
        public void makesound()
        {
            System.out.println("cat Meows.");
        }
    }
    public static void main(String[] args)
    {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makesound();
        cat.makesound();
    }
}