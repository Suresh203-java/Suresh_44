public class M_Exce
{
    public static void main(String[] args) 
    {
        try 
        {
            int result = 10 / 0;
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Cannot divide by zero.");
        }
        finally
        {
            System.out.println("This code will be Excecuted.");
        }
    }
}