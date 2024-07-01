package OOPS;

public class access_modifier {
    protected String name;
    public int rollNum;
    private String Institute;
    protected int std;

    public void SetInstitute(String Institute)
    {
        this.Institute= Institute;
    }

    public String getInstitute()
    {
        return this.Institute;
    }
    //Setters and Getters
    //--------------------------------
    //Call a public method and using
    // that public method and assign the value of a private variable
    //access private variable using public methods
    //public variable can access using hte object name
    //private variable cannot access without setters and getters
}
