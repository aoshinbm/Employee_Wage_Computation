import java.util.Random;
import java.util.Scanner;
public class EmpWageBuilder {
    static String company;
    static int working_days;
    static int wage_per_hr;
    static int working_hours_per_month;

    public EmpWageBuilder() {
        this.company=company;
        this.wage_per_hr=wage_per_hr;
        this.working_days=working_days;
        this.working_hours_per_month=working_hours_per_month;
    }
static  int total=0;
    static void computeWage() {
        int wage,daily = 1;
        int full_day = 8;
        int half_day = 4;
        int total_workingdays=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Company name:  ");
        company=sc.next();
        System.out.println("Enter wage per hour:  ");
        wage_per_hr=sc.nextInt();
        System.out.println("Enter working days:  ");
        working_days=sc.nextInt();
        System.out.println("Enter working hours per month:  ");
        working_hours_per_month=sc.nextInt();
        Random rand = new Random();
        while (daily < working_days && total_workingdays < working_days) {
            int attend = rand.nextInt(3);
            switch (attend) {
                case 1:
                    wage = wage_per_hr * full_day;
//                    System.out.println("Full-Time wage for a day :" + wage);
                    total = wage * working_days;
                    daily++;
//                    working_hours_per_month++;
                    break;
                case 2:
                    wage = wage_per_hr * half_day;
//                    System.out.println("Part-Time wage for a day :" + wage);
                    total = wage * working_days;
                    daily++;
//                    working_hours_per_month++;
                    break;
                default:
                    System.out.println("ABSENT : NO WAGE");
                    break;
            }
        }
        System.out.println("Total working hours " + working_hours_per_month + " is " + total + " for a month");
    }

    static void printDetails(){
        System.out.println("Company Employee Wage Computation");
        System.out.println("Company name: "+company);
        System.out.println("Wage:"+total);
        System.out.println("No of working days: "+working_days);
        System.out.println("Working hours: "+working_hours_per_month);
    }
}