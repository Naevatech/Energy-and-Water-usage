//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    static Scanner keyboard = new Scanner(System.in);


    public static String getDetails1(String message) {
        System.out.println(message);
        try {
            return keyboard.next();
        } catch (IllegalStateException e) {
            System.out.println("⚠️ Could not read text input. Please try again.");
            return ""; // safe fallback
        }
    }

    public static int getDetails2(String message) {
        while (true) {
            System.out.print(message);
            try {
                int value = keyboard.nextInt();
                return value;
            } catch (IllegalStateException e) {
                System.out.println("⚠️ Invalid number. Please enter a whole number.");
                keyboard.nextLine(); // clear bad token
            }
        }
    }

    public static double getDetails3(String message) {
        while (true) {
            System.out.print(message);
            try {
                double value = keyboard.nextDouble();
                return value;
            } catch (IllegalStateException e) {
                System.out.println("⚠️ Invalid number. Please enter a decimal number (e.g., 1.5).");
                keyboard.nextLine(); // clear bad token
            }
        }
    }

    public static void main(String[] args) {

        //welcome
        Welcome welcomeMsg = new Welcome();

        //tips for reducing energy usage and reduce cost
        TipIntro tips = new TipIntro();

        //User registration object creation
        UserRegistration user = new UserRegistration();

        System.out.println("Hello" + user.getFirstName() +"\n "+welcomeMsg.toString());
        //user getting details
        user.setFirstName(getDetails1("Enter firstname: "));
        user.setLastname(getDetails1("Enter lastname: "));
        user.setEmail(getDetails1("Enter your email"));
        user.setPostalCode(getDetails1("What is your house postal code?"));

        //welcome page after the user register;
        welcomeMsg.welcomeUser(user.getFirstName());

        EnergyAndCostAnalysis analysis = new EnergyAndCostAnalysis();
        analysis.setNoOfAppliance(getDetails2("How many appliance do you have: "));
        EnergyAndCostAnalysis energyAndCost = new EnergyAndCostAnalysis(analysis.getNoOfAppliance());

        int check;
        // LIST OF OPTION THAT CAN BE PERFORM ON THE APP
        do {
            System.out.println("1. Add Appliance");
            System.out.println("2. View Appliance");
            System.out.println("3. Energy Analysis");
            System.out.println("4. Cost Analysis");
            System.out.println("5. Tips");
            System.out.println("6. Exist");
            System.out.println("Enter your option");
            check = keyboard.nextInt();
            if(check == 1) {;
                String applianceName = getDetails1("Enter Appliance Name: ");
                double appliancePowerUsage = getDetails3("What is your Appliance power usage (kW): ");
                int applianceHourOfUsagePerDay = getDetails2("How many hours do you use your Appliance per day: ");
                energyAndCost.addAppliance(applianceName, appliancePowerUsage, applianceHourOfUsagePerDay);
            }
            if (check == 2) {
                energyAndCost.viewAppliance();
            }
            if (check == 3) {
                energyAndCost.analyzeEnergy();
            }
            if (check == 4) {
                energyAndCost.energyCostAnalysis();
            }
            if (check == 5) {
                //Listing of energy saving tips
                for (int i = 0; i < tips.getTipIntro().length; i++) {
                    System.out.println("Tip " + (i+1) + ":\n " + tips.getTipIntro()[i]);
                    try{
                        Thread.sleep(6000);
                    }catch (InterruptedException e){
                        System.out.println("interrupted while waiting");
                        Thread.currentThread().interrupt();
                    }
                }
            }
        } while (check !=6);
    }
}

