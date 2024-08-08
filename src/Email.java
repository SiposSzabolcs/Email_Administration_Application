public class Email {
    String firstName;
    String lastName;
    String department;
    String company;
    private String password;

    public Email(String firstName, String lastName, String department, String company){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.company = company;
        this.password = generatePassword();
    }

    String generatePassword(){
        return "password";
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getDepartment() {
        return department;
    }
}
