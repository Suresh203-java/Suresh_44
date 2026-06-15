import java.util.*;
public class BinaryTree
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
    static void inorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    static void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    static void LevelOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null)
            {
                q.add(temp.left);
            }
            if(temp.right != null)
            {
                q.add(temp.right);
            }
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Inorder : ");
        inorder(root);
        System.out.println("\nPreorder : ");
        preorder(root);
        System.out.println("\nPostorder : ");
        postorder(root);
        System.out.println("\nLevel Order : ");
        LevelOrder(root);
    }
}