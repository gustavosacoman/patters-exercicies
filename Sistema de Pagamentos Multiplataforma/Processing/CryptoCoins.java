package Processing;

public class CryptoCoins implements Payment {

    private double Balance;

    public CryptoCoins(double Balance) {
        this.Balance = Balance;
    }

    @Override
    public String PaymentProcess(double value) {

        if(verifyBalance(value)){
            System.out.println("Your balance is insufficient");
            return "Insufficient balance";
        }
        System.out.println("Processing your payment... R$" + value);
        return "Payment processed successfully";
    }

    private boolean verifyBalance(double value){

        if (this.Balance < value)
        {
            return false;
        }

        return true;
    }
}