package Tickets;

import Tools.Formater;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TicketService {
    public static void main(String[] args) {

        Ticket emptyTicket = new Ticket();
        System.out.println("Empty Ticket");
        System.out.println("Ticket id: " + Formater.idFormater(emptyTicket.getId()));

        Ticket limitedTicket = new Ticket().makeLimitedTicket("Tauron", 123);

        System.out.println("Limited Ticket");
        System.out.println("Ticket id: " + Formater.idFormater(limitedTicket.getId()));
        System.out.println("Time: " + limitedTicket.getTime());

        Ticket regularTicket = new Ticket().makeRegularTicket("Some Hall", 345, true, 'a', 12.4f, 43.11f);
        //Checks
        System.out.println("Regular Ticket");
        System.out.println("Ticket id: " + Formater.idFormater(regularTicket.getId()));
        System.out.println("Backpack weight: " + (regularTicket.getBackpackWeight()));
        System.out.println("Promo Status: " + (regularTicket.getIsPromo()));
        System.out.println("Sector " + regularTicket.getSector());
        System.out.println("Concert hall: " + regularTicket.getConcertHall());
        System.out.println("Event code: " + regularTicket.getEventCode());
        System.out.println("Price: " + regularTicket.getPrice());
        System.out.println("Time: " + regularTicket.getTime());
    }
}
