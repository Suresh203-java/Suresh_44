public class multiple_inheritance
{
    interface Father
    {
        void father();
    }
    interface Mother
    {
        void mother();
    }
    static class child implements Father,Mother
    {
        public void father()
        {
            System.out.println("Father of the Child");
        }
        public void mother()
        {
            System.out.println("Mother of the Child");
        }
        void child()
        {
            System.out.println("Son of their Parents");
        }
    }
    public static void main(String[] args)
    {
        child c = new child();
        c.father();
        c.mother();
        c.child();
    }
}