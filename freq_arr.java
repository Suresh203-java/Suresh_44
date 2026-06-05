public class freq_arr
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 4, 2, 5, 3, 5, 3, 2};
        boolean[] visited = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            if(visited[i]) continue;
            int count = 1;
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " --> " + count);
        }
    }
}