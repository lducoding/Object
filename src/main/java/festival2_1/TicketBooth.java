package festival2_1;

public class TicketBooth {
    private Ticket ticket = new Ticket();
    private int amount = 0;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void publish(Audience audience) {
        amount += audience.change(ticket);
    }
}
