package CreationalDP.Factory;

public class PaymentFactory {

    public Payment initiatePaymentType(String type){
        if(type.equals("UPI")){
            return new UPI();
        }
        if(type.equals("Paypal")){
            return new PayPal();
        }
        if(type.equals("CreditCard")){
            return new CreditCard();
        }
        throw new IllegalArgumentException("Invalid payment type: " + type);
    }
}
