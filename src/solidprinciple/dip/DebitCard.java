package solidprinciple.dip;

public class DebitCard implements BankCard {

    public void doTransaction(long amt){
        System.out.println("This is payment with debit card");
    }
}
