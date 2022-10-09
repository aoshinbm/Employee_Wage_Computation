public class Emp {
    static int wage_per_hr = 20, workhr = 1;
    static int wage = 0, total = 0;
    static int total_work_hr = 100;
    static int full_day = 12, part_time = 8;
    static int month = 20, daily = 1;

    static void fullTime(){
        System.out.println("Employee is working FULL-Time");
        System.out.println("Enter wage:");
        wage = wage_per_hr * full_day;
        daily++;
        workhr++;
        System.out.println("Full-Time:" + wage);
        total=wage*month;
        System.out.println("Total working hours "+workhr+" is "+total+" for a month");
    }
    static void partTime(){
        System.out.println("Employee is working PART-Time");
        System.out.println("Enter wage:");
        wage = wage_per_hr * part_time;
        daily++;
        workhr++;
        System.out.println("Part-Time :" + wage);
        total=wage*month;
        System.out.println("Total working hours "+workhr+" is "+total+" for a month");
    }
}
