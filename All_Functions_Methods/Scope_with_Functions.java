package All_Functions_Methods;

public class Scope_with_Functions {

    public static void main(String[] args) {

        int a = 100; // If You initialised Starting Of Main Functions They Can Access Under This Main Functions Of Many Other Functions in Block Of Code
        int b =200;
        String Name = "Shahjad";
        {
            int c = 300;
            System.out.println(a);
            Name = "Mr. Shahjad";
            System.out.println(Name);//Values initialised in this block , will remain in block You Cannot Access Other Block Of Code
        }

        //  System.out.println(c); // Cannot use Outside the block
        //Which Block Of Code Functions Variable Cannot Access Other Code Of Block it's Called Scope Simple Language

    }
    //  System.out.println(a); // Cannot use Outside the block
    //Which Block Of Code Functions Variable Cannot Access Other Code Of Block it's Called Scope Simple Language
}