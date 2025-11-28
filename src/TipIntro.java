import java.util.Arrays;

public class TipIntro {
    private String [] tipIntro =  new String[5];
    protected TipIntro() {
        tipIntro[0]="All:Turn idle appliance off\n" +
                "Turn appliance off at the plug to save an average of £30 a year";

        tipIntro[1] = "Dryer:Use smooth ducts for exhaust\n" +
                "Your dryer will use more energy if it has " +
                "to push exhaust air past the pleats found in " +
                "flexible ducts. Smooth ducts produce less turbulence" +
                "and require less energy to exhaust air";

        tipIntro[2] = "Heater:Install an A-rated boiler\n" +
                "Based on fuel prices in April 2017, a detached " +
                "house upgrading from a G-rated boiler could save up to £320 a year";

        tipIntro[3] = "Heater:Invest in double glazing\n" +
                "If your home is entirely single glazed, you could save as " +
                "much as £160 a year by installing A-rated double glazing. " +
                "Double glazing will not only insulate your home from the " +
                "cold and it will help you reduce your heating bills, it'll help keep out noise too.";

        tipIntro[4] = "Washing machine:Hot, warm or cold cycles?\n" +
                "Washing at 30 degrees rather than 40 degrees can be a " +
                "third cheaper, meaning savings of up to £52 a year. Not " +
                "all laundry needs to be washed in hot or even warm water.";
    }

    public String[] getTipIntro() {
        return tipIntro;
    }
}
