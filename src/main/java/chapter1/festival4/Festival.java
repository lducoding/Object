package chapter1.festival4;

public class Festival {

    private static TicketBooth ticketBooth = new TicketBooth();

    public static void ticketing(Audience audience) {
        ticketBooth.publish(audience);
    }

    public static void main(String[] args) {
        Audience audience1 = new Audience();
        audience1.setDay(1);

//        CorpInvitation invitation = new CorpInvitation();
//        audience1.setInvitation(invitation);

        NoDiscount discount = new NoDiscount();
        audience1.setDiscount(discount);

        System.out.println(audience1);
        System.out.println(ticketBooth);
        ticketing(audience1);
        System.out.println(audience1);
        System.out.println(ticketBooth);
        System.out.println(audience1.getTicket().getDay());
    }
}
