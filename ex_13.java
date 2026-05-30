public class ex_13
{
    interface Shape
    {
        void circle();
    }
    interface Color
    {
        void blue();
    }
    static class Circle implements Shape,Color
    {
        public void circle()
        {
            double radius = 5;
            double area = 3.14 * radius * radius;
            System.out.println("Area of the Circle : "+ area);
        }
        public void blue()
        {
            System.out.println("The color of Circle is Blue.");
        }
    }
    public static void main(String[] args)
    {
        Circle c = new Circle();
        c.circle();
        c.blue();
    }
}