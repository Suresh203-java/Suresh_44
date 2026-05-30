public class ex_14
{
    interface GPS
    {
        void location();
    }
    interface Music_Player
    {
        void song();
    }
    static class Car implements GPS,Music_Player
    {
        public void location()
        {
            System.out.println("Location of the GPS.");
        }
        public void song()
        {
            System.out.println("Play a Song in Music Player.");
        }
    }
    public static void main(String[] args)
    {
        Car car = new Car();
        car.location();
        car.song();
    }
}