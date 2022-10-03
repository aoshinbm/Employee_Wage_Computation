import java.util.Random;

public class EmpWageComputation {
    public static void main(String[] args) {
        System.out.println("Employee Wage Computation");
        Random rand = new Random();
        while (Emp.daily < Emp.month && Emp.workhr < Emp.total_work_hr) {
            int attend = rand.nextInt(3);
            switch (attend) {
                case 1:
                    Emp.fullTime();
                    break;
                case 2:
                    Emp.partTime();
                    break;
                default:
                    System.out.println("ABSENT : NO Wage");
                    break;
            }
        }
    }
}