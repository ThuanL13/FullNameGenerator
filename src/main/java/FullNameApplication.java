import java.util.Scanner;
public class FullNameApplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter your name");
        System.out.println("First name: ");
        String firstName = read.nextLine().trim(); // Reads input and trims
        System.out.println("Middle name: ");
        String middleName = read.nextLine().trim();
        System.out.println("Last name: ");
        String lastName = read.nextLine().trim();
        System.out.println("Suffix: ");
        String suffix = read.nextLine().trim();

        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }
        fullName += " " + lastName;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }
        System.out.println("Full Name: " + fullName);
        read.close();
    }
}
