import java.util.Random;

public class Emp_Wage {
    public static void main(String[] args) {
        int wage_per_hr=20;
        int wage;
        int full_day=12, part_time=8;
        Random rand=new Random();
        int attend= rand.nextInt(3);
        switch (attend){
            case 1:System.out.println("Employee is PRESENT");
                wage=wage_per_hr*full_day;
                System.out.println("Employee is working FULL-Time");
                System.out.println("Full-Time:"+wage);
                break;
            case 2:System.out.println("Employee is PRESENT");
                wage=wage_per_hr*part_time;
                System.out.println("Employee is working PART-Time");
                System.out.println("Part-Time wage:"+wage);
                break;
            case 3:System.out.println("Employee is ABSENT");
                System.out.println("ABSENT : NO Wage");
                break;
            default:
                System.out.println("Invalid input...!!!!-----");
        }
    }
}