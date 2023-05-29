package All_Functions_Methods;

public class MinimumNumber_LinearSearch_With_Functions {

    public static void main(String[] args) {
        int [] arry = {99,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,-25,26,27,28,29,30,31,32,33,34,35};
        System.out.println(MinimumNumber(arry));
    }

    static int MinimumNumber(int [] array){
        int ans = array[0];// Store Array Of First Value

        for (int i = 0; i < array.length; i++) {
            if (array[i] < ans){ //Match Array of First Value And Next Array Value if Match Then Update Ans Variable Value Then Again And Again Same Process Going on
                ans = array[i];
            }
        }
        return ans; // Then Return Smallest Value
    }

}
