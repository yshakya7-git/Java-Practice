package solidprinciple.dip;

public class MainClass {

    public static void main(String[] args) {
        BankCard bankCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.purchase(5000);
    }
}
