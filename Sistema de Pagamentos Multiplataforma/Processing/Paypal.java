package Processing;

public class Paypal implements Payment {

    public String UserEmail;

    public Paypal(String userEmail) {
        UserEmail = userEmail;
    }

    @Override
    public String PaymentProcess(double value) {

        if(!verifyEmail(UserEmail))
        {
            System.out.println("Invalid Email, try again");
            return "Invalid Email";
        }
        System.out.println("Processing your payment");
        return "Payment processed successfully";
    }
    
    public boolean verifyEmail(String email)
    {
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"))
        {
            return false;
        }
        if (!email.equals(UserEmail))
        {
            return false;
        }
        return true;
    }
}
