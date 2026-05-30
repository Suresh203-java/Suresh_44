public class catch2
{
    public static void main(String[] args) 
    {
        try 
        {
            int[] arr = new int[3];
            arr[5] = 10; // This will cause an ArrayIndexOutOfBoundsException
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Math error occurred.");
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index out of bounds error.");
        }
    }
}