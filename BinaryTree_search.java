import java.util.*;
public class BinaryTree_search
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
    static boolean search(Node root, int key)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == key)
        {
            return true;
        }
        return search(root.left, key) || search(root.right, key);
    }
    public static void main(String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.right.left.right = new Node(90);
        int key = 90;
        System.out.println("Element Found : " + search(root, key));
    }
}