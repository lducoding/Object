package chapter1.festival4;


public class TicketBooth {
    private Ticket ticket = new Ticket();
    private int amount = 0;

    public void publish(Audience audience) {
        if(audience.hasInvitation()) {
            int day = audience.InvitationDay();
            ticket.setDay(day);
            audience.change(ticket);
        } else {
            ticket.setDay(audience.getDay());
            int buyMoney = audience.buy(ticket, audience.getDay());
            amount += buyMoney;
        }
    }

    @Override
    public String toString() {
        return "TicketBooth{" +
            "amount=" + amount +
            '}';
    }
}
