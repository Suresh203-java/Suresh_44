import java.util.Stack;
public class next_great_num
{
    public static void main(String[] args)
    {
        int[] nums = {2,1,2,4,3};
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];
        for(int i = nums.length - 1; i >= 0; i--)
        {
            while(!stack.isEmpty() && stack.peek() <= nums[i])
            {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        for(int x : res)
        {
            System.out.println(x + " ");
        }
    }
}
