//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static String getDetails1(String message) {
        System.out.println(message);
        return keyboard.nextLine();
    }

    public static int getDetails2( String message) {
        System.out.println(message);
        return keyboard.nextInt();
    }
    public static void main(String[] args) {

        //welcome
        Welcome welcomeMsg = new Welcome();

        //tips for reducing energy usage and reduce cost
        TipIntro tips = new TipIntro();

        //User registration object creation
        UserRegistration user = new UserRegistration();

        System.out.println("Hello" + user.getFirstName() +"\n "+welcomeMsg.toString());

        user.setFirstName(getDetails1("Enter firstname: "));
        user.setLastname(getDetails1("Enter lastname: "));
        user.setEmail(getDetails1("Enter your email"));
        user.setPostalCode(getDetails1("What is your house postal code?"));
        user.setAverageHouseAge(getDetails2("What is the average house old age"));
        user.setNoOfHouseHold(getDetails2("What is the number of house holds?"));
        user.setNoOfAppliance(getDetails2("How many appliance to do you use?"));
        System.out.println(user.toString());
        for (int i = 0; i < tips.getTipIntro().length; i++) {
            System.out.println("Tip " + (i+1) + ":\n " + tips.getTipIntro()[i]);
            try{
                Thread.sleep(6000);
            }catch (InterruptedException e){
                System.out.println("interrupted while waiting");
                Thread.currentThread().interrupt(); //restore interrupt status
            }
        }
    }
}

