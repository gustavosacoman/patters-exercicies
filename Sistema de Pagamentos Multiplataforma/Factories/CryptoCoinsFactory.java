package Factories;

import Processing.CryptoCoins;
import Processing.Payment;

public class CryptoCoinsFactory extends PaymentFactory {

    @Override
    public Payment CreatePayment() {
        return new CryptoCoins();
    }
    
}
