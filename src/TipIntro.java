// TIPS ON HOW TO REDUCE ENERGY USAGE AND COST
import java.util.Arrays;

public class TipIntro {
    private String [] tipIntro =  new String[10];
    protected TipIntro() {
        tipIntro[0]="All Appliances: Turn idle appliances off\n" +
                "Turn appliances off at the plug to save an average of £30 per year.";

        tipIntro[1] = "Dryer: Use smooth ducts for exhaust\n" +
                "Smooth ducts reduce air resistance, helping your dryer use less energy.";

        tipIntro[2] = "Heating: Install an A-rated boiler\n" +
                "Upgrading from a G-rated boiler could save up to £320 per year.";

        tipIntro[3] = "Heating: Invest in double glazing\n" +
                "Double glazing improves insulation and can save up to £160 per year.";

        tipIntro[4] = "Washing Machine: Hot, warm or cold cycles?\n" +
                "Washing at 30°C instead of 40°C can save up to £52 per year.";

        tipIntro[5] = "Lighting: Switch to LED bulbs\n" +
                "LED bulbs use up to 80% less energy than traditional bulbs.";

        tipIntro[6] =
                "Refrigerator: Keep the door closed\n" +
                        "Opening the fridge less often helps reduce energy consumption.";

        tipIntro[7] =
                "Cooking: Use lids on pots\n" +
                        "Using lids allows food to cook faster and uses less energy.";

        tipIntro[8] =
                "Electronics: Enable power-saving mode\n" +
                        "Power-saving settings reduce electricity use when devices are idle.";

        tipIntro[9] =
                "Water Heating: Take shorter showers\n" +
                        "Reducing shower time lowers hot water and energy usage.";
    }

    public String[] getTipIntro() {
        return tipIntro;
    }
}
