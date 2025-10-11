class lab3aq2{

public static void main(String[] args) {
    
    SavingAccount saverA;

    saverA = new SavingAccount(2000, 4);

    saverA.calculateMonthlyInterest();
    saverA.printData();

     SavingAccount saverB;

    saverB = new SavingAccount(2000, 4);

    saverB.calculateMonthlyInterest();
    saverB.printData();

    saverA.modifyInterestRate(5);
    saverA.calculateMonthlyInterest();
    saverA.printData();





}



}