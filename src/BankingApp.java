import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        int choice;

        do {
            System.out.println("\n====== SIMPLE BANKING SYSTEM ======");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depAmount = sc.nextDouble();
                    account.deposit(depAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wAmount = sc.nextDouble();
                    account.withdraw(wAmount);
                    break;

                case 3:
                    System.out.println("Current Balance: ₹" + account.getBalance());
                    break;

                case 4:
                    System.out.println("Exiting System... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
