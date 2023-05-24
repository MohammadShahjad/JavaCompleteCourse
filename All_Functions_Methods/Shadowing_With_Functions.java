package All_Functions_Methods;
import java.util.Stack;
public class Shadowing_With_Functions {
    static String name = "Mr. Shahjad"; // This Will Be Shadowed at line 8
    public static void main(String[] args) {
        System.out.println(name); // Mr. Shahjad (Line Number 4)
        String name; //The Class Variable At Line 4 is Shadowed By This
       // System.out .println(name); //Scope Will Begin When Value Is initialised
        name = "Shahjad";
        System.out.println(name);
        CallFun(); // Call Functions
    }

    static void CallFun(){
        System.out.println(name);
    }
}
