import java.util.Scanner;
public class Checking {
    static Scanner keyboard = new Scanner(System.in);
    public static String getDetails1(String message) {
        System.out.println(message);
//        return keyboard.nextLine();
        return keyboard.next();
    }

//    public static int getDetails2(String message) {
//        while (true) {
//            try {
//                System.out.println(message);
//                return Integer.parseInt(keyboard.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Please enter a valid number.");
//            }
//        }
//    }

    public static double getDetails3(String message) {
        System.out.print(message);
        return keyboard.nextDouble();
    }

    public static int getDetails2( String message) {
        System.out.println(message);
        return keyboard.nextInt();
    }



    public static void main(String[] args) {
        CostAnalysis1 analysis = new CostAnalysis1();
        analysis.setNoOfAppliance(getDetails2("How many appliance do you have: "));
        CostAnalysis1 analysis1 = new CostAnalysis1(analysis.getNoOfAppliance());

        int check;
        do {
            System.out.println("1. Add Appliance");
            System.out.println("2. View Appliance");
            System.out.println("3. Energy Analysis");
            System.out.println("4. Cost Analysis");
            System.out.println("5. Exit");
            System.out.println("Enter your option");
            check = keyboard.nextInt();
            if(check == 1) {;
                String applianceName = getDetails1("Enter Appliance Name: ");
                double appliancePowerUsage = getDetails3("What is your Appliance power usage (kW): ");
                int applianceHourOfUsagePerDay = getDetails2("How many hours do you use your Appliance per day: ");
                analysis1.addAppliance(applianceName, appliancePowerUsage, applianceHourOfUsagePerDay);
            }
            if (check == 2) {
                analysis1.viewAppliance();
            }
            if (check == 3) {
                analysis1.analyzeEnergyAndTips();
            }
            if (check == 4) {

            }
        } while (check !=5);
    }
}
