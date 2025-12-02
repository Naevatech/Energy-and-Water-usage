import java.util.Scanner;
public class Checking {
    static Scanner keyboard = new Scanner(System.in);
    public static String getDetails1(String message) {
        System.out.print(message);
        return keyboard.nextLine();
    }

    public static int getDetails2( String message) {
        System.out.print(message);
        return keyboard.nextInt();
    }

    public static double getDetails3(String message) {
        System.out.print(message);
        return keyboard.nextDouble();
    }
    public static void main(String[] args) {


        int check;
        System.out.println("Hello World");
        System.out.println("1. Add Appliance");
        System.out.println("2. View Appliance");
        System.out.println("3. Exit");
        do {
            System.out.println("Enter your option");
            check = keyboard.nextInt();
            System.out.println("1. Add Appliance");
            System.out.println("2. View Appliance");
            System.out.println("3. Exit");
            if(check == 1) {
                 //Cost Calculation object creation
                // Cost analysis Section
                CostAnalysis analysis = new CostAnalysis();
                analysis.setApplianceName(getDetails1("Enter Appliance Name: "));
                analysis.setAppliancePower(getDetails3("What is your Appliance power usage (kW): "));
                analysis.setHoursOfUsage(getDetails2("How many hours do you use your Appliance per day: "));
                analysis.calEnergyDailyUsage();
                analysis.calCostPerDay();
                analysis.calCostPerWeek();
                analysis.calCostPerMonth();
                analysis.calCostPerYear();
            }
        } while (check !=3);
    }
}
