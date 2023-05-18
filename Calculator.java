import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

            Scanner in= new Scanner(System.in);
            int ans = 0;
            
            while (true){

                System.out.print("Enter Your Operators : = ");
                char op = in.next().trim().charAt(0);

                if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

                    System.out.print("Enter Two Numbers : = ");

                    int num1 = in.nextInt();
                    int num2 = in.nextInt();

                    if(op == '+'){
                        ans = num1 + num2;
                    }
                    if (op == '-'){
                        ans = num1 - num2;
                    }
                    if (op == '*'){
                        ans = num1 * num2;
                    }
                    if (num2 != 0){
                        if(op == '/'){
                            ans = num1 / num2;
                        }
                    }
                    if (op == '%') {
                        ans = num1 % num2;

                    }
                    System.out.println("Your Answer is : = " + ans);
                } else if (op == 'b' || op == 'B') {
                    break;
                }else {
                    System.out.println("Opps Invalid Operators Try Again !!! Our AI Programs Helps Accourding To Use Operators Like (+,-,*,/,%) ");
                }

            }

    }
}