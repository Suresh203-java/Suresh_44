public class simple_inheritance
{
    static class Animal
    {
        void eat()
        {
            System.out.println("Animal is Eating.");
        }
    }
    static class Dog extends Animal
    {
        void bark()
        {
            System.out.println("Dog is Barking.");
        }
    }
    public static void main(String[] args)
    {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}