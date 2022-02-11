package com.company;

public class Main {

    public static void main(String[] args) {

        MickieBankAcc mickieBA = new MickieBankAcc();

        mickieBA.accountHolderName = "miki";
        mickieBA.accountNo = "006556345342";
        mickieBA.accountType = "Savings Account";
        mickieBA.bankName = "Commercial";
        mickieBA.branchName = "Rathmalana";

        mickieBA.checkBalance();

        mickieBA.deposit(5000);

        mickieBA.checkBalance();

        mickieBA.withdraw(1000);

        mickieBA.checkBalance();

        mickieBA.showDetails();

        MickieBankAcc kavisha = new MickieBankAcc();

        kavisha.accountHolderName = "Kavisha";
        kavisha.accountNo = "00987654567";
        kavisha.accountType = "Savings Account";
        kavisha.bankName = "Commercial";
        kavisha.branchName = "Rathmalana";

        kavisha.showDetails();

        MickieBankAcc dilanka = new MickieBankAcc();

        dilanka.accountHolderName = "Dilanka";
        dilanka.accountNo = "0057635245234";
        dilanka.accountType = "Savings Account";
        dilanka.bankName = "Commercial";
        dilanka.branchName = "Rathmalana";

        dilanka.showDetails();



    }

}
