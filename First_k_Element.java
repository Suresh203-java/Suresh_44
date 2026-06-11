import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class First_k_Element
{
    static Queue<Integer> reverseK(Queue<Integer> q, int k)
    {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < k; i++)
        {
            s.push(q.remove());
        }
        while(!s.isEmpty())
        {
            q.add(s.pop());
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
        q.add(1); q.add(2); q.add(3); q.add(4); q.add(5);
        System.out.println(reverseK(q, 3));
    }
}