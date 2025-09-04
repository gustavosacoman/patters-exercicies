package Processing;
public class CreditCard implements Payment{

    private String CardNumber;

    public CreditCard(String CardNumber) {
        this.CardNumber = CardNumber;
    }

    @Override
    public String PaymentProcess(double value) {

        if (!verifyCardNumber(this.CardNumber)) {
            System.out.println("Your card number is invalid, enter a true card number");
            return "Invalid card number";
        }
       System.out.println("Processing your payment: R$" + value);
       return "Payment processed successfully";
    }

    public boolean verifyCardNumber(String CardNumber){
        if (CardNumber.length() < 16){
            return false;
        }
        return true;
    }

}
