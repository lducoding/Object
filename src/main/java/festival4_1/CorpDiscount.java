package festival4_1;

public class CorpDiscount implements Discount{

    public int discount(int money) {
        return money -= 20000;
    }

}
