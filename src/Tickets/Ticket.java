package Tickets;

import Tools.Formater;

import java.util.Date;


public class Ticket {
     private static short counter = 0;
     private String concertHall;
     private short id = 1;
     private short eventCode;
     private float backpackWeight;
     private float price;
     private long time;
     private boolean isPromo;
     private char sector;

     public short getId(){
         return this.id;
     }

     //Get/set

     public void setConcertHall(String concertHall){
         if(concertHall.length() <= 10){
            this.concertHall = concertHall;
         }else{
             System.out.println("Concert Hall name has to be less than 10 symbols in ticket №" + Formater.idFormater(this.getId()));
         }
     }

     public String getConcertHall(){
         return this.concertHall;
     }

    public void setEventCode(short eventCode){
         if(eventCode <= 999){
             this.eventCode = eventCode;
         }else{
             System.out.println("Event code must contain only 3 digits in ticket №" + Formater.idFormater(this.getId()));
         }
    }

    public short getEventCode(){
         return this.eventCode;
    }

    public void setIsPromo(boolean isPromo){
        this.isPromo = isPromo;
    }

    public boolean getIsPromo(){
         return this.isPromo;
    }

    public void setSector(char sector){
         if(     Character.toUpperCase(sector) == 'A' ||
                 Character.toUpperCase(sector) == 'B' ||
                 Character.toUpperCase(sector) == 'C'){
             this.sector = Character.toUpperCase(sector);
         }else{
             System.out.println("Choose sector A, B or C in ticket №" + Formater.idFormater(this.getId()));
         }
    }

    public char getSector(){
         return this.sector;
    }

    public void setBackpackWeight(float weight){
        if(weight > 0){
            this.backpackWeight = Formater.backpackWeihgtFormater(weight);
        }else{
            System.out.println("Weight can not be a negative value in ticket №" + Formater.idFormater(this.getId()));
        }
        if(weight > 100)
            System.out.println("r u mad?");
    }

    public float getBackpackWeight(){
         return this.backpackWeight;
    }

    public long getTime() {
        return time;
    }

    public void setPrice(float price){
         if(price > 0){
             this.price = Formater.priceFormater(price);
         }else
             System.out.println("Price can not be a negative value in ticket №" + Formater.idFormater(this.getId()));
    }

    public float getPrice(){
         return this.price;
    }


    //empty constructor
    public Ticket(){
            this.id += Ticket.counter;
            counter++;
    };

    //regular constructor
    public Ticket(boolean isPromo, char sector, float backpackWeight, String concertHall, short eventCode, float price){

        Date now = new Date();
        this.time = now.getTime();

        /* I'm aware that making constructor with setters is not a good practice
           but soon as the logic is not too complicated - guess it should be fine
         */

        setSector(sector);
        setBackpackWeight(backpackWeight);
        setConcertHall(concertHall);
        setEventCode(eventCode);
        setPrice(price);



        /*this.isPromo = isPromo;
        this.sector = Character.toUpperCase(sector);
        this.backpackWeight = backpackWeight;

        this.concertHall = concertHall;
        this.eventCode = eventCode;*/


        this.id += Ticket.counter;
        counter++;
    }

    //limited
    public Ticket(String concertHall, short eventCode){
        Date now = new Date();
        this.time = now.getTime();

        setConcertHall(concertHall);
        setEventCode(eventCode);

        /*this.concertHall = concertHall;
        this.eventCode = eventCode;*/


        this.id += Ticket.counter;
        counter++;
    }

}
