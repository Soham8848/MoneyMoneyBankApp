package Moneymoneybank;

public class MMSavingAcc extends SavingAcc{



    public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal, isSalaried);
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
