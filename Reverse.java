import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

     /* This is Reverse Simple Functions*/
        
        Scanner in = new Scanner(System.in);

        int UserInput = in.nextInt();
        int ans =0;

        while (UserInput > 0){

            int rem = UserInput % 10;

            UserInput /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println("This is Reverse Number = " + ans);

    }
}
