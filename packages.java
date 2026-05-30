import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;
public class packages
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        Random random = new Random();
        int num = random.nextInt(100);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        LocalDate currentDate = LocalDate.now();
        System.out.println("Name: " + name);
        System.out.println("Random Number: " + num);
        System.out.println("Entered Number: " + n);
        System.out.println("Current Date: " + currentDate);
        sc.close();
    }
}