public class multiple_interface
{
    interface TV
    {
        void turnOn();
    }
    interface AC
    {
        void turnOff();
    }
    interface FAN
    {
        void volumeUp();
    }
    static class hello implements TV,AC,FAN
    {
        public void turnOn()
        {
            System.out.println("Turn on TV.");
        }
        public void turnOff()
        {
            System.out.println("Turn off AC.");
        }
        public void volumeUp()
        {
            System.out.println("Volume Up the Fan.");
        }
        void Off()
        {
            System.out.println("Turn off TV.");
        }
    }
    public static void main(String[] args)
    {
        hello h = new hello();
        h.turnOn();
        h.turnOff();
        h.volumeUp();
        h.Off();
    }
}