# ATM Machine Simulation - C and Java

This repository contains a simple ATM machine simulation implemented in both C and Java. The program provides basic functionalities like checking balance, depositing funds, withdrawing funds, displaying a mini statement, and exiting the ATM session. The code is well-documented to help users understand its functionality and usage.

## Features

1. **Check Balance:** Allows users to check the available balance in their account.

2. **Deposit:** Enables users to deposit funds into their account. The deposited amount must be a multiple of 100 and at least 100.

3. **Withdraw:** Allows users to withdraw funds from their account. The withdrawal amount must be a multiple of 100, at least 100, and not exceed 10000. Additionally, there is a daily withdrawal limit of 20000.

4. **Mini Statement:** Displays a mini statement of recent transactions, including both deposits and withdrawals.

5. **Exit:** Exits the ATM session gracefully.

## Files

- `atm.c`: Contains the ATM simulation code written in C.
- `atm.java`: Contains the ATM simulation code written in Java.

## Usage

### C Code

1. **Compilation:** Compile the C code using a C compiler (e.g., GCC). In your terminal, run the following command:

    ```bash
    gcc atm.c -o atm_c
    ```

2. **Execution:** After successful compilation, run the executable:

    ```bash
    ./atm_c
    ```

3. **Follow the Prompts:** The C program will guide you through the ATM simulation using the command line.

### Java Code

1. **Compilation:** Compile the Java code using a Java compiler (e.g., `javac`). In your terminal, run the following command:

    ```bash
    javac atm.java
    ```

2. **Execution:** After successful compilation, run the compiled class:

    ```bash
    java atm
    ```

3. **Follow the Prompts:** The Java program will guide you through the ATM simulation in the console.

## Exception Handling

Both implementations (C and Java) use exception handling to gracefully handle potential input errors. If an invalid input is detected (e.g., non-numeric input), the programs will display an error message and redirect the user to the main menu. This helps prevent crashes due to unexpected user input.

## Notes

- The code is designed to simulate a simple ATM machine and should not be used for real-world banking operations.

- The code includes comments to explain the purpose and functionality of various sections.

- The ATM simulation enforces certain constraints for deposits and withdrawals to ensure realistic behavior.

- The mini statement displays transaction details and the remaining balance.

## Credits

This ATM machine simulation was developed by Prince Mishra. For any questions or feedback, feel free to contact the developer.

Please note that this simulation is for educational purposes and may not cover all real-world scenarios or security features of a genuine ATM system. Use it responsibly and avoid using real account information.
