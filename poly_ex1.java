public class poly_ex1
{
    interface Remote
    {
        void device();
    }
    static class Tv implements Remote
    {
        public void device()
        {
            System.out.println("Turn on TV");
        }
    }
    static class Ac implements Remote
    {
        public void device()
        {
            System.out.println("Turn on Ac");
        }
    }
    static class Fan implements Remote
    {
        public void device()
        {
            System.out.println("Turn on Fan");
        }
    }
    public static void main(String[] args)
    {
        Remote tv = new Tv();
        Remote ac = new Ac();
        Remote fan = new Fan();
        tv.device();
        ac.device();
        fan.device();
    }
}