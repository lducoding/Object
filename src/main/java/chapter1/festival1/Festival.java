package chapter1.festival1;

public class Festival {

    private static TicketBooth ticketBooth = new TicketBooth();

    public static void ticketing(Audience audience) {
        Ticket ticket = ticketBooth.getTicket();
        if(audience.getInvitation() != null) {
            audience.setInvitation(null);
        } else {
            audience.setMoney(audience.getMoney() - ticket.getFee());
            ticketBooth.setAmount(ticket.getFee());
        }
        audience.setTicket(ticket);
    }

    public static void main(String[] args) {
        Audience audience1 = new Audience();
        Invitation invitation = new Invitation();
        audience1.setInvitation(invitation);
        System.out.println(audience1);
        System.out.println(ticketBooth);
        ticketing(audience1);
        System.out.println(audience1);
        System.out.println(ticketBooth);
    }
}
