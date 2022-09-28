package chapter1.festival1;

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

    @Override
    public String toString() {
        return "TicketBooth{" +
            "amount=" + amount +
            '}';
    }
}
