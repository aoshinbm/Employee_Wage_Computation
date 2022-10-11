import java.util.Random;
import java.util.Scanner;

public class UC9_EmpWageBuild {
    static String company;
    static int wage;
    static int working_days;
    static int working_hours_per_month ;
    static int wage_per_hr;

    public UC9_EmpWageBuild() {
        this.company=company;
        this.wage=wage;
        this.working_days=working_days;
        this.working_hours_per_month=working_hours_per_month ;
        this.wage_per_hr=wage_per_hr;
    }

    static void computeWage() {
        int total = 0, daily = 1;
        int full_day = 8;
        int half_day = 4;
        int workhr = 1;
        int total_work_hr = 100;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        while (daily <= working_days) {
            int attend = rand.nextInt(3);
            switch (attend) {
                case 1:
                    wage = wage_per_hr * full_day;
                    System.out.println("Full-Time wage for a day :" + wage);
                    total = wage * working_days;
                    working_hours_per_month++;
                    daily++;
                    break;
                case 2:
                    wage = wage_per_hr * half_day;
                    System.out.println("Part-Time wage for a day :" + wage);
                    total = wage * working_days;
                    working_hours_per_month++;
                    daily++;
                    break;
                default:
                    System.out.println("ABSENT : NO WAGE");
                    break;
            }
        }
        System.out.println("Total working hours " + working_hours_per_month + " is " + total + " for a month");
    }

    public static void main(String[] args) {
        System.out.println("Employee Wage Computation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Company name:  ");
        String company = sc.next();
        System.out.println("Enter wage per hour :");
        wage_per_hr = sc.nextInt();
        System.out.println("Enter how many days employee worked in a month :");
        working_days = sc.nextInt();

        computeWage();
    }
}
