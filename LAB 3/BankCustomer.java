class BankCustomer{

String name;
String address;
SavingAccount SavingAccounts[] = new SavingAccount[3];
int counter;

public BankCustomer(String n, String ad)
{
    name=n;
    address=ad;
    counter= 0;

}

public void addAccount(SavingAccount account)
{
    if(counter < 3) {
        SavingAccounts[counter] = account;
        counter++;
    } else {
        System.out.println("Maximum accounts reached");
    }


}

public double balance()
{

    double totalBalance = 0;

    for(int i=0; i<counter; i++)
    {


        totalBalance = SavingAccounts[i].getBalance() + totalBalance;


    }

    return totalBalance;


}

public void printAccounts()
{

    for(int i=0; i<counter; i++)
    {

        System.out.println("Account Number: " + (i+1));
        System.out.println("Balance: " + SavingAccounts[i].getBalance());

        System.out.println();

    }



}








}