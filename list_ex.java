import java.util.ArrayList;
public class list_ex
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Blueberry");
        list.add("Cherry");
        System.out.println("Original list : " + list);
        System.out.println("After Get : " + list.get(0));
        list.set(0, "Banana");
        System.out.println("After Set : " + list);
        list.remove(0);
        System.out.println("After removal : " + list);
        System.out.println("Size of the list : " + list.size());
    }
}