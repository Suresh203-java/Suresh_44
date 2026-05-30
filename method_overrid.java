public class method_overrid
{
    static class calc
    {
        int add(int a,int b);
        {
            System.out.println("Value of a and b is :"+(a+b));
        }
    }
    static class calc2 extends calc
    {
        double add(double a,double b);
        {
            System.out.println("Value of a and b is :"+(a+b));
        }
    }
    public static void main(String[] args)
    {
        calc2 c = new calc2();
        c.add(10,20);
        c.add(1.7,28.3);
    }
}