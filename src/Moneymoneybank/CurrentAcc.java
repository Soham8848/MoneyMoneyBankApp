package Moneymoneybank;

public abstract class CurrentAcc extends BankAcc{

    private final float creditLimit ;

    public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);

        this.creditLimit = creditLimit;
    }

    public abstract void withdraw(float amount);

    public abstract String toString();

}
