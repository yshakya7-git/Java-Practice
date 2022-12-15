package solidprinciple.dip;

public class ShoppingMall{

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void purchase(long amt){
        bankCard.doTransaction(amt);
    }
}
