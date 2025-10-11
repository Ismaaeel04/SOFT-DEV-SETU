class SavingAccount{

private static int nextAccountNumber=1;
private int accountNumber;
private static double annualInterestRate;
private double savingBalance;

public SavingAccount(double initialBalance, double interest)
{

    this.accountNumber=nextAccountNumber;
    nextAccountNumber++;
    savingBalance=initialBalance;
    annualInterestRate=(interest/100);


}

public void modifyInterestRate(double interest)
{


annualInterestRate=(interest/100);


}

public double calculateMonthlyInterest()
{
    double monthlyInterest=(annualInterestRate/12);
    savingBalance=(savingBalance*monthlyInterest)+savingBalance;
    

    return monthlyInterest*100;


}

public void printData()
{

    System.out.println("Account Number: " + accountNumber);
    System.out.println("Saving Balance: " + savingBalance);
    System.out.println("Annual Interest Rate: " + annualInterestRate*100 + "%");
}

public double getBalance() {
    return savingBalance;
}

}