import java.text.DecimalFormat;
public class CostAnalysis {
    private String ApplianceName;
    private double appliancePower;
    private final double standardTariffPrice =  0.3022;
    private int hoursOfUsage;
    private double energyUsage = 0;
    private double dialyEnergyCost = 0;
    DecimalFormat df = new DecimalFormat("0.00");

    CostAnalysis() {}

    CostAnalysis(double appliancePower, int hoursOfUsage) {
        this.appliancePower = appliancePower;
        this.hoursOfUsage = hoursOfUsage;
    }

    protected void setAppliancePower(double appliancePower) {
        this.appliancePower = appliancePower;
    }
    protected void setHoursOfUsage(int hoursOfUsage) {
        this.hoursOfUsage = hoursOfUsage;
    }

    public void setApplianceName(String applianceName) {
        ApplianceName = applianceName;
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
