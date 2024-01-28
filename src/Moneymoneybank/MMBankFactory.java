package Moneymoneybank;

import java.util.Scanner;

public class MMBankFactory extends BankFactory {
    public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        System.out.println("Create saving account with MoneyMoney Bank");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name:");
        accNm = sc.nextLine();

        System.out.println("Enter true if you are salaried and false if you're not salaried:");
        isSalaried = sc.nextBoolean();
        accBal = 100;
        accNo += accNo;

        return new SavingAcc(accNo, accNm, accBal, isSalaried) {
            @Override
            public void withdraw(float amount) {
                // Implement withdraw logic
            }

            @Override
            public String toString() {
                // Accessing private variables of BankAcc class using getter methods
                return "SavingAcc{" +
                        "accNo=" + getAccNo() +
                        ", accNm='" + getAccNm() + '\'' +
                        ", accBal=" + getAccBal() +
                        '}';
            }

            @Override
            public void deposite(float accBal ) {
                // Implement deposit logic
                accBal = 599f;
            }
        };
    }

    public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        System.out.println("Create Current account with MoneyMoney Bank");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name:");
        accNm = sc.nextLine();

        accBal = 100f;
        creditLimit = 10000f;
        accNo += accNo;

        return new CurrentAcc(accNo, accNm, accBal, creditLimit) {
            @Override
            public void withdraw(float amount) {
                // Implement withdraw logic
            }

            @Override
            public String toString() {
                // Accessing private variables of BankAcc class using getter methods
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
