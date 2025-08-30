package Service;

import Factories.PaymentFactory;
import Processing.Payment;

public class PaymentService {
    
    public void SendPayment(PaymentFactory factory, double value){
        Payment payment = factory.CreatePayment();
        payment.PaymentProcess(value);
    }
}
