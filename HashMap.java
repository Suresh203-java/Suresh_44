import java.util.HashMap;
public class hashmap
{
    public static void main(String[] args)
    {
        HashMap<String,String> phonebook = new HashMap<>();
        phonebook.put("Suresh ", " 8688261748");
        phonebook.put("Raju ", " 9160299855");
        phonebook.put("Santhosh ", " 9014715984");
        phonebook.put("Hari ", " 9063082153");
        System.out.println(phonebook);
        System.out.println("Hari's Phone Number : " + phonebook.get("Hari "));
        phonebook.remove("Suresh ");
        System.out.println("After Removing Suresh's Phone Number " + phonebook);
    }
}