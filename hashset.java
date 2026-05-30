import java.util.HashSet;
public class hashset
{
    public static void main(String[] args)
    {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cherry");
        System.out.println(fruits);
        fruits.remove("Cherry");
        System.out.println(fruits);
        if(fruits.contains("Banana"))
        {
            System.out.println("This Fruit is Exists.");
        }
        else
        {
            System.out.println("This fruit not Exists.");
        }
    }
}