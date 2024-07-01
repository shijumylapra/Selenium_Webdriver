package OOPS;

public class reverse_string {

    public String Reverse_String (String str)
    {
        String result="";
        for (int i = str.length()-1; i>=0; i--) {
            result= result + str.charAt(i);
        }
        return result;

    }
}
