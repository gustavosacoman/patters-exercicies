import Factories.CreditCardFactory;
import Factories.CryptoCoinsFactory;
import Factories.PayPalFactory;
import Service.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        

        service.SendPayment(new CreditCardFactory("1234567890123456"), 500);

        service.SendPayment(new CryptoCoinsFactory(1000),500);

        service.SendPayment(new PayPalFactory("user@example.com"), 500);
        
    }   
}
