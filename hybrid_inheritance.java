public class hybrid_inheritance
{
    static class car
    {
        void car()
        {
            System.out.println("The car model, color & cost :");
        }
    }
    static class model extends car
    {
        void model()
        {
            System.out.println("Hyundi");
        }
    }
    static class color extends model
    {
        void color()
        {
            System.out.println("Black");
        }
    }
    static class cost extends car
    {
        void cost()
        {
            System.out.println("25 Lakhs");
        }
    }
    public static void main(String[] args)
    {
        color c = new color();
        c.car();
        c.model();
        c.color();
        cost c1 = new cost();
        c1.cost();
    }
}