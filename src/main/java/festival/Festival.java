package festival;

public class Festival {
    private Audience audience;
    private TicketBooth ticketBooth;

    public void registerTicket(Audience audience, TicketBooth ticketBooth) {
        ticketBooth.publishTicket(audience);
    }
}
