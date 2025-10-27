import java.util.Scanner;

public class BankInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();

        for (double rate = 0.02; rate <= 0.05; rate += 0.01) {
            double currentBalance = balance;
            System.out.println();
            System.out.println("With an initial balance of $" + balance +
                               " at an interest rate of " + rate);

            for (int year = 1; year <= 4; year++) {
                currentBalance += currentBalance * rate;
                System.out.printf("After year %d balance is $%.4f%n", year, currentBalance);
            }
        }

        input.close();
    }
}
