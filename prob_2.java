public class prob_2
{
    static class Animal
    {
        void sound()
        {
            System.out.println("Anima is make a sound.");
        }
    }
    static class Dog extends Animal
    {
        void sound()
        {
            System.out.println("Dog is Barking.");
        }
    }
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.sound();
    }
}