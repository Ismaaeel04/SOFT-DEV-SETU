class lab3aq3 {
    public static void main(String[] args) {
        
        BankCustomer customer = new BankCustomer("John Doe", "123 Main St");
        SavingAccount account1 = new SavingAccount(1000.0, 5);
        SavingAccount account2 = new SavingAccount(2000.0, 4);
        SavingAccount account3 = new SavingAccount(3000.0, 4);
        SavingAccount account4 = new SavingAccount(3000.0, 4);
        
        customer.addAccount(account1);
        customer.addAccount(account2);
        customer.addAccount(account3); 
        customer.addAccount(account4); // This should print "Maximum accounts reached"

        customer.printAccounts();
        System.out.println(customer.balance());

    }
}