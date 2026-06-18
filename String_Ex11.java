public class String_Ex11
{
    public static void main(String[] args)
    {
        String str = "Java";
        String reversed = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reversed = reversed + str.charAt(i);
        }
        System.out.println("Original List : " + str);
        System.out.println("After Reversed The List is : " + reversed);
    }
}