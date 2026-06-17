import java.util.*;
public class Identical_Trees
{
    static class Node
    {
        int data;
        Node left, right;
        Node(int data)
        {
            this.data = data;
        }
    }
    static boolean areIdentical(Node t1, Node t2)
    {
        if(t1 == null && t2 == null)
        {
            return true;
        }
        if(t1 == null || t2 == null)
        {
            return false;
        }
        return (t1.data == t2.data)
                && areIdentical(t1.left , t2.left)
                && areIdentical(t1.right , t2.right);
    }
    public static void main(String[] args)
    {
        Node t1 = new Node(1);
        t1.left = new Node(2);
        t1.right = new Node(3);
        Node t2 = new Node(1);
        t2.left = new Node(2);
        t2.right = new Node(3);
        System.out.println("Both are Identical : " + areIdentical(t1, t2));
    }
}