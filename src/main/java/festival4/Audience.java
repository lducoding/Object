package festival4;

public class Audience {
    private Invitation invitation;
    private Ticket ticket;
    private int money = 100000;
    private Discount discount;

    public Invitation getInvitation() {
        return invitation;
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
        int discount = this.discount.discount(ticket.getFee() * day);
        money -= discount;
        return discount;
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
