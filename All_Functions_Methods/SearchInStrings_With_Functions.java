package All_Functions_Methods;

import java.util.Arrays;

public class SearchInStrings_With_Functions {
    public static void main(String[] args) {
        String name = "Shahjad";
        char target ='d';

        System.out.println(StSearch1(name,target));// if Target Value Match Then Return True Otherwise Return False
        System.out.println(Arrays.toString(name.toCharArray()));//Convert String To Character wise Arrays

        System.out.println(StSearch(name,target));// if Target Value Match Then Return True Otherwise Return False
        System.out.println(Arrays.toString(name.toCharArray()));//Convert String To Character wise Arrays

    }

    static boolean StSearch1(String name , char target){
        if(name.length() == 0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)){// All String Word Create Arrays List Then Find Particular One Word To Compare Any Target Words
                return true;
            }
        }
        return false;
    }

    static boolean StSearch(String name,char target){
        if (name.length() == 0){
            return false;
        }
        for (char ch : name.toCharArray()){ // All String Word Create Arrays List Then Find Particular One Word To Compare Any Target Words
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
