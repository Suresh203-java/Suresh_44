public class method_override
{
    static class duck
    {
        void fly()
        {
            System.out.println("Duck is Flying.");
        }
    }
    static class Duck extends duck
    {
        void fly()
        {
            System.out.println("Duck is Swimming.");
        }
    }
    public static void main(String[] args)
    {
        Duck D = new Duck();
        D.fly();
    }
}