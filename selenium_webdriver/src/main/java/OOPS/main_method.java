package OOPS;

public class main_method {

    public static void main(String[] args) {
        {
            employee_details Emp1=new employee_details();
            reverse_numbers rn = new reverse_numbers();
            swap_numbers sn = new swap_numbers();
            reverse_string rs = new reverse_string();
//
            Emp1.Name = "Alex";
            Emp1.EmployeeID = 1001;
            Emp1._salary = 15000;
            Emp1.Display();
            Emp1=new employee_details();
            Emp1.Name = "Baby";
            Emp1.EmployeeID = 5002;
            Emp1._salary = 25000;
            Emp1.Display();

            //Reverse String
            System.out.println(rs.Reverse_String("HELLO WORLD"));

            //Reverse Number
            System.out.println(rn.rs_numbers(2024));

            //Number swapping
            System.out.println(sn.a);
            System.out.println(sn.b);
            System.out.println();
            int x=sn.b;sn.b=sn.a;sn.a=x;
            System.out.println(sn.a);
            System.out.println(sn.b);

            sn.a = sn.a+sn.b;
            sn.b = sn.a-sn.b;
            sn.a = sn.a-sn.b;
            System.out.println();
            System.out.println(sn.a);
            System.out.println(sn.b);

            //Palindromes operation
            String palindrome_word="civic";
            if (palindrome_operation.isPalindrome(palindrome_word))
            {System.out.println(palindrome_word +" "+"is a palindrome word "); }
            else {System.out.println(palindrome_word + " " + "is not a palindrome word ");}
            }

            java_constructors jc = new java_constructors("Mike",25);
            java_constructors jc1 = new java_constructors("Mike",25,10);
            System.out.println(jc.std_name+" "+jc.rollno+" "+jc1.std);
            static_examples stx = new static_examples("Jerry",1002);
            static_examples stx1 = new static_examples("Geethu",4526);
            System.out.println(stx.name+" "+stx.rollNo+" "+static_examples.Institute);
            static_examples.Institute = "Madras University";
            System.out.println(stx1.name+" "+stx1.rollNo+" "+static_examples.Institute);

            access_modifier acc = new access_modifier();
            acc.SetInstitute("MG Unviversity");
            System.out.println(acc.getInstitute());
            child_class ch1 = new child_class();
            ch1.Phone = "780-623-44125";
            ch1.name = "Sharma";
            ch1.rollNum = 23645;
            ch1.std = 55;

    }
}
