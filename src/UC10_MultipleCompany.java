import java.util.Random;
import java.util.Scanner;

public class UC10_MultipleCompany {
    static String company;
    static int working_days;
    static int wage_per_hr;

    public UC10_MultipleCompany(String company, int working_days, int working_hours_per_month, int wage_per_hr) {
        this.company = company;
        this.working_days = working_days;
        this.wage_per_hr = wage_per_hr;
    }

    static void computeWage() {
        int wage,total = 0, daily = 1;
        int full_day = 8;
        int half_day = 4;
        int workhr = 1, working_hours_per_month=1;
        int total_work_hr = 100;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        while (daily < working_days) {
            int attend = rand.nextInt(3);
            switch (attend) {
                case 1:
                    System.out.println("Employee is working FULL-Time");
                    wage = wage_per_hr * full_day;
                    System.out.println("Full-Time wage for a day :" + wage);
                    total = wage * working_days;
                    working_hours_per_month++;
                    daily++;
                    break;
                case 2:
                    System.out.println("Employee is working PART-Time");
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
        UC10_MultipleCompany company=new UC10_MultipleCompany("Synopsis",25,6,50);
        computeWage();
    }
}
