import java.util.Scanner;
public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance, interestRate = 0.03;
        int choice, year = 1;

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();

        System.out.println("Do you want to see next year's balance?");
        System.out.print("Enter 1 for yes or any other number for no >> ");
        choice = input.nextInt();

        while (choice == 1) {
            balance += balance * interestRate;
            System.out.println("After year " + year + " at " + interestRate + " interest rate, balance is $" + balance);
            System.out.println();
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
            year++;
        }
    }
}
