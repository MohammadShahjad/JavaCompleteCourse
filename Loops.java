import java.net.SocketOption;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
       Syntax of For Loops:
       For (Initialisation;Condition;Increment/Decrement){
          //Body
       }
       */

        for (int Num = 1; Num <= 10; Num += 1) {
            System.out.println(Num);
        }

        int n = 1;
        while (n <= 15) {
            System.out.println(n);
            n += 1;
        }

         /*
       // print number From 1 To n */

        Scanner UserInput = new Scanner(System.in);
        int UserVal = UserInput.nextInt();

        for (int i = 1; i <= UserVal; i++) {
            System.out.println(i);
        }

        /*
       Syntax of For Do While:
       Do {

       }
       while(Conditions){

       }
       */
        int x=8;
        do {
            System.out.println(x +"Do While");
            x++;
        }while (x <= 12);

    }
}