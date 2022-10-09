import java.util.Random;
import java.util.Scanner;

public class UC8_CompanyWage {
    static int wage_per_hr , workhr = 1;
    static int wage = 0, total = 0;
    static int total_work_hr = 100;
    static int full_day = 12, part_time = 8;
    static int month , daily = 1;

    static void companyFullTime() {
        System.out.println("Employee is working FULL-Time");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter wage per hour :");
        wage_per_hr = sc.nextInt();
        wage = wage_per_hr * full_day;
        daily++;
        System.out.println("Full-Time wage for a day :" + wage);
        System.out.println("Enter how many days employee worked in a month :");
        month = sc.nextInt();
        total = wage * month;
        workhr++;
        System.out.println("Total working hours " + workhr + " is " + total + " for a month");
    }
    static void companyPartTime(){
        System.out.println("Employee is working PART-Time");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter wage per hour :");
        wage_per_hr = sc.nextInt();
        wage = wage_per_hr * part_time;
        workhr++;
        System.out.println("Part-Time wage for a day:" + wage);
        System.out.println("Enter how many days employee worked in a month :");
        month = sc.nextInt();
        total=wage*month;
        daily++;
        System.out.println("Total working hours "+workhr+" is "+total+" for a month");
    }
    static void empAttendance(){
        Random rand = new Random();
        int attendance= rand.nextInt(3);
        if (attendance==1){
            companyFullTime();
        }
        else if (attendance==2) {
            companyPartTime();
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
            case "qwer" :
            case "asdf" :
            case "zxcv" :
            case "poiu" :
            case "mnb" :
                empAttendance();
                break;
            default : System.out.println("Invalid doesnt exist..!!!!!");
                break;
        }
    }
}
