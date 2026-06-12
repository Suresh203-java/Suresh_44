import java.util.*;
public class Circular_Queue
{
    int[] queue;
    int front, rear, size;
    Circular_Queue(int size)
    {
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }
    void enqueue(int x)
    {
        if((rear + 1) % size == front)
        {
            System.out.println("Queue Full");
            return;
        }
        if(front == -1)
        {
            front = 0;
        }
        rear = (rear + 1) % size;
        queue[rear] = x;
    }
    void dequeue()
    {
        if(front == -1)
        {
            System.out.println("Queue Empty");
            return;
        }
        System.out.println("Removed : " +  queue[front]);
        if(front == rear)
        {
            front = rear = -1;
        }
        else
        {
            front = (front + 1) % size;
        }
    }
    void display()
    {
        if(front == -1)
        {
            System.out.println("Queue Empty");
            return;
        }
        int i = front;
        while(true)
        {
            System.out.println(queue[i] + " ");
            if(i == rear)
            {
                break;
            }
            i = (i + 1) % size;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Circular_Queue q = new Circular_Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.enqueue(40);
        q.display();
    }
}