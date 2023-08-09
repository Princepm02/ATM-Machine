# ATM Machine Java Code

This repository contains a simple ATM machine simulation implemented in Java. The program provides basic functionalities like checking balance, depositing funds, withdrawing funds, displaying a mini statement, and exiting the ATM session. The code is well-documented to help users understand its functionality and usage.

## Features

1. **Check Balance:** Allows users to check the available balance in their account.

2. **Deposit:** Enables users to deposit funds into their account. The deposited amount must be a multiple of 100 and at least 100.

3. **Withdraw:** Allows users to withdraw funds from their account. The withdrawal amount must be a multiple of 100, at least 100, and not exceed 10000. Additionally, there is a daily withdrawal limit of 20000.

4. **Mini Statement:** Displays a mini statement of recent transactions, including both deposits and withdrawals.

5. **Exit:** Exits the ATM session gracefully.

## Usage

1. **Compilation:** Compile the code using a Java compiler (e.g., `javac`). In your terminal, run the following command:

    ```
    javac atm.java
    ```

2. **Execution:** After successful compilation, run the compiled class:

    ```
    java atm
    ```

3. **Interaction:** The program will display a menu of options. Choose a number corresponding to the desired action:

    - `1`: Check Balance
    - `2`: Deposit
    - `3`: Withdraw
    - `4`: Mini Statement
    - `5`: Exit

4. **Follow Prompts:** Depending on the chosen action, the program will guide you through the necessary steps. Follow the prompts to input appropriate values.

5. **Continuation:** After performing an action, the program will ask if you want to continue. Choose `1` to perform another action or `2` to exit the ATM session.

## Exception Handling

The code uses `try` and `catch` blocks to handle potential input errors. If an invalid input is detected (e.g., non-numeric input), the program will display an error message and redirect the user to the main menu. This helps prevent crashes due to unexpected user input.

```java
try {
    // ...
    cho = sc.nextInt();
    // ...
} catch (InputMismatchException e) {
    System.out.println("Invalid input! Please enter a valid number.\nRedirecting to the main menu!");
    sc.next(); // Clear the invalid input from the scanner
}
```

## Notes

- The code is designed to simulate a simple ATM machine and should not be used for real-world banking operations.

- The code includes comments to explain the purpose and functionality of various sections.

- The ATM simulation enforces certain constraints for deposits and withdrawals to ensure realistic behavior.

- The mini statement displays transaction details and the remaining balance.

- The ATM session can be exited at any time by selecting the "Exit" option.

## Credits

This ATM machine simulation was developed by Prince Mishra. For any questions or feedback, feel free to contact the developer.

Please note that this simulation is for educational purposes and may not cover all real-world scenarios or security features of a genuine ATM system. Use it responsibly and avoid using real account information.
