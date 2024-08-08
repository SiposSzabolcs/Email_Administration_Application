import java.util.Random;

public class Email {
    String firstName;
    String lastName;
    String department;
    String company;
    private StringBuilder password;

    public Email(String firstName, String lastName, String department, String company){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.company = company;
        this.password = generatePassword();
    }

    StringBuilder generatePassword(){
        StringBuilder pass = new StringBuilder();
        for (int i = 0; i < 16; i++){
            pass.append(getRandomChar());
        }
        return pass;
    }

    public static char getRandomChar(){
        Random RANDOM = new Random();
        String ALLOWED_CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!%+?#";
        int index = RANDOM.nextInt(ALLOWED_CHARS.length());
        return ALLOWED_CHARS.charAt(index);
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public StringBuilder getPassword() {
        return password;
    }

    public String getDepartment() {
        return department;
    }
}
