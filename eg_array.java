import java.util.Scanner;
public class eg_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of The Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter The Elements of Array : ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Elements of The Array are : ");
        for(int i = 0; i < size; i++)
        {
            System.out.println(arr[i] +" ");
        }
    }
}       