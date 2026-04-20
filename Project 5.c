// Bank Management Mini Project
#include <stdio.h>

int main() {
    int choice;
    float balance = 0, amount;

    printf("Welcome to the Bank Management System\n");

    while (1) {
        printf("\nMenu:\n");
        printf("1. Deposit\n");
        printf("2. Withdraw\n");
        printf("3. Check Balance\n");
        printf("4. Exit\n");

        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter amount to deposit: ");
                scanf("%f", &amount);
                if (amount > 0) {
                    balance += amount;
                    printf("Amount deposited successfully\n");
                } else {
                    printf("Invalid amount. Please enter a positive value.\n");
                }
                break;

            case 2:
                printf("Enter amount to withdraw: ");
                scanf("%f", &amount);
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    printf("Withdrawal successful\n");
                } else {
                    printf("Invalid amount or insufficient balance.\n");
                }
                break;

            case 3:
                printf("Current balance: %.2f\n", balance);
                break;

            case 4:
                printf("Thank you for using the bank system.\n");
                return 0;

            default:
                printf("Invalid choice\n");
        }
    }

    return 0;
}