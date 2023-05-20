import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        /*Try To SwithCase Use Some Example */

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Your Days of Numbers : = ");

            int Days = in.nextInt();

            switch (Days) {

                case 1 : if(Days == 1){
                    System.out.println("Monday");
                }

                case 2 : if (Days == 2){
                    System.out.println("Tuesday");
                }

                case 3 : if (Days == 3){
                    System.out.println("Wednesday");
                }

                case 4 : if (Days == 4){
                    System.out.println("Thursday");
                }

                case 5 : if (Days == 5){
                    System.out.println("Friday");
                }

                case 6 : if (Days == 6){
                    System.out.println("Saturday");
                }

                case 7 : if (Days == 7){
                    System.out.println("Sunday");
                }
                default : if (Days != 1 && Days != 2 && Days != 3 && Days != 4 && Days != 5 && Days != 6 && Days != 7){
                    System.out.println("Opps This is Invalid Number Just Like 1 To 7 Numbers !!!!");
                }


            }
        }
    }

}
