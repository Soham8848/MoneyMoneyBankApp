package Moneymoneybank;

public class Main {
    public static void main(String[] args) {
        MMBankFactory mmBankFactory = new MMBankFactory();

        // Call the getNewSavingAcc method
        SavingAcc savingAcc = mmBankFactory.getNewSavingAcc(101, "", 0.0f, false);

        // Call the getNewCurrentAcc method
        CurrentAcc currentAcc = mmBankFactory.getNewCurrentAcc(201, "", 0.0f, 0.0f);

        // Display the created objects
        System.out.println("Saving Account Details:");
        System.out.println(savingAcc);

        System.out.println("\nCurrent Account Details:");
        System.out.println(currentAcc);
    }
}