package Moneymoneybank;

public abstract class BankAcc {
    private int accNo = 1000;
    private String accNm;
    private float accBal;


    public BankAcc(int accNo, String accNm, float accBal) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.accBal = accBal;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public float getAccBal() {
        return accBal;
    }

    public abstract void withdraw(float amount);
    public abstract void deposite(float amount);
    public abstract String toString();
}
