package chapter1.festival4_1;

public class VolunteerDiscount implements Discount {

    @Override
    public int discount(int money) {
        return money / 2;
    }
}
