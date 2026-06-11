import java.util.Queue;
import java.util.LinkedList;
public class First_k_Element_arr
{
    static Queue<Integer> reverseK(Queue<Integer> q, int k)
    {
        if(k <= 0 || k > q.size())
            return q;
        int[] arr = new int[k];
        for(int i = 0; i < k; i++)
        {
            arr[i] = q.remove();
        }
        for(int i = k - 1; i >= 0; i--)
        {
            q.add(arr[i]);
        }
        int remaining = q.size() - k;
        for(int i = 0; i < remaining; i++)
        {
            q.add(q.remove());
        }
        return q;
    }
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(reverseK(q, 3));
    }
}