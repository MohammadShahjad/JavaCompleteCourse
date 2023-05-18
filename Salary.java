public class Salary {
    public static void main(String[] args) {
       /*
       Syntax Of If Statement
       if (Boolean Expression True of False{
          //Body
       }
        else{
          //Body
        }
       */

        /*This Is Initial Value*/
       int Salary = 9000;
       int TotalDays = 30;
       int ADays = 1;
       int Total_P_Days = 0;
       int ParDaySalaryAmt = 0;
       int TotalSalaryAmt = 0;

        if(Salary != 0){
            ParDaySalaryAmt = Salary / TotalDays;
            System.out.println("ParDaySalaryAmt is = "+ParDaySalaryAmt);
            Total_P_Days = TotalDays - ADays;
            System.out.println("Total_P_Days is = "+Total_P_Days);
            System.out.println("Total_A_Days is = "+(TotalDays-Total_P_Days));
            TotalSalaryAmt = Total_P_Days * ParDaySalaryAmt;
            System.out.println("Your Total Salary Amount is = "+TotalSalaryAmt);
        }
         else{
            System.out.println("Opps Salary Amount is = "+ Salary +" Please Fill Salary Amount Greater Than Zero Then Try Again !!!");
         };

        
    }
}