package Factories;

import Processing.CreditCard;
import Processing.Payment;

public class CreditCardFactory extends PaymentFactory{

    public String CardNumber;

    public CreditCardFactory(String CardNumber) {
        this.CardNumber = CardNumber;
    }

    @Override
    public Payment CreatePayment() {
       return new CreditCard(this.CardNumber);
    }
    
}
