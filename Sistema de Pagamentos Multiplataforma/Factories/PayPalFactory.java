package Factories;

import Processing.Payment;
import Processing.Paypal;

public class PayPalFactory extends PaymentFactory  {

    @Override
    public Payment CreatePayment() {
        return new Paypal();
    }
    
}
