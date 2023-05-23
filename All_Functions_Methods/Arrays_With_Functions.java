package All_Functions_Methods;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_With_Functions {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] temp = arr;
        System.out.println("Your Defaults Arrays Value is = " +Arrays.toString(arr));

        ArrayData(arr);
        System.out.println("Your New Changed Arrays Values = "+Arrays.toString(arr));
    }

    static void ArrayData(int [] num){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your First Number of Number Array = ");
        int Index0 = in.nextInt();
        System.out.print("Enter Your Second Number of Number Array = ");
        int Index1 = in.nextInt();
        System.out.print("Enter Your Third Number of Number Array = ");
        int Index2 = in.nextInt();
        System.out.print("Enter Your Fourth Number of Number Array = ");
        int Index3 = in.nextInt();
        num [0] = Index0;
        num [1] = Index1;
        num [2] = Index2;
        num [3] = Index3;
    }
}
