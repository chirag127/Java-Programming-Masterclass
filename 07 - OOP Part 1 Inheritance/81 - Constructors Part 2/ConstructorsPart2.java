
/**
 * Constructors Part 2
 * here we will discuss constructor chaining
 *
 * constructor chaining is when you call one constructor from another constructor
 * constructor chaining can be done in two ways
 * 1. using this keyword
 * 2. using super keyword
 *
 * this keyword is used to call the current class constructor
 * super keyword is used to call the parent class constructor
 *
 * this keyword can be used to call a constructor from another constructor only
 * super keyword can be used to call a constructor from another constructor as well as from a method
 */

 public class ConstructorsPart2 {

    public static void main(String[] args) {
        Account account = new Account(1234, 1000, "John Doe");
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        System.out.println(account.getCustomerName());
        System.out.println(account.getCustomerEmailAddress());
        System.out.println(account.getCustomerPhoneNumber());
    }

}

class Account {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {
        this(1234, 1000, "John Doe");
        System.out.println("Empty constructor called");
    }

    public Account(int accountNumber, double balance, String customerName) {
        this(accountNumber, balance, customerName, "default email", "default phone");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        System.out.println("Account constructor with parameters called");
    }

    public Account(int accountNumber, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
        System.out.println("Account constructor with all parameters called");
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

}