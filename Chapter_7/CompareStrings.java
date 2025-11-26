import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String userName = input.nextLine();

        String compareName = "Carmen";

        if (userName.equals(compareName)) {
            System.out.println(compareName + " equals " + userName);
        } else {
            System.out.println(compareName + " does not equal " + userName);
        }
    }
}
