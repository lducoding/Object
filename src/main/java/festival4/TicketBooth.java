package festival4;


public class TicketBooth {
    private Ticket ticket = new Ticket();
    private int amount = 0;

    public void publish(Audience audience) {
        if(audience.hasInvitation()) {
            int day = audience.InvitationDay();
            ticket.setDay(day);
            audience.change(ticket);
        } else {
            int day = 2;
            int buyMoney = audience.buy(ticket, day);
            amount =+ buyMoney;
        }
    }

    @Override
    public String toString() {
        return "TicketBooth{" +
            "amount=" + amount +
            '}';
    }
}
