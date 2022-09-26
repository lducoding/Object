package festival3;

public class Audience {
    private VolunteerInvitation volunteerInvitation;
    private Ticket ticket;
    private int money = 100000;
    private VolunteerDiscount volunteerDiscount;


    public void setVolunteerDiscount(VolunteerDiscount volunteerDiscount) {
        this.volunteerDiscount = volunteerDiscount;
    }

    public void setVolunteerInvitation(VolunteerInvitation volunteerInvitation) {
        this.volunteerInvitation = volunteerInvitation;
    }

    public void change(Ticket ticket) {
        volunteerInvitation = null;
        this.ticket = ticket;
    }

    public boolean hasInvitation() {
        if(volunteerInvitation != null) {
            return true;
        } else {
            return false;
        }
    }

    public int InvitationDay() {
        return volunteerInvitation.day();
    }

    public int buy(Ticket ticket, int day) {
        this.ticket = ticket;
        int discount = volunteerDiscount.discount(ticket.getFee() * day);
        money -= discount;
        return discount;
    }

    @Override
    public String toString() {
        return "Audience{" +
            "volunteerInvitation=" + volunteerInvitation +
            ", ticket=" + ticket +
            ", money=" + money +
            ", volunteerDiscount=" + volunteerDiscount +
            '}';
    }
}
