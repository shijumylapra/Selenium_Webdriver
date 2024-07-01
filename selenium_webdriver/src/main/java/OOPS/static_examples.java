package OOPS;

public class static_examples {

    public String name;
    public int rollNo;
    //static variables
    public static String Institute="University";


    public static_examples(String name, int rollNo)
    {
        this.name=name;
        this.rollNo=rollNo;
    }
    //static methods is to acess the static variables

    public static void Display()
    {
        System.out.println(Institute);
    }
}
