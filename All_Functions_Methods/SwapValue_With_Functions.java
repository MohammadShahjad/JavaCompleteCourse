package All_Functions_Methods;

import java.util.Scanner;

public class SwapValue_With_Functions {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name = ");
        String Name = in.next();

         SwapName(Name); // Call Functions


        /*System.out.print("Enter Your First Number For Swap Value = ");
        int num1 = in.nextInt();
        System.out.print("Enter Your Second Number Swap Value = ");
        int num2 = in.nextInt();
         int aa;
         int bb;

        aa = SwapValue(num1,num2);
        bb = SwapValue(num1,num2);
        System.out.print(aa +" And " + bb);*/

    }

    static void SwapName(String Name){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Changes Name = ");
        String ChangeName= in.next();
        String OldName = Name;
        String NewName = ChangeName;
        System.out.print("Your Old Name is = " + OldName + " New Name is = "+ NewName);
    }
    static int SwapValue( int a , int b){

        int temp = a;
        a=b;
        b=temp;
        return a & b;

    }

}
