import java.util.ArrayList;
import java.util.Collections;

public class Leaders_arr
{
    public static void main(String[] args)
    {
        int[] arr = {16,17,4,3,5,2};

        ArrayList<Integer> leaders = new ArrayList<>();

        int maxFromRight = arr[arr.length - 1];
        leaders.add(maxFromRight);

        for(int i = arr.length - 2; i >= 0; i--)
        {
            if(arr[i] > maxFromRight)
            {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        Collections.reverse(leaders);

        System.out.print("Leaders: ");
        for(int leader : leaders)
        {
            System.out.print(leader + " ");
        }
    }
}