public class ex_12
{
    interface Bank
    {
        abstract void deposit();
        abstract void withdraw();
    }
    interface ATM
    {
        abstract void balanceCheck();
        abstract void moneyTransfer();
    }
    static class customer implements Bank,ATM
    {
        public void deposit()
        {
            System.out.println("Amount Deposited Successfully.");
        }
        public void withdraw()
        {
            System.out.println("Amount Withdrawn Successfully.");
        }
        public void balanceCheck()
        {
            System.out.println("Balance Checked Successfully.");
        }
        public void moneyTransfer()
        {
            System.out.println("Money Transfer Completed.");
        }
    }
    public static void main(String[] args)
    {
        customer c = new customer();
        c.deposit();
        c.withdraw();
        c.balanceCheck();
        c.moneyTransfer();
    }
}