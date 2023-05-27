package All_Functions_Methods;

import java.util.Arrays;

public class Linear_Search_Algorithm_With_Functions {

    public static void main(String[] args) {
         int [] arry ={12,34,56,78,89,90,47,65,31,33,22,77,45,98,49,71,61,40,48,30,57,38};
         int target =38;

        int ans1 = Linear_Search1(arry,target);
        System.out.println(ans1);
        int ans = Linear_Search(arry,target);
        System.out.println(ans);
    }


    // Search the target and return the element

    static int Linear_Search1(int []arry,int target){
        if(arry.length == 0){
            return -1;
        }

        // run for loop
        for (int element : arry){
            if (element == target){
                return element;
            }
        }
        // This Line will execute if none of the return statements above have executed
        // Hence The Target not found
        return -1;
    }

    // Search in the array : return the index if item found
    // Otherwise if item not found return -1
    static int Linear_Search(int [] arry, int target){

        if(arry.length == 0){
            return -1;
        }

        // run for loop
        for (int index = 0; index < arry.length; index++){

            int element = arry[index];
            if (element == target){
                return index;
            }
        }
        // This Line will execute if none of the return statements above have executed
        // Hence The Target not found
        return  -1;
    }

}
