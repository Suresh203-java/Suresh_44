public class str7
{
    public static void main(String[] args)
    {
        String str = "Hello World!";
        String str1 = "    java    ";
        String str2 = "python";
        System.out.println(str.length());
        System.out.println(str.charAt(4));
        System.out.println(str.substring(6,12));
        System.out.println(str1.equals(str2));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf('e'));
        System.out.println(str.replace("World","Java"));
        System.out.println(str1.trim());
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("World!"));
        String str9 = "Java, Python, C++";
        String[] languages = str9.split(",");
        for(String language : languages)
        {
            System.out.println(language);
        }
    }
}