import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        while (true){

            System.out.print("Enter Employee ID = "); //This Line Use For User Take Input Show Heading Before Enter Value
            int EmpID = in.nextInt(); //This Line Use For User Take Input Show
            String ComStrName = "Your Employee Name is = "; //This Line Use For Again And Again Not Write So I Can Create One Variable And Store Value
            String ComStrID = " And EmpID is = "; //This Line Use For Again And Again Not Write So I Can Create One Variable And Store Value
            String ComStrDpt = " Your Department Name is =  "; //This Line Use For Again And Again Not Write So I Can Create One Variable And Store Value
            String LocalEmpNameID ="";
            String LocalEmpDpt = "";
            String FinalPrint = "";

            switch (EmpID){

                case 1: if (EmpID == 1){
                    /*System.out.println(ComStrName + "Mr.Shahjad" + ComStrID + EmpID);*/
                    LocalEmpNameID = (ComStrName + "Mr.Shahjad" + ComStrID + EmpID);
                }
                case 2: if (EmpID == 2){
                    /*System.out.println(ComStrName + "Ronak" + ComStrID + EmpID);*/
                    LocalEmpNameID = (ComStrName + "Ronak" + ComStrID + EmpID);
                }
                case 3: if (EmpID == 3){
                    /*System.out.println(ComStrName + "Alijah" + ComStrID + EmpID);*/
                    LocalEmpNameID = (ComStrName + "Alijah" + ComStrID + EmpID);
                }
                case 4: if (EmpID == 4){
                    /*System.out.println(ComStrName + "Alaina" + ComStrID + EmpID);*/
                    LocalEmpNameID = (ComStrName + "Alaina" + ComStrID + EmpID);
                }
                case 5: if (EmpID ==1 || EmpID == 2 || EmpID == 3 || EmpID ==4){ //Case 5 Use For Check Valid EmpID If EmpID True Then Next Switch Programs Working

                    System.out.print("Enter Employee Department = "); //This Line Use For User Take Input Show Heading Before Enter Value
                    String Department = in.next(); //This Line Use For User Take Input Show

                    switch (Department){
                        case "IT" : if(Department.equals("IT")){
                            /*System.out.println("IT Department");*/
                            LocalEmpDpt = (ComStrDpt + Department);
                        }
                        case "Management" : if(Department.equals("Management")){
                            /*System.out.println("Management Department");*/
                            LocalEmpDpt = (ComStrDpt + Department);
                        }
                        case "Services" : if(Department.equals("Services")){
                            /*System.out.println("Services Department");*/
                            LocalEmpDpt = (ComStrDpt + Department);
                        }
                        case "Security" : if(Department.equals("Security")){
                            /*System.out.println("Security Department");*/
                            LocalEmpDpt = (ComStrDpt + Department);
                        }
                        if(Department.equals("IT") || Department.equals("Management") || !Department.equals("Services") || !Department.equals("Security") ) {
                            FinalPrint = (LocalEmpNameID + LocalEmpDpt);
                            System.out.println(FinalPrint);
                        }
                        default : {
                            if(!Department.equals("IT") && !Department.equals("Management") && !Department.equals("Services") && !Department.equals("Security") ) {
                                System.out.println("Opps Your Department Names Does Not Match Try Again !!!");
                            }
                        }
                    }
                }
                default : if (EmpID !=1 && EmpID != 2 && EmpID != 3 && EmpID !=4){
                    System.out.println("Opps Your Employee ID Does Not Match Try Again !!!");
                }
            }
        }

    }
}
