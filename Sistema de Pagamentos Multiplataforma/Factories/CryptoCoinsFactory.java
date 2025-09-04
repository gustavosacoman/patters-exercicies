package Factories;

import Processing.CryptoCoins;
import Processing.Payment;

public class CryptoCoinsFactory extends PaymentFactory {

    public double Balance;

    public CryptoCoinsFactory(double Balance) {
        this.Balance = Balance;
    }
    @Override
    public Payment CreatePayment() {
        return new CryptoCoins(Balance);
    }
    
}
