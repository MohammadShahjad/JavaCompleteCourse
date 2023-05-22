package All_Functions_Methods;

import java.util.Scanner;

public class String_With_Functions {

    public static void main(String[] args) {

        while (true){
            String Ans = ReturnString();

            System.out.println("How Are You Mr. " + Ans + " Thanks For Using My Programing");
        }
    }

    static String ReturnString(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name = ");
        String Name = in.next();

        return Name;
    }
}
