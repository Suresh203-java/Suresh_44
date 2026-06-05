public class Duplicate_Element
{
    public static void main(String[] args)
    {
        int[] arr = {5, 3, 5, 5, 7};
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("Duplicate Element : " + i);
                    return;
                }
            }
        }
    }
}