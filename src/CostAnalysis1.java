import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class CostAnalysis1 {
    private String ApplianceName;
    private int noOfAppliance;
    private double appliancePower;
    private final double standardTariffPrice =  0.3022;
    private int hoursOfUsage;
    private double energyUsage = 0;
    private double dialyEnergyCost = 0;
    private Appliance[] applianceList;
    private int index = 0;
    private  double totalYearlyUsage;
    private double totalWeeklyUsage;
    private double totalDailyUsage;
    DecimalFormat df = new DecimalFormat("0.00");
    static Scanner keyboard = new Scanner(System.in);

    CostAnalysis1() {}
//
//    CostAnalysis(double appliancePower, int hoursOfUsage) {
//        this.appliancePower = appliancePower;
//        this.hoursOfUsage = hoursOfUsage;
//    }

    public static String getDetails1(String message) {
        System.out.println(message);
        return keyboard.next();
    }

    public static int getDetails2( String message) {
        System.out.print(message);
        return keyboard.nextInt();
    }

    public static double getDetails3(String message) {
        System.out.print(message);
        return keyboard.nextDouble();
    }

    CostAnalysis1(int noOfAppliance){
        applianceList = new Appliance[noOfAppliance];

    }

    public void addAppliance(String applianceName, double appliancePower, int hoursOfUsage) {
        if (index >= applianceList.length) {
            System.out.println("Appliance is Full, Can not add more");
            return;
        }
            applianceList[index] = new Appliance(applianceName, appliancePower, hoursOfUsage);
            index++;
    }

    public void viewAppliance() {
        System.out.println("\n============Energy Usage Analysis===========");
        System.out.println("------------------------------------------------------");
        System.out.println("S/N \t Device name \t Each day \t Each week \t Each Month \t Each Year");
        if (applianceList == null || index ==0) {
            System.out.println("No appliance to show");
            return;
        }
//        double total =0;
        for (int i = 0; i < index; i++) {
            Appliance myAppliance = applianceList[i];
            String applianceName = myAppliance.getApplianceName();
            double appliancePower = myAppliance.getAppliancePower();
            int applianceHour = myAppliance.getHoursOfUsage();
            double hourlyUsage = appliancePower/applianceHour;
            double dailyUsage = hourlyUsage*applianceHour;
            double weeklyUsage = dailyUsage * 7;
            double monthlyUsage = dailyUsage*30;
            double yearlyUsage = dailyUsage*365;

            totalYearlyUsage +=yearlyUsage;
            totalWeeklyUsage +=weeklyUsage;
            totalDailyUsage +=dailyUsage;
            System.out.println((i+1) + "\t\t" +
                    applianceName + "\t\t\t" +
                    df.format(dailyUsage) + "\t\t\t" +
                    df.format(weeklyUsage) + "\t\t\t" +
                    df.format(monthlyUsage) + "\t\t" +
                    df.format(yearlyUsage)
                    );
        }
        System.out.println("=======================================================");
//        System.out.println(total);
    }

    public void analyzeEnergyAndTips() {

        if (totalDailyUsage !=0 || totalYearlyUsage!=0 || totalWeeklyUsage!=0) {
            System.out.println("Based on the information you’ve provided, you are using " + df.format(totalYearlyUsage) + "per year on your electrical appliance.");
            //Low usage
            if (totalYearlyUsage <= 1800.00) {
                keyboard.nextLine();
                System.out.println("===========================================================================================");
                System.out.println("This is less than the average appliance usage in Northern Ireland.");
                System.out.println("Please note this is a general estimate of how much electrical appliances cost to run.\n ");
                System.out.println("===========================================================================================");
                System.out.println(totalDailyUsage +"kWh\t\t   "+ totalWeeklyUsage+"kwh\t\t" + totalYearlyUsage+"kWh");
                System.out.println("per day less  \t\t per week less \t\t per year more");
                System.out.println("You may be able to save even more energy by following our recommendations or by switching supplier.");
            }
            //Average usage
            if (totalYearlyUsage >=1800.00 && totalYearlyUsage <=2700.00) {
                keyboard.nextLine();
                System.out.println("===========================================================================================");
                System.out.println("This falls between the average appliance usage in Northern Ireland.");
                System.out.println("Please note this is a general estimate of how much electrical appliances energy run.\n ");
                System.out.println("===========================================================================================");
                System.out.println(totalDailyUsage +"kWh\t\t   "+ totalWeeklyUsage+"kwh\t\t" + totalYearlyUsage+"kWh");
                System.out.println("per day  \t\t per week \t\t per year");
                System.out.println("You may be able to save even more energy by following our recommendations or by switching supplier.");
            }
            //High usage
            if (totalYearlyUsage >=2700.00 && totalYearlyUsage <=4100.00) {
                keyboard.nextLine();
                System.out.println("===========================================================================================");
                System.out.println("This falls between the average appliance usage in Northern Ireland.");
                System.out.println("Please note this is a general estimate of how much electrical appliances energy run. ");
                System.out.println("============================================================================================");
                System.out.println(totalDailyUsage +"kWh\t\t   "+ totalWeeklyUsage+"kwh\t\t" + totalYearlyUsage+"kWh");
                System.out.println("per day more  \t\t per week more \t\t per year more");
                System.out.println("You may be able to save even more energy by following our recommendations or by switching supplier.");
            }
        }else {
            System.out.println("No appliance Added yet, kindly add your appliance.");
        }

    }


    protected void setAppliancePower(double appliancePower) {
        this.appliancePower = appliancePower;
    }
    protected void setHoursOfUsage(int hoursOfUsage) {
        this.hoursOfUsage = hoursOfUsage;
    }
    public void setNoOfAppliance(int noOfAppliance) {
        this.noOfAppliance = noOfAppliance;
    }

    public void setApplianceName(String applianceName) {
        ApplianceName = applianceName;
    }

    public int getNoOfAppliance() {
        return noOfAppliance;
    }

    protected void calEnergyDailyUsage() {
        energyUsage = appliancePower * hoursOfUsage;
        System.out.println("The energy usage per day is: "+ df.format(appliancePower * hoursOfUsage) + "kWh/day");
    }
    protected void calCostPerDay() {
        dialyEnergyCost = energyUsage * standardTariffPrice;
        System.out.println("The energy cost per day is: "+ " £" + df.format(standardTariffPrice * energyUsage) );
    }
    protected void calCostPerWeek() {
        System.out.println("The energy cost per Week is: " + " £" +  df.format(dialyEnergyCost * 7) );
    }
    protected void calCostPerMonth() {
        System.out.println("The energy cost per Month is: "+ " £"+ df.format(dialyEnergyCost * 30) );
    }
    protected void calCostPerYear() {
        System.out.println("The energy cost in a Year: "+ " £" + df.format(dialyEnergyCost * 365) );
    }


}
