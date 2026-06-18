import java.util.*;
public class Adjacency_matrix
{
    public static void main(String[] args)
    {
        int V = 4;
        int[][] matrix = new int[V][V];
        matrix[0][1] = 1;
        matrix[1][0] = 1;
        matrix[0][2] = 1;
        matrix[2][0] = 1;
        matrix[1][3] = 1;
        matrix[3][1] = 1;
        System.out.println("Adjancy Matrix : ");
        for(int i = 0; i < V; i++)
        {
            for(int j = 0; j < V; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}