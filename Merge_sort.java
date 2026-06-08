// using Mid value and swap the values using divide and conquer method.
import java.util.*;
public class Merge_sort
{
    public static void mergeSort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right)
    {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while(i <= mid && j <= right)
        {
            if(arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
            while(i <= mid) temp[k++] = arr[i++];
            
            while(j <= right) temp[k++] = arr[j++];
            
            System.arraycopy(temp, 0, arr, left, temp.length);    
    }
    public static void main(String[] args)
    {
        int[] arr = {20,40,10,48,94,44,35,21};
        System.out.println("Before Merge Sort : ");
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After Merge Sort (Stable):");
        System.out.println(Arrays.toString(arr));
    }
}