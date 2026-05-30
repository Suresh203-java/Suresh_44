public class mul_exce
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 0;
        String s = "null";
        try
        {
            int result = a/b;
            System.out.println("Result : "+result);
            System.out.println(s.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: Cannot diivide by zero. " + e.getMessage());
        }
        catch(NullPointerException e)
        {
            System.out.println("Error : String is null. " + e.getMessage());
        }
        finally
        {
            System.out.println("This block will always aexecute.");
        }
    }
}