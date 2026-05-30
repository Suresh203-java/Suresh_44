public class ex_11
{
    interface Vehicle
    {
        void start();
        void stop();
    }
    static class Car implements Vehicle
    {
        public void start()
        {
            System.out.println("Car is Started");
        }
        public void stop()
        {
            System.out.println("Car is Stopped");
        }
    }
    static class Bike implements Vehicle
    {
        public void start()
        {
            System.out.println("Bike is Started");
        }
        public void stop()
        {
            System.out.println("Bike is Stopped");
        }
    }
    public static void main(String[] args)
    {
        Vehicle c = new Car();
        Vehicle b = new Bike();
        c.start();
        c.stop();
        b.start();
        b.stop();
    }
}