package festival4;

public class CorpDiscount implements Discount {

    @Override
    public int discount(int money) {
        return money -= 20000;
    }

}
