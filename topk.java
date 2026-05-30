import java.util.Arrays;
public class topk
{
    public static void main(String[] args)
    {
        int[] arr = {3,1,5,12,2,11,4};
        int k = 5;
        int[] topKElements = findTopKElements(arr,k);
        System.out.println("Top " + k + " elements : " + Arrays.toString(topKElements));
    }
    public static int[] findTopKElements(int[] arr, int k)
    {
        Arrays.sort(arr);
        int[] topK = new int[k];
        for(int i = 0; i < k; i++)
        {
            topK[i] = arr[arr.length - 1 - i];
        }
        return topK;
    }
}