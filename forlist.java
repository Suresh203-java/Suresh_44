import java.util.ArrayList;
public class forlist
{
    public static void main(String[] args)
    {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Fox");
        animals.add("Tiger");
        System.out.println("Wild animals : " +animals);
        for(String animal : animals)
        {
            System.out.println("Wild animal in the Forest : "+animal);
        }
    }
}
