import java.util.*;

class AtmTransaction {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
            "Press \n'1' for Deposit\n'2' for Withdraw\n'3' for Checking Balance\n'4' for Exit: "
        );

        int a = sc.nextInt();

        double balance = 0;

        switch (a) {

            case 1:
                System.out.println("Enter the amount you want to deposit: ");
                double deposit = sc.nextDouble();

                if (deposit <= 0) {
                    System.out.println("Amount should be greater than 0");
                } else {
                    balance = balance + deposit;
                    System.out.println("Your new balance is: " + balance);
                }
                break;

            case 2:
                System.out.println("Enter the amount you want to withdraw: ");
                double withdraw = sc.nextDouble();

                if (withdraw <= 0) {
                    System.out.println("Amount should be greater than 0");
                } else if (withdraw > balance) {
                    System.out.println("Amount cannot exceed the balance");
                } else {
                    balance = balance - withdraw;
                    System.out.println("Your new balance is: " + balance);
                }
                break;

            case 3:
                System.out.println("Your current balance is: " + balance);
                break;

            case 4:
                System.out.println("You chose to exit.");
                break;

            default:
                System.out.println("Invalid number!");
        }
    }
}