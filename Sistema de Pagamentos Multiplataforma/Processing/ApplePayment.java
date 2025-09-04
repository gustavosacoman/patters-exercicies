package Processing;

public class ApplePayment implements Payment {
    
    private String device;

    public ApplePayment(String device) {
        this.device = device;
    }
    
    @Override
    public String PaymentProcess(double value) {

        if (!isAnAppleDevice()){
            return "Error: Device not supported for Apple payments.";
        }
        System.out.println("Processing Apple payment of $" + value + " on " + device);
        return "Apple payment processed successfully";
    }

    private boolean isAnAppleDevice() {

        if(device.equals("iPhone") || device.equals("iPad") || device.equals("MacBook")) {
            return true;
        }

        return false;
    }
    
}
