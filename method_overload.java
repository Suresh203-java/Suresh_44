public class method_overload
{
    void add(int a)
    {
        System.out.println("Value of a :" + a);
    }
    void add(int a, int b)
    {
        System.out.println("Value of a&b :" + (a+b));
    }
    void add(int a, int b, int c)
    {
        System.out.println("Value of a&b&c :" + (a+b+c));
    }
    public static void main(String[] args)
    {
        method_overload m = new method_overload();
        m.add(10);
        m.add(10,20);
        m.add(10,20,40);
    }
}