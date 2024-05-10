import java.util.*;


class AtmMachine {

    int bal;
    Scanner sc=new Scanner(System.in);
    int pin=sc.nextInt();
     // Mov;ed Scanner instantiation to class level
    
    public void checkpin() {
        System.out.println("Enter Pin");
        int PIN = sc.nextInt(); // Declared a local variable PIN
        if (pin == PIN) {
            manu();
        } else {
            System.out.println("Pin Invalid");
            checkpin();
        }
    }

    public int manu() {
        System.out.println("1: Check Balance");
        System.out.println("2: Withdrawal");
        System.out.println("3: Deposit money"); // Corrected spelling of Deposit
        System.out.println("4: Exit");
        int input = sc.nextInt();

        if (input == 1) {
            Showbalance();
        }
        if (input == 2) {
            Withdrawal();
        }
        if (input == 3) {
            deposit(); // Corrected method name to deposit
        }
        if (input == 4) {
            exit();
        }
        return input; // Added return statement
    }

    public void Showbalance() {
        System.out.println("Total Balance : " + bal);
        manu();
    }

    public void Withdrawal() {
        System.out.println("Enter Amount");
        int amo = sc.nextInt();
        if (amo > bal) {
            System.out.println("Insufficient Balance");
            manu();
        } else {
            bal = bal - amo;
            manu();
        }
    }

    public void deposit() {
        System.out.println("Enter Deposit Amount");
        int depamou = sc.nextInt(); // Defined depamou locally
        bal = bal + depamou;
        manu();
    }

    public void exit() {
        System.out.println("Exiting...");
        System.exit(0); // Exiting the program
    }
}

public class Atm {
    public static void main(String[] args) {
        AtmMachine a = new AtmMachine();
        a.checkpin();
    }
}
