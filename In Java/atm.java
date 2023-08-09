import java.util.InputMismatchException;
import java.util.Scanner;

public class atm {
    static Scanner sc = new Scanner(System.in);
    static int balance = 45000, withdraw_bal = 0;
    static int MAX_TRANSACTIONS = 20;
    static int pre_bal[] = new int[MAX_TRANSACTIONS];
    static int cur_bal[] = new int[MAX_TRANSACTIONS];
    static int index = 0;

    public static void displayMenu() {
        System.out.println("\n****************** Hello! *******************");
        System.out.println("********** Welcome to ATM Banking ***********");
        System.out.println();
        System.out.println("**** Please choose one of the options below ****");
        System.out.println("< 1 >  Check Balance");
        System.out.println("< 2 >  Deposit");
        System.out.println("< 3 >  Withdraw");
        System.out.println("< 4 >  Statement");
        System.out.println("< 5 >  Exit");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Enter your choice : ");
    }

    public static void deposit() {
        System.out.print("\nEnter the amount you want to deposit : ");
        int deposit = sc.nextInt();
        if (deposit < 100) {
            System.out.println("\nDeposit Amount should be greater than Rs 100!!!! \nEnter your choice Again!!!!");
        } else if (deposit % 100 != 0) {
            System.out.println("\nATM can't deposit Rs " + deposit % 100 + "\nPlease enter Amount multiple of 100!!!!");
        } else {
            pre_bal[index] = balance;
            balance = balance + deposit;
            System.out.println("Amount Rs " + deposit + " Deposited in your account!!!");
            cur_bal[index] = balance;
            index++;
        }
    }

    public static void withdraw() {
        System.out.print("\nEnter the amount you want to withdraw : ");
        int withdraw = sc.nextInt();
        if (withdraw < 100) {
            System.out.println("\nWithdraw Amount should be greater than 100!!!!");
        } else if (withdraw > 10000) {
            System.out.println("\nYou can't withdraw more than Rs 10000 in one time!!!");
        } else if ((withdraw + withdraw_bal) > 20000) {
            System.out.println("\nNot Allowed!!! \nToday you can only withdraw : Rs " + (20000 - withdraw_bal)
                    + " of your daily limit!!");
        } else if (withdraw % 100 != 0) {
            System.out
                    .println("\nATM can't dispense Rs " + withdraw % 100 + "\nPlease enter Amount multiple of 100!!!!");
        } else if (((balance - withdraw) >= 0) && (withdraw <= 10000) && (withdraw_bal <= 20000)) {
            pre_bal[index] = balance;
            balance = balance - withdraw;
            System.out.println("Amount Rs " + withdraw + " withdraw from your account!!!");
            cur_bal[index] = balance;
            index++;

            withdraw_bal += withdraw;
        } else {
            System.out.println("\nRequested Amount is not available in your account!!!!");
        }
    }

    public static void miniStatement() {
        if (index == 0) {
            System.out.println("\nNo Operation performed to display Statement!!!");
        } else {
            System.out.println("Mini Statement:");
            for (int i = 0; i < index; i++) {
                if ((cur_bal[i] - pre_bal[i]) >= 0) {
                    System.out.println((i + 1) + ". Credited : Rs " + (cur_bal[i] - pre_bal[i]));
                } else {
                    System.out.println((i + 1) + ". Withdrawn : Rs " + (pre_bal[i] - cur_bal[i]));
                }
            }
            System.out.println("Available Amount in your account : " + balance);
        }
    }

    public static void balanceEnquiry() {
        System.out.println("Available Balance : Rs " + balance);
    }

    public static void menuExit() {
        System.out.println("-----Thank you for using ATM Banking Machine!!!-----");
        System.out.println("-----Developed by Prince Mishra !!!-----");
    }

    public static void main(String[] args) {
        int cho = 0;
        while (cho != 5) {
            try {
                displayMenu();
                cho = sc.nextInt();
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                switch (cho) {
                    case 1:
                        balanceEnquiry();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        withdraw();
                        break;
                    case 4:
                        miniStatement();
                        break;
                    case 5:
                        menuExit();
                        break;
                    default:
                        System.out.println("\nInvalid Input!!! ");
                }

                if (cho != 5) {
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Would you like to continue :");
                    System.out.println("< 1 > Yes");
                    System.out.println("< 2 > No");
                    System.out.print("Enter your choice : ");
                    cho = sc.nextInt();
                    if (cho == 2) {
                        cho = 5;
                        menuExit();
                    } else if (cho != 1) {
                        System.out.println("Invalid Input!!! \nExiting!!!\n");
                        cho = 5;
                        menuExit();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.\nRedirecing to Main menu!!!");
                sc.next(); // Clear the invalid input from the scanner
            }
        }
    }
}
