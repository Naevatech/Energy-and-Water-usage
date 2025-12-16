//APPLIANCE ARRAY INSTANCE
public class Appliance {
    private String ApplianceName;
    private double appliancePower;
    private int hoursOfUsage;
    Appliance(String ApplianceName, double appliancePower, int hoursOfUsage){
        this.ApplianceName = ApplianceName;
        this.appliancePower=appliancePower;
        this.hoursOfUsage=hoursOfUsage;
    }

    public double getAppliancePower() {
        return appliancePower;
    }

    public String getApplianceName() {
        return ApplianceName;
    }

    public int getHoursOfUsage() {
        return hoursOfUsage;
    }
}
