public class multilevel_inheritance
{
    static class Grandparent
    {
        void Grandparent()
        {
            System.out.println("I am the Grand Parent of Child");
        }
    }
    static class Parent extends Grandparent
    {
        void Parent()
        {
            System.out.println("I am the parent of Child");
        }
    }
    static class Child extends Parent
    {
        void Child()
        {
            System.out.println("I am Child");
        }
    }
    public static void main(String[] args)
    {
        Child myChild = new Child();
        myChild.Grandparent();
        myChild.Parent();
        myChild.Child();
    }
}