import java.util.Scanner;

public class CountNumbs {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int InputNum = in.nextInt(); //This Line Used For User Input Store
        int checkValue = in.nextInt(); //This Line Used For User Input Store Which Value Compare
        int count = 0;

        while (InputNum > 0){
            int rem = InputNum % 10;
            if(rem == checkValue){ //This checkValue Variable is Check Your Inputs Number How often Repeat in Your inputs Value
                count++;
            }
            InputNum = InputNum / 10;
        }

        System.out.println(count);
    }
}