public class Queue_Ex
{
    int[] queue;
    int front, rear, size;
    Queue_Ex(int size)
    {
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }
    void enqueue(int x)
    {
        if(rear == size - 1)
        {
            System.out.println("Queue OverFlow");
            return;
        }
        if(front == -1)
        {
            front = 0;
        }
        queue[++rear] = x;
    }
    void dequeue()
    {
        if(front == -1 || front > rear)
        {
            System.out.println("Queue UnderFlow");
            return;
        }
        System.out.println("Removed : " + queue[front++]);
    }
    void display()
    {
        if(front == -1 || front > rear)
        {
            System.out.println("Queue is Empty");
            return;
        }
        for(int i = front; i <= rear; i++)
        {
            System.out.println(queue[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Queue_Ex q = new Queue_Ex(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}