class Animal_Access
{
    public String name;
    private int age;
    protected String color;
    String type;
    public void displayInfo()
    {
        System.out.println("Name  :" + name);
        System.out.println("Age : " + age);
    }
}
class Dog extends Animal_Access
{
    public void displayDetails()
    {
        System.out.println("Color :" + color);     // protected
        System.out.println("Type  :" + type);      // default
    }
}
public class main
{
    public static void main(String[] args)
    {
        Animal_Access animal = new Animal_Access();
        animal.name = "Lion";
        animal.displayInfo();
        Dog dog = new Dog();
        dog.color = "Brown";
        dog.type = "Mammal";
        dog.displayDetails();
    }
}