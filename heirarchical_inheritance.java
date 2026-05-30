public class heirarchical_inheritance
{
    static class colour
    {
        void colour()
        {
            System.out.println("The colours are :");
        }
    }
    static class c1 extends colour
    {
        void colour1()
        {
            System.out.println("This colour 1 is Blue.");
        }
    }
    static class c2 extends colour
    {
        void colour2()
        {
            System.out.println("This colour 1 is Red.");
        }
    }
    static class c3 extends colour
    {
        void colour3()
        {
            System.out.println("This colour 1 is Green.");
        }
    }
    static class c4 extends colour
    {
        void colour4()
        {
            System.out.println("This colour 1 is Black.");
        }
    }
    public static void main(String[] args)
    {
        c1 myc1 = new c1();
        c2 myc2 = new c2();
        c3 myc3 = new c3();
        c4 myc4 = new c4();
        myc1.colour();
        myc1.colour1();
        myc2.colour2();
        myc3.colour3();
        myc4.colour4();
    }
}