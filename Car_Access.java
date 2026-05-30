public class pub_pri_pro
{
    public String brand = "Toyota";
    private String model = "Corolla";
    protected int year = 2020;
    public void displayDetails()
    {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
    }
}
    public static void main(String[] args)
    {
        pub_pri_pro car = new pub_pri_pro();
        car.displayDetails();
        System.out.println("Accessing public member:"+ car.brand);
        System.out.println("Accessing private member:"+ car.model);
        System.out.println("Accessing protected member:"+ car.year);
    }
}