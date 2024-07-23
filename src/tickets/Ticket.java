package Tickets;

import Tools.Formater;

import java.util.Date;


public class Ticket {
    private static int counter;
    private String concertHall;

    static {
        counter = 1;
    }

    private int eventCode;
    private float backpackWeight;
    private float price;
    private long time;
    private boolean isPromo;
    private char sector;

    private int id;

    {
        id = counter;
        counter++;
        Date now = new Date();
        time = now.getTime();
    }

    public int getId() {
        return this.id;
    }

    //Get/set
    public void setConcertHall(String concertHall) {
        if (concertHall.length() <= 10) {
            this.concertHall = concertHall;
        } else {
            System.out.println("Concert Hall name has to be less than 10 symbols in ticket №" + Formater.idFormater(this.getId()));
        }
    }

    public String getConcertHall() {
        return this.concertHall;
    }

    public void setEventCode(int eventCode) {
        if (Integer.toString(eventCode).length() == 3 && eventCode > 0) {
            this.eventCode = eventCode;
        } else {
            System.out.println("Event code must contain 3 positive digits in ticket №" + Formater.idFormater(this.getId()));
        }
    }

    public int getEventCode() {
        return this.eventCode;
    }

    public void setIsPromo(boolean isPromo) {
        this.isPromo = isPromo;
    }

    public boolean getIsPromo() {
        return this.isPromo;
    }

    public void setSector(char sector) {
        if (Character.toUpperCase(sector) >= 65 && Character.toUpperCase(sector) <= 67) {
            this.sector = Character.toUpperCase(sector);
        } else {
            System.out.println("Choose sector A, B or C in ticket №" + Formater.idFormater(this.getId()));
        }
    }

    public char getSector() {
        return this.sector;
    }

    public void setBackpackWeight(float weight) {
        if (weight > 0) {
            this.backpackWeight = Formater.backpackWeihgtFormater(weight);
        } else
            System.out.println("Weight can not be a negative value in ticket №" + Formater.idFormater(this.getId()));


    }

    public float getBackpackWeight() {
        return this.backpackWeight;
    }

    public long getTime() {
        return time;
    }

    public void setPrice(float price) {
        if (price > 0) {
            this.price = Formater.priceFormater(price);
        } else
            System.out.println("Price can not be a negative value in ticket №" + Formater.idFormater(this.getId()));
    }

    public float getPrice() {
        return this.price;
    }

    public Ticket makeLimitedTicket(String concertHall, int eventCode) {
        setConcertHall(concertHall);
        setEventCode(eventCode);
        return this;
    }

    public Ticket makeRegularTicket(String concertHall, int eventCode, boolean isPromo, char sector, float backpackWeight, float price) {
        setConcertHall(concertHall);
        setEventCode(eventCode);
        setIsPromo(isPromo);
        setSector(sector);
        setBackpackWeight(backpackWeight);
        setPrice(price);
        return this;
    }


}
