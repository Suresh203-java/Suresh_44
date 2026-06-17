import java.util.*;
public class Mirror_tree
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
    static Node mirror(Node root)
    {
        if(root == null)
        {
            return null;
        }
        Node left = mirror(root.left);
        Node right = mirror(root.right);
        root.left = right;
        root.right = left;
        return root;
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
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        System.out.println("Original Tree (Inorder) : ");
        inorder(root);
        mirror(root);
        System.out.println("\nMirror Tree (Inorder) : ");
        inorder(root);
    }
}