package All_Functions_Methods;

public class OverLoading_with_Functions {

    public static void main(String[] args) {
       ShahjadFun(67);
       ShahjadFun("Shahjad");

       int ans= sum(12,12);//If Pass Two Parameters Then Call 14 Lines Function and If Pass Three Parameters Then Call 18 Lines Function
       System.out.println(ans);

    }

    static int sum(int a,int b){ // Auto Switch Function Data Type According and  Parameters According To Switch Functions
        return a+b;
    }

    static int sum(int a,int b,int c){// Auto Switch Function Data Type According and  Parameters According To Switch Functions
        return a+b+c;
    }

    static void ShahjadFun(int a){// Auto Switch Function Data Type According and  Parameters According To Switch Functions
        System.out.println("Mango");
        System.out.println(a);
    }

    static void ShahjadFun(String Name){// Auto Switch Function Data Type According and  Parameters According To Switch Functions
        System.out.println("Banana");
        System.out.println(Name);
    }

}
