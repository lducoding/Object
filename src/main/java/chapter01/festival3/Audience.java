package chapter01.festival3;

public class Audience {
    private VolunteerInvitation volunteerInvitation;
    private Ticket ticket;
    private int money = 100000;
    private VolunteerDiscount volunteerDiscount;

    private int day = 1;


    public VolunteerInvitation getVolunteerInvitation() {
        return volunteerInvitation;
    }

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

    public int buy(Ticket ticket) {
        this.ticket = ticket;
        int discountMoney = volunteerDiscount.discount(ticket.getFee() * ticket.getDay());
        money -= discountMoney;
        volunteerDiscount = null;
        return discountMoney;
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
