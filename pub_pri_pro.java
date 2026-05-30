public class pub_pri_pro
{
    public String brand = "RCB";
    private String color = "Red";
    protected int year = 2008;
    public void displayDetails()
    {
        System.out.println("Brand :"+brand);
        System.out.println("Color :"+color);
        System.out.println("Year of Establishment :"+year);
    }
    public static void main(String[] args)
    {
        pub_pri_pro ipl = new pub_pri_pro();
        ipl.displayDetails();
        System.out.println("public Access team :"+ ipl.brand);
        System.out.println("private Access team :"+ ipl.color);
        System.out.println("protected Access team :"+ ipl.year);
    }
}