import java.util.ArrayList;
import java.util.Iterator;
public class iter
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        System.out.println("Original list : " + list);
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext())
        {
            String fruit = iterator.next();
            if(fruit.equals("Mango"))
            {
                iterator.remove();
            }
        }
        System.out.println("After Removing Mango : "+list);
    }
}