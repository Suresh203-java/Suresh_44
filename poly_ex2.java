public class poly_ex2
{
    interface Vehicle
    {
        void move();
    }
    static class Car implements Vehicle
    {
        public void move()
        {
            System.out.println("Car runs in HighWay");
        }
    }
    static class Bike implements Vehicle
    {
        public void move()
        {
            System.out.println("Bike runs in Bridge");
        }
    }
    static class Plane implements Vehicle
    {
        public void move()
        {
            System.out.println("Plane runs in Runway");
        }
    }
    public static void main(String[] args)
    {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle plane = new Plane();
        car.move();
        bike.move();
        plane.move();
    }
}