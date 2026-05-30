public class pro_3
{
    interface Shape
    {
        void draw();
    }
    static class Circle implements Shape
    {
        public void draw()
        {
            System.out.println("Shape of the Circle.");
        }
    }
    static class Rectangle implements Shape
    {
        public void draw()
        {
            System.out.println("Shape of the Rectangle.");
        }
    }
    public static void main(String[] args)
    {
        Shape c = new Circle();
        Shape r = new Rectangle();
        c.draw();
        r.draw();
    }
}