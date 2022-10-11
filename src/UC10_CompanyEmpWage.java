import java.util.Scanner;

public class UC10_CompanyEmpWage {

    public static void main(String[] args) {
        System.out.println("Multiple Companies Employee Wage Computation");
        Scanner sc = new Scanner(System.in);
        System.out.println("How many company wage details u want to add:");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            EmpWageBuilder.computeWage();
            EmpWageBuilder.printDetails();
        }
    }
}