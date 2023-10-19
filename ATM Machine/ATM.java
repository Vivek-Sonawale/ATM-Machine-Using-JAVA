import java.util.*;

public class ATM {
    static int Balance = 50000;

    static void Withdraw() {
        System.out.print("Enter Amount to Withdraw>>");
        Scanner w = new Scanner(System.in);
        int with = w.nextInt();
        if (with > Balance) {
            System.out.println("Insufficient funds. Withdrawal canceled.");
        } else {
            Balance -= with;
            System.out.println("Your Amount is Successfully Withdrawn **********");
            System.out.println("Your Remaining Amount is>>>>>>" + Balance);
            System.out.println("*********Thank You for using TATE ATM**************");
        }
    }

    static void Deposit() {
        System.out.print("Enter Amount to Deposit>>");
        Scanner w = new Scanner(System.in);
        int Dip = w.nextInt();
        if (Dip <= 0) {
            System.out.println("Invalid deposit amount. Deposit canceled.");
        } else {
            Balance += Dip;
            System.out.println("Your Amount is Successfully Deposited **********");
            System.out.println("Your New Balance is>>>>>>" + Balance);
            System.out.println("*********Thank You for using TATE ATM**************");
        }
    }

    static void Show_balance() {
        System.out.println("YOUR CURRENT BANK BALANCE>>>>>>" + Balance);
    }

    public static void main(String[] args) throws InterruptedException {
        int password, option;
        int cd;

        System.out.println("************ WELCOME TO TATE ATM *************");
        System.out.println("***********Please Enter Your ATM CARD.........");
        System.out.print("Enter Card Number (e.g., 5656): ");

        Scanner c = new Scanner(System.in);
        cd = c.nextInt();

        if (cd == 5656) {
            System.out.println("Card Accepted!");
            Thread.sleep(2000);
        } else {
            System.out.println("Invalid Card Number. Exiting...");
            System.exit(0);
        }

        System.out.println("Please Wait...................................");
        Thread.sleep(3000);
        System.out.println("Card Entered Successfully.....................");
        System.out.print("Please Enter PASSWORD>>");

        Scanner a = new Scanner(System.in);
        password = a.nextInt();

        if (password == 6969) {
            System.out.println("**********PLEASE WAIT***********");
            Thread.sleep(3000);

            while (true) {
                System.out.println("----------------------------------");
                Thread.sleep(2000);
                System.out.println("Choose 1 Withdraw");
                System.out.println("Choose 2 Deposit");
                System.out.println("Choose 3 Show Balance");
                System.out.println("Choose 4 EXIT");
                System.out.print("Enter>>");

                Scanner sc = new Scanner(System.in);
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        Withdraw();
                        break;
                    case 2:
                        Deposit();
                        break;
                    case 3:
                        Show_balance();
                        break;
                    case 4:
                        System.out.println("Exiting ATM. Thank you for using TATE ATM!");
                        System.exit(0);
                }
            }
        } else {
            System.out.println("PASSWORD INCORRECT!!");
        }
    }
}
