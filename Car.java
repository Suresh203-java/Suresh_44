class Car
{
    public String brand;
    private String model;
    protected int year;
    public void setModel(String model)
    {
        this.model = model;
    }
    public String getModel()
    {
        return model;
    }
    public void displayCar()
    {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
    }
}
class SportsCar extends Car
{
    public void showYear()
    {
        System.out.println("Manufacturing Year : " + year);
    }
}
public class Car_Access
{
    public static void main(String[] args)
    {
        Car c = new Car();
        c.brand = "Toyota";
        c.setModel("Supra");
        c.year = 2024;
        c.displayCar();
        SportsCar s = new SportsCar();
        s.year = 2023;
        s.showYear();
    }
}