public class classobject
{
    static class Car
    {
        void displayDetails()
        {
            System.out.println(" Car Details :");
            System.out.println(" Colour : Black ");
            System.out.println(" Model : Audi ");
            System.out.println(" year : 2027 ");
        }
    }
    public static void main(String[] args)
    {
        Car myCar = new Car();
        myCar.displayDetails();
    }
}