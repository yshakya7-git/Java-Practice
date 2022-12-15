package solidprinciple.dip;

public class CreditCard implements BankCard {

    public void doTransaction(long amt){
        System.out.println("Payment using creditcard");
    }
}
