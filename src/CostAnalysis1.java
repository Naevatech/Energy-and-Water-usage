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



    //    public CostAnalysis(int size) {
//        // Create an array of 'size' references to Appliance objects
//        this.applianceList = new Appliance[size];
//    }

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
