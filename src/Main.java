import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String company = "java";

        String[] departments = {"Marketing","Operations","Finance","Human Resources"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First name");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last name");
        String lastName = scanner.nextLine();

        System.out.println("Choose a department");
        for (int i = 1; i <= departments.length; i++){
            System.out.printf("%d %s%n", i,departments[i-1]);
        }

        int x = scanner.nextInt();
        String department = departments[x-1];

        Email email = new Email(firstName, lastName, department, company);
        System.out.printf("Employee Full name: %s %s\nEmail: %s.%s@%s.%s.nya\nPassword: %s\n", firstName, lastName, firstName.toLowerCase(), lastName.toLowerCase(), department.toLowerCase(), company.toLowerCase(), email.getPassword());
    }
}