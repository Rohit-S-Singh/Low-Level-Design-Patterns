package CreationalDP.Factory;

public class PayPal implements Payment{
    @Override
    public void makePayment(){
        System.out.println("Making Payment Using Paypal");
    }
}
