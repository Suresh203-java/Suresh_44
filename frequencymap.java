import java.util.HashMap;
public class frequencymap
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,2,3,1};
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : arr)
        {
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        System.out.println("Element Frequency : "+freq);
    }
}