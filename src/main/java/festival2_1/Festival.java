package festival2_1;

public class Festival {

    private static TicketBooth ticketBooth = new TicketBooth();

    public static void ticketing(Audience audience) {
        ticketBooth.publish(audience);
    }

    public static void main(String[] args) {
        Audience audience1 = new Audience();
//        Invitation invitation = new Invitation();
//        audience1.setInvitation(invitation);
        System.out.println(audience1);
        System.out.println();
        ticketing(audience1);
        System.out.println(audience1);
    }
}
