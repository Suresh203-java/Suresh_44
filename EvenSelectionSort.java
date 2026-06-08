public class EvenSelectionSort
{
    public static void selectionSort(int[] arr)
    {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++)
        {
            if (arr[i] % 2 == 0)
            {
                int minIndex = i;

                for (int j = i + 1; j < n; j++)
                {
                    if (arr[j] % 2 == 0 && arr[j] < arr[minIndex])
                    {
                        minIndex = j;
                    }
                }

                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {5, 8, 3, 2, 9, 4};

        selectionSort(arr);

        System.out.println("Array after sorting even numbers:");

        for (int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}