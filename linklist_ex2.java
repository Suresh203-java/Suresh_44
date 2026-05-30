import java.util.LinkedList;
public class linklist_ex2
{
    public static void main(String[] args)
    {
        LinkedList<String> fruit = new LinkedList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Cherry");
        System.out.println("Original list : "+fruit);
        System.out.println("At index 1 : "+fruit.get(1));
        fruit.set(1,"Blueberry");
        System.out.println("After modify : "+fruit);
        fruit.remove(1);
        System.out.println("After removal : "+fruit);
        System.out.println("Size of the LinkedList : "+fruit.size());
    }
}