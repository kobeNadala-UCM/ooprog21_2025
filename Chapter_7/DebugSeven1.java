import java.util.*;

public class DebugSeven1 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter three names:");
        System.out.print("First name >> ");
        String name1 = kb.nextLine();

        System.out.print("Second name >> ");
        String name2 = kb.nextLine();

        System.out.print("Third name >> ");
        String name3 = kb.nextLine();

        compareNames(name1, name2);
        compareNames(name1, name3);
        compareNames(name2, name3);
    }

    public static void compareNames(String first, String second) {
        System.out.print(first + " and " + second);
        if (first.equals(second)) {
            System.out.println(" are the same");
        } else {
            System.out.println(" are different");
        }
    }
}
