package All_Functions_Methods;

import java.util.Scanner;

public class Sum_With_Functions {

    // static int Sum() This is Start Execute Main Under All Program When Call Function Name Like I Call public static void main in My Function
    public static void main(String[] args) {

        while (true){

            Scanner in = new Scanner(System.in);
            System.out.print("Enter Your First Number = ");
            int num1 = in.nextInt();
            System.out.print("Enter Your Second Number = ");
            int num2 = in.nextInt();

            int ans = Sum(num1 , num2);
            System.out.println("Your Total Sum Value is = " + ans);

        }
    }

    // static int Sum() This Function Execute When Call Function Name Like I Call public static void main in My Function
    static int Sum(int a , int b){

     int TotalSum = a + b;
     return TotalSum; // This TotalSum Value is Return Value Store in Variable When Function End Then Where Call Function Then This Function Return Value

    }

}
