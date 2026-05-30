import java.util.Scanner;
public class modify
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter inputs from user : ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Elements of The Array are : ");
        for(int i = 0; i < size; i++)
        {
            System.out.println(arr[i] +" ");
        }
        arr[2] = 100;
        System.out.println("The Modified Elements of The Array are : ");
        for(int i = 0; i < size; i++)
        {
            System.out.println(arr[i] +" ");
        }
    }
}