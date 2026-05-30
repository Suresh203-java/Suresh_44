public class str3
{
    public static void main(String[] args)
    {
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" Java!");
        System.out.println(sbf);

        StringBuffer sbf1 = new StringBuffer("Hello");
        sbf1.insert(5,",Java!");
        System.out.println(sbf1);

        StringBuffer sbf2 = new StringBuffer("GMRIT");
        sbf2.delete(3,5);
        System.out.println(sbf2);

        StringBuffer sbf3 = new StringBuffer("Java");
        sbf3.reverse();
        System.out.println(sbf3);

        StringBuffer sbf4 = new StringBuffer("Hello");
        sbf4.replace(1,5,"i");
        System.out.println(sbf4);
    }
}