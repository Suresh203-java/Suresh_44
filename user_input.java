import java.util.Scanner;
public class user_input
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        System.out.println("Enter Your Roll Number : ");
        System.out.println("Enter Your Age : ");
        String name = sc.nextLine();
        int num = sc.nextInt();
        int age = sc.nextInt();
        System.out.println("Name : "+ name +"\n Roll Number : "+num +"\n Age : "+age);
    }
}
