public class overload_ex
{
    static class calc
    {
        int add(int a, int b)
        {
            return a+b;
        }
        double add(double a, double b)
        {
            return a-b;
        }
        String add(String a, String b)
        {
            return a+" "+b;
        }
        int multiply(int a, int b)
        {
            return a*b;
        }
        double divide(double a, double b)
        {
            return a/b;
        }
    }
    public static void main(String[] args)
    {
        calc c = new calc();
        System.out.println(c.add(10,20));
        System.out.println(c.add(5.4,2));
        System.out.println(c.add("Welcome","java"));
        System.out.println(c.multiply(8,7));
        System.out.println(c.divide(3.4,2.1));
    }
}