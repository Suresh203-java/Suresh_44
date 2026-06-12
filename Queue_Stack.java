import java.util.*;
public class Queue_Stack
{
    static void interleave(Queue<Integer> q)
    {
        Stack<Integer> s = new Stack<>();
        int half = q.size() / 2;
        for(int i = 0; i < half; i++)
        {
            s.push(q.remove());
        }
        while(!s.isEmpty())
        {
            q.add(s.pop());
        }
        for(int i = 0; i < half; i++)
        {
            q.add(q.remove());
        }
        for(int i = 0; i < half; i++)
        {
            s.push(q.remove());
        }
        while(!s.isEmpty())
        {
            q.add(s.pop());
            q.add(q.remove());
        }
    }
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= 6; i++)
        {
            q.add(i);
        }
        interleave(q);
        System.out.println(q);
    }
}