# ATM Machine C Code

This repository contains a simple ATM machine simulation written in C. The program provides basic functionalities like checking balance, depositing funds, withdrawing funds, displaying a mini statement, and exiting the ATM session. The code is well-documented and organized to help users understand its functionality and usage.

## Features

1. **Check Balance:** Allows users to check the available balance in their account.

2. **Deposit:** Enables users to deposit funds into their account. The deposited amount must be a multiple of 100 and at least 100.

3. **Withdraw:** Allows users to withdraw funds from their account. The withdrawal amount must be a multiple of 100, at least 100, and not exceed 10000. Additionally, there is a daily withdrawal limit of 20000.

4. **Mini Statement:** Displays a mini statement of recent transactions, including both deposits and withdrawals.

5. **Exit:** Exits the ATM session gracefully.

## Usage

1. **Compilation:** To compile the code, ensure you have a C compiler installed on your system (e.g., GCC). Run the following command in your terminal:

    ```
    gcc atm_machine.c -o atm_machine
    ```

2. **Execution:** After successful compilation, run the executable:

    ```
    ./atm_machine
    ```

3. **Interaction:** The program will display a menu of options. Choose a number corresponding to the desired action:

    - `1`: Check Balance
    - `2`: Deposit
    - `3`: Withdraw
    - `4`: Mini Statement
    - `5`: Exit

4. **Follow Prompts:** Depending on the chosen action, the program will guide you through the necessary steps. Follow the prompts to input appropriate values.

5. **Continuation:** After performing an action, the program will ask if you want to continue. Choose `1` to perform another action or `2` to exit the ATM session.

## Notes

- The code is designed to simulate a simple ATM machine and should not be used for real-world banking operations.

- The code includes comments to explain the purpose and functionality of various sections.

- The ATM simulation enforces certain constraints for deposits and withdrawals to ensure realistic behavior.

- The mini statement displays transaction details and the remaining balance.

- The ATM session can be exited at any time by selecting the "Exit" option.

## Credits

This ATM machine simulation was developed by Prince Mishra. For any questions or feedback, feel free to contact the developer.

Please note that this simulation is for educational purposes and may not cover all real-world scenarios or security features of a genuine ATM system. Use it responsibly and avoid using real account information.
