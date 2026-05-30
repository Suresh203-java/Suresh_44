public class personal_details
{
    static class person
    {
        void displayDetails()
        {
            System.out.println("Personal Details :");
            System.out.println("Name : Devil");
            System.out.println("Roll number : 2");
            System.out.println("Age : 20");
            System.out.println("City : Rajam");
        }
    }
    public static void main(String[] args)
    {
        person k = new person();
        k.displayDetails();
    }
}