import java.util.Random;

public class Emp_WorkHours {
    public static void main(String[] args) {
        int wage_per_hr = 20, workhr = 1;
        int wage = 0, total = 0;
        int total_work_hr = 100;
        int full_day = 12, part_time = 8;
        int month = 20, daily = 1;
        Random rand = new Random();
        while (daily < month && workhr < total_work_hr) {
            int attend = rand.nextInt(3);
            switch (attend) {
                case 1:
//                    System.out.println("Employee is PRESENT");
//                    System.out.println("Employee is working FULL-Time");
                    wage = wage_per_hr * full_day;
                    daily++;
                    workhr++;
                    System.out.println("Full-Time:" + wage);
                    break;
                case 2:
//                    System.out.println("Employee is PRESENT");
//                    System.out.println("Employee is working PART-Time");
                    wage = wage_per_hr * part_time;
                    daily++;
                    workhr++;
                    System.out.println("Part-Time :" + wage);
                    break;
                default:
                    System.out.println("ABSENT : NO Wage");
                    break;
            }
            total=wage*month;
        }
        System.out.println("Total working hours "+workhr+" is "+total+" for a month");
    }
}
