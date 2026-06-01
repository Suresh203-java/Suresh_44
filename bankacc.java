class bankacc
{
    public static void main(String[] args)
    {
        int amount = 400;
        int total_amount = 500;
        if(total_amount < amount)
        {
            System.out.println("Insufficient Balance.");
        }
        else if(total_amount > amount)
        {
            System.out.println("Transaction Successfully.");
        }
        else
        {
            System.out.println("No Transaction.");
        }
    }
}