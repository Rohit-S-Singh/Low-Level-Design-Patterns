import CreationalDP.Factory.Payment;
import CreationalDP.Factory.PaymentFactory;

public class Main {
    public static void main(String[] args) {

        PaymentFactory pay = new PaymentFactory();
        Payment PaymentMethodInstance = pay.initiatePaymentType("Paypal");
        PaymentMethodInstance.makePayment();



    }
}