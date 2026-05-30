public class prob_1
{
    static class calc
    {
        void add(int a , int b)
        {
            System.out.println("sum of Two numbers : "+(a+b));
        }
        void add(double a, double b, double c)
        {
            System.out.println("Sum of Three numbers : "+(a+b+c));
        }
    }
    public static void main(String[] args)
    {
        calc ca = new calc();
        ca.add(10,20);
        ca.add(10,20,30);
    }
}