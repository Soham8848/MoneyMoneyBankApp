package Moneymoneybank;

import java.util.Scanner;

public class MMBankFactory extends BankFactory {

    public BankAcc createAccount(int accNo, String accNm, float accBal) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the type of account to create:");
        System.out.println("1. Saving Account");
        System.out.println("2. Current Account");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                return getNewSavingAcc(accNo, accNm, accBal,false);

            case 2:
                return getNewCurrentAcc(accNo,accNm, accBal, 1000);
            default:
                System.out.println("Invalid choice. No account created.");
                return null;
        }
    }

    public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Create saving account with MoneyMoney Bank");

        System.out.println("Enter your full name:");
        accNm = sc.next();

        accBal = 100;
        System.out.println("Are you salaried: true/false");
         isSalaried = sc.nextBoolean();

        return new SavingAcc(accNo, accNm, accBal, isSalaried) { // Assuming isSalaried is false for simplicity
            @Override
            public void withdraw(float amount) {
                // Implement withdraw logic
            }

            @Override
            public String toString() {
                return "SavingAcc{" +
                        "accNo=" + getAccNo() +
                        ", accNm='" + getAccNm() + '\'' +
                        ", accBal=" + getAccBal() +
                        '}';
            }

            @Override
            public void deposite(float amount) {
                // Implement deposit logic
                amount = 599f;
            }
        };
    }

    public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Create Current account with MoneyMoney Bank");

        System.out.println("Enter your full name:");
        accNm = sc.next();

        accBal = 100f;

        return new CurrentAcc(accNo, accNm, accBal, 0) { // Assuming creditLimit is 0 for simplicity
            @Override
            public void withdraw(float amount) {
                // Implement withdraw logic
            }

            @Override
            public String toString() {
                return "CurrentAcc{" +
                        "accNo=" + getAccNo() +
                        ", accNm='" + getAccNm() + '\'' +
                        ", accBal=" + getAccBal() +
                        '}';
            }

            @Override
            public void deposite(float amount) {
                // Implement deposit logic
            }
        };
    }
}
