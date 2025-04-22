package CreationalDP.Factory;

public class CreditCard implements Payment{
    @Override
    public void makePayment(){
        System.out.println("Making Payment Using Credit Card");
    }
}
