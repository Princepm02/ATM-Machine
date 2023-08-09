#include <stdio.h>

#define MAX_TRANSACTIONS 20

int balance = 45000, withdraw_bal = 0;
int pre_bal[MAX_TRANSACTIONS];
int cur_bal[MAX_TRANSACTIONS];
int curr_index = 0;

void displayMenu() {
    printf("\n****************** Hello! *******************\n");
    printf("********** Welcome to ATM Banking ***********\n\n");
    printf("**** Please choose one of the options below ****\n");
    printf("< 1 >  Check Balance\n");
    printf("< 2 >  Deposit\n");
    printf("< 3 >  Withdraw\n");
    printf("< 4 >  Statement\n");
    printf("< 5 >  Exit\n");
    printf("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
    printf("Enter your choice : ");
}

void deposit() {
    printf("\nEnter the amount you want to deposit : ");
    int deposit;
    scanf("%d", &deposit);
    
    if (deposit < 100) {
        printf("\nDeposit Amount should be greater than Rs 100!!!! \nEnter your choice Again!!!!\n");
    } else if (deposit % 100 != 0) {
        printf("\nATM can't deposit Rs %d\nPlease enter Amount multiple of 100!!!!\n", deposit % 100);
    } else {
        pre_bal[curr_index] = balance;
        balance = balance + deposit;
        printf("Amount Rs %d Deposited in your account!!!\n", deposit);
        cur_bal[curr_index] = balance;
        curr_index++;
    }
}

void withdraw() {
    printf("\nEnter the amount you want to withdraw : ");
    int withdraw;
    scanf("%d", &withdraw);
    
    if (withdraw < 100) {
        printf("\nWithdraw Amount should be greater than 100!!!!\n");
    } else if (withdraw > 10000) {
        printf("\nYou can't withdraw more than Rs 10000 in one time!!!\n");
    } else if ((withdraw + withdraw_bal) > 20000) {
        printf("\nNot Allowed!!! \nToday you can only withdraw : Rs %d of your daily limit!!\n", 20000 - withdraw_bal);
    } else if (withdraw % 100 != 0) {
        printf("\nATM can't dispense Rs %d\nPlease enter Amount multiple of 100!!!!\n", withdraw % 100);
    } else if (((balance - withdraw) >= 0) && (withdraw <= 10000) && (withdraw_bal <= 20000)) {
        pre_bal[curr_index] = balance;
        balance = balance - withdraw;
        printf("Amount Rs %d withdraw from your account!!!\n", withdraw);
        cur_bal[curr_index] = balance;
        curr_index++;

        withdraw_bal += withdraw;
    } else {
        printf("\nRequested Amount is not available in your account!!!!\n");
    }
}

void miniStatement() {
    if (curr_index == 0) {
        printf("\nNo Operation performed to display Statement!!!\n");
    } else {
        printf("Mini Statement:\n");
        for (int i = 0; i < curr_index; i++) {
            if ((cur_bal[i] - pre_bal[i]) >= 0) {
                printf("%d. Credited : Rs %d\n", i + 1, cur_bal[i] - pre_bal[i]);
            } else {
                printf("%d. Withdrawn : Rs %d\n", i + 1, pre_bal[i] - cur_bal[i]);
            }
        }
        printf("Available Amount in your account : %d\n", balance);
    }
}

void balanceEnquiry() {
    printf("Available Balance : Rs %d\n", balance);
}

void menuExit() {
    printf("-----Thank you for using ATM Banking Machine!!!-----\n");
    printf("-----Developed by Prince Mishra !!!-----\n");
}

int main() {
    int cho = 0;
    
    while (cho != 5) {
        displayMenu();
        scanf("%d", &cho);
        printf("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        
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
                printf("\nInvalid Input!!!\n");
        }

        if (cho != 5) {
            printf("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
            printf("Would you like to continue :\n");
            printf("< 1 > Yes\n");
            printf("< 2 > No\n");
            printf("Enter your choice : ");
            scanf("%d", &cho);
            
            if (cho == 2) {
                cho = 5;
                menuExit();
            } else if (cho != 1) {
                printf("Invalid Input!!! \nExiting!!!\n");
                cho = 5;
                menuExit();
            }
        }
    }

    return 0;
}
