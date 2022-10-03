import java.util.Random;
import java.util.Scanner;

public class UC8_CompanyWage {
    static void empAttendance(){
        Random rand = new Random();
        int attendance= rand.nextInt(3);
        if (attendance==1){
            Emp.fullTime();
        }
        else if (attendance==2) {
            Emp.partTime();
        }
        else {
            System.out.println("ABSENT : NO wage");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Company name:  ");
        String company = sc.next();

        switch(company)
        {
            case "QWER" :
            case "ZXCVB" :
            case "ASDF" :
            case "POIU" :
            case "LOKM" :
                empAttendance();
                break;
            default : System.out.println("Invalid doesnt exist..!!!!!");
                break;
        }
    }
}
