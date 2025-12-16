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

    UserRegistration(String first_Name, String last_name, String user_email,  String postal_code) {
        this.firstName = first_Name;
        this.lastname = last_name;
        this.email = user_email;
        this.postalCode = postal_code;
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

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "hello " + getFirstName();
    }
}