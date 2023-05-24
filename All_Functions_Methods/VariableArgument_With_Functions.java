package All_Functions_Methods;

import java.util.Arrays;

public class VariableArgument_With_Functions {
    public static void main(String[] args) {
        fun(12,23,56,78,90,23);
        MultipleDataType(99,100,"Mr.Shahjad","Mr.Shahbaz");
    }

    static void MultipleDataType(int a,int b,String ...strVal){
        System.out.println(Arrays.toString(strVal)+a+b);

    }
    static void fun(int ...arry){

        System.out.println(Arrays.toString(arry));


    }
}
