public class constructor
{
    static class Animal
    {
        String name;
        int age;
        Animal(String name,int age)
        {
            this.name = name;
            this.age = age;
        }
        void displayDetails()
        {
            System.out.println("Animal Details :");
            System.out.println("Name : "+ name);
            System.out.println("Age : "+ age);
        }
    }
    public static void main(String[] args)
    {
        Animal myAnimal = new Animal("Lion",19);
        myAnimal.displayDetails();
    }
}
