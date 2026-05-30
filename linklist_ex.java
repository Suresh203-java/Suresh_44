import java.util.LinkedList;
public class linklist_ex
{
    public static void main(String[] args)
    {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println("Original Fruits : " + fruits);
        fruits.addFirst("Mango");
        fruits.addLast("Orange");
        System.out.println("After Insertion : " + fruits);
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println("After Deletion : " + fruits);
        for(String fruit : fruits)
        {
            System.out.println("After Traversing : " + fruit);
        }
    }
}