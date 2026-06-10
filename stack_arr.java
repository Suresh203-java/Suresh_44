public class stack_arr
{
    int[] stack;
    int top;
    int size;
    stack_arr(int size)
    {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    void push(int x)
    {
        if(top == size - 1)
        {
            System.out.println("Stack OverFlow");
            return;
        }
        stack[++top] = x;
    }
    int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        return stack[top--];
    }
    int peek()
    {
        if(top == -1)
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }
    public static void main(String[] args)
    {
        stack_arr s = new stack_arr(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Popped : " + s.pop());
        System.out.println("Top Element : " + s.peek());
    }
}