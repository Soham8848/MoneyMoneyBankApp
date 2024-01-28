package Moneymoneybank;

public abstract class SavingAcc extends BankAcc{

    private boolean isSalaried;
    private static final float MINBAL= 100.00F;

    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal);
        this.isSalaried = isSalaried;
    }

   public abstract void withdraw(float amount);

   public abstract String toString();
}
