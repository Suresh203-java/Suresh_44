public class RecCountDig
{
    static int countDigits(int n)
    {
        if(n == 0)
            return 0;
            return 1 + countDigits(n / 10);
    }
    public static void main(String[] args)
    {
        int number = 123456;
        System.out.println(countDigits(number));
    }
}