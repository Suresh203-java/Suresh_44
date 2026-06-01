class oddoreven
{
    public static void main(String[] args)
    {
        int n = 10;
        System.out.println("Even Numbers : ");
        for(int i = 0; i <= n; i++)
        {
            if(i%2 == 0)
            {
                System.out.println(i);
            }
        }
        System.out.println("Odd Numbers : ");
        for(int i = 0; i <= n; i++)
        {
            if(i%2 != 0)
            {
                System.out.println(+i);
            }
        }
    }
}