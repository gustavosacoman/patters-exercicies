package Processing;
public class CryptoCoins implements Payment {

    double Balance;

    @Override
    public void PaymentProcess(double value) {

        if(verifyBalance(value)){
            System.out.println("Your balance is insufficient");
            return;
        }
        System.out.println("Processing your payment");
    }

    private boolean verifyBalance(double value){

        if(this.Balance < Balance)
        {
            return false;
        }

        return true;
    }
}