//it can assign key and search the all elements and arrange it.
public class insertion_sort
{
    public static void insertionSort(int[] arr)
    {
        int n = arr.length;
        for(int i = 1; i < n; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {4,3,6,23,75,5};
        insertionSort(arr);
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}