package OOPS;

public class palindrome_operation {
    public static boolean isPalindrome(String x)
    {
           String reverse = "";
           for (int i = x.length() - 1; i >= 0; i--) {
            //Adding each character to the reversed
            reverse = reverse + x.charAt(i);
            System.out.println(i+" "+reverse+" "+x);
        }
        return x.equals(reverse);
    }
}

