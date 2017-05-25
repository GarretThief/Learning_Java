package OOP._2_17_Multithreading.testthread5;

/**   ---Laba 7---
 * 1) The first task is to complete the class Transfer that transfers a random amount of money
 *    from a given account to another random account in a bank (use an infinite loop);
 *    this class will be executed by multiple threads concurrently.
 * 2) Complete the code in BankTest to spawn N_ACCOUNTS Transfer threads with an initial balance: INITIAL_BALANCE.
 *    ---Laba 8---
 * 1) When running the program from lab 2-17-7, you should see that in some cases it fails to work properly
 *    (i.e. the total balance of all the accounts is corrupted). This is an example of race condition.
 *    Modify your code in order to fix these race conditions.
 */
public class BankTest {
    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;

    public static void main(String args[]) {
        Bank bank = new Bank(N_ACCOUNTS, INIT_BALANCE);
        Transfer trans1 = new Transfer(bank, 700);

        new Thread(trans1).start();
        new Thread(trans1).start();
        new Thread(trans1).start();


    }
}
