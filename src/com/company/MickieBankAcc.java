package com.company;

class MickieBankAcc implements bankAccounts {

    String accountHolderName;
    String accountNo;
    String accountType;
    String bankName;
    String branchName;
    long balance = 0;
    long depositAmount;
    long withdrawAmount;

    public void deposit(long depositAmount) {

        balance = balance + depositAmount;
        System.out.println("You have deposited Rs. " + depositAmount + "/=");

    }


    public void withdraw(long withdrawAmount) {

        if (withdrawAmount > balance) {
            System.out.println("Your balance is insufficient to withdraw");
        } else {
            System.out.println("Your withdrawed amount = " + withdrawAmount + "/=");
            balance = balance - withdrawAmount;
        }
    }


    public void checkBalance() {

        System.out.println("Your current balance is = Rs. " + balance + "/=");


    }

    public void showDetails() {
        System.out.println("\n");
        System.out.println("Holder Name     :   " + accountHolderName);
        System.out.println("Account NO      :   " + accountNo);
        System.out.println("Account Type    :   " + accountType);
        System.out.println("Bank Name       :   " + bankName);
        System.out.println("Branch Name     :   " + branchName);
    }


}
