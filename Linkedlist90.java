public class Linkedlist90
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    void insertAtBeginning(int data)
    {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }
    void insertAtEnd(int data)
    {
        Node n = new Node(data);
        if(head == null) 
        {
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = n;
    }
    void deleteAtBeginning()
    {
        if(head == null)
        {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }
    void deleteAtEnd()
    {
        if(head == null)
        {
            System.out.println("List is Empty");
            return;
        }
        if(head.next == null)
        {
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
    }
    void display()
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("List is Empty");
            return;
        }
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args)
    {
        Linkedlist90 list = new Linkedlist90();
        //list.insertAtBeginning(10);
        //list.insertAtEnd(20);
        //list.insertAtBeginning(15);
        //list.insertAtEnd(25);
        //list.display();
        //list.deleteAtBeginning();
        //list.deleteAtEnd();
        //list.display();
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        System.out.println("Linked List after insertion:");
        list.display();
        list.deleteAtBeginning();
        System.out.println("After deleting from beginning:");
        list.display();
        list.deleteAtEnd();
        System.out.println("After deleting from end:");
        list.display();
    }
}