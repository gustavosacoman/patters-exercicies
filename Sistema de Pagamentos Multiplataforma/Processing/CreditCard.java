package Processing;
public class CreditCard implements Payment{

    public String CardNumber;

    @Override
    public void PaymentProcess(double value) {

        if (!verifyCardNumber(CardNumber)){
            System.out.println("Your card number is invalid, enter a true card number");
            return;
        }
       System.out.println("Processing your payment: R$" + value);
    }

    public boolean verifyCardNumber(String CardNumber){
        if (CardNumber.length() < 16){
            return false;
        }
        return true;
    }

}
