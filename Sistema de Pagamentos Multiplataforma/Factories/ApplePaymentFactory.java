package Factories;

import Processing.ApplePayment;
import Processing.Payment;

public class ApplePaymentFactory extends PaymentFactory {

    public String Device;
    public ApplePaymentFactory(String Device) {
        this.Device = Device;
    }

    @Override
    public Payment CreatePayment() {
        return new ApplePayment(Device);
    }
}

