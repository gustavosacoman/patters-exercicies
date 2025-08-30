package Processing;
public class Paypal implements Payment {

    public String UserEmail;
    @Override
    public void PaymentProcess(double value) {

        if(verifyEmail(UserEmail))
        {
            System.out.println("Invalid Email, try again");
            return;
        }
        System.out.println("Processing your payment");
    }
    
    public boolean verifyEmail(String email)
    {
        if (email != "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
        {
            return false;
        }
        if (email != UserEmail)
        {
            return false;
        }
        return true;
    }
}
