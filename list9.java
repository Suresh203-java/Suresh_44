import java.util.ArrayList;
public class list9
{
    public static void main(String[] args)
    {
        ArrayList<String> Books = new ArrayList<>();
        Books.add("Mathematics");
        Books.add("Telugu");
        Books.add("English");
        Books.add("Hindi");
        Books.add("Telugu");
        Books.add("General Science");
        System.out.println("ArrayList :" +Books);
        System.out.println("Third Book : " + Books.get(2));
    }
}