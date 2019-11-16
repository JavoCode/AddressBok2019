import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Item implements ExchangeItem{

    //Attributes 
    private String description; 
    private String owner; 
    private float value; 
    private static int count = 1; 
    private int id;
    private float rate; 
    private Status status;
    private String burrower; 
    private Date dateIn;
    private Date dateOut;
    private float charge;
    private float numdays; 
    
    
    /** 
     * @param description
     * @param owner
     * @param value
     * @return 
     */
    public Item(String description, String owner, float value){
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
        //System.out.println(rate);

        status = Status.Available;
    }

    
    /** 
     * @return String
     */
    //method to return the string status of the item
    public String getStatus(){
        if(status == Status.Available){
           return "Available"; 
        }
        return "Borrowed by " + burrower +" "+ dateOut;
    }

    
    /** 
     * @param burrower
     * @param dateOut
     */
    //method checkOut 
    public void checkOut(String burrower, Date dateOut){
        this.burrower = burrower;
        this.dateOut = dateOut;
        status = Status.Onloan;
    }

    
    /** 
     * @param dateIn
     * @return float
     */
    //method checkIn
    public float checkIn(Date dateIn){
        this.dateIn = dateIn;
        long differenceInMs = Math.abs(dateOut.getTime()-dateIn.getTime());
        long diffInDays = TimeUnit.DAYS.convert(differenceInMs, TimeUnit.MILLISECONDS);
        charge = rate * diffInDays;
        //System.out.println(charge);
        return charge;
    }

    
    /** 
     * @return long
     */
    //method to return the difference in days 
    public long diffDays(){
        long differenceInMs = Math.abs(dateOut.getTime()-dateIn.getTime());
        long diffInDays = TimeUnit.DAYS.convert(differenceInMs, TimeUnit.MILLISECONDS);
        return diffInDays;
    }


    
    /** 
     * @return boolean
     */
    //method that returns true if the item is available to borrow
    public boolean isAvailable(){

        if(status == Status.Available){
            return true;
        }
        return false;
    }

    
    /** 
     * @return String
     */
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

    
    /** 
     * @return String
     */
    public String getDescription(){
        return description;
    }

    
    /** 
     * @return float
     */
    public float getValue(){
        return value;
    }

    
    /** 
     * @return float
     */
    public float getRate(){
        return rate;
    }

    
    /** 
     * @return String
     */
    public String getOwner(){
        return owner;
    }

    
    /** 
     * @return String
     */
    //toString method
    public String toString(){
        return  "Item No: "+getItemNo() +"\n"+
                "Owner/Description: " + getOwner() +"/"+getDescription()+"\n"+
                "Value: "+ getValue()+"\n"+
                "Status: " +getStatus();
    }

    //public static void main(String[] args) {
        
   // }


}