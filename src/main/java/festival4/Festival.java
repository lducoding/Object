package festival4;

public class Festival {

    private static TicketBooth ticketBooth = new TicketBooth();

    public static void ticketing(Audience audience) {
        ticketBooth.publish(audience);
    }

    public static void main(String[] args) {
        Audience audience1 = new Audience();

//        ArtistInvitation volunteerInvitation = new ArtistInvitation();
//        audience1.setInvitation(volunteerInvitation);

        VolunteerDiscount volunteerDiscount = new VolunteerDiscount();
        audience1.setDiscount(volunteerDiscount);

        System.out.println(audience1);
        System.out.println(ticketBooth);
        ticketing(audience1);
        System.out.println(audience1);
        System.out.println(ticketBooth);
    }
}
