import java.util.Random;

public class Emp_DailyWage {
    public static void main(String[] args) {
        int wage_per_hr=20;
        int wage;
        int full_day=8;
        Random rand=new Random();
        int attend= rand.nextInt(2);
        if (attend==1){
            System.out.println("Employee is PRESENT");
            wage=wage_per_hr*full_day;
            System.out.println("Daily wage:"+wage);
        }
        else {
            System.out.println("Employee is ABSENT");
            System.out.println("ABSENT : NO Wage");
        }
    }
}
