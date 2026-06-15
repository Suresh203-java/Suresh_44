import java.util.*;
public class BinaryTree_height
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
    static int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }
    static int countNodes(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.left.right = new Node(7);
        System.out.println("Height of Tree : " + height(root));
        System.out.println("Nodes of Tree : " + countNodes(root));

    }
}