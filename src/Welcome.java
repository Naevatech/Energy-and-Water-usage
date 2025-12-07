import java.util.Date;
public class Welcome {
    Date currentTime = new Date();
    protected Welcome() {
    }
    @Override
    public String toString() {
        return "===============Welcome to UP-Warding...===============\n" +
                "We track your energy usage and minimize cost.\n\n" +
                "To get started, Look at our tips on how you \ncan use energy sufficiently and reduce cost ";
    }

    public void welcomeUser(String name) {
        System.out.println("=====================================");
        System.out.println("Welcome " + name);
        System.out.println("Date:\t" + currentTime);
        System.out.println("=====================================");
    }
}
