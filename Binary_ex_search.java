public class Binary_ex_search
{
    public static int binarySearch(int[] arr, int low, int high, int target)
    {
        if(low > high)
        {
            return - 1;
        }
        int mid = low + (high - low) / 2;
        if(arr[mid] == target)
        {
            return mid;
        }
        else if(arr[mid] > target)
        {
            return binarySearch(arr, low, mid - 1, target);
        }
        else
        {
            return binarySearch(arr, mid + 1, high, target);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {5,10,15,20,15};
        int target = 15;
        System.out.println(binarySearch(arr, 0, arr.length - 1, target));
    }
}