package festival4_1;

public class VolunteerDiscount implements Discount{

    public int discount(int money) {
        return money / 2;
    }
}
