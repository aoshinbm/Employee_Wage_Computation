import java.util.Random;

public class Emp_PartTime {
    public static void main(String[] args) {
        int wage_per_hr=20;
        int wage;
        int full_day=12, part_time=8;
        Random rand=new Random();
        int attend= rand.nextInt(3);
        if (attend==1){
            System.out.println("Employee is PRESENT");
            wage=wage_per_hr*full_day;
            System.out.println("Employee is working FULL-Time");
            System.out.println("Full-Time:"+wage);
        }
        else if (attend==2) {
            System.out.println("Employee is PRESENT");
            wage=wage_per_hr*part_time;
            System.out.println("Employee is working PART-Time");
            System.out.println("Part-Time wage:"+wage);
        }
        else {
            System.out.println("Employee is ABSENT");
            System.out.println("ABSENT : NO Wage");
        }
    }
}