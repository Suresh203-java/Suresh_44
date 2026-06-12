import java.util.Deque;
import java.util.PriorityQueue;
public class Priority_Queue
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(30);
        minHeap.add(10);
        minHeap.add(20);
        System.out.println("Min Heap : " + minHeap);
        while(!minHeap.isEmpty())
        {
            System.out.println("Removed : " + minHeap.poll());
        }
    }
}