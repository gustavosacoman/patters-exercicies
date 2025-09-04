package Factories;

import Processing.Payment;
import Processing.Paypal;

public class PayPalFactory extends PaymentFactory  {
    public String UserEmail;

    public PayPalFactory(String userEmail) {
        this.UserEmail = userEmail;
    }
    
    @Override
    public Payment CreatePayment() {
        return new Paypal(UserEmail);
    }
    
}
