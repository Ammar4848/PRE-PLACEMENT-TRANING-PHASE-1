import java.util.Scanner;
interface RBI {
    public void rateOfInterest(int amt);
}
abstract class BankAccount {
    String name;
    int accNo;
    double balance;
    Scanner sc = new Scanner(System.in);
    BankAccount(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }
    abstract void deposit(int interest);
    abstract void withdraw();
    void showCustData() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    SavingsAccount(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }
    void deposit(int interest) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
    }
    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (balance - amount < 1000) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
        }
    }
}
class Interest1 extends SavingsAccount implements RBI {
    Interest1(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }
    void deposit(int interest) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        double totalInterest = 0.02 + (interest / 100);
        balance += balance * totalInterest;
    }
    public void rateOfInterest(int amt) {
        deposit(4);
    }
}
class CurrentAccount extends BankAccount {
    CurrentAccount(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }
    void deposit(int interest) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
    }
    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (balance - amount < 1000) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
        }
    }
}
class Interest2 extends CurrentAccount {
    Interest2(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }
    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        balance += balance * 0.04;
    }
}
public class BankAccountMain {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter account number: ");
            int accNo = sc.nextInt();
            System.out.print("Enter balance: ");
            double balance = sc.nextDouble();
            System.out.print("Enter account type (1. Savings 2. Current): ");
            int type = sc.nextInt();
            BankAccount account;
            if (type == 1) {
                account = new Interest1(name, accNo, balance);
            } else {
                account = new Interest2(name, accNo, balance);
            }
            while (true) {
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Show Customer Data");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        account.deposit(4);
                        break;
                    case 2:
                        account.withdraw();
                        break;
                    case 3:
                        account.showCustData();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid Choice");
                }
            }
        }
    }
}