package org.example.oops;

public class Abstract {
    public static void main(String[] args) {
        Atm atm = new AtmOperation();
        atm.checkBalance();
        atm.withdrawal();
        atm.deposite();
    }
}
interface Atm{
    void withdrawal();
    void deposite();
    void checkBalance();
}

class AtmOperation implements Atm{

    @Override
    public void withdrawal() {
        System.out.println("withdrawal is successful");
    }

    @Override
    public void deposite() {
        System.out.println("deposite is successful");
    }

    @Override
    public void checkBalance() {
        System.out.println("balance: ");
    }
}
