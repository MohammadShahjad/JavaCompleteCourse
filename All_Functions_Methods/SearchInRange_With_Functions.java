package All_Functions_Methods;

public class SearchInRange_With_Functions {
    public static void main(String[] args) {

       int [] arry = {1,99,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35};
       int target =34;
       System.out.println(LinearSearching(arry,target,0,34));//pass value Find Which arrays of index number
    }

    static int LinearSearching(int [] arry,int target,int start,int end){

        if(arry.length == 0){//Error Handle if Arrays is Blank
            return -1; // -1 means Program Over
        }

        for(int index = start; index <= end; index ++){

            int element = arry[index];

            if (element == target){
                return index;//Value of Array if value match
            }
        }
        return -1;// -1 means Program Over
    }



}
