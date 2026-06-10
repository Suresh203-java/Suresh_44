public class Binary_search
{
    public static int binarySearch(int[] arr, int target)
    {
        int low = 0, high = arr.length - 1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return - 1;
    }
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50};
        int target = 40;
        System.out.println(binarySearch(arr, target));
    }
}