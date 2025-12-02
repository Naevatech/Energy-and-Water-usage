public class UserRegistration {
    private  String firstName;
    private String lastname;
    private String email;
    private int averageHouseAge;
    private int noOfHouseHold;
    private String postalCode;
    private int noOfAppliance;

    //default constructor
    UserRegistration() {
    }

    UserRegistration(String first_Name, String last_name, String user_email, int average_houseAge, int no_of_house_hold, String postal_code, int no_of_appliance) {
        this.firstName = first_Name;
        this.lastname = last_name;
        this.email = user_email;
        this.averageHouseAge = average_houseAge;
        this.noOfHouseHold = no_of_house_hold;
        this.postalCode = postal_code;
        this.noOfAppliance = no_of_appliance;
    }



    protected String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAverageHouseAge(int averageHouseAge) {
        this.averageHouseAge = averageHouseAge;
    }

    public void setNoOfHouseHold(int noOfHouseHold) {
        this.noOfHouseHold = noOfHouseHold;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setNoOfAppliance(int noOfAppliance) {
        this.noOfAppliance = noOfAppliance;
    }

    @Override
    public String toString() {
        return "hello " + getFirstName();
    }
}