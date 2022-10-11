import java.util.Random;

public class UC9_EmpWageBuider {
    int full_time = 1;
    int part_time = 2;
    String company;
    static int wage_per_hr;
    int workingdays;
    int hrpermonth;

    public UC9_EmpWageBuider(String company, int wage_per_hr, int workingdays, int hrpermonth) {
        this.company = company;
        this.wage_per_hr = wage_per_hr;
        this.workingdays = workingdays;
        this.hrpermonth = hrpermonth;
    }

    int computeWage() {
        int emphrs = 0, totalEmphrs = 0, totalworkingdays = 0;
        while (totalEmphrs <= hrpermonth && totalworkingdays <= workingdays) {
            totalworkingdays++;
            Random rand=new Random();
            int attend = rand.nextInt(3);
            switch (attend) {
                case 1:
                    emphrs = 8;
                    break;
                case 2:
                    emphrs = 4;
                    break;
                default:
                    emphrs = 0;
                    break;
            }
            totalEmphrs += emphrs;
            System.out.println("Days:" + totalworkingdays + "Emp hrs:" + emphrs);
        }
        return totalEmphrs * wage_per_hr;
    }
        public static void main (String[]args){
        UC9_EmpWageBuider Dmart= new UC9_EmpWageBuider("Jio",50,30,200);
            System.out.println("Total wage is"+Dmart.company+"is: "+Dmart.computeWage());
        }
    }
