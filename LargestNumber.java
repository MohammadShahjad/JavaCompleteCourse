import java.awt.print.Printable;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

     /*Q1: Find The Largest Of The 3 Numbers*/

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = a;

        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }

        System.out.println("Your Max Number is = " + max +" Q. Number 1");

        /*Q2: Find The Largest Of The 3 Numbers Different Type Calculate*/

        Scanner ini = new Scanner(System.in);
        int aa = ini.nextInt();
        int bb = ini.nextInt();
        int cc = ini.nextInt();
        int maxm = aa;

        if(bb > max) {
            maxm = bb;
        }
        if (cc > max){
            maxm =cc;
        }

        System.out.println("Your Max Number is = "+maxm +" Q. Number 2");

        /*Q3: Find The Largest Of The 3 Numbers Used Inbuilt Function of Java Type Calculate*/

        Scanner Newin = new Scanner(System.in);
        int aaa= Newin.nextInt();
        int bbb= Newin.nextInt();
        int ccc = Newin.nextInt();

        int NewMax = Math.max(ccc,Math.max(aaa,bbb));
        System.out.println("This Java Function Use By Return Max Number is = " +NewMax +" Q. Number 1");
    }
}