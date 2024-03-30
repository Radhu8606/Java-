public class Bank_Account {
    private int accountNo;
    private String userName;
    private String email;
    private String accountType;
    private double accountBalance;
    
    // Constructor
    public Bank_Account(int accountNo, String userName, String email, String accountType, double accountBalance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    
    // Method to get account details
    public String getAccountDetails() {
        return "Account No: " + accountNo + "\n" +
               "User Name: " + userName + "\n" +
               "Email: " + email + "\n" +
               "Account Type: " + accountType + "\n" +
               "Account Balance: " + accountBalance;
    }
    
    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Details:");
        System.out.println(getAccountDetails());
    }
    
    public static void main(String[] args) {
        Bank_Account account1 = new Bank_Account(123456789, "John Doe", "john.doe@example.com", "Savings", 5000.0);
        account1.displayAccountDetails();
    }
}