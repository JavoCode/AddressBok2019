import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Item implements ExchangeItem{

    //Attributes 
    private String description; 
    private String owner; 
    private int value; 
    private static int count = 1; 
    private int id;
    private int rate; 
    private Status status;
    private String burrower; 
    private Calendar dateIn;
    private Calendar dateOut;
    private float charge;
    private float numdays; 
    
    public Item(String description, String owner, int value){
        this.description = description;
        this.owner = owner; 
        this.value = value; 

        if(description == "BOOK" || description == "book"){
            id = count++;
        }
        if(description == "EQUIPMENT" || description == "equipment"){
            id = count++;
        }

        rate = value/365;

        status = Status.Available;
    }

    //method to return the string status of the item
    public String getStatus(){
        if(status == Status.Available){
           return "Available"; 
        }
        return "Borrowed by" + burrower +" "+ dateOut;
    }

    //method checkOut 
    public void checkOut(String burrower, Calendar dateOut){
        this.burrower = burrower;
        this.dateOut = dateOut;
        status = Status.Onloan;
    }

    //method checkIn
    public float checkIn(Calendar dateIn){
        this.dateIn = dateIn;
        numdays = ChronoUnit.DAYS.between(dateOut.toInstant(), dateIn.toInstant());
        charge = rate * numdays;
        return charge;
    }

    //method that returns true if the item is available to borrow
    public boolean isAvailable(){

        if(status == Status.Available){
            return true;
        }
        return false;
    }

    //getter Methods 
    public String getItemNo(){
        String output = null;
        if(description == "BOOK" || description == "book"){
            output = "B" +id;
        }
        if(description == "EQUIPMENT" || description == "equipment"){
            output = "E"+id;
        }
        return output;
    }

    public String getDescription(){
        return description;
    }

    public float getValue(){
        return value;
    }

    public float getRate(){
        return rate;
    }

    public String getOwner(){
        return owner;
    }

    //toString method
    public String toString(){
        return  "Item No: "+getItemNo() +"/n"+
                "Owner/Description: " + getOwner() +"/"+getDescription()+
                "Value: "+ getValue()+
                "Status: " +getStatus();
    }


}