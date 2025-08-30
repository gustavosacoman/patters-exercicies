package Factories;

import Processing.CreditCard;
import Processing.Payment;

public class CreditCardFactory extends PaymentFactory{

    @Override
    public Payment CreatePayment() {
       return new CreditCard();
    }
    
}
