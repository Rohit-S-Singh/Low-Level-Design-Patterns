package CreationalDP.Factory;

public class UPI implements Payment{

    @Override
    public void makePayment(){
        System.out.println("Making Payment Using UPI");
    }
}
