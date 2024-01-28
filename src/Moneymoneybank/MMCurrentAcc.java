package Moneymoneybank;

public class MMCurrentAcc extends CurrentAcc {

    public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal, creditLimit);
    }
    @Override
    public void withdraw(float amount) {

    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public void deposite(float amount) {

    }
}
