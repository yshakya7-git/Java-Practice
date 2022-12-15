package solidprinciple.dip;

public class DebitCard implements BankCard {

    public void doTransaction(long amt){
        System.out.println("This is pay,ment with debit card");
    }
}
