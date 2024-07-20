package Tickets;

import Tools.Formater;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TicketService {
    public static void main(String[] args) {

    Ticket emptyTicket = new Ticket();
        System.out.println("Empty One");
        System.out.println( Formater.idFormater(emptyTicket.getId()));

    Ticket regularTicket = new Ticket(false, 'b', 15.5f, "Tauron", (short)101, 11.5612f);

        //Checks

/*

        System.out.println("Regular One");
        System.out.println("Ticket id: " + Formater.idFormater(regularTicket.getId()));
        System.out.println("Backpack weight: "  + (regularTicket.getBackpackWeight()));
        System.out.println("Promo Status: " + (regularTicket.getIsPromo()) );
        System.out.println("Sector " + regularTicket.getSector());
        System.out.println("Concert hall: " + regularTicket.getConcertHall());
        System.out.println("Event code: " + regularTicket.getEventCode());
        System.out.println("Price: "  + regularTicket.getPrice());
        System.out.println("Time: " + regularTicket.getTime());
*/


    Ticket limitedTicket = new Ticket("Carnegie", (short)777);

        //checks
    /*
        System.out.println("Ticket id: " + Formater.idFormater (limitedTicket.getId()));
        System.out.println("Concert hall: " + limitedTicket.getConcertHall());
        System.out.println("Event code: " + limitedTicket.getEventCode());
        System.out.println("Time: " + limitedTicket.getTime());
    */

    Ticket testTicket = new Ticket();

        System.out.println("Ticket id: " + Formater.idFormater (testTicket.getId()));


        testTicket.setConcertHall("Some long ah name");
        System.out.println("Concert hall: " + testTicket.getConcertHall());

        testTicket.setPrice(-3f);
        System.out.println("Price: "  + testTicket.getPrice());

        testTicket.setBackpackWeight(155.5002f);
        System.out.println("Backpack weight: "  + (testTicket.getBackpackWeight()));

    }
}
