class Animal_1
{
    public String name;
    private int age;
    protected String color;
    String type;
    public void setAge(int age)
    {
        this.age = age;
    }
    public void displayInfo()
    {
        System.out.println("Name  :" + name);
        System.out.println("Age : " + age);
    }
}
class Dog extends Animal_1
{
    public void displayDetails()
    {
        System.out.println("Color :" + color);     // protected
        System.out.println("Type  :" + type);      // default
    }
}
public class Animal_Access
{
    public static void main(String[] args)
    {
        Animal_1 animal = new Animal_1();
        animal.name = "Lion";
        animal.setAge(5);
        animal.displayInfo();
        Dog dog = new Dog();
        dog.color = "Brown";
        dog.type = "Mammal";
        dog.displayDetails();
    }
}