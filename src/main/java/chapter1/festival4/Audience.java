package chapter1.festival4;

public class Audience {
    private Invitation invitation;
    private Ticket ticket;
    private int money = 100000;
    private Discount discount;

    private int day = 1;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void setInvitation(Invitation invitation) {
        this.invitation = invitation;
    }

    public void change(Ticket ticket) {
        invitation = null;
        this.ticket = ticket;
    }

    public boolean hasInvitation() {
        if(invitation != null) {
            return true;
        } else {
            return false;
        }
    }

    public int InvitationDay() {
        return invitation.day();
    }

    public int buy(Ticket ticket, int day) {
        this.ticket = ticket;
        int discountMoney = discount.discount(ticket.getFee() * day);
        money -= discountMoney;
        discount = null;
        return discountMoney;
    }

    @Override
    public String toString() {
        return "Audience{" +
            "volunteerInvitation=" + invitation +
            ", ticket=" + ticket +
            ", money=" + money +
            ", volunteerDiscount=" + discount +
            '}';
    }
}
