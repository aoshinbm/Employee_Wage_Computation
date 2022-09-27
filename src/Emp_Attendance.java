import java.util.Random;

public class Emp_Attendance {
    public static void main(String[] args) {
        Random rand=new Random();
        int attend= rand.nextInt(2);
        if (attend==1){
            System.out.println("Employee is PRESENT");
        }
        else {
            System.out.println("Employee is ABSENT");
        }
    }
}
