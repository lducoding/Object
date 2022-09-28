package chapter1.festival4;

public class NoDiscount implements Discount{

    @Override
    public int discount(int money) {
        return money;
    }
}
