public class Rotate_arr
{
    public static void main(String[] args)
    {
        int[] arr = {1,6,4,8,4,2,9};
        int first = arr[0];
        for(int i = 0; i < arr.length - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Left Rotation : " + arr[i] + " ");
        }
        
        int[] arr1 = {1,6,4,8,4,2,9};
        int last = arr1[arr1.length - 1];
        for(int i = arr1.length - 1; i > 0; i--)
        {
            arr1[i] = arr1[i - 1];
        }
        arr1[0] = last;
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.println("Right Rotation : " + arr1[i] + " ");
        }
    }
}