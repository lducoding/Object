package chapter01.festival2_1;

public class Audience {
    private Invitation invitation;
    private Ticket ticket;
    private int money = 100000;

    public Invitation getInvitation() {
        return invitation;
    }

    public void setInvitation(Invitation invitation) {
        this.invitation = invitation;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Audience{" +
            "invitation=" + invitation +
            ", ticket=" + ticket +
            ", money=" + money +
            '}';
    }

    public int change(Ticket ticket) {
        if(invitation != null) {
            invitation =null;
            this.ticket = ticket;
            return 0;
        } else {
            money -= ticket.getFee();
            return ticket.getFee();
        }
    }
}
