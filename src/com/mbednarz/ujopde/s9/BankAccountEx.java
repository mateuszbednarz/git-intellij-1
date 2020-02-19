package com.mbednarz.ujopde.s9;

/* -- LESSON 51: Klasy zagnieżdżone praktyczniejszy przykład -- */
public class BankAccountEx
{
    public static void main(String[] args)
    {
        BAcc bankAccount = new BAcc(10000);
        System.out.println("Previous account balance = " + bankAccount.getAccBalance() + " USD");
        bankAccount.accountStart(5);
        System.out.println("Actual account balance = " + bankAccount.getAccBalance() + " USD");
    }
}

class BAcc
{
    private double accBalance;

    public BAcc(double accBalance)
    {
        this.accBalance = accBalance;
    }

    public double getAccBalance()
    {
        return this.accBalance;
    }

    void accountStart(double intRate)
    {
        Interest intr = new Interest(intRate);
    }


    /* -- NESTED class -- */
    class Interest
    {
        private double interestRate;

        public Interest(double intRate)
        {
            this.interestRate = intRate;
            this.changeAccBalance(intRate);
        }

        void changeAccBalance(double intRate)
        {
            double interest = (accBalance * intRate) / 100;
            accBalance += interest;
        }
    }
}