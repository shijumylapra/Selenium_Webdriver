package OOPS;

public class reverse_numbers {

    public int rs_numbers (int rn)
    {
       int  reverse = 0;

        while(rn != 0)
        {
            int remainder = rn % 10;
            reverse = reverse * 10 + remainder;
            rn = rn/10;
        }
        return reverse;
    }
}
