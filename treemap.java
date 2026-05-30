import java.util.TreeMap;
public class treemap
{
    public static void main(String[] args)
    {
        TreeMap<String,String> country = new TreeMap<>();
        country.put("India "," Freedom");
        country.put("China "," Wepons");
        country.put("Russia "," Missiles");
        System.out.println(country);
        System.out.println("Access a Country :" + country.get("India "));
        country.remove("China ");
        System.out.println(country);
    }
}