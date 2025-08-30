import Factories.CreditCardFactory;
import Factories.CryptoCoinsFactory;
import Factories.PayPalFactory;
import Processing.Payment;
import Service.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        Payment pg = new CryptoCoinsFactory().CreatePayment();
        //Linhas de determinaçao do estado do objeto pg
        pg.PaymentProcess(0);
        service.SendPayment(new CreditCardFactory(), 500);

        service.SendPayment(new CryptoCoinsFactory(),500);

        service.SendPayment(new PayPalFactory(), 500);
        
    }   
}
