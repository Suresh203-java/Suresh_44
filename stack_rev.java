import java.util.Stack;
public class stack_rev
{
    public static void main(String[] args)
    {
        String str = "STACK";
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray())
        {
            stack.push(c);
        }
        String reversed = "";
        while(!stack.isEmpty())
        {
            reversed = reversed + stack.pop();
        }
        System.out.println(reversed);
    }
}