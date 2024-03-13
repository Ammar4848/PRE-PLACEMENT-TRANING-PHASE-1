// import java.util.*;
// abstract class BankAccout {
//     abstract void deposit();
//     abstract void withdraw();
//     private String c_accno;
//     private String c_name;
//     protected double balance = 1000;
//     private String c_city;
    
//     public void inputData(String accno, String name, double bal, String city) {
//         c_accno = accno;
//         c_name = name;
//         balance = bal;
//         c_city = city;
//     }
//     public void display() {
//         System.out.println("+---------------------------------------------------------------------------------------------+");
//         System.out.println("| Account No\t\t\tName\t\t\tBalance\t\t\tCity");
//         System.out.println("+---------------------------------------------------------------------------------------------+");
//         System.out.println("|" + c_accno + "\t\t\t" + c_name + "\t\t\t" + balance + "\t\t\t" + c_city + "|");
//         System.out.println("+---------------------------------------------------------------------------------------------+");
//     }
// }
// class SavingsAccout extends BankAccount{
//     public void deposit(double amt){
//         balance += amt;
//     }
//     public void withdraw(double amt){
//         if (balance - amt < 1000) {
//             System.out.println(ANSI_RED + "Insufficient Balance" + ANSI_RESET);
//         } else {
//             balance -= amt;
//             System.out.println(ANSI_GREEN + "\nAmount Withdrawn!\n" + ANSI_RESET);
//         }
//     }
// }
// class CurrentAccount extends BankAccount{
//     public void deposit(double amt){
//         balance += amt;
//     }
//     public void withdraw(double amt){
//         if (balance - amt < 1000) {
//             System.out.println(ANSI_RED + "Insufficient Balance" + ANSI_RESET);
//         } else {
//             balance -= amt;
//             System.out.println(ANSI_GREEN + "\nAmount Withdrawn!\n" + ANSI_RESET);
//         }
//     }
// }
// public class Banking {
//     public static final String ANSI_RESET = "\u001B[0m";
//     public static final String ANSI_BLACK = "\u001B[30m";
//     public static final String ANSI_RED = "\u001B[31m";
//     public static final String ANSI_GREEN = "\u001B[32m";
//     public static final String ANSI_YELLOW = "\u001B[33m";
//     public static final String ANSI_BLUE = "\u001B[34m";
//     public static final String ANSI_PURPLE = "\u001B[35m";
//     public static final String ANSI_CYAN = "\u001B[36m";
//     public static final String ANSI_WHITE = "\u001B[37m";
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             SavingsAccount sa = new SavingsAccount();
//             System.out.println("Enter Account No: ");
//             String accno = sc.nextLine();
//             System.out.println("Enter Name: ");
//             String name = sc.next();
//             System.out.println("Enter Balance: ");
//             double bal = sc.nextDouble();
//             System.out.println("Enter City: ");
//             String city = sc.next();
//             sa.inputData(accno, name, bal, city);
//             while (true) {
//                 System.out.println(ANSI_GREEN + "\n1. Display" + ANSI_RESET);
//                 System.out.println(ANSI_GREEN + "2. Deposit" + ANSI_RESET);
//                 System.out.println(ANSI_GREEN + "3. Withdraw" + ANSI_RESET);
//                 System.out.println(ANSI_GREEN + "4. Exit\n" + ANSI_RESET);
//                 System.out.println("Enter your choice: ");
//                 int choice = sc.nextInt();
//                 switch (choice) {
//                     case 1:
//                         sa.display();
//                         break;
//                     case 2:
//                         System.out.println("Enter amount to deposit: ");
//                         double amt = sc.nextDouble();
//                         sa.deposit(amt);
//                         System.out.println(ANSI_GREEN + "\nAmount Deposited!\n" + ANSI_RESET);
//                         System.out.println(ANSI_YELLOW + "Balance: " + sa.balance + ANSI_RESET);
//                         break;
//                     case 3:
//                         System.out.println("Enter amount to withdraw: ");
//                         amt = sc.nextDouble();
//                         sa.withdraw(amt);
//                         System.out.println(ANSI_YELLOW + "Balance: " + sa.balance + ANSI_RESET);
//                         break;
//                     case 4:
//                         System.exit(0);
//                         break;
//                     default:
//                         System.out.println(ANSI_RED + "\nInvalid Choice!\n" + ANSI_RESET);
//                         break;
//                 }
//             }
//         } catch (Exception e) {
//             System.out.println(ANSI_RED + "\nError: " + e + "\n" + ANSI_RESET);
//         }
//     }
// }