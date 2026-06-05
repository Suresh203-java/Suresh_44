public class print_arr
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,0,4,2,0,5};
        int index = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                arr[index++] = arr[i];
            }
        }
        while(index < arr.length)
        {
            arr[index++] = 0;
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}