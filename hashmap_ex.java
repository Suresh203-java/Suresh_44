import java.util.HashMap;
import java.util.Scanner;
public class hashmap_ex
{
    public static void main(String[] args)
    {
        HashMap<String,String> phonebook = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit...");
            System.out.println("Enter your Choice : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter Name : ");
                    String name = sc.nextLine();
                    System.out.println("Enter your Phone Number : ");
                    String number = sc.nextLine();
                    phonebook.put(name, number);
                    System.out.println("Contact added Successfully...");
                    break;
                case 2:
                    System.out.println("Enter Name : ");
                    name = sc.nextLine();
                    if (phonebook.containsKey(name))
                    {
                        System.out.println("Phone Number : " + phonebook.get(name));
                    }
                    else
                    {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter Name : ");
                    name = sc.nextLine();
                    if (phonebook.containsKey(name))
                    {
                        System.out.println("Enter new Phone Number : ");
                        number = sc.nextLine();
                        phonebook.put(name, number);
                        System.out.println("Contact Updated.");
                    }
                    else
                    {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter Name : ");
                    name = sc.nextLine();
                    if (phonebook.containsKey(name))
                    {
                        phonebook.remove(name);
                        System.out.println("Contact Deleted.");
                    }
                    else
                    {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid Choice. please try again.");
            }
        }
        while(choice != 5);
    }
}